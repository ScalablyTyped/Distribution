package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an unsigned 64-bit value.
  */
@js.native
trait UInt64
  extends _Arm64CallArgument
     with _ArmCallArgument
     with _MipsCallArgument
     with _NativeArgumentValue
     with _NativeReturnValue
     with _X86CallArgument {
  
  def add(v: String): UInt64 = js.native
  def add(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` + `v`.
    */
  def add(v: UInt64): UInt64 = js.native
  
  def and(v: String): UInt64 = js.native
  def and(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` & `v`.
    */
  def and(v: UInt64): UInt64 = js.native
  
  def compare(v: String): Double = js.native
  def compare(v: Double): Double = js.native
  /**
    * Returns an integer comparison result just like String#localeCompare().
    */
  def compare(v: UInt64): Double = js.native
  
  def equals(v: String): Boolean = js.native
  def equals(v: Double): Boolean = js.native
  /**
    * Returns a boolean indicating whether `v` is equal to `this`.
    */
  def equals(v: UInt64): Boolean = js.native
  
  /**
    * Makes a new UInt64 whose value is ~`this`.
    */
  def not(): UInt64 = js.native
  
  def or(v: String): UInt64 = js.native
  def or(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` | `v`.
    */
  def or(v: UInt64): UInt64 = js.native
  
  def shl(v: String): UInt64 = js.native
  def shl(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` >> `v`.
    */
  def shl(v: UInt64): UInt64 = js.native
  
  def shr(v: String): UInt64 = js.native
  def shr(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` << `v`.
    */
  def shr(v: UInt64): UInt64 = js.native
  
  def sub(v: String): UInt64 = js.native
  def sub(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` - `v`.
    */
  def sub(v: UInt64): UInt64 = js.native
  
  /**
    * Converts to a JSON-serializable value. Same as `toString()`.
    */
  def toJSON(): String = js.native
  
  /**
    * Converts to a number.
    */
  def toNumber(): Double = js.native
  
  def toString(radix: Double): String = js.native
  
  def xor(v: String): UInt64 = js.native
  def xor(v: Double): UInt64 = js.native
  /**
    * Makes a new UInt64 whose value is `this` ^ `v`.
    */
  def xor(v: UInt64): UInt64 = js.native
}
