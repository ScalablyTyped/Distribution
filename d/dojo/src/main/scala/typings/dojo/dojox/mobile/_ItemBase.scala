package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.alt
import typings.dojo.dojoStrings.back
import typings.dojo.dojoStrings.callback
import typings.dojo.dojoStrings.clickable
import typings.dojo.dojoStrings.href
import typings.dojo.dojoStrings.hrefTarget
import typings.dojo.dojoStrings.icon
import typings.dojo.dojoStrings.iconPos
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.moveTo
import typings.dojo.dojoStrings.paramsToInherit
import typings.dojo.dojoStrings.scene
import typings.dojo.dojoStrings.selected
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.toggle
import typings.dojo.dojoStrings.transitionDir
import typings.dojo.dojoStrings.transitionOptions
import typings.dojo.dojoStrings.url
import typings.dojo.dojoStrings.urlTarget
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_ItemBase.html
  *
  * A base class for item classes (e.g. ListItem, IconItem, etc.).
  * _ItemBase is a base class for widgets that have capability to
  * make a view transition when clicked.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile._ItemBase")
@js.native
class _ItemBase () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * An alternate text for the icon image.
    *
    */
  var alt: String = js.native
  /**
    * If true, history.back() is called when clicked.
    *
    */
  var back: Boolean = js.native
  /**
    * A callback function that is called when the transition has been
    * finished. A function reference, or name of a function in
    * context.
    *
    */
  var callback: js.Function = js.native
  /**
    * If true, this item becomes clickable even if a transition
    * destination (moveTo, etc.) is not specified.
    *
    */
  var clickable: Boolean = js.native
  /**
    * A URL of another web page to go to.
    *
    */
  var href: String = js.native
  /**
    * A target that specifies where to open a page specified by
    * href. The value will be passed to the 2nd argument of
    * window.open().
    *
    */
  var hrefTarget: String = js.native
  /**
    * An icon image to display. The value can be either a path for an
    * image file or a class name of a DOM button. If icon is not
    * specified, the iconBase parameter of the parent widget is used.
    *
    */
  var icon: String = js.native
  /**
    * The position of an aggregated icon. IconPos is comma separated
    * values like top,left,width,height (ex. "0,0,29,29"). If iconPos
    * is not specified, the iconPos parameter of the parent widget is
    * used.
    *
    */
  var iconPos: String = js.native
  /**
    * A label of the item. If the label is not specified, innerHTML is
    * used as a label.
    *
    */
  var label: String = js.native
  /**
    * The id of the transition destination view which resides in the
    * current page.
    *
    * If the value has a hash sign ('#') before the id (e.g. #view1)
    * and the dojo/hash module is loaded by the user application, the
    * view transition updates the hash in the browser URL so that the
    * user can bookmark the destination view. In this case, the user
    * can also use the browser's back/forward button to navigate
    * through the views in the browser history.
    *
    * If null, transitions to a blank view.
    * If '#', returns immediately without transition.
    *
    */
  var moveTo: String = js.native
  /**
    * Comma separated parameters to inherit from the parent.
    *
    */
  var paramsToInherit: String = js.native
  /**
    * The name of a scene. Used from dojox/mobile/app.
    *
    */
  var scene: String = js.native
  /**
    * If true, the item is highlighted to indicate it is selected.
    *
    */
  var selected: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__ItemBase: String = js.native
  /**
    * Tabindex setting for the item so users can hit the tab key to
    * focus on it.
    *
    */
  var tabIndex: String = js.native
  /**
    * If true, the item acts like a toggle button.
    *
    */
  var toggle: Boolean = js.native
  /**
    * A type of animated transition effect. You can choose from the
    * standard transition types, "slide", "fade", "flip", or from the
    * extended transition types, "cover", "coverv", "dissolve",
    * "reveal", "revealv", "scaleIn", "scaleOut", "slidev",
    * "swirl", "zoomIn", "zoomOut", "cube", and "swap". If "none" is
    * specified, transition occurs immediately without animation.
    *
    */
  var transition: String = js.native
  /**
    * The transition direction. If 1, transition forward. If -1,
    * transition backward. For example, the slide transition slides
    * the view from right to left when dir == 1, and from left to
    * right when dir == -1.
    *
    */
  var transitionDir: Double = js.native
  /**
    * A hash object that holds transition options.
    *
    */
  var transitionOptions: js.Object = js.native
  /**
    * A URL of an html fragment page or JSON data that represents a
    * new view content. The view content is loaded with XHR and
    * inserted in the current page. Then a view transition occurs to
    * the newly created view. The view is cached so that subsequent
    * requests would not load the content again.
    *
    */
  var url: String = js.native
  /**
    * Node id under which a new view will be created according to the
    * url parameter. If not specified, The new view will be created as
    * a sibling of the current view.
    *
    */
  var urlTarget: String = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Cancels an ongoing selection (if any).
    *
    */
  def cancel(): Unit = js.native
  /**
    * The default action of this item.
    *
    * @param e
    */
  def defaultClickAction(e: Event): Unit = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  /**
    * Copies from the parent and returns the values of parametersspecified by the property paramsToInherit.
    *
    */
  def getTransOpts(): String = js.native
  @JSName("get")
  def get_alt(property: alt): String = js.native
  @JSName("get")
  def get_back(property: back): Boolean = js.native
  @JSName("get")
  def get_callback(property: callback): js.Function = js.native
  @JSName("get")
  def get_clickable(property: clickable): Boolean = js.native
  @JSName("get")
  def get_href(property: href): String = js.native
  @JSName("get")
  def get_hrefTarget(property: hrefTarget): String = js.native
  @JSName("get")
  def get_icon(property: icon): String = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_moveTo(property: moveTo): String = js.native
  @JSName("get")
  def get_paramsToInherit(property: paramsToInherit): String = js.native
  @JSName("get")
  def get_scene(property: scene): String = js.native
  @JSName("get")
  def get_selected(property: selected): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_toggle(property: toggle): Boolean = js.native
  @JSName("get")
  def get_transition(property: typings.dojo.dojoStrings.transition): String = js.native
  @JSName("get")
  def get_transitionDir(property: transitionDir): Double = js.native
  @JSName("get")
  def get_transitionOptions(property: transitionOptions): js.Object = js.native
  @JSName("get")
  def get_url(property: url): String = js.native
  @JSName("get")
  def get_urlTarget(property: urlTarget): String = js.native
  /**
    * Handles this items selection state.
    *
    * @param e
    */
  def handleSelection(e: Event): Unit = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    *
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Copies from the parent the values of parameters specified
    * by the property paramsToInherit.
    *
    */
  def inheritParams(): Boolean = js.native
  /**
    * Makes a transition.
    *
    * @param e
    */
  def makeTransition(e: Event): Unit = js.native
  /**
    * User-defined function to handle touchStart events.
    *
    * @param e
    */
  def onTouchStart(e: Event): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: _WidgetBase): Unit = js.native
  /**
    * Stores the clicked position for later use.
    * Some of the transition animations (e.g. ScaleIn) need the
    * clicked position.
    *
    * @param e
    */
  def setTransitionPos(e: js.Any): Unit = js.native
  @JSName("set")
  def set_alt(property: alt, value: String): Unit = js.native
  @JSName("set")
  def set_back(property: back, value: Boolean): Unit = js.native
  @JSName("set")
  def set_callback(property: callback, value: js.Function): Unit = js.native
  @JSName("set")
  def set_clickable(property: clickable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_href(property: href, value: String): Unit = js.native
  @JSName("set")
  def set_hrefTarget(property: hrefTarget, value: String): Unit = js.native
  @JSName("set")
  def set_icon(property: icon, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_moveTo(property: moveTo, value: String): Unit = js.native
  @JSName("set")
  def set_paramsToInherit(property: paramsToInherit, value: String): Unit = js.native
  @JSName("set")
  def set_scene(property: scene, value: String): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_toggle(property: toggle, value: Boolean): Unit = js.native
  @JSName("set")
  def set_transition(property: typings.dojo.dojoStrings.transition, value: String): Unit = js.native
  @JSName("set")
  def set_transitionDir(property: transitionDir, value: Double): Unit = js.native
  @JSName("set")
  def set_transitionOptions(property: transitionOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_url(property: url, value: String): Unit = js.native
  @JSName("set")
  def set_urlTarget(property: urlTarget, value: String): Unit = js.native
  /**
    * Performs a view transition.
    * Given a transition destination, this method performs a view
    * transition. This method is typically called when this item
    * is clicked.
    *
    * @param moveTo
    * @param href
    * @param url
    * @param scene
    */
  def transitionTo(moveTo: String, href: String, url: String, scene: String): Unit = js.native
  /**
    * Performs a view transition.
    * Given a transition destination, this method performs a view
    * transition. This method is typically called when this item
    * is clicked.
    *
    * @param moveTo
    * @param href
    * @param url
    * @param scene
    */
  def transitionTo(moveTo: js.Object, href: String, url: String, scene: String): Unit = js.native
  /**
    * User-defined click action.
    *
    * @param e
    */
  def userClickAction(e: Event): Unit = js.native
  @JSName("watch")
  def watch_alt(property: alt, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_back(property: back, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_callback(property: callback, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_clickable(property: clickable, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_href(property: href, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hrefTarget(property: hrefTarget, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_icon(property: icon, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_iconPos(property: iconPos, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_moveTo(property: moveTo, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_paramsToInherit(property: paramsToInherit, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scene(property: scene, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selected(property: selected, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_toggle(property: toggle, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_transition(property: typings.dojo.dojoStrings.transition, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_transitionDir(property: transitionDir, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_transitionOptions(property: transitionOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_url(property: url, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_urlTarget(property: urlTarget, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

