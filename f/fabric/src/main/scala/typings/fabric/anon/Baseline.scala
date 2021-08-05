package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseline extends StObject {
  
  var baseline: Double
  
  var size: Double
}
object Baseline {
  
  inline def apply(baseline: Double, size: Double): Baseline = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseline]
  }
  
  extension [Self <: Baseline](x: Self) {
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
