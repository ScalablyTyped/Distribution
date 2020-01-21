package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInfo extends js.Object {
  var Config: PluginConfig
  var Enabled: Boolean
  var Id: js.UndefOr[String] = js.undefined
  var Name: String
  var PluginReference: js.UndefOr[String] = js.undefined
  var Settings: PluginSettings
}

object PluginInfo {
  @scala.inline
  def apply(
    Config: PluginConfig,
    Enabled: Boolean,
    Name: String,
    Settings: PluginSettings,
    Id: String = null,
    PluginReference: String = null
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (PluginReference != null) __obj.updateDynamic("PluginReference")(PluginReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInfo]
  }
}

