package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhysicsTransform extends js.Object {
  var position: js.Array[Double] = js.native
  var rotation: js.Array[Double] = js.native
}

object IPhysicsTransform {
  @scala.inline
  def apply(position: js.Array[Double], rotation: js.Array[Double]): IPhysicsTransform = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPhysicsTransform]
  }
  @scala.inline
  implicit class IPhysicsTransformOps[Self <: IPhysicsTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Array[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationVarargs(value: Double*): Self = this.set("rotation", js.Array(value :_*))
    @scala.inline
    def setRotation(value: js.Array[Double]): Self = this.set("rotation", value.asInstanceOf[js.Any])
  }
  
}

