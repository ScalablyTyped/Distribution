package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for renaming a feature.
  */
@js.native
trait Schema$FeatureRename extends js.Object {
  /**
    * New name of the feature.
    */
  var newName: js.UndefOr[String] = js.native
}

object Schema$FeatureRename {
  @scala.inline
  def apply(newName: String = null): Schema$FeatureRename = {
    val __obj = js.Dynamic.literal()
    if (newName != null) __obj.updateDynamic("newName")(newName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FeatureRename]
  }
}

