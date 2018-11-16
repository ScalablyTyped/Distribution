package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISpringOptions extends IForceOptions {
  var anchor: js.UndefOr[famousLib.mathMod.Vec3] = js.undefined
  var damping: js.UndefOr[scala.Double] = js.undefined
  var dampingRatio: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var period: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, scala.Double]] = js.undefined
}

