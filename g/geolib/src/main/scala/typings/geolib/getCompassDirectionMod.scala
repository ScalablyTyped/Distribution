package typings.geolib

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
import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCompassDirectionMod {
  
  @JSImport("geolib/es/getCompassDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N]
  @scala.inline
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], bearingFn.asInstanceOf[js.Any])).asInstanceOf[S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N]
  
  type BearingFunction = js.Function2[/* origin */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
