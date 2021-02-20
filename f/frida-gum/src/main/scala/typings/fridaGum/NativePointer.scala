package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a native pointer value whose size depends on Process#pointerSize.
  */
@js.native
trait NativePointer
  extends NativePointerValue
     with _NativeReturnValue {
  
  def add(v: String): NativePointer = js.native
  def add(v: Double): NativePointer = js.native
  def add(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` + `v`.
    */
  def add(v: NativePointerValue): NativePointer = js.native
  def add(v: UInt64): NativePointer = js.native
  
  def and(v: String): NativePointer = js.native
  def and(v: Double): NativePointer = js.native
  def and(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` & `v`.
    */
  def and(v: NativePointerValue): NativePointer = js.native
  def and(v: UInt64): NativePointer = js.native
  
  /**
    * Makes a new NativePointer by taking `this` and blending it with
    * a constant, which may in turn be passed to `sign()` as `data`.
    *
    * @param smallInteger Value to blend with.
    */
  def blend(smallInteger: Double): NativePointer = js.native
  
  def compare(v: String): Double = js.native
  def compare(v: Double): Double = js.native
  def compare(v: Int64): Double = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: NativePointerValue): Double = js.native
  def compare(v: UInt64): Double = js.native
  
  def equals(v: String): Boolean = js.native
  def equals(v: Double): Boolean = js.native
  def equals(v: Int64): Boolean = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`; i.e. it contains the same memory address.
    */
  def equals(v: NativePointerValue): Boolean = js.native
  def equals(v: UInt64): Boolean = js.native
  
  /**
    * Returns a boolean allowing you to conveniently check if a pointer is `NULL`.
    */
  def isNull(): Boolean = js.native
  
  /**
    * Makes a new NativePointer whose value is ~`this`.
    */
  def not(): NativePointer = js.native
  
  def or(v: String): NativePointer = js.native
  def or(v: Double): NativePointer = js.native
  def or(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` | `v`.
    */
  def or(v: NativePointerValue): NativePointer = js.native
  def or(v: UInt64): NativePointer = js.native
  
  def readAnsiString(): String | Null = js.native
  def readAnsiString(size: Double): String | Null = js.native
  
  def readByteArray(length: Double): ArrayBuffer | Null = js.native
  
  def readCString(): String | Null = js.native
  def readCString(size: Double): String | Null = js.native
  
  def readDouble(): Double = js.native
  
  def readFloat(): Double = js.native
  
  def readInt(): Double = js.native
  
  def readLong(): Double | Int64 = js.native
  
  def readPointer(): NativePointer = js.native
  
  def readS16(): Double = js.native
  
  def readS32(): Double = js.native
  
  def readS64(): Int64 = js.native
  
  def readS8(): Double = js.native
  
  def readShort(): Double = js.native
  
  def readU16(): Double = js.native
  
  def readU32(): Double = js.native
  
  def readU64(): UInt64 = js.native
  
  def readU8(): Double = js.native
  
  def readUInt(): Double = js.native
  
  def readULong(): Double | UInt64 = js.native
  
  def readUShort(): Double = js.native
  
  def readUtf16String(): String | Null = js.native
  def readUtf16String(length: Double): String | Null = js.native
  
  def readUtf8String(): String | Null = js.native
  def readUtf8String(size: Double): String | Null = js.native
  
  def shl(v: String): NativePointer = js.native
  def shl(v: Double): NativePointer = js.native
  def shl(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` >> `v`.
    */
  def shl(v: NativePointerValue): NativePointer = js.native
  def shl(v: UInt64): NativePointer = js.native
  
  def shr(v: String): NativePointer = js.native
  def shr(v: Double): NativePointer = js.native
  def shr(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` << `v`.
    */
  def shr(v: NativePointerValue): NativePointer = js.native
  def shr(v: UInt64): NativePointer = js.native
  
  /**
    * Makes a new NativePointer by taking the bits of `this` and adding
    * pointer authentication bits, creating a signed pointer. This is a
    * no-op if the current process does not support pointer
    * authentication, returning `this` instead of a new value.
    *
    * @param key The key to use. Defaults to `ia`.
    * @param data The data to use. Defaults to `0`.
    */
  def sign(): NativePointer = js.native
  def sign(key: js.UndefOr[scala.Nothing], data: String): NativePointer = js.native
  def sign(key: js.UndefOr[scala.Nothing], data: Double): NativePointer = js.native
  def sign(key: js.UndefOr[scala.Nothing], data: Int64): NativePointer = js.native
  def sign(key: js.UndefOr[scala.Nothing], data: NativePointerValue): NativePointer = js.native
  def sign(key: js.UndefOr[scala.Nothing], data: UInt64): NativePointer = js.native
  def sign(key: PointerAuthenticationKey): NativePointer = js.native
  def sign(key: PointerAuthenticationKey, data: String): NativePointer = js.native
  def sign(key: PointerAuthenticationKey, data: Double): NativePointer = js.native
  def sign(key: PointerAuthenticationKey, data: Int64): NativePointer = js.native
  def sign(key: PointerAuthenticationKey, data: NativePointerValue): NativePointer = js.native
  def sign(key: PointerAuthenticationKey, data: UInt64): NativePointer = js.native
  
  /**
    * Makes a new NativePointer by taking the bits of `this` and
    * removing its pointer authentication bits, creating a raw pointer.
    * This is a no-op if the current process does not support pointer
    * authentication, returning `this` instead of a new value.
    *
    * @param key The key that was used to sign `this`. Defaults to `ia`.
    */
  def strip(): NativePointer = js.native
  def strip(key: PointerAuthenticationKey): NativePointer = js.native
  
  def sub(v: String): NativePointer = js.native
  def sub(v: Double): NativePointer = js.native
  def sub(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` - `v`.
    */
  def sub(v: NativePointerValue): NativePointer = js.native
  def sub(v: UInt64): NativePointer = js.native
  
  /**
    * Converts to a signed 32-bit integer.
    */
  def toInt32(): Double = js.native
  
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): String = js.native
  
  /**
    * Returns a string containing a `Memory#scan()`-compatible match pattern for this pointer’s raw value.
    */
  def toMatchPattern(): String = js.native
  
  def toString(radix: Double): String = js.native
  
  /**
    * Converts to an unsigned 32-bit integer.
    */
  def toUInt32(): Double = js.native
  
  def writeAnsiString(value: String): NativePointer = js.native
  
  def writeByteArray(value: js.Array[Double]): NativePointer = js.native
  def writeByteArray(value: ArrayBuffer): NativePointer = js.native
  
  def writeDouble(value: Double): NativePointer = js.native
  
  def writeFloat(value: Double): NativePointer = js.native
  
  def writeInt(value: Double): NativePointer = js.native
  def writeInt(value: Int64): NativePointer = js.native
  
  def writeLong(value: Double): NativePointer = js.native
  def writeLong(value: Int64): NativePointer = js.native
  
  def writePointer(value: NativePointerValue): NativePointer = js.native
  
  def writeS16(value: Double): NativePointer = js.native
  def writeS16(value: Int64): NativePointer = js.native
  
  def writeS32(value: Double): NativePointer = js.native
  def writeS32(value: Int64): NativePointer = js.native
  
  def writeS64(value: Double): NativePointer = js.native
  def writeS64(value: Int64): NativePointer = js.native
  
  def writeS8(value: Double): NativePointer = js.native
  def writeS8(value: Int64): NativePointer = js.native
  
  def writeShort(value: Double): NativePointer = js.native
  def writeShort(value: Int64): NativePointer = js.native
  
  def writeU16(value: Double): NativePointer = js.native
  def writeU16(value: UInt64): NativePointer = js.native
  
  def writeU32(value: Double): NativePointer = js.native
  def writeU32(value: UInt64): NativePointer = js.native
  
  def writeU64(value: Double): NativePointer = js.native
  def writeU64(value: UInt64): NativePointer = js.native
  
  def writeU8(value: Double): NativePointer = js.native
  def writeU8(value: UInt64): NativePointer = js.native
  
  def writeUInt(value: Double): NativePointer = js.native
  def writeUInt(value: UInt64): NativePointer = js.native
  
  def writeULong(value: Double): NativePointer = js.native
  def writeULong(value: UInt64): NativePointer = js.native
  
  def writeUShort(value: Double): NativePointer = js.native
  def writeUShort(value: UInt64): NativePointer = js.native
  
  def writeUtf16String(value: String): NativePointer = js.native
  
  def writeUtf8String(value: String): NativePointer = js.native
  
  def xor(v: String): NativePointer = js.native
  def xor(v: Double): NativePointer = js.native
  def xor(v: Int64): NativePointer = js.native
  /**
    * Makes a new NativePointer whose value is `this` ^ `v`.
    */
  def xor(v: NativePointerValue): NativePointer = js.native
  def xor(v: UInt64): NativePointer = js.native
}
