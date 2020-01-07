package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set the scoring configuration. This allows modifying the ranking of results
  * for a source.
  */
@js.native
trait Schema$SourceScoringConfig extends js.Object {
  /**
    * Importance of the source.
    */
  var sourceImportance: js.UndefOr[String] = js.native
}

object Schema$SourceScoringConfig {
  @scala.inline
  def apply(sourceImportance: String = null): Schema$SourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    if (sourceImportance != null) __obj.updateDynamic("sourceImportance")(sourceImportance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceScoringConfig]
  }
}

