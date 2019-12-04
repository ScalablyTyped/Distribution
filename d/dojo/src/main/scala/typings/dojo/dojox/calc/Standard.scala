package typings.dojo.dojox.calc

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.functions
import typings.dojo.dojoStrings.hasDisplay
import typings.dojo.dojoStrings.readStore
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.dojo.dojoStrings.writeStore
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/Standard.html
  *
  * The dialog layout for a standard 4 function/algebraic calculator
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calc.Standard")
@js.native
class Standard () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    *
    */
  var functions: js.Array[_] = js.native
  /**
    *
    */
  var hasDisplay: Boolean = js.native
  /**
    *
    */
  var readStore: js.Object = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Standard: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    *
    */
  var writeStore: js.Object = js.native
  /**
    * this clears the input box if it has content, but if it does not it clears the display
    *
    */
  def clearText(): Unit = js.native
  /**
    * cycle down through the list of commands the user has entered already
    *
    */
  def cycleCommandDown(): Unit = js.native
  /**
    * cycle up through the list of commands the user has entered already
    *
    */
  def cycleCommandUp(): Unit = js.native
  /**
    * Cycle through the commands that the user has entered.
    * It does not wrap around.
    *
    * @param count
    * @param node
    * @param event
    */
  def cycleCommands(count: js.Any, node: js.Any, event: js.Any): Unit = js.native
  /**
    * load in the stores after executor is loaded (the stores need executor to be loaded because it parses them)
    *
    */
  def executorLoaded(): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_functions(property: functions): js.Array[_] = js.native
  @JSName("get")
  def get_hasDisplay(property: hasDisplay): Boolean = js.native
  @JSName("get")
  def get_readStore(property: readStore): js.Object = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  @JSName("get")
  def get_writeStore(property: writeStore): js.Object = js.native
  /**
    * insert a minus sign when they press (-) in the combo button
    *
    */
  def insertMinus(): Unit = js.native
  /**
    * insert an operator with a button
    *
    * @param newText
    */
  def insertOperator(newText: js.Any): Unit = js.native
  /**
    *
    * @param newText
    */
  def insertText(newText: js.Any): Unit = js.native
  /**
    * load an entire store, and make it publicly editable/viewable based on isReadOnly
    *
    * @param store
    * @param isReadOnly
    */
  def loadStore(store: js.Any, isReadOnly: js.Any): Unit = js.native
  /**
    * handle key input for Enter and operators
    *
    * @param e
    */
  def onKeyPress(e: js.Any): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * parse the contents of the textboxWidget and display the answer somewhere (depending on the layout)
    *
    */
  def parseTextbox(): Unit = js.native
  /**
    * print the answer (typically) to the display or the input box
    *
    * @param text
    * @param isRight
    */
  def print(text: js.Any, isRight: js.Any): Unit = js.native
  /**
    * try seeing if the textbox is highlighted completely so you know if Ans should be put in for an operator like +
    *
    * @param node
    */
  def putInAnsIfTextboxIsHighlighted(node: js.Any): Boolean = js.native
  /**
    * make the function with executor
    *
    * @param name
    * @param args
    * @param body
    */
  def saveFunction(name: js.Any, args: js.Any, body: js.Any): Unit = js.native
  /**
    * set a widget's value
    *
    * @param widget
    * @param val
    */
  def setTextboxValue(widget: js.Any, `val`: js.Any): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_functions(property: functions, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_hasDisplay(property: hasDisplay, value: Boolean): Unit = js.native
  @JSName("set")
  def set_readStore(property: readStore, value: js.Object): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  @JSName("set")
  def set_writeStore(property: writeStore, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_functions(
    property: functions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hasDisplay(
    property: hasDisplay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_readStore(
    property: readStore,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_writeStore(
    property: writeStore,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

