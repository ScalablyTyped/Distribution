package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [Quaternion](//en.wikipedia.org/wiki/Quaternion). Please note: if in the
  * response you see &quot;w: 1&quot; and nothing else this is the default
  * value of [0, 0, 0, 1] where x,y, and z are 0.
  */
@js.native
trait Schema$Quaternion extends js.Object {
  /**
    * The scalar component.
    */
  var w: js.UndefOr[Double] = js.native
  /**
    * The x component.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y component.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * The z component.
    */
  var z: js.UndefOr[Double] = js.native
}

object Schema$Quaternion {
  @scala.inline
  def apply(w: Int | Double = null, x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): Schema$Quaternion = {
    val __obj = js.Dynamic.literal()
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Quaternion]
  }
}

