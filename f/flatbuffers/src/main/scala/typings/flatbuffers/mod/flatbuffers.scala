package typings.flatbuffers.mod

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flatbuffers", "flatbuffers")
@js.native
object flatbuffers extends js.Object {
  
  val FILE_IDENTIFIER_LENGTH: Double = js.native
  
  val SIZEOF_INT: Double = js.native
  
  val SIZEOF_SHORT: Double = js.native
  
  val SIZE_PREFIX_LENGTH: Double = js.native
  
  val float32: Float32Array = js.native
  
  val float64: Float64Array = js.native
  
  val int32: Int32Array = js.native
  
  val isLittleEndian: Boolean = js.native
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Builder ()
    extends typings.flatbuffers.mod.global.flatbuffers.Builder {
    def this(initial_size: Double) = this()
  }
  /* static members */
  @js.native
  object Builder extends js.Object {
    
    /**
      * Doubles the size of the backing ByteBuffer and copies the old data towards
      * the end of the new buffer (since we build the buffer backwards).
      *
      * @param bb The current buffer with the existing data
      * @returns A new byte buffer with the old data copied
      * to it. The data is located at the end of the buffer.
      */
    def growByteBuffer(bb: typings.flatbuffers.mod.global.flatbuffers.ByteBuffer): typings.flatbuffers.mod.global.flatbuffers.ByteBuffer = js.native
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class ByteBuffer protected ()
    extends typings.flatbuffers.mod.global.flatbuffers.ByteBuffer {
    def this(bytes: Uint8Array) = this()
  }
  /* static members */
  @js.native
  object ByteBuffer extends js.Object {
    
    def allocate(byte_size: Double): typings.flatbuffers.mod.global.flatbuffers.ByteBuffer = js.native
  }
  
  @js.native
  object Encoding extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.flatbuffers.mod.global.flatbuffers.Encoding with Double] = js.native
    
    /* 1 */ val UTF16_STRING: typings.flatbuffers.mod.global.flatbuffers.Encoding.UTF16_STRING with Double = js.native
    
    /* 0 */ val UTF8_BYTES: typings.flatbuffers.mod.global.flatbuffers.Encoding.UTF8_BYTES with Double = js.native
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Long protected ()
    extends typings.flatbuffers.mod.global.flatbuffers.Long {
    def this(low: Double, high: Double) = this()
  }
  /* static members */
  @js.native
  object Long extends js.Object {
    
    var ZERO: typings.flatbuffers.mod.global.flatbuffers.Long = js.native
    
    def create(low: Double, high: Double): typings.flatbuffers.mod.global.flatbuffers.Long = js.native
  }
}
