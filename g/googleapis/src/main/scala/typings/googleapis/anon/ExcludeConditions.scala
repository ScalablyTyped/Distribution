package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeConditions extends js.Object {
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.native
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.native
}

object ExcludeConditions {
  @scala.inline
  def apply(excludeConditions: ExclusionDuration = null, includeConditions: SchemaIncludeConditions = null): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions.asInstanceOf[js.Any])
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeConditions]
  }
}

