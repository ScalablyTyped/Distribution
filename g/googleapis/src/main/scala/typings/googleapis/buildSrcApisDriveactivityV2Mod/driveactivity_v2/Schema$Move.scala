package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was moved.
  */
@js.native
trait Schema$Move extends js.Object {
  /**
    * The added parent object(s).
    */
  var addedParents: js.UndefOr[js.Array[Schema$TargetReference]] = js.native
  /**
    * The removed parent object(s).
    */
  var removedParents: js.UndefOr[js.Array[Schema$TargetReference]] = js.native
}

object Schema$Move {
  @scala.inline
  def apply(
    addedParents: js.Array[Schema$TargetReference] = null,
    removedParents: js.Array[Schema$TargetReference] = null
  ): Schema$Move = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents.asInstanceOf[js.Any])
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Move]
  }
}

