package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.lte
  - typings.atGoogleMaps.atGoogleMapsStrings.gsm
  - typings.atGoogleMaps.atGoogleMapsStrings.cdma
  - typings.atGoogleMaps.atGoogleMapsStrings.wcdma
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cdma: typings.atGoogleMaps.atGoogleMapsStrings.cdma = this.cast("cdma")
  @scala.inline
  def gsm: typings.atGoogleMaps.atGoogleMapsStrings.gsm = this.cast("gsm")
  @scala.inline
  def lte: typings.atGoogleMaps.atGoogleMapsStrings.lte = this.cast("lte")
  @scala.inline
  def wcdma: typings.atGoogleMaps.atGoogleMapsStrings.wcdma = this.cast("wcdma")
}

