package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Environments Response.
  */
@js.native
trait Schema$ListEnvironmentsResponse extends js.Object {
  /**
    * All Environments of a GTM Container.
    */
  var environments: js.UndefOr[js.Array[Schema$Environment]] = js.native
}

object Schema$ListEnvironmentsResponse {
  @scala.inline
  def apply(environments: js.Array[Schema$Environment] = null): Schema$ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListEnvironmentsResponse]
  }
}

