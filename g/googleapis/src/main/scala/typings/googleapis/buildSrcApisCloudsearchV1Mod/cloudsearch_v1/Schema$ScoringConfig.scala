package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scoring configurations for a source while processing a Search or Suggest
  * request.
  */
@js.native
trait Schema$ScoringConfig extends js.Object {
  /**
    * Whether to use freshness as a ranking signal. By default, freshness is
    * used as a ranking signal. Note that this setting is not available in the
    * Admin UI.
    */
  var disableFreshness: js.UndefOr[Boolean] = js.native
  /**
    * Whether to personalize the results. By default, personal signals will be
    * used to boost results.
    */
  var disablePersonalization: js.UndefOr[Boolean] = js.native
}

object Schema$ScoringConfig {
  @scala.inline
  def apply(
    disableFreshness: js.UndefOr[Boolean] = js.undefined,
    disablePersonalization: js.UndefOr[Boolean] = js.undefined
  ): Schema$ScoringConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableFreshness)) __obj.updateDynamic("disableFreshness")(disableFreshness.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePersonalization)) __obj.updateDynamic("disablePersonalization")(disablePersonalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScoringConfig]
  }
}

