package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input field that allows inputing a date.
  */
@js.native
trait DatePicker extends js.Object {
  def setFieldName(fieldName: String): DatePicker = js.native
  def setOnChangeAction(action: Action): DatePicker = js.native
  def setTitle(title: String): DatePicker = js.native
  def setValueInMsSinceEpoch(valueMsEpoch: String): DatePicker = js.native
  def setValueInMsSinceEpoch(valueMsEpoch: Double): DatePicker = js.native
}

