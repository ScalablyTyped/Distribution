package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkippableSetting extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#skippableSetting". */
  var kind: js.UndefOr[String] = js.undefined
  /** Amount of time to play videos served to this placement before counting a view. Applicable when skippable is true. */
  var progressOffset: js.UndefOr[VideoOffset] = js.undefined
  /** Amount of time to play videos served to this placement before the skip button should appear. Applicable when skippable is true. */
  var skipOffset: js.UndefOr[VideoOffset] = js.undefined
  /** Whether the user can skip creatives served to this placement. */
  var skippable: js.UndefOr[Boolean] = js.undefined
}

object SkippableSetting {
  @scala.inline
  def apply(
    kind: String = null,
    progressOffset: VideoOffset = null,
    skipOffset: VideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined
  ): SkippableSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset.asInstanceOf[js.Any])
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkippableSetting]
  }
}

