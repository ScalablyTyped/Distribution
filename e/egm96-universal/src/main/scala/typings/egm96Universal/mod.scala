package typings.egm96Universal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("egm96-universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def egm96ToEllipsoid(latitude: Double, longitude: Double, altitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("egm96ToEllipsoid")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ellipsoidToEgm96(latitude: Double, longitude: Double, altitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsoidToEgm96")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def meanSeaLevel(latitude: Double, longitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSeaLevel")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[Double]
}
