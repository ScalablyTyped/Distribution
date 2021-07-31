package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAreaOfPolygonMod {
  
  @JSImport("geolib/es/getAreaOfPolygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(points: js.Array[GeolibInputCoordinates]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
}
