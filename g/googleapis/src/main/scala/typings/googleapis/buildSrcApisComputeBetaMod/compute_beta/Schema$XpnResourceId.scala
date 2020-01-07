package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service resource (a.k.a service project) ID.
  */
@js.native
trait Schema$XpnResourceId extends js.Object {
  /**
    * The ID of the service resource. In the case of projects, this field
    * supports project id (e.g., my-project-123) and project number (e.g.
    * 12345678).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of the service resource.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$XpnResourceId {
  @scala.inline
  def apply(id: String = null, `type`: String = null): Schema$XpnResourceId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$XpnResourceId]
  }
}

