package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.best_guess
  - typings.atGoogleMaps.atGoogleMapsStrings.pessimistic
  - typings.atGoogleMaps.atGoogleMapsStrings.optimistic
*/
trait TrafficModel extends js.Object

object TrafficModel {
  @scala.inline
  def best_guess: typings.atGoogleMaps.atGoogleMapsStrings.best_guess = this.cast("best_guess")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optimistic: typings.atGoogleMaps.atGoogleMapsStrings.optimistic = this.cast("optimistic")
  @scala.inline
  def pessimistic: typings.atGoogleMaps.atGoogleMapsStrings.pessimistic = this.cast("pessimistic")
}

