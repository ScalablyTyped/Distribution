package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.currentFocus
import typings.dojo.dojoStrings.datePackage
import typings.dojo.dojoStrings.dateTemplateString
import typings.dojo.dojoStrings.dayWidth
import typings.dojo.dojoStrings.dowTemplateString
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.weekTemplateString
import typings.std.Date
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/CalendarLite.html
  *
  * Lightweight version of Calendar widget aimed towards mobile use
  * A simple GUI for choosing a date in the context of a monthly calendar.
  * This widget can't be used in a form because it doesn't serialize the date to an
  * <input> field.  For a form element, use dijit/form/DateTextBox instead.
  * 
  * Note that the parser takes all dates attributes passed in the
  * RFC 3339 format, e.g. 2005-06-30T08:05:00-07:00
  * so that they are serializable and locale-independent.
  * 
  * Also note that this widget isn't keyboard accessible; use dijit.Calendar for that
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit.CalendarLite")
@js.native
class CalendarLite_ () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * Date object containing the currently focused date, or the date which would be focused
    * if the calendar itself was focused.   Also indicates which year and month to display,
    * i.e. the current "page" the calendar is on.
    * 
    */
  var currentFocus: Date = js.native
  /**
    * JavaScript namespace to find calendar routines.  If unspecified, uses Gregorian calendar routines
    * at dojo/date and dojo/date/locale.
    * 
    */
  var datePackage: String = js.native
  /**
    * 
    */
  var dateTemplateString: String = js.native
  /**
    * How to represent the days of the week in the calendar header. See locale
    * 
    */
  var dayWidth: String = js.native
  /**
    * 
    */
  var dowTemplateString: String = js.native
  /**
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_CalendarLite_ : String = js.native
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
    * The currently selected Date, initially set to invalid date to indicate no selection.
    * 
    */
  var value: Date = js.native
  /**
    * 
    */
  var weekTemplateString: String = js.native
  /**
    * Focus the calendar by focusing one of the calendar cells
    * 
    */
  def focus(): Unit = js.native
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
  def getClassForDate(dateObject: Date): String = js.native
  def getClassForDate(dateObject: Date, locale: String): String = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_currentFocus(property: currentFocus): Date = js.native
  @JSName("get")
  def get_datePackage(property: datePackage): String = js.native
  @JSName("get")
  def get_dateTemplateString(property: dateTemplateString): String = js.native
  @JSName("get")
  def get_dayWidth(property: dayWidth): String = js.native
  @JSName("get")
  def get_dowTemplateString(property: dowTemplateString): String = js.native
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
  def get_weekTemplateString(property: weekTemplateString): String = js.native
  /**
    * Sets calendar's value to today's date
    * 
    */
  def goToToday(): Unit = js.native
  /**
    * May be overridden to disable certain dates in the calendar e.g. isDisabledDate=dojo.date.locale.isWeekend
    * 
    * @param dateObject             
    * @param locale               Optional            
    */
  def isDisabledDate(dateObject: Date): Boolean = js.native
  def isDisabledDate(dateObject: Date, locale: String): Boolean = js.native
  /**
    * Called only when the selected date has changed
    * 
    * @param date             
    */
  def onChange(date: Date): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_currentFocus(property: currentFocus, value: Date): Unit = js.native
  @JSName("set")
  def set_datePackage(property: datePackage, value: String): Unit = js.native
  @JSName("set")
  def set_dateTemplateString(property: dateTemplateString, value: String): Unit = js.native
  @JSName("set")
  def set_dayWidth(property: dayWidth, value: String): Unit = js.native
  @JSName("set")
  def set_dowTemplateString(property: dowTemplateString, value: String): Unit = js.native
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
  def set_weekTemplateString(property: weekTemplateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_currentFocus(
    property: currentFocus,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datePackage(
    property: datePackage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dateTemplateString(
    property: dateTemplateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dayWidth(
    property: dayWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dowTemplateString(
    property: dowTemplateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_weekTemplateString(
    property: weekTemplateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

