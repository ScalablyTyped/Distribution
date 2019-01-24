package typings
package flatbuffersLib.flatbuffersMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("flatbuffers")
@js.native
object flatbuffersNs extends js.Object {
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Builder () extends js.Object {
    def this(initial_size: scala.Double) = this()
    def addFieldFloat32(voffset: scala.Double, value: scala.Double, defaultValue: scala.Double): scala.Unit = js.native
    def addFieldFloat64(voffset: scala.Double, value: scala.Double, defaultValue: scala.Double): scala.Unit = js.native
    def addFieldInt16(voffset: scala.Double, value: scala.Double, defaultValue: scala.Double): scala.Unit = js.native
    def addFieldInt32(voffset: scala.Double, value: scala.Double, defaultValue: scala.Double): scala.Unit = js.native
    def addFieldInt64(voffset: scala.Double, value: Long, defaultValue: Long): scala.Unit = js.native
    def addFieldInt8(voffset: scala.Double, value: scala.Double, defaultValue: scala.Double): scala.Unit = js.native
    def addFieldOffset(voffset: scala.Double, value: Offset, defaultValue: Offset): scala.Unit = js.native
    /**
      * Structs are stored inline, so nothing additional is being added. `d` is always 0.
      */
    def addFieldStruct(voffset: scala.Double, value: Offset, defaultValue: Offset): scala.Unit = js.native
    def addFloat32(value: scala.Double): scala.Unit = js.native
    def addFloat64(value: scala.Double): scala.Unit = js.native
    def addInt16(value: scala.Double): scala.Unit = js.native
    def addInt32(value: scala.Double): scala.Unit = js.native
    def addInt64(value: Long): scala.Unit = js.native
    def addInt8(value: scala.Double): scala.Unit = js.native
    /**
      * Adds on offset, relative to where it will be written.
      *
      * @param offset The offset to add
      */
    def addOffset(offset: Offset): scala.Unit = js.native
    /**
      * Get the ByteBuffer representing the FlatBuffer. Only call this after you've
      * called finish(). The actual data starts at the ByteBuffer's current position,
      * not necessarily at 0.
      */
    def asUint8Array(): stdLib.Uint8Array = js.native
    /**
      * Reset all the state in this FlatBufferBuilder
      * so it can be reused to construct another buffer.
      */
    def clear(): scala.Unit = js.native
    /**
      * Conveniance function for creating Long objects.
      */
    def createLong(low: scala.Double, high: scala.Double): Long = js.native
    /**
      * Encode the string `s` in the buffer using UTF-8. If a Uint8Array is passed
      * instead of a string, it is assumed to contain valid UTF-8 encoded data.
      *
      * @param s The string to encode
      * @return The offset in the buffer where the encoded string starts
      */
    def createString(s: java.lang.String): Offset = js.native
    def createString(s: stdLib.Uint8Array): Offset = js.native
    /**
      * Get the ByteBuffer representing the FlatBuffer. Only call this after you've
      * called finish(). The actual data starts at the ByteBuffer's current position,
      * not necessarily at 0.
      */
    def dataBuffer(): ByteBuffer = js.native
    /**
      * Finish off writing the object that is under construction.
      *
      * @returns The offset to the object inside `dataBuffer`
      */
    def endObject(): Offset = js.native
    /**
      * Finish off the creation of an array and all its elements. The array must be
      * created with `startVector`.
      *
      * @returns The offset at which the newly created array
      * starts.
      */
    def endVector(): Offset = js.native
    def finish(root_table: Offset): scala.Unit = js.native
    def finish(root_table: Offset, file_identifier: java.lang.String): scala.Unit = js.native
    /**
      * In order to save space, fields that are set to their default value
      * don't get serialized into the buffer. Forcing defaults provides a
      * way to manually disable this optimization.
      *
      * @param forceDefaults true always serializes default values
      */
    def forceDefaults(forceDefaults: scala.Boolean): scala.Unit = js.native
    /**
      * Structures are always stored inline, they need to be created right
      * where they're used.  You'll get this assertion failure if you
      * created it elsewhere.
      *
      * @param obj The offset of the created object
      */
    def nested(obj: Offset): scala.Unit = js.native
    /**
      * Should not be creating any other object, string or vector
      * while an object is being constructed
      */
    def notNested(): scala.Unit = js.native
    /**
      * @returns Offset relative to the end of the buffer.
      */
    def offset(): Offset = js.native
    def pad(byte_size: scala.Double): scala.Unit = js.native
    /**
      * Prepare to write an element of `size` after `additional_bytes` have been
      * written, e.g. if you write a string, you need to align such the int length
      * field is aligned to 4 bytes, and the string data follows it directly. If all
      * you need to do is alignment, `additional_bytes` will be 0.
      *
      * @param size This is the of the new element to write
      * @param additional_bytes The padding size
      */
    def prep(size: scala.Double, additional_bytes: scala.Double): scala.Unit = js.native
    /**
      * This checks a required field has been set in a given table that has
      * just been constructed.
      */
    def requiredField(table: Offset, field: scala.Double): scala.Unit = js.native
    /**
      * Set the current vtable at `voffset` to the current location in the buffer.
      */
    def slot(voffset: scala.Double): scala.Unit = js.native
    /**
      * Start encoding a new object in the buffer.  Users will not usually need to
      * call this directly. The FlatBuffers compiler will generate helper methods
      * that call this method internally.
      */
    def startObject(numfields: scala.Double): scala.Unit = js.native
    /**
      * Start a new array/vector of objects.  Users usually will not call
      * this directly. The FlatBuffers compiler will create a start/end
      * method for vector types in generated code.
      *
      * @param elem_size The size of each element in the array
      * @param num_elems The number of elements in the array
      * @param alignment The alignment of the array
      */
    def startVector(elem_size: scala.Double, num_elems: scala.Double, alignment: scala.Double): scala.Unit = js.native
    def writeFloat32(value: scala.Double): scala.Unit = js.native
    def writeFloat64(value: scala.Double): scala.Unit = js.native
    def writeInt16(value: scala.Double): scala.Unit = js.native
    def writeInt32(value: scala.Double): scala.Unit = js.native
    def writeInt64(value: Long): scala.Unit = js.native
    def writeInt8(value: scala.Double): scala.Unit = js.native
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class ByteBuffer protected () extends js.Object {
    def this(bytes: stdLib.Uint8Array) = this()
    def __has_identifier(ident: java.lang.String): scala.Boolean = js.native
    /**
      * Retrieve the relative offset stored at "offset"
      */
    def __indirect(offset: scala.Double): scala.Double = js.native
    /**
      * Look up a field in the vtable, return an offset into the object, or 0 if the
      * field is not present.
      */
    def __offset(bb_pos: scala.Double, vtable_offset: scala.Double): scala.Double = js.native
    /**
      * Create a JavaScript string from UTF-8 data stored inside the FlatBuffer.
      * This allocates a new string and converts to wide chars upon each access.
      *
      * To avoid the conversion to UTF-16, pass flatbuffers.Encoding.UTF8_BYTES as
      * the "optionalEncoding" argument. This is useful for avoiding conversion to
      * and from UTF-16 when the data will just be packaged back up in another
      * FlatBuffer later on.
      *
      * @param optionalEncoding Defaults to UTF16_STRING
      */
    def __string(offset: scala.Double): java.lang.String | stdLib.Uint8Array = js.native
    def __string(offset: scala.Double, optionalEncoding: Encoding): java.lang.String | stdLib.Uint8Array = js.native
    /**
      * Initialize any Table-derived type to point to the union at the given offset.
      */
    def __union[T /* <: Table */](t: T, offset: scala.Double): T = js.native
    /**
      * Get the start of data of a vector whose offset is stored at "offset" in this object.
      */
    def __vector(offset: scala.Double): scala.Double = js.native
    /**
      * Get the length of a vector whose offset is stored at "offset" in this object.
      */
    def __vector_len(offset: scala.Double): scala.Double = js.native
    def bytes(): stdLib.Uint8Array = js.native
    def capacity(): scala.Double = js.native
    def clear(): scala.Unit = js.native
    /**
      * Conveniance function for creating Long objects.
      */
    def createLong(low: scala.Double, high: scala.Double): Long = js.native
    def getBufferIdentifier(): java.lang.String = js.native
    def position(): scala.Double = js.native
    def readFloat32(offset: scala.Double): scala.Double = js.native
    def readFloat64(offset: scala.Double): scala.Double = js.native
    def readInt16(offset: scala.Double): scala.Double = js.native
    def readInt32(offset: scala.Double): scala.Double = js.native
    def readInt64(offset: scala.Double): Long = js.native
    def readInt8(offset: scala.Double): scala.Double = js.native
    def readUint16(offset: scala.Double): scala.Double = js.native
    def readUint32(offset: scala.Double): scala.Double = js.native
    def readUint64(offset: scala.Double): Long = js.native
    def readUint8(offset: scala.Double): scala.Double = js.native
    def setPosition(position: scala.Double): scala.Unit = js.native
    def writeFloat32(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeFloat64(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeInt16(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeInt32(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeInt64(offset: scala.Double, value: Long): scala.Unit = js.native
    def writeInt8(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeUint16(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeUint32(offset: scala.Double, value: scala.Double): scala.Unit = js.native
    def writeUint64(offset: scala.Double, value: Long): scala.Unit = js.native
    def writeUint8(offset: scala.Double, value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  sealed trait Encoding extends js.Object
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Long protected () extends js.Object {
    def this(low: scala.Double, high: scala.Double) = this()
    var high: scala.Double = js.native
    var low: scala.Double = js.native
    def equals(other: js.Any): scala.Boolean = js.native
    def toFloat64(): scala.Double = js.native
  }
  
  trait Table extends js.Object {
    var bb: ByteBuffer | scala.Null
    var bb_pos: scala.Double
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
    @js.native
    sealed trait UTF16_STRING
      extends flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Encoding
    
    @js.native
    sealed trait UTF8_BYTES
      extends flatbuffersLib.flatbuffersMod.Global.flatbuffersNs.Encoding
    
    val UTF16_STRING: UTF16_STRING with java.lang.String = js.native
    val UTF8_BYTES: UTF8_BYTES with java.lang.String = js.native
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
  
  type Offset = scala.Double
}

