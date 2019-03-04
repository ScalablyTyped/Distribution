package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDefinition extends js.Object {
  var frag: java.lang.String
  var vert: js.UndefOr[java.lang.String] = js.undefined
}

object ShaderDefinition {
  @scala.inline
  def apply(frag: java.lang.String, vert: java.lang.String = null): ShaderDefinition = {
    val __obj = js.Dynamic.literal(frag = frag)
    if (vert != null) __obj.updateDynamic("vert")(vert)
    __obj.asInstanceOf[ShaderDefinition]
  }
}

