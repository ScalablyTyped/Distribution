package typings.geolib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConvertDistanceMod {
  
  @JSImport("geolib/es/convertDistance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(meters: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(meters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(meters: Double, targetUnit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(meters.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
}
