package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Google Tag Manager Container access permissions.
  */
@js.native
trait Schema$ContainerAccess extends js.Object {
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * List of Container permissions. Valid container permissions are: read,
    * edit, delete, publish.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ContainerAccess {
  @scala.inline
  def apply(containerId: String = null, permission: js.Array[String] = null): Schema$ContainerAccess = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContainerAccess]
  }
}

