package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeConditions extends js.Object {
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.native
}

object IncludeConditions {
  @scala.inline
  def apply(includeConditions: SchemaIncludeConditions = null): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeConditions]
  }
}

