package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIsPointWithinRadiusMod {
  
  @JSImport("geolib/es/isPointWithinRadius", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates, center: GeolibInputCoordinates, radius: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
