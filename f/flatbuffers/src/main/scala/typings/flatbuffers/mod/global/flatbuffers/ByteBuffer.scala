package typings.flatbuffers.mod.global.flatbuffers

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
@JSGlobal("flatbuffers.ByteBuffer")
@js.native
class ByteBuffer protected () extends js.Object {
  def this(bytes: Uint8Array) = this()
  def __has_identifier(ident: String): Boolean = js.native
  /**
    * Retrieve the relative offset stored at "offset"
    */
  def __indirect(offset: Double): Double = js.native
  /**
    * Look up a field in the vtable, return an offset into the object, or 0 if the
    * field is not present.
    */
  def __offset(bb_pos: Double, vtable_offset: Double): Double = js.native
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
  def __string(offset: Double): String | Uint8Array = js.native
  def __string(offset: Double, optionalEncoding: Encoding): String | Uint8Array = js.native
  /**
    * Initialize any Table-derived type to point to the union at the given offset.
    */
  def __union[T /* <: Table */](t: T, offset: Double): T = js.native
  /**
    * Get the start of data of a vector whose offset is stored at "offset" in this object.
    */
  def __vector(offset: Double): Double = js.native
  /**
    * Get the length of a vector whose offset is stored at "offset" in this object.
    */
  def __vector_len(offset: Double): Double = js.native
  def bytes(): Uint8Array = js.native
  def capacity(): Double = js.native
  def clear(): Unit = js.native
  /**
    * Convenience function for creating Long objects.
    */
  def createLong(low: Double, high: Double): Long = js.native
  def getBufferIdentifier(): String = js.native
  def position(): Double = js.native
  def readFloat32(offset: Double): Double = js.native
  def readFloat64(offset: Double): Double = js.native
  def readInt16(offset: Double): Double = js.native
  def readInt32(offset: Double): Double = js.native
  def readInt64(offset: Double): Long = js.native
  def readInt8(offset: Double): Double = js.native
  def readUint16(offset: Double): Double = js.native
  def readUint32(offset: Double): Double = js.native
  def readUint64(offset: Double): Long = js.native
  def readUint8(offset: Double): Double = js.native
  def setPosition(position: Double): Unit = js.native
  def writeFloat32(offset: Double, value: Double): Unit = js.native
  def writeFloat64(offset: Double, value: Double): Unit = js.native
  def writeInt16(offset: Double, value: Double): Unit = js.native
  def writeInt32(offset: Double, value: Double): Unit = js.native
  def writeInt64(offset: Double, value: Long): Unit = js.native
  def writeInt8(offset: Double, value: Double): Unit = js.native
  def writeUint16(offset: Double, value: Double): Unit = js.native
  def writeUint32(offset: Double, value: Double): Unit = js.native
  def writeUint64(offset: Double, value: Long): Unit = js.native
  def writeUint8(offset: Double, value: Double): Unit = js.native
}

/* static members */
@JSGlobal("flatbuffers.ByteBuffer")
@js.native
object ByteBuffer extends js.Object {
  def allocate(byte_size: Double): ByteBuffer = js.native
}

