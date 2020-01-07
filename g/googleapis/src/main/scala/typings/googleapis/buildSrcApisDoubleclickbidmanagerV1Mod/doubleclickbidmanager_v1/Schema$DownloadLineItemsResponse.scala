package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Download line items response.
  */
@js.native
trait Schema$DownloadLineItemsResponse extends js.Object {
  /**
    * Retrieved line items in CSV format. For more information about file
    * formats, see  Entity Write File Format.
    */
  var lineItems: js.UndefOr[String] = js.native
}

object Schema$DownloadLineItemsResponse {
  @scala.inline
  def apply(lineItems: String = null): Schema$DownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DownloadLineItemsResponse]
  }
}

