package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadRequest extends js.Object {
  /** File types that will be returned. */
  var fileTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID must be specified. Only one ID is allowed for the
               * ADVERTISER_ID filter type. For INSERTION_ORDER_ID or LINE_ITEM_ID filter types, all IDs must be from the same Advertiser.
               */
  var filterIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[java.lang.String] = js.undefined
  /** SDF Version (column names, types, order) in which the entities will be returned. Default to 3. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

