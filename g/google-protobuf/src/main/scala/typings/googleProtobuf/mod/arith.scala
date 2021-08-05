package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("google-protobuf", "arith.Int64")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromString(str: String): Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Int64]
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
    
    @JSImport("google-protobuf", "arith.UInt64")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromString(str: String): UInt64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[UInt64]
    
    /* static member */
    inline def mul32x32(a: Double, b: Double): UInt64 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul32x32")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UInt64]
  }
}
