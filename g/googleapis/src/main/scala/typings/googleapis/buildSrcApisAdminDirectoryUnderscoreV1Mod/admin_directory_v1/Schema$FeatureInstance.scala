package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a &quot;feature instance&quot;.
  */
@js.native
trait Schema$FeatureInstance extends js.Object {
  /**
    * The feature that this is an instance of. A calendar resource may have
    * multiple instances of a feature.
    */
  var feature: js.UndefOr[Schema$Feature] = js.native
}

object Schema$FeatureInstance {
  @scala.inline
  def apply(feature: Schema$Feature = null): Schema$FeatureInstance = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FeatureInstance]
  }
}

