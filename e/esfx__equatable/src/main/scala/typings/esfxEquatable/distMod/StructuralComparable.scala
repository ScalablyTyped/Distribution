package typings.esfxEquatable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuralComparable extends js.Object
@JSImport("@esfx/equatable/dist", "StructuralComparable")
@js.native
object StructuralComparable extends js.Object {
  
  /**
    * Determines whether a value is StructuralComparable.
    */
  def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = js.native
  
  /**
    * Determines whether a value is StructuralComparable.
    * @deprecated Use `StructuralComparable.hasInstance` instead.
    */
  def isStructuralComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = js.native
  
  val name: /* "StructuralComparable" */ String = js.native
  
  /**
    * A well-known symbol used to define a structural comparison method on a value.
    */
  val structuralCompareTo: js.Symbol = js.native
}
