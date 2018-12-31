package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItem extends js.Object {
  /** A custom message to display for this promotion. This field is currently ignored unless the promoted item is a website. */
  var customMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the promoted item. */
  var id: js.UndefOr[PromotedItemId] = js.undefined
  /**
    * If true, the content owner's name will be used when displaying the promotion. This field can only be set when the update is made on behalf of the
    * content owner.
    */
  var promotedByContentOwner: js.UndefOr[scala.Boolean] = js.undefined
  /** The temporal position within the video where the promoted item will be displayed. If present, it overrides the default timing. */
  var timing: js.UndefOr[InvideoTiming] = js.undefined
}

