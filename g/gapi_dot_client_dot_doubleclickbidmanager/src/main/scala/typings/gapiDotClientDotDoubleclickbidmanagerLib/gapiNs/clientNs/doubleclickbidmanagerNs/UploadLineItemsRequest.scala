package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLineItemsRequest extends js.Object {
  /** Set to true to get upload status without actually persisting the line items. */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /** Format the line items are in. Default to CSV. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Line items in CSV to upload. Refer to  Entity Write File Format for more information on file format. */
  var lineItems: js.UndefOr[java.lang.String] = js.undefined
}

object UploadLineItemsRequest {
  @scala.inline
  def apply(
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    lineItems: java.lang.String = null
  ): UploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (format != null) __obj.updateDynamic("format")(format)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    __obj.asInstanceOf[UploadLineItemsRequest]
  }
}

