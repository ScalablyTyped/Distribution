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
  
  @scala.inline
  def apply(backgroundColor: String, pixelRatio: Double, `type`: String): ExcludeComponents = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeComponents]
  }
  
  @scala.inline
  implicit class ExcludeComponentsMutableBuilder[Self <: ExcludeComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeComponents(value: js.Array[String]): Self = StObject.set(x, "excludeComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeComponentsUndefined: Self = StObject.set(x, "excludeComponents", js.undefined)
    
    @scala.inline
    def setExcludeComponentsVarargs(value: String*): Self = StObject.set(x, "excludeComponents", js.Array(value :_*))
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
