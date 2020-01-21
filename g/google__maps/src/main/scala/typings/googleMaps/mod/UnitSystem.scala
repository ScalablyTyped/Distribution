package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.metric
  - typings.googleMaps.googleMapsStrings.imperial
*/
trait UnitSystem extends js.Object

object UnitSystem {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typings.googleMaps.googleMapsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typings.googleMaps.googleMapsStrings.metric = this.cast("metric")
}

