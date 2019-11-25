package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.dailyLimitExceeded
  - typings.atGoogleMaps.atGoogleMapsStrings.keyInvalid
  - typings.atGoogleMaps.atGoogleMapsStrings.userRateLimitExceeded
  - typings.atGoogleMaps.atGoogleMapsStrings.notFound
  - typings.atGoogleMaps.atGoogleMapsStrings.parseError
*/
trait GeolocationErrorReason extends js.Object

object GeolocationErrorReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dailyLimitExceeded: typings.atGoogleMaps.atGoogleMapsStrings.dailyLimitExceeded = this.cast("dailyLimitExceeded")
  @scala.inline
  def keyInvalid: typings.atGoogleMaps.atGoogleMapsStrings.keyInvalid = this.cast("keyInvalid")
  @scala.inline
  def notFound: typings.atGoogleMaps.atGoogleMapsStrings.notFound = this.cast("notFound")
  @scala.inline
  def parseError: typings.atGoogleMaps.atGoogleMapsStrings.parseError = this.cast("parseError")
  @scala.inline
  def userRateLimitExceeded: typings.atGoogleMaps.atGoogleMapsStrings.userRateLimitExceeded = this.cast("userRateLimitExceeded")
}

