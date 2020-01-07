package typings.googleapis

import typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Schema$IncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IncludeConditions extends js.Object {
  var includeConditions: js.UndefOr[Schema$IncludeConditions] = js.native
}

object Anon_IncludeConditions {
  @scala.inline
  def apply(includeConditions: Schema$IncludeConditions = null): Anon_IncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeConditions]
  }
}

