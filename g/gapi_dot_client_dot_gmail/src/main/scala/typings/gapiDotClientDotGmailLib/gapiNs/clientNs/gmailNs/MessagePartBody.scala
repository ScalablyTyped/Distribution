package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePartBody extends js.Object {
  /**
    * When present, contains the ID of an external attachment that can be retrieved in a separate messages.attachments.get request. When not present, the
    * entire content of the message part body is contained in the data field.
    */
  var attachmentId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The body data of a MIME message part as a base64url encoded string. May be empty for MIME container types that have no message body or when the body
    * data is sent as a separate attachment. An attachment ID is present if the body data is contained in a separate attachment.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Number of bytes for the message part data (encoding notwithstanding). */
  var size: js.UndefOr[scala.Double] = js.undefined
}

