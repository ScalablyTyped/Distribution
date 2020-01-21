package typings.dojo.dijit.Calendar

import typings.dojo.dijit.form.DropDownButton
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Calendar._MonthDropDownButton.html
  *
  * DropDownButton for the current month.    Displays name of current month
  * and a list of month names in the drop down
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.Calendar._MonthDropDownButton")
@js.native
class MonthDropDownButton () extends DropDownButton {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  def onMonthSelect(): Unit = js.native
}

