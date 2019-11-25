package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.OK
  - typings.atGoogleMaps.atGoogleMapsStrings.INVALID_REQUEST
  - typings.atGoogleMaps.atGoogleMapsStrings.OVER_DAILY_LIMIT
  - typings.atGoogleMaps.atGoogleMapsStrings.OVER_QUERY_LIMIT
  - typings.atGoogleMaps.atGoogleMapsStrings.REQUEST_DENIED
  - typings.atGoogleMaps.atGoogleMapsStrings.UNKNOWN_ERROR
*/
trait ElevationResponseStatus extends js.Object

object ElevationResponseStatus {
  @scala.inline
  def INVALID_REQUEST: typings.atGoogleMaps.atGoogleMapsStrings.INVALID_REQUEST = this.cast("INVALID_REQUEST")
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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

