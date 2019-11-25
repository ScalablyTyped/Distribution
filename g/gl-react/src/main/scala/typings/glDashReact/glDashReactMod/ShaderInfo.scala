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
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShaderInfo]
  }
}

