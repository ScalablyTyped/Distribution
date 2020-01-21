package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an unsigned 64-bit value.
  */
@JSGlobal("UInt64")
@js.native
class UInt64_ protected ()
  extends _Arm64CallArgument
     with _ArmCallArgument
     with _MipsCallArgument
     with _NativeArgumentValue
     with _NativeReturnValue
     with _X86CallArgument {
  /**
    * Creates a new UInt64 from `v`, which is either a string containing the value in decimal, or hexadecimal
    * if prefixed with “0x”, or a number. You may use the uint64(v) short-hand for brevity.
    */
  def this(v: String) = this()
  def this(v: Double) = this()
  def this(v: UInt64_) = this()
  def add(v: String): UInt64_ = js.native
  def add(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` + `v`.
    */
  def add(v: UInt64_): UInt64_ = js.native
  def and(v: String): UInt64_ = js.native
  def and(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` & `v`.
    */
  def and(v: UInt64_): UInt64_ = js.native
  def compare(v: String): Double = js.native
  def compare(v: Double): Double = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: UInt64_): Double = js.native
  def equals(v: String): Boolean = js.native
  def equals(v: Double): Boolean = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`.
    */
  def equals(v: UInt64_): Boolean = js.native
  /**
    * Makes a new UInt64 whose value is ~`this`.
    */
  def not(): UInt64_ = js.native
  def or(v: String): UInt64_ = js.native
  def or(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` | `v`.
    */
  def or(v: UInt64_): UInt64_ = js.native
  def shl(v: String): UInt64_ = js.native
  def shl(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` >> `v`.
    */
  def shl(v: UInt64_): UInt64_ = js.native
  def shr(v: String): UInt64_ = js.native
  def shr(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` << `v`.
    */
  def shr(v: UInt64_): UInt64_ = js.native
  def sub(v: String): UInt64_ = js.native
  def sub(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` - `v`.
    */
  def sub(v: UInt64_): UInt64_ = js.native
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): String = js.native
  /**
    * Converts to a number.
    */
  def toNumber(): Double = js.native
  def toString(radix: Double): String = js.native
  def xor(v: String): UInt64_ = js.native
  def xor(v: Double): UInt64_ = js.native
  /**
    * Makes a new UInt64 whose value is `this` ^ `v`.
    */
  def xor(v: UInt64_): UInt64_ = js.native
}

