package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadLineItemsResponse extends js.Object {
  /** Retrieved line items in CSV format. For more information about file formats, see  Entity Write File Format. */
  var lineItems: js.UndefOr[String] = js.native
}

object DownloadLineItemsResponse {
  @scala.inline
  def apply(): DownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadLineItemsResponse]
  }
  @scala.inline
  implicit class DownloadLineItemsResponseOps[Self <: DownloadLineItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLineItems(value: String): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
  }
  
}

