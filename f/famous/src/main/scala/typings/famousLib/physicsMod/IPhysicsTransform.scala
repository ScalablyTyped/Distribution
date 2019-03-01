package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhysicsTransform extends js.Object {
  var position: js.Array[scala.Double]
  var rotation: js.Array[scala.Double]
}

object IPhysicsTransform {
  @scala.inline
  def apply(position: js.Array[scala.Double], rotation: js.Array[scala.Double]): IPhysicsTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("rotation")(rotation)
    __obj.asInstanceOf[IPhysicsTransform]
  }
}

