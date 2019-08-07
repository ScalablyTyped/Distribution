package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxTimeEdit control.
  */
@JSGlobal("ASPxClientTimeEdit")
@js.native
class ASPxClientTimeEdit () extends ASPxClientSpinEditBase {
  /**
    * Fires after the selected date has been changed within the time editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimeEdit]] = js.native
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): Date = js.native
  /**
    * Specifies the date for the editor.
    * @param date A DateTime object that is the date.
    */
  def SetDate(date: Date): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientTimeEdit")
@js.native
object ASPxClientTimeEdit extends js.Object {
  /**
    * Converts the specified object to the ASPxClientTimeEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientTimeEdit = js.native
}

