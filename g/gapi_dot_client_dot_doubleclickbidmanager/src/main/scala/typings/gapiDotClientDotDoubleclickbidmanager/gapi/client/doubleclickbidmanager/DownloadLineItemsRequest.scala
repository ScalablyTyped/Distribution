package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadLineItemsRequest extends js.Object {
  /** File specification (column names, types, order) in which the line items will be returned. Default to EWF. */
  var fileSpec: js.UndefOr[String] = js.undefined
  /** Ids of the specified filter type used to filter line items to fetch. If omitted, all the line items will be returned. */
  var filterIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[String] = js.undefined
  /** Format in which the line items will be returned. Default to CSV. */
  var format: js.UndefOr[String] = js.undefined
}

object DownloadLineItemsRequest {
  @scala.inline
  def apply(
    fileSpec: String = null,
    filterIds: js.Array[String] = null,
    filterType: String = null,
    format: String = null
  ): DownloadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (fileSpec != null) __obj.updateDynamic("fileSpec")(fileSpec)
    if (filterIds != null) __obj.updateDynamic("filterIds")(filterIds)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[DownloadLineItemsRequest]
  }
}

