package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.best_guess
  - typings.googleMaps.googleMapsStrings.pessimistic
  - typings.googleMaps.googleMapsStrings.optimistic
*/
trait TrafficModel extends js.Object

object TrafficModel {
  @scala.inline
  def best_guess: typings.googleMaps.googleMapsStrings.best_guess = this.cast("best_guess")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optimistic: typings.googleMaps.googleMapsStrings.optimistic = this.cast("optimistic")
  @scala.inline
  def pessimistic: typings.googleMaps.googleMapsStrings.pessimistic = this.cast("pessimistic")
}

