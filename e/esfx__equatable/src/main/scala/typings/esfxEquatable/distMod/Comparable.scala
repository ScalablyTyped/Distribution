package typings.esfxEquatable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparable extends js.Object

@JSImport("@esfx/equatable/dist", "Comparable")
@js.native
object Comparable extends js.Object {
  /**
    * A well-known symbol used to define a relational comparison method on a value.
    */
  val compareTo: js.Symbol = js.native
  val name: /* "Comparable" */ String = js.native
  /**
    * Determines whether a value is Comparable.
    */
  def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = js.native
  /**
    * Determines whether a value is Comparable.
    * @deprecated Use `Comparable.hasInstance` instead.
    */
  def isComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = js.native
}

