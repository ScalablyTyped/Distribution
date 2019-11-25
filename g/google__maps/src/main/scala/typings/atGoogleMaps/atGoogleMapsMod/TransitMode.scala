package typings.atGoogleMaps.atGoogleMapsMod

import typings.atGoogleMaps.atGoogleMapsStrings.bus_
import typings.atGoogleMaps.atGoogleMapsStrings.rail_
import typings.atGoogleMaps.atGoogleMapsStrings.subway_
import typings.atGoogleMaps.atGoogleMapsStrings.tram_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.bus_
  - typings.atGoogleMaps.atGoogleMapsStrings.subway_
  - typings.atGoogleMaps.atGoogleMapsStrings.train
  - typings.atGoogleMaps.atGoogleMapsStrings.tram_
  - typings.atGoogleMaps.atGoogleMapsStrings.rail_
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
  def train: typings.atGoogleMaps.atGoogleMapsStrings.train = this.cast("train")
  @scala.inline
  def tram: tram_ = this.cast("tram")
}

