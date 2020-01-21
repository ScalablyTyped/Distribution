package typings.googleMaps.mod

import typings.googleMaps.googleMapsStrings.bus_
import typings.googleMaps.googleMapsStrings.rail_
import typings.googleMaps.googleMapsStrings.subway_
import typings.googleMaps.googleMapsStrings.tram_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.bus_
  - typings.googleMaps.googleMapsStrings.subway_
  - typings.googleMaps.googleMapsStrings.train
  - typings.googleMaps.googleMapsStrings.tram_
  - typings.googleMaps.googleMapsStrings.rail_
*/
trait TransitMode extends js.Object

object TransitMode {
  @scala.inline
  def bus: bus_ = this.cast("bus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rail: rail_ = this.cast("rail")
  @scala.inline
  def subway: subway_ = this.cast("subway")
  @scala.inline
  def train: typings.googleMaps.googleMapsStrings.train = this.cast("train")
  @scala.inline
  def tram: tram_ = this.cast("tram")
}

