package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLongitudeMod {
  
  @JSImport("geolib/es/getLongitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(point: GeolibInputCoordinates): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(point: GeolibInputCoordinates, raw: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
