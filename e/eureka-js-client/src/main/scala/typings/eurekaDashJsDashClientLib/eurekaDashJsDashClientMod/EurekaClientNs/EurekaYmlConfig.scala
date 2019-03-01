package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaYmlConfig extends js.Object {
  var cwd: java.lang.String
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object EurekaYmlConfig {
  @scala.inline
  def apply(cwd: java.lang.String, filename: java.lang.String = null): EurekaYmlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cwd")(cwd)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[EurekaYmlConfig]
  }
}

