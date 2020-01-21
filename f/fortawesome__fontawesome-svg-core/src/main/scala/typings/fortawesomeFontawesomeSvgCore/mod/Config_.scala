package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.nest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config_ extends js.Object {
  var autoA11y: Boolean
  var autoAddCss: Boolean
  var autoReplaceSvg: Boolean | nest
  var familyPrefix: IconPrefix
  var keepOriginalSource: Boolean
  var measurePerformance: Boolean
  var observeMutations: Boolean
  var replacementClass: String
  var searchPseudoElements: Boolean
  var showMissingIcons: Boolean
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
}

