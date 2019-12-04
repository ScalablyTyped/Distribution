package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affects extends js.Object {
  var affects: js.UndefOr[js.Array[Query]] = js.undefined
  var removed: js.UndefOr[js.Array[Query]] = js.undefined
}

object Anon_Affects {
  @scala.inline
  def apply(affects: js.Array[Query] = null, removed: js.Array[Query] = null): Anon_Affects = {
    val __obj = js.Dynamic.literal()
    if (affects != null) __obj.updateDynamic("affects")(affects.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Affects]
  }
}

