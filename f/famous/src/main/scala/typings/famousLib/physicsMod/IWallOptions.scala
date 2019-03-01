package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallOptions extends IParticleOptions {
  var direction: js.UndefOr[scala.Double] = js.undefined
}

object IWallOptions {
  @scala.inline
  def apply(
    collisionGroup: scala.Int | scala.Double = null,
    collisionMask: scala.Int | scala.Double = null,
    direction: scala.Int | scala.Double = null,
    friction: scala.Int | scala.Double = null,
    mass: scala.Int | scala.Double = null,
    orientation: famousLib.mathMod.Quaternion = null,
    position: famousLib.mathMod.Vec3 = null,
    restitution: scala.Int | scala.Double = null,
    restrictions: scala.Int | scala.Double = null,
    size: js.Array[scala.Double] = null,
    velocity: scala.Int | scala.Double = null
  ): IWallOptions = {
    val __obj = js.Dynamic.literal()
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (position != null) __obj.updateDynamic("position")(position)
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallOptions]
  }
}

