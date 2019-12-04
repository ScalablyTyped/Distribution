package typings.elliptic.ellipticMod.curve.base

import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve.base.BasePoint")
@js.native
class BasePoint protected () extends js.Object {
  def this(curve: typings.elliptic.ellipticMod.curve.base, `type`: String) = this()
  var curve: typings.elliptic.ellipticMod.curve.base = js.native
  var precomputed: PrecomputedValues | Null = js.native
  var `type`: String = js.native
  def add(p: BasePoint): BasePoint = js.native
  def dbl(): BasePoint = js.native
  def dblp(k: Double): BasePoint = js.native
  def encode(enc: js.UndefOr[scala.Nothing], compact: Boolean): js.Array[Double] = js.native
  def encodeCompressed(): js.Array[Double] = js.native
  @JSName("encodeCompressed")
  def encodeCompressed_array(enc: array): js.Array[Double] = js.native
  @JSName("encodeCompressed")
  def encodeCompressed_hex(enc: hex): String = js.native
  @JSName("encode")
  def encode_array(enc: array, compact: Boolean): js.Array[Double] = js.native
  @JSName("encode")
  def encode_hex(enc: hex, compact: Boolean): String = js.native
  def eq(p: BasePoint): Boolean = js.native
  def getX(): js.Any = js.native
  def getY(): js.Any = js.native
  def inspect(): String = js.native
  def isInfinity(): Boolean = js.native
  def mul(
    k: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): BasePoint = js.native
  def neg(): BasePoint = js.native
  def precompute(power: Double): BasePoint = js.native
  def validate(): Boolean = js.native
}

