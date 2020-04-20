package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDoubleclickbidmanager.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: AnonAlt): Request_[DownloadLineItemsResponse]
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: AnonAlt): Request_[UploadLineItemsResponse]
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: AnonAlt => Request_[DownloadLineItemsResponse],
    uploadlineitems: AnonAlt => Request_[UploadLineItemsResponse]
  ): LineitemsResource = {
    val __obj = js.Dynamic.literal(downloadlineitems = js.Any.fromFunction1(downloadlineitems), uploadlineitems = js.Any.fromFunction1(uploadlineitems))
    __obj.asInstanceOf[LineitemsResource]
  }
}

