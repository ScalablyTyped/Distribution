package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetCoordinateKeyMod {
  
  @JSImport("geolib/es/getCoordinateKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Keys](point: GeolibInputCoordinates, keysToLookup: js.Array[Keys]): js.UndefOr[Keys] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], keysToLookup.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Keys]]
}
