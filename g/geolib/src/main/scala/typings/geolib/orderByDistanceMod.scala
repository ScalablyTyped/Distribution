package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderByDistanceMod {
  
  @JSImport("geolib/es/orderByDistance", JSImport.Default)
  @js.native
  def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): js.Array[GeolibInputCoordinates] = js.native
  @JSImport("geolib/es/orderByDistance", JSImport.Default)
  @js.native
  def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): js.Array[GeolibInputCoordinates] = js.native
  
  type DistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
