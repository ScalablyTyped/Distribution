package typings.dojo.dijit

import typings.dojo.Anon_Remove
import typings.dojo.Anon_Unwatch
import typings.dojo.dojo.Stateful
import typings.dojo.dojoStrings.`class`
import typings.dojo.dojoStrings.attributeMap
import typings.dojo.dojoStrings.baseClass
import typings.dojo.dojoStrings.containerNode
import typings.dojo.dojoStrings.dir
import typings.dojo.dojoStrings.domNode
import typings.dojo.dojoStrings.focused
import typings.dojo.dojoStrings.id
import typings.dojo.dojoStrings.lang
import typings.dojo.dojoStrings.ownerDocument
import typings.dojo.dojoStrings.srcNodeRef
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.title
import typings.dojo.dojoStrings.tooltip_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_WidgetBase.html
  *
  * Future base class for all Dijit widgets.
  * Future base class for all Dijit widgets.
  * _Widget extends this class adding support for various features needed by desktop.
  * 
  * Provides stubs for widget lifecycle methods for subclasses to extend, like postMixInProperties(), buildRendering(),
  * postCreate(), startup(), and destroy(), and also public API methods like set(), get(), and watch().
  * 
  * Widgets can provide custom setters/getters for widget attributes, which are called automatically by set(name, value).
  * For an attribute XXX, define methods _setXXXAttr() and/or _getXXXAttr().
  * 
  * _setXXXAttr can also be a string/hash/array mapping from a widget attribute XXX to the widget's DOMNodes:
  * 
  * DOM node attribute
  *   _setFocusAttr: {node: "focusNode", type: "attribute"}
  *   _setFocusAttr: "focusNode"  (shorthand)
  *   _setFocusAttr: ""       (shorthand, maps to this.domNode)
  * Maps this.focus to this.focusNode.focus, or (last example) this.domNode.focus
  * 
  * DOM node innerHTML
  *   _setTitleAttr: { node: "titleNode", type: "innerHTML" }
  * Maps this.title to this.titleNode.innerHTML
  * 
  * DOM node innerText
  *   _setTitleAttr: { node: "titleNode", type: "innerText" }
  * Maps this.title to this.titleNode.innerText
  * 
  * DOM node CSS class
  *   _setMyClassAttr: { node: "domNode", type: "class" }
  * Maps this.myClass to this.domNode.className
  * 
  * If the value of _setXXXAttr is an array, then each element in the array matches one of the
  * formats of the above list.
  * 
  * If the custom setter is null, no action is performed other than saving the new value
  * in the widget (in this).
  * 
  * If no custom setter is defined for an attribute, then it will be copied
  * to this.focusNode (if the widget defines a focusNode), or this.domNode otherwise.
  * That's only done though for attributes that match DOMNode attributes (title,
  * alt, aria-labelledby, etc.)
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Destroyable because Inheritance from two classes. Inlined destroy, destroy, own */ @JSGlobal("dijit._WidgetBase")
@js.native
class _WidgetBase () extends Stateful {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Deprecated. Instead of attributeMap, widget should have a _setXXXAttr attribute
    * for each XXX attribute to be mapped to the DOM.
    * 
    * attributeMap sets up a "binding" between attributes (aka properties)
    * of the widget and the widget's DOM.
    * Changes to widget attributes listed in attributeMap will be
    * reflected into the DOM.
    * 
    * For example, calling set('title', 'hello')
    * on a TitlePane will automatically cause the TitlePane's DOM to update
    * with the new title.
    * 
    * attributeMap is a hash where the key is an attribute of the widget,
    * and the value reflects a binding to a:
    * 
    * DOM node attribute
    *   focus: {node: "focusNode", type: "attribute"}
    * Maps this.focus to this.focusNode.focus
    * 
    * DOM node innerHTML
    *   title: { node: "titleNode", type: "innerHTML" }
    * Maps this.title to this.titleNode.innerHTML
    * 
    * DOM node innerText
    *   title: { node: "titleNode", type: "innerText" }
    * Maps this.title to this.titleNode.innerText
    * 
    * DOM node CSS class
    *   myClass: { node: "domNode", type: "class" }
    * Maps this.myClass to this.domNode.className
    * 
    * If the value is an array, then each element in the array matches one of the
    * formats of the above list.
    * 
    * There are also some shorthands for backwards compatibility:
    * 
    * string --> { node: string, type: "attribute" }, for example:
    * "focusNode" ---> { node: "focusNode", type: "attribute" }
    * "" --> { node: "domNode", type: "attribute" }
    * 
    */
  var attributeMap: js.Object = js.native
  /**
    * Root CSS class of the widget (ex: dijitTextBox), used to construct CSS classes to indicate
    * widget state.
    * 
    */
  var baseClass: String = js.native
  /**
    * 
    */
  var `class`: String = js.native
  /**
    * Designates where children of the source DOM node will be placed.
    * "Children" in this case refers to both DOM nodes and widgets.
    * For example, for myWidget:
    * 
    * <div data-dojo-type=myWidget>
    *     <b> here's a plain DOM node
    *     <span data-dojo-type=subWidget>and a widget</span>
    *     <i> and another plain DOM node </i>
    * </div>
    * containerNode would point to:
    * 
    * <b> here's a plain DOM node
    * <span data-dojo-type=subWidget>and a widget</span>
    * <i> and another plain DOM node </i>
    * In templated widgets, "containerNode" is set via a
    * data-dojo-attach-point assignment.
    * 
    * containerNode must be defined for any widget that accepts innerHTML
    * (like ContentPane or BorderContainer or even Button), and conversely
    * is null for widgets that don't, like TextBox.
    * 
    */
  var containerNode: HTMLElement = js.native
  /**
    * Bi-directional support, as defined by the HTML DIR
    * attribute. Either left-to-right "ltr" or right-to-left "rtl".  If undefined, widgets renders in page's
    * default direction.
    * 
    */
  var dir: String = js.native
  /**
    * This is our visible representation of the widget! Other DOM
    * Nodes may by assigned to other properties, usually through the
    * template system's data-dojo-attach-point syntax, but the domNode
    * property is the canonical "top level" node in widget UI.
    * 
    */
  var domNode: HTMLElement = js.native
  /**
    * This widget or a widget it contains has focus, or is "active" because
    * it was recently clicked.
    * 
    */
  var focused: Boolean = js.native
  /**
    * A unique, opaque ID string that can be assigned by users or by the
    * system. If the developer passes an ID which is known not to be
    * unique, the specified ID is ignored and the system-generated ID is
    * used instead.
    * 
    */
  var id: String = js.native
  /**
    * 
    */
  var isValid: js.Any = js.native
  /**
    * Rarely used.  Overrides the default Dojo locale used to render this widget,
    * as defined by the HTML LANG attribute.
    * Value must be among the list of locales specified during by the Dojo bootstrap,
    * formatted according to RFC 3066 (like en-us).
    * 
    */
  var lang: String = js.native
  /**
    * The document this widget belongs to.  If not specified to constructor, will default to
    * srcNodeRef.ownerDocument, or if no sourceRef specified, then to the document global
    * 
    */
  var ownerDocument: js.Object = js.native
  /**
    * pointer to original DOM node
    * 
    */
  var srcNodeRef: HTMLElement = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  var style: js.Object = js.native
  /**
    * HTML title attribute.
    * 
    * For form widgets this specifies a tooltip to display when hovering over
    * the widget (just like the native HTML title attribute).
    * 
    * For TitlePane or for when this widget is a child of a TabContainer, AccordionContainer,
    * etc., it's used to specify the tab label, accordion pane title, etc.  In this case it's
    * interpreted as HTML.
    * 
    */
  var title: String = js.native
  /**
    * When this widget's title attribute is used to for a tab label, accordion pane title, etc.,
    * this specifies the tooltip to appear when the mouse is hovered over that text.
    * 
    */
  var tooltip: String = js.native
  /**
    * Construct the UI for this widget, setting this.domNode.
    * Most widgets will mixin dijit._TemplatedMixin, which implements this method.
    * 
    */
  def buildRendering(): Unit = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Any, event: String, method: String): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Any, event: String, method: js.Function): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Any, event: js.Function, method: String): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Any, event: js.Function, method: js.Function): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Object, event: String, method: String): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Object, event: String, method: js.Function): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Object, event: js.Function, method: String): js.Any = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(on(...)) or this.own(aspect.after(...)) instead.
    * 
    * Connects specified obj/event to specified method of this object
    * and registers for disconnect() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.connect, except with the
    * implicit use of this widget as the target object.
    * Events connected with this.connect are disconnected upon
    * destruction.
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Object, event: js.Function, method: js.Function): js.Any = js.native
  /**
    * Wrapper to setTimeout to avoid deferred functions executing
    * after the originating widget has been destroyed.
    * Returns an object handle with a remove method (that returns null) (replaces clearTimeout).
    * 
    * @param fcn Function reference.             
    * @param delay               OptionalDelay, defaults to 0.             
    */
  def defer(fcn: js.Function): js.Object = js.native
  def defer(fcn: js.Function, delay: Double): js.Object = js.native
  /**
    * Destroy this widget, but not its descendants.  Descendants means widgets inside of
    * this.containerNode.   Will also destroy any resources (including widgets) registered via this.own().
    * 
    * This method will also destroy internal widgets such as those created from a template,
    * assuming those widgets exist inside of this.domNode but outside of this.containerNode.
    * 
    * For 2.0 it's planned that this method will also destroy descendant widgets, so apps should not
    * depend on the current ability to destroy a widget without destroying its descendants.   Generally
    * they should use destroyRecursive() for widgets with children.
    * 
    * @param preserveDom If true, this method will leave the original DOM structure alone.Note: This will not yet work with _TemplatedMixin widgets             
    */
  /**
    * Destroy this class, releasing any resources registered via own().
    * 
    * @param preserveDom             
    */
  def destroy(): Unit = js.native
  def destroy(preserveDom: Boolean): Unit = js.native
  /**
    * Recursively destroy the children of this widget and their
    * descendants.
    * 
    * @param preserveDom               OptionalIf true, the preserveDom attribute is passed to all descendantwidget's .destroy() method. Not for use with _Templatedwidgets.             
    */
  def destroyDescendants(): Unit = js.native
  def destroyDescendants(preserveDom: Boolean): Unit = js.native
  /**
    * Destroy this widget and its descendants
    * This is the generic "destructor" function that all widget users
    * should call to cleanly discard with a widget. Once a widget is
    * destroyed, it is removed from the manager object.
    * 
    * @param preserveDom               OptionalIf true, this method will leave the original DOM structurealone of descendant Widgets. Note: This will NOT work withdijit._TemplatedMixin widgets.             
    */
  def destroyRecursive(): Unit = js.native
  def destroyRecursive(preserveDom: Boolean): Unit = js.native
  /**
    * Destroys the DOM nodes associated with this widget.
    * 
    * @param preserveDom               OptionalIf true, this method will leave the original DOM structure aloneduring tear-down. Note: this will not work with _Templatedwidgets yet.             
    */
  def destroyRendering(): Unit = js.native
  def destroyRendering(preserveDom: Boolean): Unit = js.native
  /**
    * Deprecated, will be removed in 2.0, use handle.remove() instead.
    * 
    * Disconnects handle created by connect.
    * 
    * @param handle             
    */
  def disconnect(handle: js.Any): Unit = js.native
  /**
    * Used by widgets to signal that a synthetic event occurred, ex:
    * 
    * myWidget.emit("attrmodified-selectedChildWidget", {}).
    * Emits an event on this.domNode named type.toLowerCase(), based on eventObj.
    * Also calls onType() method, if present, and returns value from that method.
    * By default passes eventObj to callback, but will pass callbackArgs instead, if specified.
    * Modifies eventObj by adding missing parameters (bubbles, cancelable, widget).
    * 
    * @param type             
    * @param eventObj               Optional            
    * @param callbackArgs               Optional            
    */
  def emit(`type`: String): js.Any = js.native
  def emit(`type`: String, eventObj: js.Object): js.Any = js.native
  def emit(`type`: String, eventObj: js.Object, callbackArgs: js.Array[_]): js.Any = js.native
  /**
    * Get a property from a widget.
    * Get a named property from a widget. The property may
    * potentially be retrieved via a getter method. If no getter is defined, this
    * just retrieves the object's property.
    * 
    * For example, if the widget has properties foo and bar
    * and a method named _getFooAttr(), calling:
    * myWidget.get("foo") would be equivalent to calling
    * widget._getFooAttr() and myWidget.get("bar")
    * would be equivalent to the expression
    * widget.bar2
    * 
    * @param name The property to get.             
    */
  def get(name: js.Any): js.Any = js.native
  /**
    * Returns all direct children of this widget, i.e. all widgets underneath this.containerNode whose parent
    * is this widget.   Note that it does not return all descendants, but rather just direct children.
    * Analogous to Node.childNodes,
    * except containing widgets rather than DOMNodes.
    * 
    * The result intentionally excludes internally created widgets (a.k.a. supporting widgets)
    * outside of this.containerNode.
    * 
    * Note that the array returned is a simple array.  Application code should not assume
    * existence of methods like forEach().
    * 
    */
  def getChildren(): js.Array[_] = js.native
  /**
    * Returns the parent widget of this widget.
    * 
    */
  def getParent(): js.Any = js.native
  @JSName("get")
  def get_attributeMap(property: attributeMap): js.Object = js.native
  @JSName("get")
  def get_baseClass(property: baseClass): String = js.native
  @JSName("get")
  def get_class(property: `class`): String = js.native
  @JSName("get")
  def get_containerNode(property: containerNode): HTMLElement = js.native
  @JSName("get")
  def get_dir(property: dir): String = js.native
  @JSName("get")
  def get_domNode(property: domNode): HTMLElement = js.native
  @JSName("get")
  def get_focused(property: focused): Boolean = js.native
  @JSName("get")
  def get_id(property: id): String = js.native
  @JSName("get")
  def get_lang(property: lang): String = js.native
  @JSName("get")
  def get_ownerDocument(property: ownerDocument): js.Object = js.native
  @JSName("get")
  def get_srcNodeRef(property: srcNodeRef): HTMLElement = js.native
  @JSName("get")
  def get_style(property: style): js.Object = js.native
  @JSName("get")
  def get_title(property: title): String = js.native
  @JSName("get")
  def get_tooltip(property: tooltip_): String = js.native
  /**
    * Return true if this widget can currently be focused
    * and false if not
    * 
    */
  def isFocusable(): js.Any = js.native
  /**
    * Return this widget's explicit or implicit orientation (true for LTR, false for RTL)
    * 
    */
  def isLeftToRight(): js.Any = js.native
  /**
    * Call specified function when event occurs, ex: myWidget.on("click", function(){ ... }).
    * Call specified function when event type occurs, ex: myWidget.on("click", function(){ ... }).
    * Note that the function is not run in any particular scope, so if (for example) you want it to run in the
    * widget's scope you must do myWidget.on("click", lang.hitch(myWidget, func)).
    * 
    * @param type Name of event (ex: "click") or extension event like touch.press.             
    * @param func             
    */
  def on(`type`: String, func: js.Function): Anon_Remove = js.native
  /**
    * Call specified function when event occurs, ex: myWidget.on("click", function(){ ... }).
    * Call specified function when event type occurs, ex: myWidget.on("click", function(){ ... }).
    * Note that the function is not run in any particular scope, so if (for example) you want it to run in the
    * widget's scope you must do myWidget.on("click", lang.hitch(myWidget, func)).
    * 
    * @param type Name of event (ex: "click") or extension event like touch.press.             
    * @param func             
    */
  def on(`type`: js.Function, func: js.Function): Anon_Remove = js.native
  /**
    * Called when the widget stops being "active" because
    * focus moved to something outside of it, or the user
    * clicked somewhere outside of it, or the widget was
    * hidden.
    * 
    */
  def onBlur(): Unit = js.native
  /**
    * Called when the widget becomes "active" because
    * it or a widget inside of it either has focus, or has recently
    * been clicked.
    * 
    */
  def onFocus(): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(handle: js.Any): js.Any = js.native
  /**
    * Place this widget somewhere in the DOM based
    * on standard domConstruct.place() conventions.
    * A convenience function provided in all _Widgets, providing a simple
    * shorthand mechanism to put an existing (or newly created) Widget
    * somewhere in the dom, and allow chaining.
    * 
    * @param reference Widget, DOMNode, or id of widget or DOMNode             
    * @param position               OptionalIf reference is a widget (or id of widget), and that widget has an ".addChild" method,it will be called passing this widget instance into that method, supplying the optionalposition index passed.  In this case position (if specified) should be an integer.If reference is a DOMNode (or id matching a DOMNode but not a widget),the position argument can be a numeric index or a string"first", "last", "before", or "after", same as dojo/dom-construct::place().             
    */
  def placeAt(reference: String): js.Any = js.native
  def placeAt(reference: String, position: String): js.Any = js.native
  def placeAt(reference: String, position: Double): js.Any = js.native
  /**
    * Place this widget somewhere in the DOM based
    * on standard domConstruct.place() conventions.
    * A convenience function provided in all _Widgets, providing a simple
    * shorthand mechanism to put an existing (or newly created) Widget
    * somewhere in the dom, and allow chaining.
    * 
    * @param reference Widget, DOMNode, or id of widget or DOMNode             
    * @param position               OptionalIf reference is a widget (or id of widget), and that widget has an ".addChild" method,it will be called passing this widget instance into that method, supplying the optionalposition index passed.  In this case position (if specified) should be an integer.If reference is a DOMNode (or id matching a DOMNode but not a widget),the position argument can be a numeric index or a string"first", "last", "before", or "after", same as dojo/dom-construct::place().             
    */
  def placeAt(reference: _WidgetBase): js.Any = js.native
  def placeAt(reference: _WidgetBase, position: String): js.Any = js.native
  def placeAt(reference: _WidgetBase, position: Double): js.Any = js.native
  /**
    * Place this widget somewhere in the DOM based
    * on standard domConstruct.place() conventions.
    * A convenience function provided in all _Widgets, providing a simple
    * shorthand mechanism to put an existing (or newly created) Widget
    * somewhere in the dom, and allow chaining.
    * 
    * @param reference Widget, DOMNode, or id of widget or DOMNode             
    * @param position               OptionalIf reference is a widget (or id of widget), and that widget has an ".addChild" method,it will be called passing this widget instance into that method, supplying the optionalposition index passed.  In this case position (if specified) should be an integer.If reference is a DOMNode (or id matching a DOMNode but not a widget),the position argument can be a numeric index or a string"first", "last", "before", or "after", same as dojo/dom-construct::place().             
    */
  def placeAt(reference: HTMLElement): js.Any = js.native
  def placeAt(reference: HTMLElement, position: String): js.Any = js.native
  def placeAt(reference: HTMLElement, position: Double): js.Any = js.native
  /**
    * Processing after the DOM fragment is created
    * Called after the DOM fragment has been created, but not necessarily
    * added to the document.  Do not include any operations which rely on
    * node dimensions or placement.
    * 
    */
  def postCreate(): Unit = js.native
  /**
    * Called after the parameters to the widget have been read-in,
    * but before the widget template is instantiated. Especially
    * useful to set properties that are referenced in the widget
    * template.
    * 
    */
  def postMixInProperties(): Unit = js.native
  /**
    * Set a property on a widget
    * Sets named properties on a widget which may potentially be handled by a
    * setter in the widget.
    * 
    * For example, if the widget has properties foo and bar
    * and a method named _setFooAttr(), calling
    * myWidget.set("foo", "Howdy!") would be equivalent to calling
    * widget._setFooAttr("Howdy!") and myWidget.set("bar", 3)
    * would be equivalent to the statement widget.bar = 3;
    * 
    * set() may also be called with a hash of name/value pairs, ex:
    * 
    * myWidget.set({
    *     foo: "Howdy",
    *     bar: 3
    * });
    * This is equivalent to calling set(foo, "Howdy") and set(bar, 3)
    * 
    * @param name The property to set.             
    * @param value The value to set in the property.             
    */
  def set(name: js.Any, value: js.Any): js.Any = js.native
  @JSName("set")
  def set_attributeMap(property: attributeMap, value: js.Object): Unit = js.native
  @JSName("set")
  def set_baseClass(property: baseClass, value: String): Unit = js.native
  @JSName("set")
  def set_class(property: `class`, value: String): Unit = js.native
  @JSName("set")
  def set_containerNode(property: containerNode, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_dir(property: dir, value: String): Unit = js.native
  @JSName("set")
  def set_domNode(property: domNode, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_focused(property: focused, value: Boolean): Unit = js.native
  @JSName("set")
  def set_id(property: id, value: String): Unit = js.native
  @JSName("set")
  def set_lang(property: lang, value: String): Unit = js.native
  @JSName("set")
  def set_ownerDocument(property: ownerDocument, value: js.Object): Unit = js.native
  @JSName("set")
  def set_srcNodeRef(property: srcNodeRef, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: js.Object): Unit = js.native
  @JSName("set")
  def set_title(property: title, value: String): Unit = js.native
  @JSName("set")
  def set_tooltip(property: tooltip_, value: String): Unit = js.native
  /**
    * Processing after the DOM fragment is added to the document
    * Called after a widget and its children have been created and added to the page,
    * and all related widgets have finished their create() cycle, up through postCreate().
    * 
    * Note that startup() may be called while the widget is still hidden, for example if the widget is
    * inside a hidden dijit/Dialog or an unselected tab of a dijit/layout/TabContainer.
    * For widgets that need to do layout, it's best to put that layout code inside resize(), and then
    * extend dijit/layout/_LayoutWidget so that resize() is called when the widget is visible.
    * 
    */
  def startup(): Unit = js.native
  /**
    * Deprecated, will be removed in 2.0, use this.own(topic.subscribe()) instead.
    * 
    * Subscribes to the specified topic and calls the specified method
    * of this object and registers for unsubscribe() on widget destroy.
    * 
    * Provide widget-specific analog to dojo.subscribe, except with the
    * implicit use of this widget as the target object.
    * 
    * @param t The topic             
    * @param method The callback             
    */
  def subscribe(t: String, method: js.Function): js.Any = js.native
  /**
    * Deprecated. Override destroy() instead to implement custom widget tear-down
    * behavior.
    * 
    */
  def uninitialize(): Boolean = js.native
  /**
    * Deprecated, will be removed in 2.0, use handle.remove() instead.
    * 
    * Unsubscribes handle created by this.subscribe.
    * Also removes handle from this widget's list of subscriptions
    * 
    * @param handle             
    */
  def unsubscribe(handle: js.Object): Unit = js.native
  @JSName("watch")
  def watch_attributeMap(
    property: attributeMap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_baseClass(
    property: baseClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_class(
    property: `class`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_containerNode(
    property: containerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dir(
    property: dir,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_domNode(
    property: domNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_focused(
    property: focused,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_id(
    property: id,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_lang(
    property: lang,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_ownerDocument(
    property: ownerDocument,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_srcNodeRef(
    property: srcNodeRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(
    property: style,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_title(
    property: title,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tooltip(
    property: tooltip_,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

