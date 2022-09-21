package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeComponents extends StObject {
  
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: String
  
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.undefined
  
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: Double
  
  // Exporting format, can be either png, or jpeg
  var `type`: String
}
object ExcludeComponents {
  
  inline def apply(backgroundColor: String, pixelRatio: Double, `type`: String): ExcludeComponents = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeComponents]
  }
  
  extension [Self <: ExcludeComponents](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setExcludeComponents(value: js.Array[String]): Self = StObject.set(x, "excludeComponents", value.asInstanceOf[js.Any])
    
    inline def setExcludeComponentsUndefined: Self = StObject.set(x, "excludeComponents", js.undefined)
    
    inline def setExcludeComponentsVarargs(value: String*): Self = StObject.set(x, "excludeComponents", js.Array(value*))
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
