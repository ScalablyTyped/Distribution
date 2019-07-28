package typings.ecurve.ecurveMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecurve", "Point")
@js.native
class Point protected () extends js.Object {
  def this(curve: Curve, x: typings.bigi.bigiMod.^, y: typings.bigi.bigiMod.^, z: typings.bigi.bigiMod.^) = this()
  var affineX: typings.bigi.bigiMod.^ = js.native
  var affineY: typings.bigi.bigiMod.^ = js.native
  var x: typings.bigi.bigiMod.^ = js.native
  var y: typings.bigi.bigiMod.^ = js.native
  var z: typings.bigi.bigiMod.^ = js.native
  def add(b: Point): Point = js.native
  def equals(other: Point): Boolean = js.native
  def getEncoded(): Buffer = js.native
  def getEncoded(compressed: Boolean): Buffer = js.native
  def multiply(k: js.Any): Point = js.native
  def multiplyTwo(j: js.Any, x: js.Any, k: js.Any): Point = js.native
  def negate(): Point = js.native
  def twice(): Point = js.native
}

/* static members */
@JSImport("ecurve", "Point")
@js.native
object Point extends js.Object {
  def decodeFrom(curve: Curve, buffer: Buffer): js.Any = js.native
  def fromAffine(curve: Curve, x: typings.bigi.bigiMod.^, y: typings.bigi.bigiMod.^): Point = js.native
}

