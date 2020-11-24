package typings.fastGlob.entryMod

import typings.fastGlob.typesMod.EntryFilterFunction
import typings.fastGlob.typesMod.Pattern
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryFilter extends js.Object {
  
  var _createIndexRecord: js.Any = js.native
  
  var _filter: js.Any = js.native
  
  var _isDuplicateEntry: js.Any = js.native
  
  var _isMatchToPatterns: js.Any = js.native
  
  var _isSkippedByAbsoluteNegativePatterns: js.Any = js.native
  
  val _micromatchOptions: js.Any = js.native
  
  var _onlyDirectoryFilter: js.Any = js.native
  
  var _onlyFileFilter: js.Any = js.native
  
  val _settings: js.Any = js.native
  
  def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
  
  val index: Map[String, js.UndefOr[scala.Nothing]] = js.native
}
object EntryFilter {
  
  @scala.inline
  def apply(
    _createIndexRecord: js.Any,
    _filter: js.Any,
    _isDuplicateEntry: js.Any,
    _isMatchToPatterns: js.Any,
    _isSkippedByAbsoluteNegativePatterns: js.Any,
    _micromatchOptions: js.Any,
    _onlyDirectoryFilter: js.Any,
    _onlyFileFilter: js.Any,
    _settings: js.Any,
    getFilter: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction,
    index: Map[String, js.UndefOr[scala.Nothing]]
  ): EntryFilter = {
    val __obj = js.Dynamic.literal(_createIndexRecord = _createIndexRecord.asInstanceOf[js.Any], _filter = _filter.asInstanceOf[js.Any], _isDuplicateEntry = _isDuplicateEntry.asInstanceOf[js.Any], _isMatchToPatterns = _isMatchToPatterns.asInstanceOf[js.Any], _isSkippedByAbsoluteNegativePatterns = _isSkippedByAbsoluteNegativePatterns.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _onlyDirectoryFilter = _onlyDirectoryFilter.asInstanceOf[js.Any], _onlyFileFilter = _onlyFileFilter.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryFilter]
  }
  
  @scala.inline
  implicit class EntryFilterOps[Self <: EntryFilter] (val x: Self) extends AnyVal {
    
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
    def set_createIndexRecord(value: js.Any): Self = this.set("_createIndexRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_filter(value: js.Any): Self = this.set("_filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isDuplicateEntry(value: js.Any): Self = this.set("_isDuplicateEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isMatchToPatterns(value: js.Any): Self = this.set("_isMatchToPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isSkippedByAbsoluteNegativePatterns(value: js.Any): Self = this.set("_isSkippedByAbsoluteNegativePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_micromatchOptions(value: js.Any): Self = this.set("_micromatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onlyDirectoryFilter(value: js.Any): Self = this.set("_onlyDirectoryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onlyFileFilter(value: js.Any): Self = this.set("_onlyFileFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilter(value: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction): Self = this.set("getFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndex(value: Map[String, js.UndefOr[scala.Nothing]]): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
