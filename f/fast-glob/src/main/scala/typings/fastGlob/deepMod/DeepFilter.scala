package typings.fastGlob.deepMod

import typings.fastGlob.typesMod.EntryFilterFunction
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepFilter extends js.Object {
  
  var _filter: js.Any = js.native
  
  var _getEntryLevel: js.Any = js.native
  
  var _getMatcher: js.Any = js.native
  
  var _getNegativePatternsRe: js.Any = js.native
  
  var _isSkippedByDeep: js.Any = js.native
  
  var _isSkippedByNegativePatterns: js.Any = js.native
  
  var _isSkippedByPositivePatterns: js.Any = js.native
  
  var _isSkippedSymbolicLink: js.Any = js.native
  
  val _micromatchOptions: js.Any = js.native
  
  val _settings: js.Any = js.native
  
  def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
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
  
  @scala.inline
  implicit class DeepFilterOps[Self <: DeepFilter] (val x: Self) extends AnyVal {
    
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
    def set_filter(value: js.Any): Self = this.set("_filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getEntryLevel(value: js.Any): Self = this.set("_getEntryLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getMatcher(value: js.Any): Self = this.set("_getMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getNegativePatternsRe(value: js.Any): Self = this.set("_getNegativePatternsRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isSkippedByDeep(value: js.Any): Self = this.set("_isSkippedByDeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isSkippedByNegativePatterns(value: js.Any): Self = this.set("_isSkippedByNegativePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isSkippedByPositivePatterns(value: js.Any): Self = this.set("_isSkippedByPositivePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isSkippedSymbolicLink(value: js.Any): Self = this.set("_isSkippedSymbolicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_micromatchOptions(value: js.Any): Self = this.set("_micromatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilter(value: (String, js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction): Self = this.set("getFilter", js.Any.fromFunction3(value))
  }
}
