package typings.dojo.dijit.CalendarLite

import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/CalendarLite._MonthWidget.html
  *
  * Displays name of current month padded to the width of the month
  * w/the longest name, so that changing months doesn't change width.
  * 
  * Create as:
  * 
  * new Calendar._MonthWidget({
  *         lang: ...,
  *         dateLocaleModule: ...
  *     })
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.CalendarLite._MonthWidget")
@js.native
class MonthWidget () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_MonthWidget: String = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
}

