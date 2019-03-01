package typings
package electronLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessVersions extends js.Object {
  var chrome: java.lang.String
  var electron: java.lang.String
}

object ProcessVersions {
  @scala.inline
  def apply(chrome: java.lang.String, electron: java.lang.String): ProcessVersions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chrome")(chrome)
    __obj.updateDynamic("electron")(electron)
    __obj.asInstanceOf[ProcessVersions]
  }
}

