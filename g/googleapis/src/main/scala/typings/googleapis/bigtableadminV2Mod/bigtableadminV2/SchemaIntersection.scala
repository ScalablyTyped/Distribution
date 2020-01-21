package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GcRule which deletes cells matching all of the given rules.
  */
@js.native
trait SchemaIntersection extends js.Object {
  /**
    * Only delete cells which would be deleted by every element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.native
}

object SchemaIntersection {
  @scala.inline
  def apply(rules: js.Array[SchemaGcRule] = null): SchemaIntersection = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIntersection]
  }
}

