package typings.geolib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConvertSpeedMod {
  
  @JSImport("geolib/es/convertSpeed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(metersPerSecond: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(metersPerSecond.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(metersPerSecond: Double, targetUnit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(metersPerSecond.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
}
