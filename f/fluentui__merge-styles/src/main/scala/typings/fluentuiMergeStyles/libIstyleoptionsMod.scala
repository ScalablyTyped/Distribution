package typings.fluentuiMergeStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIstyleoptionsMod {
  
  trait IStyleOptions extends StObject {
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var specificityMultiplier: js.UndefOr[Double] = js.undefined
  }
  object IStyleOptions {
    
    inline def apply(): IStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyleOptions]
    }
    
    extension [Self <: IStyleOptions](x: Self) {
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSpecificityMultiplier(value: Double): Self = StObject.set(x, "specificityMultiplier", value.asInstanceOf[js.Any])
      
      inline def setSpecificityMultiplierUndefined: Self = StObject.set(x, "specificityMultiplier", js.undefined)
    }
  }
}
