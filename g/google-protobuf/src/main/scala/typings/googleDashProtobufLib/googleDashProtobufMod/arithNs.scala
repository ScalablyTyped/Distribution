package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "arith")
@js.native
object arithNs extends js.Object {
  @js.native
  class Int64 protected () extends js.Object {
    def this(lo: scala.Double, hi: scala.Double) = this()
    var hi: scala.Double = js.native
    var lo: scala.Double = js.native
    def add(other: Int64): Int64 = js.native
    def sub(other: Int64): Int64 = js.native
  }
  
  @js.native
  class UInt64 protected () extends js.Object {
    def this(lo: scala.Double, hi: scala.Double) = this()
    var hi: scala.Double = js.native
    var lo: scala.Double = js.native
    def add(other: UInt64): UInt64 = js.native
    def cmp(other: UInt64): scala.Double = js.native
    def div(divisor: scala.Double): js.Tuple2[UInt64, UInt64] = js.native
    def leftShift(): UInt64 = js.native
    def lsb(): scala.Boolean = js.native
    def msb(): scala.Boolean = js.native
    def mul(a: scala.Double): UInt64 = js.native
    def rightShift(): UInt64 = js.native
    def sub(other: UInt64): UInt64 = js.native
    def zero(): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Int64 extends js.Object {
    def fromString(str: java.lang.String): googleDashProtobufLib.googleDashProtobufMod.arithNs.Int64 = js.native
  }
  
  /* static members */
  @js.native
  object UInt64 extends js.Object {
    def fromString(str: java.lang.String): googleDashProtobufLib.googleDashProtobufMod.arithNs.UInt64 = js.native
    def mul32x32(a: scala.Double, b: scala.Double): googleDashProtobufLib.googleDashProtobufMod.arithNs.UInt64 = js.native
  }
  
}

