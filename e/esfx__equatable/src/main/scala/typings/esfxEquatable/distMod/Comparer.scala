package typings.esfxEquatable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparer[T] extends js.Object {
  
  /**
    * Compares two values:
    * - A negative value indicates `x` is lesser than `y`.
    * - A positive value indicates `x` is greater than `y`.
    * - A zero value indicates `x` and `y` are equivalent.
    */
  def compare(x: T, y: T): Double = js.native
}
@JSImport("@esfx/equatable/dist", "Comparer")
@js.native
object Comparer extends js.Object {
  
  /**
    * Creates a `Comparer` from a comparison function.
    */
  def create[T](comparison: Comparison[T]): Comparer[T] = js.native
  
  /**
    * The default `Comparer`.
    */
  val defaultComparer: Comparer[js.Any] = js.native
  
  /**
    * A default `Comparer` that supports `StructuralComparable` values.
    */
  val structuralComparer: Comparer[js.Any] = js.native
  
  /**
    * A default `Comparer` that compares array values rather than the arrays themselves.
    */
  val tupleComparer: Comparer[js.Array[js.Any]] = js.native
  
  /**
    * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
    */
  val tupleStructuralComparer: Comparer[js.Array[js.Any]] = js.native
}
