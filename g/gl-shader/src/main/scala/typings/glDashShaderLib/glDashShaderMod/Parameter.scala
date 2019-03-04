package typings
package glDashShaderLib.glDashShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object Parameter {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): Parameter = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Parameter]
  }
}

