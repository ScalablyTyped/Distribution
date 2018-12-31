package typings
package flatbuffersLib.flatbuffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatbuffers", "flatbuffers")
@js.native
object flatbuffersNs extends js.Object {
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Builder ()
    extends flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Builder {
    def this(initial_size: scala.Double) = this()
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class ByteBuffer protected ()
    extends flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.ByteBuffer {
    def this(bytes: stdLib.Uint8Array) = this()
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Long protected ()
    extends flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Long {
    def this(low: scala.Double, high: scala.Double) = this()
  }
  
  val FILE_IDENTIFIER_LENGTH: scala.Double = js.native
  val SIZEOF_INT: scala.Double = js.native
  val SIZEOF_SHORT: scala.Double = js.native
  val float32: stdLib.Float32Array = js.native
  val float64: stdLib.Float64Array = js.native
  val int32: stdLib.Int32Array = js.native
  val isLittleEndian: scala.Boolean = js.native
  ////////////////////////////////////////////////////////////////////////////////
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
    def growByteBuffer(bb: flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.ByteBuffer): flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.ByteBuffer = js.native
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  object ByteBuffer extends js.Object {
    def allocate(byte_size: scala.Double): flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.ByteBuffer = js.native
  }
  
  @js.native
  object Encoding extends js.Object {
    val UTF16_STRING: flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Encoding.UTF16_STRING with java.lang.String = js.native
    val UTF8_BYTES: flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Encoding.UTF8_BYTES with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Encoding with java.lang.String
      ] = js.native
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  object Long extends js.Object {
    var ZERO: flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Long = js.native
    def create(low: scala.Double, high: scala.Double): flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Long = js.native
  }
  
  type Encoding = flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Encoding
}

