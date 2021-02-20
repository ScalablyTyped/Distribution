package typings.geolib

import typings.geolib.anon.Latitude
import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeDestinationPointMod {
  
  @JSImport("geolib/es/computeDestinationPoint", JSImport.Default)
  @js.native
  def default(start: GeolibInputCoordinates, distance: Double, bearing: Double): Latitude = js.native
  @JSImport("geolib/es/computeDestinationPoint", JSImport.Default)
  @js.native
  def default(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Latitude = js.native
}
