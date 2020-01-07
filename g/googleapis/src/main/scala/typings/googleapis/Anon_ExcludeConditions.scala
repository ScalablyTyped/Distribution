package typings.googleapis

import typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Schema$IncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExcludeConditions extends js.Object {
  var excludeConditions: js.UndefOr[Anon_ExclusionDuration] = js.native
  var includeConditions: js.UndefOr[Schema$IncludeConditions] = js.native
}

object Anon_ExcludeConditions {
  @scala.inline
  def apply(
    excludeConditions: Anon_ExclusionDuration = null,
    includeConditions: Schema$IncludeConditions = null
  ): Anon_ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions.asInstanceOf[js.Any])
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeConditions]
  }
}

