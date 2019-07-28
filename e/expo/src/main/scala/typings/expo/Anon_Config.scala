package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[Anon_Fabric] = js.undefined
  var `package`: js.UndefOr[String] = js.undefined
  var versionCode: js.UndefOr[String] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: Anon_Fabric = null, `package`: String = null, versionCode: String = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode)
    __obj.asInstanceOf[Anon_Config]
  }
}

