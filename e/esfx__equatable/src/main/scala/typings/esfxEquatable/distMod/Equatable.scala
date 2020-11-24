package typings.esfxEquatable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Equatable extends js.Object
@JSImport("@esfx/equatable/dist", "Equatable")
@js.native
object Equatable extends js.Object {
  
  /**
    * A well-known symbol used to define an equality test method on a value.
    */
  @JSName("equals")
  val equals_FEquatable: js.Symbol = js.native
  
  /**
    * Determines whether a value is Equatable.
    */
  def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = js.native
  
  /**
    * A well-known symbol used to define a hashing method on a value.
    */
  val hash: js.Symbol = js.native
  
  /**
    * Determines whether a value is Equatable.
    * @deprecated Use `Equatable.hasInstance` instead.
    */
  def isEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = js.native
  
  val name: /* "Equatable" */ String = js.native
}
