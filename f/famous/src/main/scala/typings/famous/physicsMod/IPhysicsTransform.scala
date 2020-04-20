package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhysicsTransform extends js.Object {
  var position: js.Array[Double]
  var rotation: js.Array[Double]
}

object IPhysicsTransform {
  @scala.inline
  def apply(position: js.Array[Double], rotation: js.Array[Double]): IPhysicsTransform = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPhysicsTransform]
  }
}

