package typings.flatbuffers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object flatbuffers {
    
    ////////////////////////////////////////////////////////////////////////////////
    @JSImport("flatbuffers", "flatbuffers.Builder")
    @js.native
    open class Builder ()
      extends typings.flatbuffers.mod.global.flatbuffers.Builder {
      def this(initial_size: Double) = this()
    }
    object Builder {
      
      @JSImport("flatbuffers", "flatbuffers.Builder")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Doubles the size of the backing ByteBuffer and copies the old data towards
        * the end of the new buffer (since we build the buffer backwards).
        *
        * @param bb The current buffer with the existing data
        * @returns A new byte buffer with the old data copied
        * to it. The data is located at the end of the buffer.
        */
      /* static member */
      inline def growByteBuffer(bb: typings.flatbuffers.mod.global.flatbuffers.ByteBuffer): typings.flatbuffers.mod.global.flatbuffers.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("growByteBuffer")(bb.asInstanceOf[js.Any]).asInstanceOf[typings.flatbuffers.mod.global.flatbuffers.ByteBuffer]
    }
    
    ////////////////////////////////////////////////////////////////////////////////
    @JSImport("flatbuffers", "flatbuffers.ByteBuffer")
    @js.native
    open class ByteBuffer protected ()
      extends typings.flatbuffers.mod.global.flatbuffers.ByteBuffer {
      def this(bytes: js.typedarray.Uint8Array) = this()
    }
    object ByteBuffer {
      
      @JSImport("flatbuffers", "flatbuffers.ByteBuffer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def allocate(byte_size: Double): typings.flatbuffers.mod.global.flatbuffers.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(byte_size.asInstanceOf[js.Any]).asInstanceOf[typings.flatbuffers.mod.global.flatbuffers.ByteBuffer]
    }
    
    @JSImport("flatbuffers", "flatbuffers.Encoding")
    @js.native
    object Encoding extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.flatbuffers.mod.global.flatbuffers.Encoding & Double] = js.native
      
      /* 1 */ val UTF16_STRING: typings.flatbuffers.mod.global.flatbuffers.Encoding.UTF16_STRING & Double = js.native
      
      /* 0 */ val UTF8_BYTES: typings.flatbuffers.mod.global.flatbuffers.Encoding.UTF8_BYTES & Double = js.native
    }
    
    @JSImport("flatbuffers", "flatbuffers.FILE_IDENTIFIER_LENGTH")
    @js.native
    val FILE_IDENTIFIER_LENGTH: Double = js.native
    
    ////////////////////////////////////////////////////////////////////////////////
    @JSImport("flatbuffers", "flatbuffers.Long")
    @js.native
    open class Long protected ()
      extends typings.flatbuffers.mod.global.flatbuffers.Long {
      def this(low: Double, high: Double) = this()
    }
    object Long {
      
      @JSImport("flatbuffers", "flatbuffers.Long")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("flatbuffers", "flatbuffers.Long.ZERO")
      @js.native
      def ZERO: typings.flatbuffers.mod.global.flatbuffers.Long = js.native
      inline def ZERO_=(x: typings.flatbuffers.mod.global.flatbuffers.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def create(low: Double, high: Double): typings.flatbuffers.mod.global.flatbuffers.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[typings.flatbuffers.mod.global.flatbuffers.Long]
    }
    
    @JSImport("flatbuffers", "flatbuffers.SIZEOF_INT")
    @js.native
    val SIZEOF_INT: Double = js.native
    
    @JSImport("flatbuffers", "flatbuffers.SIZEOF_SHORT")
    @js.native
    val SIZEOF_SHORT: Double = js.native
    
    @JSImport("flatbuffers", "flatbuffers.SIZE_PREFIX_LENGTH")
    @js.native
    val SIZE_PREFIX_LENGTH: Double = js.native
    
    @JSImport("flatbuffers", "flatbuffers.float32")
    @js.native
    val float32: js.typedarray.Float32Array = js.native
    
    @JSImport("flatbuffers", "flatbuffers.float64")
    @js.native
    val float64: js.typedarray.Float64Array = js.native
    
    @JSImport("flatbuffers", "flatbuffers.int32")
    @js.native
    val int32: js.typedarray.Int32Array = js.native
    
    @JSImport("flatbuffers", "flatbuffers.isLittleEndian")
    @js.native
    val isLittleEndian: Boolean = js.native
  }
  
  object global {
    
    object flatbuffers {
      
      ////////////////////////////////////////////////////////////////////////////////
      @JSGlobal("flatbuffers.Builder")
      @js.native
      open class Builder () extends StObject {
        def this(initial_size: Double) = this()
        
        def addFieldFloat32(voffset: Double, value: Double, defaultValue: Double): Unit = js.native
        
        def addFieldFloat64(voffset: Double, value: Double, defaultValue: Double): Unit = js.native
        
        def addFieldInt16(voffset: Double, value: Double, defaultValue: Double): Unit = js.native
        
        def addFieldInt32(voffset: Double, value: Double, defaultValue: Double): Unit = js.native
        
        def addFieldInt64(voffset: Double, value: Long, defaultValue: Long): Unit = js.native
        
        def addFieldInt8(voffset: Double, value: Double, defaultValue: Double): Unit = js.native
        
        def addFieldOffset(voffset: Double, value: Offset, defaultValue: Offset): Unit = js.native
        
        /**
          * Structs are stored inline, so nothing additional is being added. `d` is always 0.
          */
        def addFieldStruct(voffset: Double, value: Offset, defaultValue: Offset): Unit = js.native
        
        def addFloat32(value: Double): Unit = js.native
        
        def addFloat64(value: Double): Unit = js.native
        
        def addInt16(value: Double): Unit = js.native
        
        def addInt32(value: Double): Unit = js.native
        
        def addInt64(value: Long): Unit = js.native
        
        def addInt8(value: Double): Unit = js.native
        
        /**
          * Adds on offset, relative to where it will be written.
          *
          * @param offset The offset to add
          */
        def addOffset(offset: Offset): Unit = js.native
        
        /**
          * Get the ByteBuffer representing the FlatBuffer. Only call this after you've
          * called finish(). The actual data starts at the ByteBuffer's current position,
          * not necessarily at 0.
          */
        def asUint8Array(): js.typedarray.Uint8Array = js.native
        
        /**
          * Reset all the state in this FlatBufferBuilder
          * so it can be reused to construct another buffer.
          */
        def clear(): Unit = js.native
        
        /**
          * Convenience function for creating Long objects.
          */
        def createLong(low: Double, high: Double): Long = js.native
        
        /**
          * Encode the string `s` in the buffer using UTF-8. If a Uint8Array is passed
          * instead of a string, it is assumed to contain valid UTF-8 encoded data.
          *
          * @param s The string to encode
          * @return The offset in the buffer where the encoded string starts
          */
        def createString(s: String): Offset = js.native
        def createString(s: js.typedarray.Uint8Array): Offset = js.native
        
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
        
        def finish(root_table: Offset): Unit = js.native
        def finish(root_table: Offset, file_identifier: String): Unit = js.native
        def finish(root_table: Offset, file_identifier: String, size_prefix: Boolean): Unit = js.native
        def finish(root_table: Offset, file_identifier: Unit, size_prefix: Boolean): Unit = js.native
        
        def finishSizePrefixed(root_table: Offset): Unit = js.native
        def finishSizePrefixed(root_table: Offset, file_identifier: String): Unit = js.native
        
        /**
          * In order to save space, fields that are set to their default value
          * don't get serialized into the buffer. Forcing defaults provides a
          * way to manually disable this optimization.
          *
          * @param forceDefaults true always serializes default values
          */
        def forceDefaults(forceDefaults: Boolean): Unit = js.native
        
        /**
          * Structures are always stored inline, they need to be created right
          * where they're used.  You'll get this assertion failure if you
          * created it elsewhere.
          *
          * @param obj The offset of the created object
          */
        def nested(obj: Offset): Unit = js.native
        
        /**
          * Should not be creating any other object, string or vector
          * while an object is being constructed
          */
        def notNested(): Unit = js.native
        
        /**
          * @returns Offset relative to the end of the buffer.
          */
        def offset(): Offset = js.native
        
        def pad(byte_size: Double): Unit = js.native
        
        /**
          * Prepare to write an element of `size` after `additional_bytes` have been
          * written, e.g. if you write a string, you need to align such the int length
          * field is aligned to 4 bytes, and the string data follows it directly. If all
          * you need to do is alignment, `additional_bytes` will be 0.
          *
          * @param size This is the of the new element to write
          * @param additional_bytes The padding size
          */
        def prep(size: Double, additional_bytes: Double): Unit = js.native
        
        /**
          * This checks a required field has been set in a given table that has
          * just been constructed.
          */
        def requiredField(table: Offset, field: Double): Unit = js.native
        
        /**
          * Set the current vtable at `voffset` to the current location in the buffer.
          */
        def slot(voffset: Double): Unit = js.native
        
        /**
          * Start encoding a new object in the buffer.  Users will not usually need to
          * call this directly. The FlatBuffers compiler will generate helper methods
          * that call this method internally.
          */
        def startObject(numfields: Double): Unit = js.native
        
        /**
          * Start a new array/vector of objects.  Users usually will not call
          * this directly. The FlatBuffers compiler will create a start/end
          * method for vector types in generated code.
          *
          * @param elem_size The size of each element in the array
          * @param num_elems The number of elements in the array
          * @param alignment The alignment of the array
          */
        def startVector(elem_size: Double, num_elems: Double, alignment: Double): Unit = js.native
        
        def writeFloat32(value: Double): Unit = js.native
        
        def writeFloat64(value: Double): Unit = js.native
        
        def writeInt16(value: Double): Unit = js.native
        
        def writeInt32(value: Double): Unit = js.native
        
        def writeInt64(value: Long): Unit = js.native
        
        def writeInt8(value: Double): Unit = js.native
      }
      object Builder {
        
        @JSGlobal("flatbuffers.Builder")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Doubles the size of the backing ByteBuffer and copies the old data towards
          * the end of the new buffer (since we build the buffer backwards).
          *
          * @param bb The current buffer with the existing data
          * @returns A new byte buffer with the old data copied
          * to it. The data is located at the end of the buffer.
          */
        /* static member */
        inline def growByteBuffer(bb: ByteBuffer): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("growByteBuffer")(bb.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
      }
      
      ////////////////////////////////////////////////////////////////////////////////
      @JSGlobal("flatbuffers.ByteBuffer")
      @js.native
      open class ByteBuffer protected () extends StObject {
        def this(bytes: js.typedarray.Uint8Array) = this()
        
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
        def __string(offset: Double): String | js.typedarray.Uint8Array = js.native
        def __string(offset: Double, optionalEncoding: Encoding): String | js.typedarray.Uint8Array = js.native
        
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
        
        def bytes(): js.typedarray.Uint8Array = js.native
        
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
      object ByteBuffer {
        
        @JSGlobal("flatbuffers.ByteBuffer")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def allocate(byte_size: Double): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(byte_size.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
      }
      
      @js.native
      sealed trait Encoding extends StObject
      @JSGlobal("flatbuffers.Encoding")
      @js.native
      object Encoding extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[Encoding & Double] = js.native
        
        @js.native
        sealed trait UTF16_STRING
          extends StObject
             with Encoding
        /* 1 */ val UTF16_STRING: typings.flatbuffers.mod.global.flatbuffers.Encoding.UTF16_STRING & Double = js.native
        
        @js.native
        sealed trait UTF8_BYTES
          extends StObject
             with Encoding
        /* 0 */ val UTF8_BYTES: typings.flatbuffers.mod.global.flatbuffers.Encoding.UTF8_BYTES & Double = js.native
      }
      
      @JSGlobal("flatbuffers.FILE_IDENTIFIER_LENGTH")
      @js.native
      val FILE_IDENTIFIER_LENGTH: Double = js.native
      
      ////////////////////////////////////////////////////////////////////////////////
      @JSGlobal("flatbuffers.Long")
      @js.native
      open class Long protected () extends StObject {
        def this(low: Double, high: Double) = this()
        
        var high: Double = js.native
        
        var low: Double = js.native
        
        def toFloat64(): Double = js.native
      }
      object Long {
        
        @JSGlobal("flatbuffers.Long")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("flatbuffers.Long.ZERO")
        @js.native
        def ZERO: Long = js.native
        inline def ZERO_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
        
        /* static member */
        inline def create(low: Double, high: Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Long]
      }
      
      @JSGlobal("flatbuffers.SIZEOF_INT")
      @js.native
      val SIZEOF_INT: Double = js.native
      
      @JSGlobal("flatbuffers.SIZEOF_SHORT")
      @js.native
      val SIZEOF_SHORT: Double = js.native
      
      @JSGlobal("flatbuffers.SIZE_PREFIX_LENGTH")
      @js.native
      val SIZE_PREFIX_LENGTH: Double = js.native
      
      @JSGlobal("flatbuffers.float32")
      @js.native
      val float32: js.typedarray.Float32Array = js.native
      
      @JSGlobal("flatbuffers.float64")
      @js.native
      val float64: js.typedarray.Float64Array = js.native
      
      @JSGlobal("flatbuffers.int32")
      @js.native
      val int32: js.typedarray.Int32Array = js.native
      
      @JSGlobal("flatbuffers.isLittleEndian")
      @js.native
      val isLittleEndian: Boolean = js.native
      
      type Offset = Double
      
      trait Table extends StObject {
        
        var bb: ByteBuffer | Null
        
        var bb_pos: Double
      }
      object Table {
        
        inline def apply(bb_pos: Double): Table = {
          val __obj = js.Dynamic.literal(bb_pos = bb_pos.asInstanceOf[js.Any], bb = null)
          __obj.asInstanceOf[Table]
        }
        
        extension [Self <: Table](x: Self) {
          
          inline def setBb(value: ByteBuffer): Self = StObject.set(x, "bb", value.asInstanceOf[js.Any])
          
          inline def setBbNull: Self = StObject.set(x, "bb", null)
          
          inline def setBb_pos(value: Double): Self = StObject.set(x, "bb_pos", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
