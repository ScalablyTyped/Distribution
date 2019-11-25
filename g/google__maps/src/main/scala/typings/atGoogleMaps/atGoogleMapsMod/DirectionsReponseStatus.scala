package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.OK
  - typings.atGoogleMaps.atGoogleMapsStrings.NOT_FOUND
  - typings.atGoogleMaps.atGoogleMapsStrings.ZERO_RESULTS
  - typings.atGoogleMaps.atGoogleMapsStrings.MAX_WAYPOINTS_EXCEEDED
  - typings.atGoogleMaps.atGoogleMapsStrings.`MAX_ROUTE_LENGTH_EXCEEDED `
  - typings.atGoogleMaps.atGoogleMapsStrings.INVALID_REQUEST
  - typings.atGoogleMaps.atGoogleMapsStrings.OVER_DAILY_LIMIT
  - typings.atGoogleMaps.atGoogleMapsStrings.OVER_QUERY_LIMIT
  - typings.atGoogleMaps.atGoogleMapsStrings.REQUEST_DENIED
  - typings.atGoogleMaps.atGoogleMapsStrings.UNKNOWN_ERROR
*/
trait DirectionsReponseStatus extends js.Object

object DirectionsReponseStatus {
  @scala.inline
  def INVALID_REQUEST: typings.atGoogleMaps.atGoogleMapsStrings.INVALID_REQUEST = this.cast("INVALID_REQUEST")
  @scala.inline
  def `MAX_ROUTE_LENGTH_EXCEEDED `: typings.atGoogleMaps.atGoogleMapsStrings.`MAX_ROUTE_LENGTH_EXCEEDED ` = this.cast("MAX_ROUTE_LENGTH_EXCEEDED ")
  @scala.inline
  def MAX_WAYPOINTS_EXCEEDED: typings.atGoogleMaps.atGoogleMapsStrings.MAX_WAYPOINTS_EXCEEDED = this.cast("MAX_WAYPOINTS_EXCEEDED")
  @scala.inline
  def NOT_FOUND: typings.atGoogleMaps.atGoogleMapsStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def OK: typings.atGoogleMaps.atGoogleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def OVER_DAILY_LIMIT: typings.atGoogleMaps.atGoogleMapsStrings.OVER_DAILY_LIMIT = this.cast("OVER_DAILY_LIMIT")
  @scala.inline
  def OVER_QUERY_LIMIT: typings.atGoogleMaps.atGoogleMapsStrings.OVER_QUERY_LIMIT = this.cast("OVER_QUERY_LIMIT")
  @scala.inline
  def REQUEST_DENIED: typings.atGoogleMaps.atGoogleMapsStrings.REQUEST_DENIED = this.cast("REQUEST_DENIED")
  @scala.inline
  def UNKNOWN_ERROR: typings.atGoogleMaps.atGoogleMapsStrings.UNKNOWN_ERROR = this.cast("UNKNOWN_ERROR")
  @scala.inline
  def ZERO_RESULTS: typings.atGoogleMaps.atGoogleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

