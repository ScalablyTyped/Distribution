package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was created by copying an existing object.
  */
@js.native
trait Schema$Copy extends js.Object {
  /**
    * The the original object.
    */
  var originalObject: js.UndefOr[Schema$TargetReference] = js.native
}

object Schema$Copy {
  @scala.inline
  def apply(originalObject: Schema$TargetReference = null): Schema$Copy = {
    val __obj = js.Dynamic.literal()
    if (originalObject != null) __obj.updateDynamic("originalObject")(originalObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Copy]
  }
}

