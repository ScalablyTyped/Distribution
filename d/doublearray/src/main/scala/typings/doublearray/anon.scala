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
    
    @scala.inline
    def apply(all: Double, efficiency: Double, unused: Double): All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], efficiency = efficiency.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit class AllMutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEfficiency(value: Double): Self = StObject.set(x, "efficiency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnused(value: Double): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
    }
  }
}
