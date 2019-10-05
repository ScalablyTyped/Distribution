package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDoubleclickbidmanager.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: Anon_Alt): Request[DownloadLineItemsResponse]
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: Anon_Alt): Request[UploadLineItemsResponse]
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: Anon_Alt => Request[DownloadLineItemsResponse],
    uploadlineitems: Anon_Alt => Request[UploadLineItemsResponse]
  ): LineitemsResource = {
    val __obj = js.Dynamic.literal(downloadlineitems = js.Any.fromFunction1(downloadlineitems), uploadlineitems = js.Any.fromFunction1(uploadlineitems))
  
    __obj.asInstanceOf[LineitemsResource]
  }
}

