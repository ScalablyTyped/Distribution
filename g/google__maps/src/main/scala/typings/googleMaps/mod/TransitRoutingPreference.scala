package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.less_walking
  - typings.googleMaps.googleMapsStrings.fewer_transfers
*/
trait TransitRoutingPreference extends js.Object

object TransitRoutingPreference {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fewer_transfers: typings.googleMaps.googleMapsStrings.fewer_transfers = this.cast("fewer_transfers")
  @scala.inline
  def less_walking: typings.googleMaps.googleMapsStrings.less_walking = this.cast("less_walking")
}

