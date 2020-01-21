package typings.googleapis

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeConditions extends js.Object {
  var excludeConditions: js.UndefOr[AnonExclusionDuration] = js.native
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.native
}

object AnonExcludeConditions {
  @scala.inline
  def apply(excludeConditions: AnonExclusionDuration = null, includeConditions: SchemaIncludeConditions = null): AnonExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions.asInstanceOf[js.Any])
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeConditions]
  }
}

