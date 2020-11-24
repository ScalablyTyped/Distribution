package typings.esfxEquatable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Equaler[T] extends js.Object {
  
  /**
    * Tests whether two values are equal to each other.
    * @param x The first value.
    * @param y The second value.
    */
  def equals(x: T, y: T): Boolean = js.native
  
  /**
    * Generates a hash code for a value.
    */
  def hash(x: T): Double = js.native
}
@JSImport("@esfx/equatable/dist", "Equaler")
@js.native
object Equaler extends js.Object {
  
  /**
    * Creates an `Equaler` from a comparison function and an optional hash generator.
    */
  def create[T](equalityComparison: EqualityComparison[T]): Equaler[T] = js.native
  def create[T](equalityComparison: EqualityComparison[T], hashGenerator: HashGenerator[T]): Equaler[T] = js.native
  
  /**
    * Gets the default `Equaler`.
    */
  val defaultEqualer: Equaler[js.Any] = js.native
  
  /**
    * Gets a default `Equaler` that supports `StructuralEquatable` values.
    */
  val structuralEqualer: Equaler[js.Any] = js.native
  
  /**
    * An `Equaler` that compares array values rather than the arrays themselves.
    */
  val tupleEqualer: Equaler[js.Array[js.Any]] = js.native
  
  /**
    * An `Equaler` that compares array values that may be `StructuralEquatable` rather than the arrays themselves.
    */
  val tupleStructuralEqualer: Equaler[js.Array[js.Any]] = js.native
}
