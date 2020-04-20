package typings.fastGlob.deepMod

import typings.fastGlob.typesMod.EntryFilterFunction
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepFilter extends js.Object {
  var _filter: js.Any
  var _getEntryLevel: js.Any
  var _getMatcher: js.Any
  var _getNegativePatternsRe: js.Any
  var _isSkippedByDeep: js.Any
  var _isSkippedByNegativePatterns: js.Any
  var _isSkippedByPositivePatterns: js.Any
  var _isSkippedSymbolicLink: js.Any
  val _micromatchOptions: js.Any
  val _settings: js.Any
  def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction
}

object DeepFilter {
  @scala.inline
  def apply(
    _filter: js.Any,
    _getEntryLevel: js.Any,
    _getMatcher: js.Any,
    _getNegativePatternsRe: js.Any,
    _isSkippedByDeep: js.Any,
    _isSkippedByNegativePatterns: js.Any,
    _isSkippedByPositivePatterns: js.Any,
    _isSkippedSymbolicLink: js.Any,
    _micromatchOptions: js.Any,
    _settings: js.Any,
    getFilter: (String, js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction
  ): DeepFilter = {
    val __obj = js.Dynamic.literal(_filter = _filter.asInstanceOf[js.Any], _getEntryLevel = _getEntryLevel.asInstanceOf[js.Any], _getMatcher = _getMatcher.asInstanceOf[js.Any], _getNegativePatternsRe = _getNegativePatternsRe.asInstanceOf[js.Any], _isSkippedByDeep = _isSkippedByDeep.asInstanceOf[js.Any], _isSkippedByNegativePatterns = _isSkippedByNegativePatterns.asInstanceOf[js.Any], _isSkippedByPositivePatterns = _isSkippedByPositivePatterns.asInstanceOf[js.Any], _isSkippedSymbolicLink = _isSkippedSymbolicLink.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction3(getFilter))
    __obj.asInstanceOf[DeepFilter]
  }
}

