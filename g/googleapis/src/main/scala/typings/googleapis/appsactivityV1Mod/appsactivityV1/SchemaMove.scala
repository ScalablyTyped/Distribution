package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about changes in an object&#39;s parents as a result
  * of a move type event.
  */
@js.native
trait SchemaMove extends js.Object {
  /**
    * The added parent(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaParent]] = js.native
  /**
    * The removed parent(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaParent]] = js.native
}

object SchemaMove {
  @scala.inline
  def apply(addedParents: js.Array[SchemaParent] = null, removedParents: js.Array[SchemaParent] = null): SchemaMove = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents.asInstanceOf[js.Any])
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMove]
  }
}

