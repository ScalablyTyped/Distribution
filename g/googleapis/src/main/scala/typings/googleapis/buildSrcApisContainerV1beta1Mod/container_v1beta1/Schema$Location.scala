package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location returns the location name, and if the location is recommended for
  * GKE cluster scheduling.
  */
@js.native
trait Schema$Location extends js.Object {
  /**
    * Contains the name of the resource requested. Specified in the format
    * &#39;projects/x/locations/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the location is recomended for GKE cluster scheduling.
    */
  var recommended: js.UndefOr[Boolean] = js.native
  /**
    * Contains the type of location this Location is for. Regional or Zonal.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Location {
  @scala.inline
  def apply(name: String = null, recommended: js.UndefOr[Boolean] = js.undefined, `type`: String = null): Schema$Location = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(recommended)) __obj.updateDynamic("recommended")(recommended.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Location]
  }
}

