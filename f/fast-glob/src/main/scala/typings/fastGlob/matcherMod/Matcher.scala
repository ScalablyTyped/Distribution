package typings.fastGlob.matcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matcher extends js.Object {
  var _fillStorage: js.Any
  var _getPatternSegments: js.Any
  val _micromatchOptions: js.Any
  val _patterns: js.Any
  val _settings: js.Any
  var _splitSegmentsIntoSections: js.Any
  val _storage: js.Array[PatternInfo]
}

object Matcher {
  @scala.inline
  def apply(
    _fillStorage: js.Any,
    _getPatternSegments: js.Any,
    _micromatchOptions: js.Any,
    _patterns: js.Any,
    _settings: js.Any,
    _splitSegmentsIntoSections: js.Any,
    _storage: js.Array[PatternInfo]
  ): Matcher = {
    val __obj = js.Dynamic.literal(_fillStorage = _fillStorage.asInstanceOf[js.Any], _getPatternSegments = _getPatternSegments.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _patterns = _patterns.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _splitSegmentsIntoSections = _splitSegmentsIntoSections.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Matcher]
  }
}

