package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSendAs method.
  */
@js.native
trait Schema$ListSendAsResponse extends js.Object {
  /**
    * List of send-as aliases.
    */
  var sendAs: js.UndefOr[js.Array[Schema$SendAs]] = js.native
}

object Schema$ListSendAsResponse {
  @scala.inline
  def apply(sendAs: js.Array[Schema$SendAs] = null): Schema$ListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    if (sendAs != null) __obj.updateDynamic("sendAs")(sendAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSendAsResponse]
  }
}

