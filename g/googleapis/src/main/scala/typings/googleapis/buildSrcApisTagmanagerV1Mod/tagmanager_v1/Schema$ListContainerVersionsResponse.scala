package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List container versions response.
  */
@js.native
trait Schema$ListContainerVersionsResponse extends js.Object {
  /**
    * All versions of a GTM Container.
    */
  var containerVersion: js.UndefOr[js.Array[Schema$ContainerVersion]] = js.native
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[Schema$ContainerVersionHeader]] = js.native
}

object Schema$ListContainerVersionsResponse {
  @scala.inline
  def apply(
    containerVersion: js.Array[Schema$ContainerVersion] = null,
    containerVersionHeader: js.Array[Schema$ContainerVersionHeader] = null
  ): Schema$ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListContainerVersionsResponse]
  }
}

