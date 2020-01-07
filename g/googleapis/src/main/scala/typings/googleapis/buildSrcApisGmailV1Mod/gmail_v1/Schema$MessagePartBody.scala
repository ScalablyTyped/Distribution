package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The body of a single MIME message part.
  */
@js.native
trait Schema$MessagePartBody extends js.Object {
  /**
    * When present, contains the ID of an external attachment that can be
    * retrieved in a separate messages.attachments.get request. When not
    * present, the entire content of the message part body is contained in the
    * data field.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The body data of a MIME message part as a base64url encoded string. May
    * be empty for MIME container types that have no message body or when the
    * body data is sent as a separate attachment. An attachment ID is present
    * if the body data is contained in a separate attachment.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Number of bytes for the message part data (encoding notwithstanding).
    */
  var size: js.UndefOr[Double] = js.native
}

object Schema$MessagePartBody {
  @scala.inline
  def apply(attachmentId: String = null, data: String = null, size: Int | Double = null): Schema$MessagePartBody = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MessagePartBody]
  }
}

