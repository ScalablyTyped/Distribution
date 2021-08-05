package typings.dygraphs

import typings.dygraphs.dygraphs.PerAxisOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Label extends StObject {
    
    var label: String
    
    var v: Double
  }
  object Label {
    
    inline def apply(label: String, v: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: js.UndefOr[PerAxisOptions] = js.undefined
    
    var y: js.UndefOr[PerAxisOptions] = js.undefined
    
    var y2: js.UndefOr[PerAxisOptions] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: PerAxisOptions): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: PerAxisOptions): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: PerAxisOptions): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
