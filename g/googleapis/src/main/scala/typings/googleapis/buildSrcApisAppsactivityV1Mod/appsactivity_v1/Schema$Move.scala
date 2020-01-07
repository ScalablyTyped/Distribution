package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about changes in an object&#39;s parents as a result
  * of a move type event.
  */
@js.native
trait Schema$Move extends js.Object {
  /**
    * The added parent(s).
    */
  var addedParents: js.UndefOr[js.Array[Schema$Parent]] = js.native
  /**
    * The removed parent(s).
    */
  var removedParents: js.UndefOr[js.Array[Schema$Parent]] = js.native
}

object Schema$Move {
  @scala.inline
  def apply(addedParents: js.Array[Schema$Parent] = null, removedParents: js.Array[Schema$Parent] = null): Schema$Move = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents.asInstanceOf[js.Any])
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Move]
  }
}

