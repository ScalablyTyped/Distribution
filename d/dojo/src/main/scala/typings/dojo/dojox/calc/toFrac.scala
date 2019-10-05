package typings.dojo.dojox.calc

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.chartIndex
import typings.dojo.dojoStrings.checkboxIndex
import typings.dojo.dojoStrings.colorBoxFieldsetIndex
import typings.dojo.dojoStrings.colorIndex
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.dropDownIndex
import typings.dojo.dojoStrings.evaluatedExpression
import typings.dojo.dojoStrings.expressionIndex
import typings.dojo.dojoStrings.funcNumberIndex
import typings.dojo.dojoStrings.functionMode
import typings.dojo.dojoStrings.functionRef
import typings.dojo.dojoStrings.functions
import typings.dojo.dojoStrings.readStore
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.statusIndex
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.tooltipIndex
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.dojo.dojoStrings.writeStore
import typings.dojo.dojox.charting.Chart2D
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/toFrac.html
  *
  *
  */
trait toFrac extends js.Object {
  /**
    *
    */
  def FuncGen(): Unit
  /**
    *
    */
  def Grapher(): Unit
  /**
    * Return a less exact approximation of r such that approx(r * (1 +- eps)) == approx(r)
    *
    * @param r
    */
  def approx(r: Double): Double
  /**
    * graph a chart with the given function.
    *
    * @param chart
    * @param functionToGraph Function with one numeric parameter (x or y typically)
    * @param params can contain the number of the graph in the chart it is (an integer), a boolean saying if the functionToGraph is a function of x (otherwise y)and the color, which is an object with a stroke with a color's name eg: color:{stroke:"black"}
    */
  def draw(chart: Chart2D, functionToGraph: js.Function, params: js.Object): js.Any
  /**
    * create the points with information about the graph.
    *
    * @param funcToGraph A function with one numeric parameter (x or y typically)
    * @param x x and y are Strings which always have the values of "x" or "y".  If y="x" and x="y" then it is creating points for the function as though it was a function of y
    * @param y x and y are Strings which always have the values of "x" or "y".  If y="x" and x="y" then it is creating points for the function as though it was a function of y
    * @param width pixel width of the chart
    * @param minX minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    * @param maxX minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    * @param minY minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    * @param maxY minX, maxX, minY, and maxY are all bounds of the chart.  If x="y" then maxY should be the maximum bound of x rather than y
    */
  def generatePoints(
    funcToGraph: js.Function,
    x: String,
    y: String,
    width: Double,
    minX: Double,
    maxX: Double,
    minY: Double,
    maxY: Double
  ): js.Object
  /**
    *
    * @param base
    * @param exponent
    */
  def pow(base: js.Any, exponent: js.Any): js.Any
  /**
    *
    * @param number
    */
  def toFrac(number: js.Any): js.Any
}

