package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAction extends js.Object {
  /** List of labels to add to the message. */
  var addLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Email address that the message should be forwarded to. */
  var forward: js.UndefOr[java.lang.String] = js.undefined
  /** List of labels to remove from the message. */
  var removeLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

