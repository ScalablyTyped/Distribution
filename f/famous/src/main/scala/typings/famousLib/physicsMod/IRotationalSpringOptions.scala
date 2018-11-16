package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRotationalSpringOptions extends IForceOptions {
  var anchor: js.UndefOr[famousLib.mathMod.Quaternion] = js.undefined
  var damping: js.UndefOr[scala.Double] = js.undefined
  var dampingRatio: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var period: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, scala.Double]] = js.undefined
}

