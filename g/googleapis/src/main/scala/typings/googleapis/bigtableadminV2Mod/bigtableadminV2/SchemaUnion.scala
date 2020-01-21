package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GcRule which deletes cells matching any of the given rules.
  */
@js.native
trait SchemaUnion extends js.Object {
  /**
    * Delete cells which would be deleted by any element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.native
}

object SchemaUnion {
  @scala.inline
  def apply(rules: js.Array[SchemaGcRule] = null): SchemaUnion = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnion]
  }
}

