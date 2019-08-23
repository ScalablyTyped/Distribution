package typings.expo.buildARMod

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
    val __obj = js.Dynamic.literal(id = id, transform = transform)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseAnchor]
  }
}

