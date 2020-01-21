package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a signed 64-bit value.
  */
@JSGlobal("Int64")
@js.native
class Int64_ protected ()
  extends _Arm64CallArgument
     with _ArmCallArgument
     with _MipsCallArgument
     with _NativeArgumentValue
     with _NativeReturnValue
     with _X86CallArgument {
  /**
    * Creates a new Int64 from `v`, which is either a string containing the value in decimal, or hexadecimal
    * if prefixed with “0x”, or a number. You may use the int64(v) short-hand for brevity.
    */
  def this(v: String) = this()
  def this(v: Double) = this()
  def this(v: Int64_) = this()
  def add(v: String): Int64_ = js.native
  def add(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` + `v`.
    */
  def add(v: Int64_): Int64_ = js.native
  def and(v: String): Int64_ = js.native
  def and(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` & `v`.
    */
  def and(v: Int64_): Int64_ = js.native
  def compare(v: String): Double = js.native
  def compare(v: Double): Double = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: Int64_): Double = js.native
  def equals(v: String): Boolean = js.native
  def equals(v: Double): Boolean = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`.
    */
  def equals(v: Int64_): Boolean = js.native
  /**
    * Makes a new Int64 whose value is ~`this`.
    */
  def not(): Int64_ = js.native
  def or(v: String): Int64_ = js.native
  def or(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` | `v`.
    */
  def or(v: Int64_): Int64_ = js.native
  def shl(v: String): Int64_ = js.native
  def shl(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` << `v`.
    */
  def shl(v: Int64_): Int64_ = js.native
  def shr(v: String): Int64_ = js.native
  def shr(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` >> `v`.
    */
  def shr(v: Int64_): Int64_ = js.native
  def sub(v: String): Int64_ = js.native
  def sub(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` - `v`.
    */
  def sub(v: Int64_): Int64_ = js.native
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): String = js.native
  /**
    * Converts to a number.
    */
  def toNumber(): Double = js.native
  def toString(radix: Double): String = js.native
  def xor(v: String): Int64_ = js.native
  def xor(v: Double): Int64_ = js.native
  /**
    * Makes a new Int64 whose value is `this` ^ `v`.
    */
  def xor(v: Int64_): Int64_ = js.native
}

