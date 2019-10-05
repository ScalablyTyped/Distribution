package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyDate
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.currentFocus
import typings.dojo.dojoStrings.datePackage
import typings.dojo.dojoStrings.dayWidth
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.months
import typings.dojo.dojoStrings.returnIsoRanges
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.Date
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/MultiSelectCalendar.html
  *
  * A simple GUI for choosing several dates in the context of a monthly calendar.
  * A simple GUI for choosing several dates in the context of a monthly calendar.
  * This widget serialises its selected dates to ISO dates or ISO ranges of dates,
  * depending on developer selection
  * Note that it accepts an Array of ISO dates as its input
  *
  * @param args
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.MultiSelectCalendar")
@js.native
class MultiSelectCalendar protected () extends _Widget {
  def this(args: js.Object) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    *
    */
  var active: Boolean = js.native
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
  var cssStateNodes: js.Object = js.native
  /**
    * Date object containing the currently focused date, or the date which would be focused
    * if the calendar itself was focused.   Also indicates which year and month to display,
    * i.e. the current "page" the calendar is on.
    *
    */
  var currentFocus: Date = js.native
  /**
    * JavaScript namespace to find Calendar routines.  Uses Gregorian Calendar routines
    * at dojo.date by default.
    *
    */
  var datePackage: String = js.native
  /**
    * How to represent the days of the week in the calendar header. See dojo.date.locale
    *
    */
  var dayWidth: String = js.native
  /**
    * True if cursor is over this widget
    *
    */
  var hovering: Boolean = js.native
  /**
    *
    */
  var returnIsoRanges: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_MultiSelectCalendar: String = js.native
  /**
    * Order fields are traversed when user hits the tab key
    *
    */
  var tabIndex: String = js.native
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
    * The currently selected Dates, initially set to an empty object to indicate no selection.
    *
    */
  var value: Date = js.native
  /**
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Focus the calendar by focusing one of the calendar cells
    *
    */
  def focus(): Unit = js.native
  /**
    *
    * @param lastElement
    */
  def focusOnLastDate(lastElement: js.Any): Unit = js.native
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
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_currentFocus(property: currentFocus): Date = js.native
  @JSName("get")
  def get_datePackage(property: datePackage): String = js.native
  @JSName("get")
  def get_dayWidth(property: dayWidth): String = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_returnIsoRanges(property: returnIsoRanges): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_value(property: value): Date = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * We go to today but we do no select it
    *
    */
  def goToToday(): Unit = js.native
  /**
    * Provides keyboard navigation of calendar.
    * Called from _onKeyDown() to handle keypress on a stand alone Calendar,
    * and also from dijit.form._DateTimeTextBox to pass a keypress event
    * from the dijit.form.DateTextBox to be handled in this widget
    *
    * @param evt
    */
  def handleKey(evt: Event): js.Any = js.native
  /**
    * May be overridden to disable certain dates in the calendar e.g. isDisabledDate=dojo.date.locale.isWeekend
    *
    * @param dateObject
    * @param locale               Optional
    */
  def isDisabledDate(dateObject: Date, locale: String): Boolean = js.native
  /**
    * Called only when the selected date has changed
    *
    * @param date
    */
  def onChange(date: Date): Unit = js.native
  /**
    * Notification that a date cell or more were selected.
    * Passes on the list of ISO dates that are selected
    *
    * @param dates
    */
  def onValueSelected(dates: js.Array[Date]): Unit = js.native
  /**
    * Notification that a date cell or more were unselected.
    * Passes on the list of ISO dates that are unselected
    *
    * @param dates
    */
  def onValueUnselected(dates: js.Array[Date]): Unit = js.native
  /**
    *
    * @param dateToSelect
    * @param selectedDates
    */
  def selectDate(dateToSelect: typings.dojo.dojo.date, selectedDates: js.Array[Date]): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_currentFocus(property: currentFocus, value: Date): Unit = js.native
  @JSName("set")
  def set_datePackage(property: datePackage, value: String): Unit = js.native
  @JSName("set")
  def set_dayWidth(property: dayWidth, value: String): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_returnIsoRanges(property: returnIsoRanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Date): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  /**
    *
    * @param dateToToggle
    * @param selectedDates
    * @param unselectedDates
    */
  def toggleDate(
    dateToToggle: typings.dojo.dojo.date,
    selectedDates: js.Array[Date],
    unselectedDates: js.Array[Date]
  ): Unit = js.native
  /**
    *
    * @param dateToUnselect
    * @param unselectedDates
    */
  def unselectDate(dateToUnselect: typings.dojo.dojo.date, unselectedDates: js.Array[Date]): Unit = js.native
  @JSName("watch")
  def watch_active(property: active, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(property: cssStateNodes, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_currentFocus(property: currentFocus, callback: Fn_NewValueOldValuePropertyDate): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_datePackage(property: datePackage, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dayWidth(property: dayWidth, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovering(property: hovering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_returnIsoRanges(property: returnIsoRanges, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValuePropertyDate): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
}

@JSGlobal("dojox.widget.MultiSelectCalendar")
@js.native
object MultiSelectCalendar extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/MultiSelectCalendar._MonthDropDown.html
    *
    * The month drop down
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _MonthDropDown () extends _Widget {
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
      * List of names of months, possibly w/some undefined entries for Hebrew leap months
      * (ex: ["January", "February", undefined, "April", ...])
      *
      */
    var months: js.Object = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__MonthDropDown: String = js.native
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
    def get_months(property: months): js.Object = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      * Callback when month is selected from drop down
      *
      * @param month
      */
    def onChange(month: Double): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_months(property: months, value: js.Object): Unit = js.native
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
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_months(property: months, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
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
  }
  
}

