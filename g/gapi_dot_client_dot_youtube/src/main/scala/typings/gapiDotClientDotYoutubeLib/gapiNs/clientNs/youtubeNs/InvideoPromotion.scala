package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoPromotion extends js.Object {
  /** The default temporal position within the video where the promoted item will be displayed. Can be overriden by more specific timing in the item. */
  var defaultTiming: js.UndefOr[InvideoTiming] = js.undefined
  /** List of promoted items in decreasing priority. */
  var items: js.UndefOr[js.Array[PromotedItem]] = js.undefined
  /** The spatial position within the video where the promoted item will be displayed. */
  var position: js.UndefOr[InvideoPosition] = js.undefined
  /**
    * Indicates whether the channel's promotional campaign uses "smart timing." This feature attempts to show promotions at a point in the video when they
    * are more likely to be clicked and less likely to disrupt the viewing experience. This feature also picks up a single promotion to show on each video.
    */
  var useSmartTiming: js.UndefOr[scala.Boolean] = js.undefined
}

