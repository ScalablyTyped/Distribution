package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Thread extends js.Object {
  /** The ID of the last history record that modified this thread. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID of the thread. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The list of messages in the thread. */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  /** A short part of the message text. */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
}

