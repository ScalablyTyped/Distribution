package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderInfo extends js.Object {
  var frag: java.lang.String
  var vert: java.lang.String
}

object ShaderInfo {
  @scala.inline
  def apply(frag: java.lang.String, vert: java.lang.String): ShaderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("vert")(vert)
    __obj.asInstanceOf[ShaderInfo]
  }
}

