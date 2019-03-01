package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderIdentifier extends js.Object {
  var id: java.lang.String
  var `type`: java.lang.String
}

object ShaderIdentifier {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): ShaderIdentifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ShaderIdentifier]
  }
}

