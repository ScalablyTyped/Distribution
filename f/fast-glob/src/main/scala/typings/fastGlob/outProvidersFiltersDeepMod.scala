package typings.fastGlob

import typings.fastGlob.outTypesMod.EntryFilterFunction
import typings.fastGlob.outTypesMod.MicromatchOptions
import typings.fastGlob.outTypesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersFiltersDeepMod {
  
  @JSImport("fast-glob/out/providers/filters/deep", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DeepFilter {
    def this(_settings: typings.fastGlob.outSettingsMod.default, _micromatchOptions: MicromatchOptions) = this()
    
    /* private */ /* CompleteClass */
    var _filter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getEntryLevel: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getMatcher: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getNegativePatternsRe: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByDeep: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByNegativePatterns: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByPositivePatterns: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedSymbolicLink: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _micromatchOptions: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* CompleteClass */
    override def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
  }
  
  trait DeepFilter extends StObject {
    
    /* private */ var _filter: Any
    
    /* private */ var _getEntryLevel: Any
    
    /* private */ var _getMatcher: Any
    
    /* private */ var _getNegativePatternsRe: Any
    
    /* private */ var _isSkippedByDeep: Any
    
    /* private */ var _isSkippedByNegativePatterns: Any
    
    /* private */ var _isSkippedByPositivePatterns: Any
    
    /* private */ var _isSkippedSymbolicLink: Any
    
    /* private */ val _micromatchOptions: Any
    
    /* private */ val _settings: Any
    
    def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction
  }
  object DeepFilter {
    
    inline def apply(
      _filter: Any,
      _getEntryLevel: Any,
      _getMatcher: Any,
      _getNegativePatternsRe: Any,
      _isSkippedByDeep: Any,
      _isSkippedByNegativePatterns: Any,
      _isSkippedByPositivePatterns: Any,
      _isSkippedSymbolicLink: Any,
      _micromatchOptions: Any,
      _settings: Any,
      getFilter: (String, js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction
    ): DeepFilter = {
      val __obj = js.Dynamic.literal(_filter = _filter.asInstanceOf[js.Any], _getEntryLevel = _getEntryLevel.asInstanceOf[js.Any], _getMatcher = _getMatcher.asInstanceOf[js.Any], _getNegativePatternsRe = _getNegativePatternsRe.asInstanceOf[js.Any], _isSkippedByDeep = _isSkippedByDeep.asInstanceOf[js.Any], _isSkippedByNegativePatterns = _isSkippedByNegativePatterns.asInstanceOf[js.Any], _isSkippedByPositivePatterns = _isSkippedByPositivePatterns.asInstanceOf[js.Any], _isSkippedSymbolicLink = _isSkippedSymbolicLink.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction3(getFilter))
      __obj.asInstanceOf[DeepFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeepFilter] (val x: Self) extends AnyVal {
      
      inline def setGetFilter(value: (String, js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction): Self = StObject.set(x, "getFilter", js.Any.fromFunction3(value))
      
      inline def set_filter(value: Any): Self = StObject.set(x, "_filter", value.asInstanceOf[js.Any])
      
      inline def set_getEntryLevel(value: Any): Self = StObject.set(x, "_getEntryLevel", value.asInstanceOf[js.Any])
      
      inline def set_getMatcher(value: Any): Self = StObject.set(x, "_getMatcher", value.asInstanceOf[js.Any])
      
      inline def set_getNegativePatternsRe(value: Any): Self = StObject.set(x, "_getNegativePatternsRe", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByDeep(value: Any): Self = StObject.set(x, "_isSkippedByDeep", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByNegativePatterns(value: Any): Self = StObject.set(x, "_isSkippedByNegativePatterns", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByPositivePatterns(value: Any): Self = StObject.set(x, "_isSkippedByPositivePatterns", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedSymbolicLink(value: Any): Self = StObject.set(x, "_isSkippedSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def set_micromatchOptions(value: Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
