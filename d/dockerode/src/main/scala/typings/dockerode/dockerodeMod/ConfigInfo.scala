package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigInfo extends js.Object {
  var CreatedAt: String
  var ID: String
  var Spec: js.UndefOr[ConfigSpec] = js.undefined
  var UpdatedAt: js.UndefOr[String] = js.undefined
  var Version: SecretVersion
}

object ConfigInfo {
  @scala.inline
  def apply(
    CreatedAt: String,
    ID: String,
    Version: SecretVersion,
    Spec: ConfigSpec = null,
    UpdatedAt: String = null
  ): ConfigInfo = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt, ID = ID, Version = Version)
    if (Spec != null) __obj.updateDynamic("Spec")(Spec)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[ConfigInfo]
  }
}

