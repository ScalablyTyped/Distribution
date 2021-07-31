package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPointNearLineMod {
  
  @JSImport("geolib/es/isPointNearLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    point: GeolibInputCoordinates,
    start: GeolibInputCoordinates,
    end: GeolibInputCoordinates,
    distance: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
