package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a signed 64-bit value.
  */
@JSGlobal("Int64")
@js.native
class Int64 protected ()
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
  def this(v: Int64) = this()
  def add(v: String): Int64 = js.native
  def add(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` + `v`.
    */
  def add(v: Int64): Int64 = js.native
  def and(v: String): Int64 = js.native
  def and(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` & `v`.
    */
  def and(v: Int64): Int64 = js.native
  def compare(v: String): Double = js.native
  def compare(v: Double): Double = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: Int64): Double = js.native
  def equals(v: String): Boolean = js.native
  def equals(v: Double): Boolean = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`.
    */
  def equals(v: Int64): Boolean = js.native
  /**
    * Makes a new Int64 whose value is ~`this`.
    */
  def not(): Int64 = js.native
  def or(v: String): Int64 = js.native
  def or(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` | `v`.
    */
  def or(v: Int64): Int64 = js.native
  def shl(v: String): Int64 = js.native
  def shl(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` << `v`.
    */
  def shl(v: Int64): Int64 = js.native
  def shr(v: String): Int64 = js.native
  def shr(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` >> `v`.
    */
  def shr(v: Int64): Int64 = js.native
  def sub(v: String): Int64 = js.native
  def sub(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` - `v`.
    */
  def sub(v: Int64): Int64 = js.native
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): String = js.native
  /**
    * Converts to a number.
    */
  def toNumber(): Double = js.native
  def toString(radix: Double): String = js.native
  def xor(v: String): Int64 = js.native
  def xor(v: Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` ^ `v`.
    */
  def xor(v: Int64): Int64 = js.native
}

@JSGlobal("int64")
@js.native
object int64 extends js.Object {
  /**
    * Short-hand for `new Int64(value)`.
    */
  def apply(value: String): Int64 = js.native
  def apply(value: Double): Int64 = js.native
}

