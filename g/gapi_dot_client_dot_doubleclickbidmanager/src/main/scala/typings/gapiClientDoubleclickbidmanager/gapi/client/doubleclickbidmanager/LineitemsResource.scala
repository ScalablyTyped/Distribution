package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclickbidmanager.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: Alt): Request[DownloadLineItemsResponse]
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: Alt): Request[UploadLineItemsResponse]
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: Alt => Request[DownloadLineItemsResponse],
    uploadlineitems: Alt => Request[UploadLineItemsResponse]
  ): LineitemsResource = {
    val __obj = js.Dynamic.literal(downloadlineitems = js.Any.fromFunction1(downloadlineitems), uploadlineitems = js.Any.fromFunction1(uploadlineitems))
    __obj.asInstanceOf[LineitemsResource]
  }
}

