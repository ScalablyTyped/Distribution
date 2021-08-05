package typings.geolib

import typings.geolib.anon.Latitude
import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCenterOfBoundsMod {
  
  @JSImport("geolib/es/getCenterOfBounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(coords: js.Array[GeolibInputCoordinates]): Latitude = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(coords.asInstanceOf[js.Any]).asInstanceOf[Latitude]
}
