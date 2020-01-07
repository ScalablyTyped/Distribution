package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configurations for a source while processing a Search or Suggest request.
  */
@js.native
trait Schema$SourceConfig extends js.Object {
  /**
    * The crowding configuration for the source.
    */
  var crowdingConfig: js.UndefOr[Schema$SourceCrowdingConfig] = js.native
  /**
    * The scoring configuration for the source.
    */
  var scoringConfig: js.UndefOr[Schema$SourceScoringConfig] = js.native
  /**
    * The source for which this configuration is to be used.
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$SourceConfig {
  @scala.inline
  def apply(
    crowdingConfig: Schema$SourceCrowdingConfig = null,
    scoringConfig: Schema$SourceScoringConfig = null,
    source: Schema$Source = null
  ): Schema$SourceConfig = {
    val __obj = js.Dynamic.literal()
    if (crowdingConfig != null) __obj.updateDynamic("crowdingConfig")(crowdingConfig.asInstanceOf[js.Any])
    if (scoringConfig != null) __obj.updateDynamic("scoringConfig")(scoringConfig.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceConfig]
  }
}

