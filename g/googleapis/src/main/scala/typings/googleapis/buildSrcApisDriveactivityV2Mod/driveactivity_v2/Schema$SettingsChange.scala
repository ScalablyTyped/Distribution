package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about settings changes.
  */
@js.native
trait Schema$SettingsChange extends js.Object {
  /**
    * The set of changes made to restrictions.
    */
  var restrictionChanges: js.UndefOr[js.Array[Schema$RestrictionChange]] = js.native
}

object Schema$SettingsChange {
  @scala.inline
  def apply(restrictionChanges: js.Array[Schema$RestrictionChange] = null): Schema$SettingsChange = {
    val __obj = js.Dynamic.literal()
    if (restrictionChanges != null) __obj.updateDynamic("restrictionChanges")(restrictionChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SettingsChange]
  }
}

