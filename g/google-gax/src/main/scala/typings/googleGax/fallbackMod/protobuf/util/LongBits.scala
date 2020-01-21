package typings.googleGax.fallbackMod.protobuf.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Helper class for working with the low and high bits of a 64 bit value. */
@JSImport("google-gax/build/src/fallback", "protobuf.util.LongBits")
@js.native
class LongBits protected ()
  extends typings.protobufjs.mod.util.LongBits {
  /**
    * Constructs new long bits.
    * @param lo Low 32 bits, unsigned
    * @param hi High 32 bits, unsigned
    */
  def this(lo: Double, hi: Double) = this()
}

/* static members */
@JSImport("google-gax/build/src/fallback", "protobuf.util.LongBits")
@js.native
object LongBits extends js.Object {
  /** Zero bits. */
  var zero: typings.protobufjs.mod.util.LongBits = js.native
  /** Zero hash. */
  var zeroHash: String = js.native
  def from(value: String): typings.protobufjs.mod.util.LongBits = js.native
  def from(value: Double): typings.protobufjs.mod.util.LongBits = js.native
  /**
    * Constructs new long bits from a number, long or string.
    * @param value Value
    * @returns Instance
    */
  def from(value: typings.protobufjs.mod.Long): typings.protobufjs.mod.util.LongBits = js.native
  /**
    * Constructs new long bits from the specified 8 characters long hash.
    * @param hash Hash
    * @returns Bits
    */
  def fromHash(hash: String): typings.protobufjs.mod.util.LongBits = js.native
  /**
    * Constructs new long bits from the specified number.
    * @param value Value
    * @returns Instance
    */
  def fromNumber(value: Double): typings.protobufjs.mod.util.LongBits = js.native
}

