package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BatchDeleteMessagesRequest extends js.Object {
  /**
    * The IDs of the messages to delete.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
}

object Schema$BatchDeleteMessagesRequest {
  @scala.inline
  def apply(ids: js.Array[String] = null): Schema$BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchDeleteMessagesRequest]
  }
}

