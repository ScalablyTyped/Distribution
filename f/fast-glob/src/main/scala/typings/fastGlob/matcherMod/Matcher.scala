package typings.fastGlob.matcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  var _fillStorage: js.Any = js.native
  var _getPatternSegments: js.Any = js.native
  val _micromatchOptions: js.Any = js.native
  val _patterns: js.Any = js.native
  val _settings: js.Any = js.native
  var _splitSegmentsIntoSections: js.Any = js.native
  val _storage: js.Array[PatternInfo] = js.native
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
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
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
    def set_fillStorage(value: js.Any): Self = this.set("_fillStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def set_getPatternSegments(value: js.Any): Self = this.set("_getPatternSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def set_micromatchOptions(value: js.Any): Self = this.set("_micromatchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def set_patterns(value: js.Any): Self = this.set("_patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def set_splitSegmentsIntoSections(value: js.Any): Self = this.set("_splitSegmentsIntoSections", value.asInstanceOf[js.Any])
    @scala.inline
    def set_storageVarargs(value: PatternInfo*): Self = this.set("_storage", js.Array(value :_*))
    @scala.inline
    def set_storage(value: js.Array[PatternInfo]): Self = this.set("_storage", value.asInstanceOf[js.Any])
  }
  
}

