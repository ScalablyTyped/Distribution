package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.dailyLimitExceeded
  - typings.googleMaps.googleMapsStrings.keyInvalid
  - typings.googleMaps.googleMapsStrings.userRateLimitExceeded
  - typings.googleMaps.googleMapsStrings.notFound
  - typings.googleMaps.googleMapsStrings.parseError
*/
trait GeolocationErrorReason extends js.Object

object GeolocationErrorReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dailyLimitExceeded: typings.googleMaps.googleMapsStrings.dailyLimitExceeded = this.cast("dailyLimitExceeded")
  @scala.inline
  def keyInvalid: typings.googleMaps.googleMapsStrings.keyInvalid = this.cast("keyInvalid")
  @scala.inline
  def notFound: typings.googleMaps.googleMapsStrings.notFound = this.cast("notFound")
  @scala.inline
  def parseError: typings.googleMaps.googleMapsStrings.parseError = this.cast("parseError")
  @scala.inline
  def userRateLimitExceeded: typings.googleMaps.googleMapsStrings.userRateLimitExceeded = this.cast("userRateLimitExceeded")
}