@JSGlobal("dojox.calc.toFrac")
@js.native
object toFrac extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/toFrac.FuncGen.html
    *
    * The dialog layout for making functions
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class FuncGen () extends _WidgetBase {
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
    var functions: js.Object = js.native
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
    var style_FuncGen: String = js.native
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
      * clear the name, arguments, and body
      *
      */
    def clear(): Unit = js.native
    /**
      *
      * @param name
      */
    def deleteFunction(name: js.Any): Unit = js.native
    /**
      * delete an item in the writestore
      *
      * @param item
      */
    def deleteThing(item: js.Any): Unit = js.native
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
    def get_functions(property: functions): js.Object = js.native
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
      * The clear button in the template calls this.
      * Clear the name, arguments, and body if the user says yes.
      *
      */
    def onClear(): Unit = js.native
    /**
      * (Delete button on click event) delete a function if the user clicks yes
      *
      */
    def onDelete(): Unit = js.native
    /**
      * (Reset button on click event) reset the arguments and body to their previously saved state if the user says yes
      *
      */
    def onReset(): Unit = js.native
    /**
      *
      */
    def onSaved(): Unit = js.native
    /**
      * if they select something in the name combobox, then change the body and arguments to correspond to the function they selected
      *
      */
    def onSelect(): Unit = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * set the status in the template to ready
      *
      */
    def readyStatus(): Unit = js.native
    /**
      * set the arguments and body to match a function selected if it exists in the function list
      *
      */
    def reset(): Unit = js.native
    /**
      *
      * @param name
      * @param args
      * @param body
      */
    def saveFunction(name: js.Any, args: js.Any, body: js.Any): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_functions(property: functions, value: js.Object): Unit = js.native
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
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_functions(property: functions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_readStore(property: readStore, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_writeStore(property: writeStore, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/toFrac.Grapher.html
    *
    * The dialog layout for making graphs
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class Grapher () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      *
      */
    var chartIndex: Double = js.native
    /**
      *
      */
    var checkboxIndex: Double = js.native
    /**
      *
      */
    var colorBoxFieldsetIndex: Double = js.native
    /**
      *
      */
    var colorIndex: Double = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      *
      */
    var dropDownIndex: Double = js.native
    /**
      *
      */
    var evaluatedExpression: Double = js.native
    /**
      *
      */
    var expressionIndex: Double = js.native
    /**
      *
      */
    var funcNumberIndex: Double = js.native
    /**
      *
      */
    var functionMode: Double = js.native
    /**
      *
      */
    var functionRef: Double = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      *
      */
    var statusIndex: Double = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Grapher: String = js.native
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
      *
      */
    var tooltipIndex: Double = js.native
    /**
      * Should we parse the template to find widgets that might be
      * declared in markup inside it?  (Remove for 2.0 and assume true)
      *
      */
    var widgetsInTemplate: Boolean = js.native
    /**
      * add or re-add the default x/y axes to the Chart provided
      *
      * @param chart
      */
    def addXYAxes(chart: Chart2D): js.Any = js.native
    /**
      * Make the color of the chart the new color.
      * The context is changed to the colorPalette, and a reference to chart was added to it a an attribute.
      *
      */
    def changedColor(): Unit = js.native
    /**
      * adjust all charts in this.array according to any changes in window options
      *
      */
    def checkDirty(): Unit = js.native
    /**
      * to stay in sync with onChange, checkDirty is called with a timeout
      *
      */
    def checkDirty1(): Unit = js.native
    /**
      * create a new row in the table with all of the dojo objects.
      *
      */
    def createFunction(): Unit = js.native
    /**
      * deselect all checkboxes inside the function table
      *
      */
    def deselectAll(): Unit = js.native
    /**
      *
      * @param i
      */
    def drawOne(i: js.Any): Unit = js.native
    /**
      * erase the chart inside this.array with the index i
      *
      * @param i index to this.array that represents the current row number in the table
      */
    def erase(i: Double): Unit = js.native
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
    def get_chartIndex(property: chartIndex): Double = js.native
    @JSName("get")
    def get_checkboxIndex(property: checkboxIndex): Double = js.native
    @JSName("get")
    def get_colorBoxFieldsetIndex(property: colorBoxFieldsetIndex): Double = js.native
    @JSName("get")
    def get_colorIndex(property: colorIndex): Double = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_dropDownIndex(property: dropDownIndex): Double = js.native
    @JSName("get")
    def get_evaluatedExpression(property: evaluatedExpression): Double = js.native
    @JSName("get")
    def get_expressionIndex(property: expressionIndex): Double = js.native
    @JSName("get")
    def get_funcNumberIndex(property: funcNumberIndex): Double = js.native
    @JSName("get")
    def get_functionMode(property: functionMode): Double = js.native
    @JSName("get")
    def get_functionRef(property: functionRef): Double = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_statusIndex(property: statusIndex): Double = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_tooltipIndex(property: tooltipIndex): Double = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      * if something in the window options is changed, this is called
      *
      */
    def makeDirty(): Unit = js.native
    /**
      * The delete button's onClick method.
      * Delete all of the selected rows.
      *
      */
    def onDelete(): Unit = js.native
    /**
      *
      */
    def onDraw(): Unit = js.native
    /**
      * the erase button's onClick method
      * it see's if the checkbox is checked and then erases it if it is.
      *
      */
    def onErase(): Unit = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * select all checkboxes inside the function table
      *
      */
    def selectAll(): Unit = js.native
    /**
      * set the status of the row i to be status
      *
      * @param i index of this.array as well as a row index
      * @param status either Error, Hidden, or Drawn
      */
    def setStatus(i: Double, status: String): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_chartIndex(property: chartIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_checkboxIndex(property: checkboxIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_colorBoxFieldsetIndex(property: colorBoxFieldsetIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_colorIndex(property: colorIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_dropDownIndex(property: dropDownIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_evaluatedExpression(property: evaluatedExpression, value: Double): Unit = js.native
    @JSName("set")
    def set_expressionIndex(property: expressionIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_funcNumberIndex(property: funcNumberIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_functionMode(property: functionMode, value: Double): Unit = js.native
    @JSName("set")
    def set_functionRef(property: functionRef, value: Double): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_statusIndex(property: statusIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_tooltipIndex(property: tooltipIndex, value: Double): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_chartIndex(property: chartIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_checkboxIndex(property: checkboxIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_colorBoxFieldsetIndex(property: colorBoxFieldsetIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_colorIndex(property: colorIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_dropDownIndex(property: dropDownIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_evaluatedExpression(property: evaluatedExpression, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_expressionIndex(property: expressionIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_funcNumberIndex(property: funcNumberIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_functionMode(property: functionMode, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_functionRef(property: functionRef, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_statusIndex(property: statusIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_tooltipIndex(property: tooltipIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/toFrac._Executor.html
    *
    * A graphing, scientific calculator
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _Executor () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__Executor: String = js.native
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
      * create an anonymous function to run the code the parser generates from the user input.
      *
      * @param name this argument is simply a String that represents the name of the function being evaluated. It can be undefined, but in that case the function is a one time use.
      * @param args the function arguments
      * @param body the function body
      */
    def Function(name: js.Any, args: String, body: String): js.Any = js.native
    /**
      *
      * @param name
      */
    def deleteFunction(name: js.Any): Unit = js.native
    /**
      * create an anonymous function to run the code the parser generates from the user input.
      *
      * @param text the user input that needs to be parsed
      */
    def eval(text: String): js.Any = js.native
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
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    /**
      *
      * @param name
      * @param args
      * @param body
      */
    def normalizedFunction(name: js.Any, args: js.Any, body: js.Any): js.Any = js.native
    /**
      * this should be overwritten and become a great place for making user predefined functions
      *
      */
    def onLoad(): Unit = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
}

