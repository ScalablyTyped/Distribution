package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.OK
  - typings.googleMaps.googleMapsStrings.NOT_FOUND
  - typings.googleMaps.googleMapsStrings.ZERO_RESULTS
  - typings.googleMaps.googleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED
*/
trait DistanceMatrixResponseElementLevelStatus extends js.Object

object DistanceMatrixResponseElementLevelStatus {
  @scala.inline
  def MAX_ROUTE_LENGTH_EXCEEDED: typings.googleMaps.googleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED = this.cast("MAX_ROUTE_LENGTH_EXCEEDED")
  @scala.inline
  def NOT_FOUND: typings.googleMaps.googleMapsStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def OK: typings.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def ZERO_RESULTS: typings.googleMaps.googleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

