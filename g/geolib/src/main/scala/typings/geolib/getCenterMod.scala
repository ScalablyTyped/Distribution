package typings.geolib

import typings.geolib.anon.Longitude
import typings.geolib.geolibBooleans.`false`
import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCenterMod {
  
  @JSImport("geolib/es/getCenter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(points: js.Array[GeolibInputCoordinates]): `false` | Longitude = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any]).asInstanceOf[`false` | Longitude]
}
