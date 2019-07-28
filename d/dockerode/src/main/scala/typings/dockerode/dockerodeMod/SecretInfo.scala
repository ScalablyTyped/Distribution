package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretInfo extends js.Object {
  var CreatedAt: String
  var ID: String
  var Spec: js.UndefOr[ServiceSpec] = js.undefined
  var UpdatedAt: js.UndefOr[String] = js.undefined
  var Version: SecretVersion
}

object SecretInfo {
  @scala.inline
  def apply(
    CreatedAt: String,
    ID: String,
    Version: SecretVersion,
    Spec: ServiceSpec = null,
    UpdatedAt: String = null
  ): SecretInfo = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt, ID = ID, Version = Version)
    if (Spec != null) __obj.updateDynamic("Spec")(Spec)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[SecretInfo]
  }
}

