package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathLengthMod {
  
  @JSImport("geolib/es/getPathLength", JSImport.Default)
  @js.native
  def default(points: js.Array[GeolibInputCoordinates]): Double = js.native
  @JSImport("geolib/es/getPathLength", JSImport.Default)
  @js.native
  def default(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = js.native
  
  type DistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
