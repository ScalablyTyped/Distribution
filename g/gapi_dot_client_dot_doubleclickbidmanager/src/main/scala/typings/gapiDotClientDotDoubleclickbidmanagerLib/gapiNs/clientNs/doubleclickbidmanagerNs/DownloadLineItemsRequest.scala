package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadLineItemsRequest extends js.Object {
  /** File specification (column names, types, order) in which the line items will be returned. Default to EWF. */
  var fileSpec: js.UndefOr[java.lang.String] = js.undefined
  /** Ids of the specified filter type used to filter line items to fetch. If omitted, all the line items will be returned. */
  var filterIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[java.lang.String] = js.undefined
  /** Format in which the line items will be returned. Default to CSV. */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

