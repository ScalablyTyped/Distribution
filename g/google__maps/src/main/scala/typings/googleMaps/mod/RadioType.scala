package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.lte
  - typings.googleMaps.googleMapsStrings.gsm
  - typings.googleMaps.googleMapsStrings.cdma
  - typings.googleMaps.googleMapsStrings.wcdma
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cdma: typings.googleMaps.googleMapsStrings.cdma = this.cast("cdma")
  @scala.inline
  def gsm: typings.googleMaps.googleMapsStrings.gsm = this.cast("gsm")
  @scala.inline
  def lte: typings.googleMaps.googleMapsStrings.lte = this.cast("lte")
  @scala.inline
  def wcdma: typings.googleMaps.googleMapsStrings.wcdma = this.cast("wcdma")
}

