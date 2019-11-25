package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.OK
  - typings.atGoogleMaps.atGoogleMapsStrings.NOT_FOUND
  - typings.atGoogleMaps.atGoogleMapsStrings.ZERO_RESULTS
  - typings.atGoogleMaps.atGoogleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED
*/
trait DistanceMatrixResponseElementLevelStatus extends js.Object

object DistanceMatrixResponseElementLevelStatus {
  @scala.inline
  def MAX_ROUTE_LENGTH_EXCEEDED: typings.atGoogleMaps.atGoogleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED = this.cast("MAX_ROUTE_LENGTH_EXCEEDED")
  @scala.inline
  def NOT_FOUND: typings.atGoogleMaps.atGoogleMapsStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def OK: typings.atGoogleMaps.atGoogleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def ZERO_RESULTS: typings.atGoogleMaps.atGoogleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

