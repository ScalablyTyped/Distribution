package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BatchModifyMessagesRequest extends js.Object {
  /** A list of label IDs to add to messages. */
  var addLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The IDs of the messages to modify. There is a limit of 1000 ids per request. */
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of label IDs to remove from messages. */
  var removeLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

