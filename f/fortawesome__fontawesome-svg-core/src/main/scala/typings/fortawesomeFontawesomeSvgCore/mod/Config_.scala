package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.nest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config_ extends js.Object {
  
  var autoA11y: Boolean = js.native
  
  var autoAddCss: Boolean = js.native
  
  var autoReplaceSvg: Boolean | nest = js.native
  
  var familyPrefix: IconPrefix = js.native
  
  var keepOriginalSource: Boolean = js.native
  
  var measurePerformance: Boolean = js.native
  
  var observeMutations: Boolean = js.native
  
  var replacementClass: String = js.native
  
  var searchPseudoElements: Boolean = js.native
  
  var showMissingIcons: Boolean = js.native
}
object Config_ {
  
  @scala.inline
  def apply(
    autoA11y: Boolean,
    autoAddCss: Boolean,
    autoReplaceSvg: Boolean | nest,
    familyPrefix: IconPrefix,
    keepOriginalSource: Boolean,
    measurePerformance: Boolean,
    observeMutations: Boolean,
    replacementClass: String,
    searchPseudoElements: Boolean,
    showMissingIcons: Boolean
  ): Config_ = {
    val __obj = js.Dynamic.literal(autoA11y = autoA11y.asInstanceOf[js.Any], autoAddCss = autoAddCss.asInstanceOf[js.Any], autoReplaceSvg = autoReplaceSvg.asInstanceOf[js.Any], familyPrefix = familyPrefix.asInstanceOf[js.Any], keepOriginalSource = keepOriginalSource.asInstanceOf[js.Any], measurePerformance = measurePerformance.asInstanceOf[js.Any], observeMutations = observeMutations.asInstanceOf[js.Any], replacementClass = replacementClass.asInstanceOf[js.Any], searchPseudoElements = searchPseudoElements.asInstanceOf[js.Any], showMissingIcons = showMissingIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoA11y(value: Boolean): Self = this.set("autoA11y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAddCss(value: Boolean): Self = this.set("autoAddCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReplaceSvg(value: Boolean | nest): Self = this.set("autoReplaceSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyPrefix(value: IconPrefix): Self = this.set("familyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOriginalSource(value: Boolean): Self = this.set("keepOriginalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurePerformance(value: Boolean): Self = this.set("measurePerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveMutations(value: Boolean): Self = this.set("observeMutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementClass(value: String): Self = this.set("replacementClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPseudoElements(value: Boolean): Self = this.set("searchPseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMissingIcons(value: Boolean): Self = this.set("showMissingIcons", value.asInstanceOf[js.Any])
  }
}
