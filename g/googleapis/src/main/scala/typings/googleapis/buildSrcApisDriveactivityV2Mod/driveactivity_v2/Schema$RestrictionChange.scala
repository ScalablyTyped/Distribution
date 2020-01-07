package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about restriction policy changes to a feature.
  */
@js.native
trait Schema$RestrictionChange extends js.Object {
  /**
    * The feature which had a change in restriction policy.
    */
  var feature: js.UndefOr[String] = js.native
  /**
    * The restriction in place after the change.
    */
  var newRestriction: js.UndefOr[String] = js.native
}

object Schema$RestrictionChange {
  @scala.inline
  def apply(feature: String = null, newRestriction: String = null): Schema$RestrictionChange = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (newRestriction != null) __obj.updateDynamic("newRestriction")(newRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RestrictionChange]
  }
}

