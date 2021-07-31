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
  
  @scala.inline
  def apply(): Accessibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessibility]
  }
  
  @scala.inline
  implicit class AccessibilityMutableBuilder[Self <: Accessibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def `setBest-practices`(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "best-practices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBest-practicesUndefined`: Self = StObject.set(x, "best-practices", js.undefined)
    
    @scala.inline
    def setPerformance(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setPwa(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "pwa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwaUndefined: Self = StObject.set(x, "pwa", js.undefined)
    
    @scala.inline
    def setSeo(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
  }
}
