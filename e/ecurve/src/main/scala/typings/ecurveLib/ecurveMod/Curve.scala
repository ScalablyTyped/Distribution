package typings
package ecurveLib.ecurveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecurve", "Curve")
@js.native
class Curve protected () extends js.Object {
  def this(p: bigiLib.bigiMod.namespaced, a: bigiLib.bigiMod.namespaced, b: bigiLib.bigiMod.namespaced, Gx: bigiLib.bigiMod.namespaced, Gy: bigiLib.bigiMod.namespaced, n: bigiLib.bigiMod.namespaced, h: bigiLib.bigiMod.namespaced) = this()
  var G: Point = js.native
  var a: bigiLib.bigiMod.namespaced = js.native
  var b: bigiLib.bigiMod.namespaced = js.native
  var h: bigiLib.bigiMod.namespaced = js.native
  var n: bigiLib.bigiMod.namespaced = js.native
  var p: bigiLib.bigiMod.namespaced = js.native
  def isInfinity(Q: js.Any): scala.Boolean = js.native
  def isOnCurve(Q: js.Any): scala.Boolean = js.native
  def pointFromX(isOdd: scala.Boolean, x: Point): Point = js.native
  def validate(Q: js.Any): scala.Boolean = js.native
}

