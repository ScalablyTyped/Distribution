package typings.googleProtobuf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "arith")
@js.native
object arith extends js.Object {
  @js.native
  class Int64 protected () extends js.Object {
    def this(lo: Double, hi: Double) = this()
    var hi: Double = js.native
    var lo: Double = js.native
    def add(other: Int64): Int64 = js.native
    def sub(other: Int64): Int64 = js.native
  }
  
  @js.native
  class UInt64 protected () extends js.Object {
    def this(lo: Double, hi: Double) = this()
    var hi: Double = js.native
    var lo: Double = js.native
    def add(other: UInt64): UInt64 = js.native
    def cmp(other: UInt64): Double = js.native
    def div(divisor: Double): js.Tuple2[UInt64, UInt64] = js.native
    def leftShift(): UInt64 = js.native
    def lsb(): Boolean = js.native
    def msb(): Boolean = js.native
    def mul(a: Double): UInt64 = js.native
    def rightShift(): UInt64 = js.native
    def sub(other: UInt64): UInt64 = js.native
    def zero(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Int64 extends js.Object {
    def fromString(str: String): Int64 = js.native
  }
  
  /* static members */
  @js.native
  object UInt64 extends js.Object {
    def fromString(str: String): UInt64 = js.native
    def mul32x32(a: Double, b: Double): UInt64 = js.native
  }
  
}

