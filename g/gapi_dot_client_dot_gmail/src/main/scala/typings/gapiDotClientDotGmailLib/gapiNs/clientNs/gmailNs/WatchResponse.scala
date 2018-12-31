package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchResponse extends js.Object {
  /** When Gmail will stop sending notifications for mailbox updates (epoch millis). Call watch again before this time to renew the watch. */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
}

