package typings.glReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderIdentifier extends js.Object {
  var id: String
  var `type`: String
}

object ShaderIdentifier {
  @scala.inline
  def apply(id: String, `type`: String): ShaderIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderIdentifier]
  }
}

