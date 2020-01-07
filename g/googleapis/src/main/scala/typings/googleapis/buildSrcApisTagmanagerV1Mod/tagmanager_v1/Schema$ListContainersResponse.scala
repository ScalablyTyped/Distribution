package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Containers Response.
  */
@js.native
trait Schema$ListContainersResponse extends js.Object {
  /**
    * All Containers of a GTM Account.
    */
  var containers: js.UndefOr[js.Array[Schema$Container]] = js.native
}

object Schema$ListContainersResponse {
  @scala.inline
  def apply(containers: js.Array[Schema$Container] = null): Schema$ListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListContainersResponse]
  }
}

