package typings
package ecurveLib.ecurveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecurve", "Curve")
@js.native
class Curve protected () extends js.Object {
  def this(p: bigiLib.bigiMod.^, a: bigiLib.bigiMod.^, b: bigiLib.bigiMod.^, Gx: bigiLib.bigiMod.^, Gy: bigiLib.bigiMod.^, n: bigiLib.bigiMod.^, h: bigiLib.bigiMod.^) = this()
  var G: Point = js.native
  var a: bigiLib.bigiMod.^ = js.native
  var b: bigiLib.bigiMod.^ = js.native
  var h: bigiLib.bigiMod.^ = js.native
  var n: bigiLib.bigiMod.^ = js.native
  var p: bigiLib.bigiMod.^ = js.native
  def isInfinity(Q: js.Any): scala.Boolean = js.native
  def isOnCurve(Q: js.Any): scala.Boolean = js.native
  def pointFromX(isOdd: scala.Boolean, x: Point): Point = js.native
  def validate(Q: js.Any): scala.Boolean = js.native
}

