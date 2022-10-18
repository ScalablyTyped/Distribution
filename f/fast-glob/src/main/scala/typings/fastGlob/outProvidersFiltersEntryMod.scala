package typings.fastGlob

import typings.fastGlob.outTypesMod.EntryFilterFunction
import typings.fastGlob.outTypesMod.MicromatchOptions
import typings.fastGlob.outTypesMod.Pattern
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersFiltersEntryMod {
  
  @JSImport("fast-glob/out/providers/filters/entry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EntryFilter {
    def this(_settings: typings.fastGlob.outSettingsMod.default, _micromatchOptions: MicromatchOptions) = this()
    
    /* private */ /* CompleteClass */
    var _createIndexRecord: Any = js.native
    
    /* private */ /* CompleteClass */
    var _filter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isDuplicateEntry: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isMatchToPatterns: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByAbsoluteNegativePatterns: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _micromatchOptions: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onlyDirectoryFilter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onlyFileFilter: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* CompleteClass */
    override def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
    
    /* CompleteClass */
    override val index: Map[String, Unit] = js.native
  }
  
  trait EntryFilter extends StObject {
    
    /* private */ var _createIndexRecord: Any
    
    /* private */ var _filter: Any
    
    /* private */ var _isDuplicateEntry: Any
    
    /* private */ var _isMatchToPatterns: Any
    
    /* private */ var _isSkippedByAbsoluteNegativePatterns: Any
    
    /* private */ val _micromatchOptions: Any
    
    /* private */ var _onlyDirectoryFilter: Any
    
    /* private */ var _onlyFileFilter: Any
    
    /* private */ val _settings: Any
    
    def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction
    
    val index: Map[String, Unit]
  }
  object EntryFilter {
    
    inline def apply(
      _createIndexRecord: Any,
      _filter: Any,
      _isDuplicateEntry: Any,
      _isMatchToPatterns: Any,
      _isSkippedByAbsoluteNegativePatterns: Any,
      _micromatchOptions: Any,
      _onlyDirectoryFilter: Any,
      _onlyFileFilter: Any,
      _settings: Any,
      getFilter: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction,
      index: Map[String, Unit]
    ): EntryFilter = {
      val __obj = js.Dynamic.literal(_createIndexRecord = _createIndexRecord.asInstanceOf[js.Any], _filter = _filter.asInstanceOf[js.Any], _isDuplicateEntry = _isDuplicateEntry.asInstanceOf[js.Any], _isMatchToPatterns = _isMatchToPatterns.asInstanceOf[js.Any], _isSkippedByAbsoluteNegativePatterns = _isSkippedByAbsoluteNegativePatterns.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _onlyDirectoryFilter = _onlyDirectoryFilter.asInstanceOf[js.Any], _onlyFileFilter = _onlyFileFilter.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryFilter]
    }
    
    extension [Self <: EntryFilter](x: Self) {
      
      inline def setGetFilter(value: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction): Self = StObject.set(x, "getFilter", js.Any.fromFunction2(value))
      
      inline def setIndex(value: Map[String, Unit]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def set_createIndexRecord(value: Any): Self = StObject.set(x, "_createIndexRecord", value.asInstanceOf[js.Any])
      
      inline def set_filter(value: Any): Self = StObject.set(x, "_filter", value.asInstanceOf[js.Any])
      
      inline def set_isDuplicateEntry(value: Any): Self = StObject.set(x, "_isDuplicateEntry", value.asInstanceOf[js.Any])
      
      inline def set_isMatchToPatterns(value: Any): Self = StObject.set(x, "_isMatchToPatterns", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByAbsoluteNegativePatterns(value: Any): Self = StObject.set(x, "_isSkippedByAbsoluteNegativePatterns", value.asInstanceOf[js.Any])
      
      inline def set_micromatchOptions(value: Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      inline def set_onlyDirectoryFilter(value: Any): Self = StObject.set(x, "_onlyDirectoryFilter", value.asInstanceOf[js.Any])
      
      inline def set_onlyFileFilter(value: Any): Self = StObject.set(x, "_onlyFileFilter", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
