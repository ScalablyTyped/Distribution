package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZMax extends StObject {
  
  var zMax: Double
  
  var zMin: Double
}
object ZMax {
  
  inline def apply(zMax: Double, zMin: Double): ZMax = {
    val __obj = js.Dynamic.literal(zMax = zMax.asInstanceOf[js.Any], zMin = zMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZMax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZMax] (val x: Self) extends AnyVal {
    
    inline def setZMax(value: Double): Self = StObject.set(x, "zMax", value.asInstanceOf[js.Any])
    
    inline def setZMin(value: Double): Self = StObject.set(x, "zMin", value.asInstanceOf[js.Any])
  }
}
