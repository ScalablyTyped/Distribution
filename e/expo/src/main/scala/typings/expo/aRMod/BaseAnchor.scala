package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAnchor extends js.Object {
  var id: String
  var transform: Matrix
  var `type`: AnchorType
}

object BaseAnchor {
  @scala.inline
  def apply(id: String, transform: Matrix, `type`: AnchorType): BaseAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAnchor]
  }
}

