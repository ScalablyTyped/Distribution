package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DownloadLineItemsResponse]
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[UploadLineItemsResponse]
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[DownloadLineItemsResponse],
    uploadlineitems: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[UploadLineItemsResponse]
  ): LineitemsResource = {
    val __obj = js.Dynamic.literal(downloadlineitems = js.Any.fromFunction1(downloadlineitems), uploadlineitems = js.Any.fromFunction1(uploadlineitems))
  
    __obj.asInstanceOf[LineitemsResource]
  }
}

