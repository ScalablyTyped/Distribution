package typings.esfxEquatable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructuralEquatable extends js.Object

@JSImport("@esfx/equatable/dist", "StructuralEquatable")
@js.native
object StructuralEquatable extends js.Object {
  val name: /* "StructuralEquatable" */ String = js.native
  /**
    * A well-known symbol used to define a structural equality test method on a value.
    */
  val structuralEquals: js.Symbol = js.native
  /**
    * A well-known symbol used to define a structural hashing method on a value.
    */
  val structuralHash: js.Symbol = js.native
  /**
    * Determines whether a value is StructuralEquatable.
    */
  def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = js.native
  /**
    * Determines whether a value is StructuralEquatable.
    * @deprecated Use `StructuralEquatable.hasInstance` instead.
    */
  def isStructuralEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = js.native
}

