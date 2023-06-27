package typings.geolib

import typings.geolib.esTypesMod.GeolibBounds
import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetBoundsMod {
  
  @JSImport("geolib/es/getBounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(points: js.Array[GeolibInputCoordinates]): GeolibBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any]).asInstanceOf[GeolibBounds]
}
