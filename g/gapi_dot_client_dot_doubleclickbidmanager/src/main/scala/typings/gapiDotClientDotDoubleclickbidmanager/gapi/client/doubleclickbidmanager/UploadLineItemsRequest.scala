package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLineItemsRequest extends js.Object {
  /** Set to true to get upload status without actually persisting the line items. */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  /** Format the line items are in. Default to CSV. */
  var format: js.UndefOr[String] = js.undefined
  /** Line items in CSV to upload. Refer to  Entity Write File Format for more information on file format. */
  var lineItems: js.UndefOr[String] = js.undefined
}

object UploadLineItemsRequest {
  @scala.inline
  def apply(dryRun: js.UndefOr[Boolean] = js.undefined, format: String = null, lineItems: String = null): UploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLineItemsRequest]
  }
}

