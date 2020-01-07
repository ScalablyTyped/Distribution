package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying an adjustment to the likelihood of a finding as part
  * of a detection rule.
  */
@js.native
trait Schema$GooglePrivacyDlpV2LikelihoodAdjustment extends js.Object {
  /**
    * Set the likelihood of a finding to a fixed value.
    */
  var fixedLikelihood: js.UndefOr[String] = js.native
  /**
    * Increase or decrease the likelihood by the specified number of levels.
    * For example, if a finding would be `POSSIBLE` without the detection rule
    * and `relative_likelihood` is 1, then it is upgraded to `LIKELY`, while a
    * value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop
    * below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment
    * of 1 followed by an adjustment of -1 when base likelihood is
    * `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
    */
  var relativeLikelihood: js.UndefOr[Double] = js.native
}

object Schema$GooglePrivacyDlpV2LikelihoodAdjustment {
  @scala.inline
  def apply(fixedLikelihood: String = null, relativeLikelihood: Int | Double = null): Schema$GooglePrivacyDlpV2LikelihoodAdjustment = {
    val __obj = js.Dynamic.literal()
    if (fixedLikelihood != null) __obj.updateDynamic("fixedLikelihood")(fixedLikelihood.asInstanceOf[js.Any])
    if (relativeLikelihood != null) __obj.updateDynamic("relativeLikelihood")(relativeLikelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2LikelihoodAdjustment]
  }
}

