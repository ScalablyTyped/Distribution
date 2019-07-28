package typings.glDashShader.glDashShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var name: String
  var `type`: String
}

object Parameter {
  @scala.inline
  def apply(name: String, `type`: String): Parameter = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Parameter]
  }
}

