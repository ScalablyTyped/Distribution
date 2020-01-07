package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GcRule which deletes cells matching all of the given rules.
  */
@js.native
trait Schema$Intersection extends js.Object {
  /**
    * Only delete cells which would be deleted by every element of `rules`.
    */
  var rules: js.UndefOr[js.Array[Schema$GcRule]] = js.native
}

object Schema$Intersection {
  @scala.inline
  def apply(rules: js.Array[Schema$GcRule] = null): Schema$Intersection = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Intersection]
  }
}

