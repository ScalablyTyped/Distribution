package typings.geolib

import typings.geolib.esGetCompassDirectionMod.BearingFunction
import typings.geolib.esTypesMod.GeolibInputCoordinates
import typings.geolib.geolibStrings.E
import typings.geolib.geolibStrings.ENE
import typings.geolib.geolibStrings.ESE
import typings.geolib.geolibStrings.N
import typings.geolib.geolibStrings.NE
import typings.geolib.geolibStrings.NNE
import typings.geolib.geolibStrings.NNW
import typings.geolib.geolibStrings.NW
import typings.geolib.geolibStrings.S
import typings.geolib.geolibStrings.SE
import typings.geolib.geolibStrings.SSE
import typings.geolib.geolibStrings.SSW
import typings.geolib.geolibStrings.SW
import typings.geolib.geolibStrings.W
import typings.geolib.geolibStrings.WNW
import typings.geolib.geolibStrings.WSW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCompassDirection", JSImport.Namespace)
@js.native
object esGetCompassDirectionMod extends js.Object {
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  type BearingFunction = js.Function2[/* origin */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}

