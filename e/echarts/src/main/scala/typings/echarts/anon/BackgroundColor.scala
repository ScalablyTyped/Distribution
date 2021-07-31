package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.undefined
  
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  // Exporting format, can be either png, or jpeg
  var `type`: js.UndefOr[String] = js.undefined
}
object BackgroundColor {
  
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setExcludeComponents(value: js.Array[String]): Self = StObject.set(x, "excludeComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeComponentsUndefined: Self = StObject.set(x, "excludeComponents", js.undefined)
    
    @scala.inline
    def setExcludeComponentsVarargs(value: String*): Self = StObject.set(x, "excludeComponents", js.Array(value :_*))
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
