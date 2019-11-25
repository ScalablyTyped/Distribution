package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.metric
  - typings.atGoogleMaps.atGoogleMapsStrings.imperial
*/
trait UnitSystem extends js.Object

object UnitSystem {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typings.atGoogleMaps.atGoogleMapsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typings.atGoogleMaps.atGoogleMapsStrings.metric = this.cast("metric")
}

