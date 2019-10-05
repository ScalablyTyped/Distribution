package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyDate
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.constraints
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.footerFormat
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.useFx
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.Date
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/_CalendarBase.html
  *
  * The Root class for all _Calendar extensions
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, getIndexOfChild, hasChildren, removeChild, removeChild
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget._CalendarBase")
@js.native
class _CalendarBase () extends _WidgetBase {
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    *
    */
  var constraints: js.Object = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    * The date format of the date displayed in the footer.    Can be
    * 'short', 'medium', and 'long'
    *
    */
  var footerFormat: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__CalendarBase: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    * The template to be used to construct the widget.
    *
    */
  var templateString: String = js.native
  /**
    * Specifies if visual effects should be applied to the widget.
    * The default behavior of the widget does not contain any effects.
    * The dojox.widget.CalendarFx package is needed for these.
    *
    */
  var useFx: Boolean = js.native
  /**
    * The currently selected Date
    *
    */
  var value: Date = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    *
    */
  var widgetsInTemplate: Boolean = js.native
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
    *
    * @param query
    * @param fromNode
    */
  def addFx(query: js.Any, fromNode: js.Any): Unit = js.native
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
  /**
    * May be overridden to return CSS classes to associate with the date entry for the given dateObject,
    * for example to indicate a holiday in specified locale.
    *
    * @param dateObject
    * @param locale               Optional
    */
  def getClassForDate(dateObject: Date, locale: String): String = js.native
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
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_constraints(property: constraints): js.Object = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_footerFormat(property: footerFormat): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_useFx(property: useFx): Boolean = js.native
  @JSName("get")
  def get_value(property: value): Date = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    *
    */
  def goToToday(): Unit = js.native
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
    * May be overridden to disable certain dates in the calendar e.g. isDisabledDate=dojo.date.locale.isWeekend
    *
    * @param date
    * @param locale               Optional
    */
  def isDisabledDate(date: Date, locale: String): js.Any = js.native
  /**
    * Called only when the selected date has changed
    *
    * @param date
    */
  def onChange(date: Date): Unit = js.native
  /**
    * Transitions to the next view.
    *
    * @param e
    */
  def onHeaderClick(e: js.Any): Unit = js.native
  /**
    * A date cell was selected. It may be the same as the previous value.
    *
    * @param date
    */
  def onValueSelected(date: Date): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    * @param value
    */
  def parseInitialValue(value: js.Any): js.Any = js.native
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
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_constraints(property: constraints, value: js.Object): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_footerFormat(property: footerFormat, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_useFx(property: useFx, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Date): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_constraints(property: constraints, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_footerFormat(property: footerFormat, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useFx(property: useFx, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValuePropertyDate): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
}

