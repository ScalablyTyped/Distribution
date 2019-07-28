package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFailureEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the failure type.
    */
  var failureType: js.UndefOr[String] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model] = js.undefined
  /** Returns the status index.
    */
  var status: js.UndefOr[Double] = js.undefined
  /** Returns the status in text.
    */
  var statusText: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OpenFailureEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    failureType: String = null,
    model: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model = null,
    status: Int | Double = null,
    statusText: String = null,
    `type`: String = null
  ): OpenFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (failureType != null) __obj.updateDynamic("failureType")(failureType)
    if (model != null) __obj.updateDynamic("model")(model)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OpenFailureEventArgs]
  }
}

