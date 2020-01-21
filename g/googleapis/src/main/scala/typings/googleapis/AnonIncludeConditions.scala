package typings.googleapis

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeConditions extends js.Object {
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.native
}

object AnonIncludeConditions {
  @scala.inline
  def apply(includeConditions: SchemaIncludeConditions = null): AnonIncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeConditions]
  }
}

