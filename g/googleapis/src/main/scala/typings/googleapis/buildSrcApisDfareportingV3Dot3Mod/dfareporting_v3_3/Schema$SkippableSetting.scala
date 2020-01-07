package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Skippable Settings
  */
@js.native
trait Schema$SkippableSetting extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#skippableSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Amount of time to play videos served to this placement before counting a
    * view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[Schema$VideoOffset] = js.native
  /**
    * Amount of time to play videos served to this placement before the skip
    * button should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[Schema$VideoOffset] = js.native
  /**
    * Whether the user can skip creatives served to this placement.
    */
  var skippable: js.UndefOr[Boolean] = js.native
}

object Schema$SkippableSetting {
  @scala.inline
  def apply(
    kind: String = null,
    progressOffset: Schema$VideoOffset = null,
    skipOffset: Schema$VideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined
  ): Schema$SkippableSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset.asInstanceOf[js.Any])
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SkippableSetting]
  }
}

