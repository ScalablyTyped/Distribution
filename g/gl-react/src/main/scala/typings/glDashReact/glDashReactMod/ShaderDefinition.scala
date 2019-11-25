package typings.glDashReact.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDefinition extends js.Object {
  var frag: String
  var vert: js.UndefOr[String] = js.undefined
}

object ShaderDefinition {
  @scala.inline
  def apply(frag: String, vert: String = null): ShaderDefinition = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    if (vert != null) __obj.updateDynamic("vert")(vert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefinition]
  }
}

