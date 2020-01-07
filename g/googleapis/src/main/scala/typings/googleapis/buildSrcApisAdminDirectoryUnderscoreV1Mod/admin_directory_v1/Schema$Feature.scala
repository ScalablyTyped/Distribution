package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Feature object in Directory API.
  */
@js.native
trait Schema$Feature extends js.Object {
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the feature.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Feature {
  @scala.inline
  def apply(etags: String = null, kind: String = null, name: String = null): Schema$Feature = {
    val __obj = js.Dynamic.literal()
    if (etags != null) __obj.updateDynamic("etags")(etags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Feature]
  }
}

