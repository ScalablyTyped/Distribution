package typings.famous.physicsMod

import typings.famous.mathMod.Quaternion
import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallOptions extends IParticleOptions {
  var direction: js.UndefOr[Double] = js.undefined
}

object IWallOptions {
  @scala.inline
  def apply(
    collisionGroup: js.UndefOr[Double] = js.undefined,
    collisionMask: js.UndefOr[Double] = js.undefined,
    direction: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    orientation: Quaternion = null,
    position: Vec3 = null,
    restitution: js.UndefOr[Double] = js.undefined,
    restrictions: js.UndefOr[Double] = js.undefined,
    size: js.Array[Double] = null,
    velocity: js.UndefOr[Double] = js.undefined
  ): IWallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collisionGroup)) __obj.updateDynamic("collisionGroup")(collisionGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionMask)) __obj.updateDynamic("collisionMask")(collisionMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictions)) __obj.updateDynamic("restrictions")(restrictions.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallOptions]
  }
}

