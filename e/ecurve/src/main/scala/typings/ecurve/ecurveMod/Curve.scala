package typings.ecurve.ecurveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecurve", "Curve")
@js.native
class Curve protected () extends js.Object {
  def this(
    p: typings.bigi.bigiMod.^,
    a: typings.bigi.bigiMod.^,
    b: typings.bigi.bigiMod.^,
    Gx: typings.bigi.bigiMod.^,
    Gy: typings.bigi.bigiMod.^,
    n: typings.bigi.bigiMod.^,
    h: typings.bigi.bigiMod.^
  ) = this()
  var G: Point = js.native
  var a: typings.bigi.bigiMod.^ = js.native
  var b: typings.bigi.bigiMod.^ = js.native
  var h: typings.bigi.bigiMod.^ = js.native
  var n: typings.bigi.bigiMod.^ = js.native
  var p: typings.bigi.bigiMod.^ = js.native
  def isInfinity(Q: js.Any): Boolean = js.native
  def isOnCurve(Q: js.Any): Boolean = js.native
  def pointFromX(isOdd: Boolean, x: Point): Point = js.native
  def validate(Q: js.Any): Boolean = js.native
}

