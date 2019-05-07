package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var autoA11y: scala.Boolean
  var autoAddCss: scala.Boolean
  var autoReplaceSvg: scala.Boolean | atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreLibStrings.nest
  var familyPrefix: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconPrefix
  var keepOriginalSource: scala.Boolean
  var measurePerformance: scala.Boolean
  var observeMutations: scala.Boolean
  var replacementClass: java.lang.String
  var searchPseudoElements: scala.Boolean
  var showMissingIcons: scala.Boolean
}

object Config {
  @scala.inline
  def apply(
    autoA11y: scala.Boolean,
    autoAddCss: scala.Boolean,
    autoReplaceSvg: scala.Boolean | atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreLibStrings.nest,
    familyPrefix: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconPrefix,
    keepOriginalSource: scala.Boolean,
    measurePerformance: scala.Boolean,
    observeMutations: scala.Boolean,
    replacementClass: java.lang.String,
    searchPseudoElements: scala.Boolean,
    showMissingIcons: scala.Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(autoA11y = autoA11y, autoAddCss = autoAddCss, autoReplaceSvg = autoReplaceSvg.asInstanceOf[js.Any], familyPrefix = familyPrefix, keepOriginalSource = keepOriginalSource, measurePerformance = measurePerformance, observeMutations = observeMutations, replacementClass = replacementClass, searchPseudoElements = searchPseudoElements, showMissingIcons = showMissingIcons)
  
    __obj.asInstanceOf[Config]
  }
}

