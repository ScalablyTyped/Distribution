package typings.glDashReact.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderInfo extends js.Object {
  var frag: String
  var vert: String
}

object ShaderInfo {
  @scala.inline
  def apply(frag: String, vert: String): ShaderInfo = {
    val __obj = js.Dynamic.literal(frag = frag, vert = vert)
  
    __obj.asInstanceOf[ShaderInfo]
  }
}

