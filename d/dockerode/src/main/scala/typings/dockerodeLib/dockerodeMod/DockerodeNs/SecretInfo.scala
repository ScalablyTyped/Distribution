package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretInfo extends js.Object {
  var CreatedAt: java.lang.String
  var ID: java.lang.String
  var Spec: js.UndefOr[ServiceSpec] = js.undefined
  var UpdatedAt: js.UndefOr[java.lang.String] = js.undefined
  var Version: SecretVersion
}

object SecretInfo {
  @scala.inline
  def apply(
    CreatedAt: java.lang.String,
    ID: java.lang.String,
    Version: SecretVersion,
    Spec: ServiceSpec = null,
    UpdatedAt: java.lang.String = null
  ): SecretInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CreatedAt")(CreatedAt)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Version")(Version)
    if (Spec != null) __obj.updateDynamic("Spec")(Spec)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[SecretInfo]
  }
}

