package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.CssStyleClass
import typings.fortawesomeFontawesomeCommonTypes.mod.IconFamily
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typings.fortawesomeFontawesomeCommonTypes.mod.IconStyle
import typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.nest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config_ extends StObject {
  
  var autoA11y: Boolean
  
  var autoAddCss: Boolean
  
  var autoReplaceSvg: Boolean | nest
  
  var cssPrefix: String
  
  var familyDefault: IconFamily
  
  var familyPrefix: String
  
  var keepOriginalSource: Boolean
  
  var measurePerformance: Boolean
  
  var observeMutations: Boolean
  
  var replacementClass: String
  
  var searchPseudoElements: Boolean
  
  var showMissingIcons: Boolean
  
  var styleDefault: IconPrefix | CssStyleClass | IconStyle
}
object Config_ {
  
  inline def apply(
    autoA11y: Boolean,
    autoAddCss: Boolean,
    autoReplaceSvg: Boolean | nest,
    cssPrefix: String,
    familyDefault: IconFamily,
    familyPrefix: String,
    keepOriginalSource: Boolean,
    measurePerformance: Boolean,
    observeMutations: Boolean,
    replacementClass: String,
    searchPseudoElements: Boolean,
    showMissingIcons: Boolean,
    styleDefault: IconPrefix | CssStyleClass | IconStyle
  ): Config_ = {
    val __obj = js.Dynamic.literal(autoA11y = autoA11y.asInstanceOf[js.Any], autoAddCss = autoAddCss.asInstanceOf[js.Any], autoReplaceSvg = autoReplaceSvg.asInstanceOf[js.Any], cssPrefix = cssPrefix.asInstanceOf[js.Any], familyDefault = familyDefault.asInstanceOf[js.Any], familyPrefix = familyPrefix.asInstanceOf[js.Any], keepOriginalSource = keepOriginalSource.asInstanceOf[js.Any], measurePerformance = measurePerformance.asInstanceOf[js.Any], observeMutations = observeMutations.asInstanceOf[js.Any], replacementClass = replacementClass.asInstanceOf[js.Any], searchPseudoElements = searchPseudoElements.asInstanceOf[js.Any], showMissingIcons = showMissingIcons.asInstanceOf[js.Any], styleDefault = styleDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config_] (val x: Self) extends AnyVal {
    
    inline def setAutoA11y(value: Boolean): Self = StObject.set(x, "autoA11y", value.asInstanceOf[js.Any])
    
    inline def setAutoAddCss(value: Boolean): Self = StObject.set(x, "autoAddCss", value.asInstanceOf[js.Any])
    
    inline def setAutoReplaceSvg(value: Boolean | nest): Self = StObject.set(x, "autoReplaceSvg", value.asInstanceOf[js.Any])
    
    inline def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    inline def setFamilyDefault(value: IconFamily): Self = StObject.set(x, "familyDefault", value.asInstanceOf[js.Any])
    
    inline def setFamilyPrefix(value: String): Self = StObject.set(x, "familyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeepOriginalSource(value: Boolean): Self = StObject.set(x, "keepOriginalSource", value.asInstanceOf[js.Any])
    
    inline def setMeasurePerformance(value: Boolean): Self = StObject.set(x, "measurePerformance", value.asInstanceOf[js.Any])
    
    inline def setObserveMutations(value: Boolean): Self = StObject.set(x, "observeMutations", value.asInstanceOf[js.Any])
    
    inline def setReplacementClass(value: String): Self = StObject.set(x, "replacementClass", value.asInstanceOf[js.Any])
    
    inline def setSearchPseudoElements(value: Boolean): Self = StObject.set(x, "searchPseudoElements", value.asInstanceOf[js.Any])
    
    inline def setShowMissingIcons(value: Boolean): Self = StObject.set(x, "showMissingIcons", value.asInstanceOf[js.Any])
    
    inline def setStyleDefault(value: IconPrefix | CssStyleClass | IconStyle): Self = StObject.set(x, "styleDefault", value.asInstanceOf[js.Any])
  }
}
