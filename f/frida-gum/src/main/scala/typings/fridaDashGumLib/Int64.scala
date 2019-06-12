package typings
package fridaDashGumLib

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
  def this(v: Int64) = this()
  /**
    * Creates a new Int64 from `v`, which is either a string containing the value in decimal, or hexadecimal
    * if prefixed with “0x”, or a number. You may use the int64(v) short-hand for brevity.
    */
  def this(v: java.lang.String) = this()
  def this(v: scala.Double) = this()
  /**
    * Makes a new Int64 whose value is `this` + `v`.
    */
  def add(v: Int64): Int64 = js.native
  def add(v: java.lang.String): Int64 = js.native
  def add(v: scala.Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` & `v`.
    */
  def and(v: Int64): Int64 = js.native
  def and(v: java.lang.String): Int64 = js.native
  def and(v: scala.Double): Int64 = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: Int64): scala.Double = js.native
  def compare(v: java.lang.String): scala.Double = js.native
  def compare(v: scala.Double): scala.Double = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`.
    */
  def equals(v: Int64): scala.Boolean = js.native
  def equals(v: java.lang.String): scala.Boolean = js.native
  def equals(v: scala.Double): scala.Boolean = js.native
  /**
    * Makes a new Int64 whose value is ~`this`.
    */
  def not(): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` | `v`.
    */
  def or(v: Int64): Int64 = js.native
  def or(v: java.lang.String): Int64 = js.native
  def or(v: scala.Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` << `v`.
    */
  def shl(v: Int64): Int64 = js.native
  def shl(v: java.lang.String): Int64 = js.native
  def shl(v: scala.Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` >> `v`.
    */
  def shr(v: Int64): Int64 = js.native
  def shr(v: java.lang.String): Int64 = js.native
  def shr(v: scala.Double): Int64 = js.native
  /**
    * Makes a new Int64 whose value is `this` - `v`.
    */
  def sub(v: Int64): Int64 = js.native
  def sub(v: java.lang.String): Int64 = js.native
  def sub(v: scala.Double): Int64 = js.native
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): java.lang.String = js.native
  /**
    * Converts to a number.
    */
  def toNumber(): scala.Double = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
  /**
    * Makes a new Int64 whose value is `this` ^ `v`.
    */
  def xor(v: Int64): Int64 = js.native
  def xor(v: java.lang.String): Int64 = js.native
  def xor(v: scala.Double): Int64 = js.native
}

