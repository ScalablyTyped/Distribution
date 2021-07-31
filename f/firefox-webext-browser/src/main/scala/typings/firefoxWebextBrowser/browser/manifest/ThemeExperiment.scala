package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeExperiment extends StObject {
  
  var colors: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var images: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var stylesheet: js.UndefOr[ExtensionURL] = js.undefined
}
object ThemeExperiment {
  
  @scala.inline
  def apply(): ThemeExperiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeExperiment]
  }
  
  @scala.inline
  implicit class ThemeExperimentMutableBuilder[Self <: ThemeExperiment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: StringDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setImages(value: StringDictionary[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setStylesheet(value: ExtensionURL): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
  }
}
