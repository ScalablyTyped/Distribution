package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arith {
  
  @JSImport("google-protobuf", "arith.Int64")
  @js.native
  class Int64 protected () extends StObject {
    def this(lo: Double, hi: Double) = this()
    
    def add(other: Int64): Int64 = js.native
    
    var hi: Double = js.native
    
    var lo: Double = js.native
    
    def sub(other: Int64): Int64 = js.native
  }
  object Int64 {
    
    /* static member */
    @JSImport("google-protobuf", "arith.Int64.fromString")
    @js.native
    def fromString(str: String): Int64 = js.native
  }
  
  @JSImport("google-protobuf", "arith.UInt64")
  @js.native
  class UInt64 protected () extends StObject {
    def this(lo: Double, hi: Double) = this()
    
    def add(other: UInt64): UInt64 = js.native
    
    def cmp(other: UInt64): Double = js.native
    
    def div(divisor: Double): js.Tuple2[UInt64, UInt64] = js.native
    
    var hi: Double = js.native
    
    def leftShift(): UInt64 = js.native
    
    var lo: Double = js.native
    
    def lsb(): Boolean = js.native
    
    def msb(): Boolean = js.native
    
    def mul(a: Double): UInt64 = js.native
    
    def rightShift(): UInt64 = js.native
    
    def sub(other: UInt64): UInt64 = js.native
    
    def zero(): Boolean = js.native
  }
  object UInt64 {
    
    /* static member */
    @JSImport("google-protobuf", "arith.UInt64.fromString")
    @js.native
    def fromString(str: String): UInt64 = js.native
    
    /* static member */
    @JSImport("google-protobuf", "arith.UInt64.mul32x32")
    @js.native
    def mul32x32(a: Double, b: Double): UInt64 = js.native
  }
}
