package typings.doublearray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    var all: Double
    
    var efficiency: Double
    
    var unused: Double
  }
  object All {
    
    inline def apply(all: Double, efficiency: Double, unused: Double): All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], efficiency = efficiency.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setEfficiency(value: Double): Self = StObject.set(x, "efficiency", value.asInstanceOf[js.Any])
      
      inline def setUnused(value: Double): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
    }
  }
}
