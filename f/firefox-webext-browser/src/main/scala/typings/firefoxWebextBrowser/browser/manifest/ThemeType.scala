package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeType extends StObject {
  
  var colors: js.UndefOr[ThemeTypeColors] = js.native
  
  var images: js.UndefOr[ThemeTypeImages] = js.native
  
  var properties: js.UndefOr[_ThemeType] = js.native
}
object ThemeType {
  
  @scala.inline
  def apply(): ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeType]
  }
  
  @scala.inline
  implicit class ThemeTypeMutableBuilder[Self <: ThemeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: ThemeTypeColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setImages(value: ThemeTypeImages): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setProperties(value: _ThemeType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
