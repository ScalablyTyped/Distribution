package typings.famous.physicsMod

import typings.famous.mathMod.Quaternion
import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParticleOptions extends js.Object {
  var collisionGroup: js.UndefOr[Double] = js.undefined
  var collisionMask: js.UndefOr[Double] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Quaternion] = js.undefined
  var position: js.UndefOr[Vec3] = js.undefined
  var restitution: js.UndefOr[Double] = js.undefined
  var restrictions: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[js.Array[Double]] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object IParticleOptions {
  @scala.inline
  def apply(
    collisionGroup: Int | Double = null,
    collisionMask: Int | Double = null,
    friction: Int | Double = null,
    mass: Int | Double = null,
    orientation: Quaternion = null,
    position: Vec3 = null,
    restitution: Int | Double = null,
    restrictions: Int | Double = null,
    size: js.Array[Double] = null,
    velocity: Int | Double = null
  ): IParticleOptions = {
    val __obj = js.Dynamic.literal()
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParticleOptions]
  }
}

