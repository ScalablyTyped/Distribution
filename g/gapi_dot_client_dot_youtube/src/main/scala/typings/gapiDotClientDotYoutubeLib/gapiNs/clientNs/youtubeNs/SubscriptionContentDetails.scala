package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContentDetails extends js.Object {
  /** The type of activity this subscription is for (only uploads, everything). */
  var activityType: js.UndefOr[java.lang.String] = js.undefined
  /** The number of new items in the subscription since its content was last read. */
  var newItemCount: js.UndefOr[scala.Double] = js.undefined
  /** The approximate number of items that the subscription points to. */
  var totalItemCount: js.UndefOr[scala.Double] = js.undefined
}

