package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a native pointer value whose size depends on Process#pointerSize.
  */
@JSGlobal("NativePointer")
@js.native
class NativePointer protected ()
  extends NativePointerValue
     with _NativeReturnValue {
  def this(v: Int64) = this()
  def this(v: NativePointerValue) = this()
  def this(v: UInt64) = this()
  /**
    * Creates a new NativePointer from `v`, which is either a string containing the memory address in decimal,
    * or hexadecimal if prefixed with “0x”, or a number. You may use the ptr(v) short-hand for brevity.
    */
  def this(v: java.lang.String) = this()
  def this(v: scala.Double) = this()
  def add(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` + `v`.
    */
  def add(v: NativePointerValue): NativePointer = js.native
  def add(v: UInt64): NativePointer = js.native
  def add(v: java.lang.String): NativePointer = js.native
  def add(v: scala.Double): NativePointer = js.native
  def and(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` & `v`.
    */
  def and(v: NativePointerValue): NativePointer = js.native
  def and(v: UInt64): NativePointer = js.native
  def and(v: java.lang.String): NativePointer = js.native
  def and(v: scala.Double): NativePointer = js.native
  def compare(v: Int64): scala.Double = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: NativePointerValue): scala.Double = js.native
  def compare(v: UInt64): scala.Double = js.native
  def compare(v: java.lang.String): scala.Double = js.native
  def compare(v: scala.Double): scala.Double = js.native
  def equals(v: Int64): scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`; i.e. it contains the same memory address.
    */
  def equals(v: NativePointerValue): scala.Boolean = js.native
  def equals(v: UInt64): scala.Boolean = js.native
  def equals(v: java.lang.String): scala.Boolean = js.native
  def equals(v: scala.Double): scala.Boolean = js.native
  /**
    * Returns a boolean allowing you to conveniently check if a pointer is `NULL`.
    */
  def isNull(): scala.Boolean = js.native
  /**
    * Makes a new NativePointer whose value is ~`this`.
    */
  def not(): NativePointer = js.native
  def or(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` | `v`.
    */
  def or(v: NativePointerValue): NativePointer = js.native
  def or(v: UInt64): NativePointer = js.native
  def or(v: java.lang.String): NativePointer = js.native
  def or(v: scala.Double): NativePointer = js.native
  def readAnsiString(): java.lang.String | scala.Null = js.native
  def readAnsiString(size: scala.Double): java.lang.String | scala.Null = js.native
  def readByteArray(length: scala.Double): stdLib.ArrayBuffer | scala.Null = js.native
  def readCString(): java.lang.String | scala.Null = js.native
  def readCString(size: scala.Double): java.lang.String | scala.Null = js.native
  def readDouble(): scala.Double = js.native
  def readFloat(): scala.Double = js.native
  def readInt(): scala.Double = js.native
  def readLong(): scala.Double | Int64 = js.native
  def readPointer(): NativePointer = js.native
  def readS16(): scala.Double = js.native
  def readS32(): scala.Double = js.native
  def readS64(): Int64 = js.native
  def readS8(): scala.Double = js.native
  def readShort(): scala.Double = js.native
  def readU16(): scala.Double = js.native
  def readU32(): scala.Double = js.native
  def readU64(): UInt64 = js.native
  def readU8(): scala.Double = js.native
  def readUInt(): scala.Double = js.native
  def readULong(): scala.Double | UInt64 = js.native
  def readUShort(): scala.Double = js.native
  def readUtf16String(): java.lang.String | scala.Null = js.native
  def readUtf16String(length: scala.Double): java.lang.String | scala.Null = js.native
  def readUtf8String(): java.lang.String | scala.Null = js.native
  def readUtf8String(size: scala.Double): java.lang.String | scala.Null = js.native
  def shl(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` >> `v`.
    */
  def shl(v: NativePointerValue): NativePointer = js.native
  def shl(v: UInt64): NativePointer = js.native
  def shl(v: java.lang.String): NativePointer = js.native
  def shl(v: scala.Double): NativePointer = js.native
  def shr(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` << `v`.
    */
  def shr(v: NativePointerValue): NativePointer = js.native
  def shr(v: UInt64): NativePointer = js.native
  def shr(v: java.lang.String): NativePointer = js.native
  def shr(v: scala.Double): NativePointer = js.native
  def sub(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` - `v`.
    */
  def sub(v: NativePointerValue): NativePointer = js.native
  def sub(v: UInt64): NativePointer = js.native
  def sub(v: java.lang.String): NativePointer = js.native
  def sub(v: scala.Double): NativePointer = js.native
  /**
    * Converts to a signed 32-bit integer.
    */
  def toInt32(): scala.Double = js.native
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): java.lang.String = js.native
  /**
    * Returns a string containing a `Memory#scan()`-compatible match pattern for this pointer’s raw value.
    */
  def toMatchPattern(): java.lang.String = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
  def writeAnsiString(value: java.lang.String): NativePointer = js.native
  def writeByteArray(value: js.Array[scala.Double]): NativePointer = js.native
  def writeByteArray(value: stdLib.ArrayBuffer): NativePointer = js.native
  def writeDouble(value: scala.Double): NativePointer = js.native
  def writeFloat(value: scala.Double): NativePointer = js.native
  def writeInt(value: Int64): NativePointer = js.native
  def writeInt(value: scala.Double): NativePointer = js.native
  def writeLong(value: Int64): NativePointer = js.native
  def writeLong(value: scala.Double): NativePointer = js.native
  def writePointer(value: NativePointerValue): NativePointer = js.native
  def writeS16(value: Int64): NativePointer = js.native
  def writeS16(value: scala.Double): NativePointer = js.native
  def writeS32(value: Int64): NativePointer = js.native
  def writeS32(value: scala.Double): NativePointer = js.native
  def writeS64(value: Int64): NativePointer = js.native
  def writeS64(value: scala.Double): NativePointer = js.native
  def writeS8(value: Int64): NativePointer = js.native
  def writeS8(value: scala.Double): NativePointer = js.native
  def writeShort(value: Int64): NativePointer = js.native
  def writeShort(value: scala.Double): NativePointer = js.native
  def writeU16(value: UInt64): NativePointer = js.native
  def writeU16(value: scala.Double): NativePointer = js.native
  def writeU32(value: UInt64): NativePointer = js.native
  def writeU32(value: scala.Double): NativePointer = js.native
  def writeU64(value: UInt64): NativePointer = js.native
  def writeU64(value: scala.Double): NativePointer = js.native
  def writeU8(value: UInt64): NativePointer = js.native
  def writeU8(value: scala.Double): NativePointer = js.native
  def writeUInt(value: UInt64): NativePointer = js.native
  def writeUInt(value: scala.Double): NativePointer = js.native
  def writeULong(value: UInt64): NativePointer = js.native
  def writeULong(value: scala.Double): NativePointer = js.native
  def writeUShort(value: UInt64): NativePointer = js.native
  def writeUShort(value: scala.Double): NativePointer = js.native
  def writeUtf16String(value: java.lang.String): NativePointer = js.native
  def writeUtf8String(value: java.lang.String): NativePointer = js.native
  def xor(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` ^ `v`.
    */
  def xor(v: NativePointerValue): NativePointer = js.native
  def xor(v: UInt64): NativePointer = js.native
  def xor(v: java.lang.String): NativePointer = js.native
  def xor(v: scala.Double): NativePointer = js.native
}

