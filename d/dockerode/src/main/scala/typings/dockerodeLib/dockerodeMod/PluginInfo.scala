package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInfo extends js.Object {
  var Config: PluginConfig
  var Enabled: scala.Boolean
  var Id: js.UndefOr[java.lang.String] = js.undefined
  var Name: java.lang.String
  var PluginReference: js.UndefOr[java.lang.String] = js.undefined
  var Settings: PluginSettings
}

object PluginInfo {
  @scala.inline
  def apply(
    Config: PluginConfig,
    Enabled: scala.Boolean,
    Name: java.lang.String,
    Settings: PluginSettings,
    Id: java.lang.String = null,
    PluginReference: java.lang.String = null
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(Config = Config, Enabled = Enabled, Name = Name, Settings = Settings)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (PluginReference != null) __obj.updateDynamic("PluginReference")(PluginReference)
    __obj.asInstanceOf[PluginInfo]
  }
}

