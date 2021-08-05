package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidCoordinateMod {
  
  @JSImport("geolib/es/isValidCoordinate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
