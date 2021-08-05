package typings.googleapis.anon

import typings.googleapis.v5Mod.pagespeedonlineV5.SchemaLighthouseCategoryV5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accessibility extends StObject {
  
  var accessibility: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  var `best-practices`: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  var performance: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  var pwa: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  var seo: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
}
object Accessibility {
  
  inline def apply(): Accessibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessibility]
  }
  
  extension [Self <: Accessibility](x: Self) {
    
    inline def setAccessibility(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def `setBest-practices`(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "best-practices", value.asInstanceOf[js.Any])
    
    inline def `setBest-practicesUndefined`: Self = StObject.set(x, "best-practices", js.undefined)
    
    inline def setPerformance(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPwa(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "pwa", value.asInstanceOf[js.Any])
    
    inline def setPwaUndefined: Self = StObject.set(x, "pwa", js.undefined)
    
    inline def setSeo(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
  }
}
