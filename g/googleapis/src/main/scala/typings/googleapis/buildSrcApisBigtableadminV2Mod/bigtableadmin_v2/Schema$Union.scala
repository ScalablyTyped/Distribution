package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GcRule which deletes cells matching any of the given rules.
  */
@js.native
trait Schema$Union extends js.Object {
  /**
    * Delete cells which would be deleted by any element of `rules`.
    */
  var rules: js.UndefOr[js.Array[Schema$GcRule]] = js.native
}

object Schema$Union {
  @scala.inline
  def apply(rules: js.Array[Schema$GcRule] = null): Schema$Union = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Union]
  }
}

