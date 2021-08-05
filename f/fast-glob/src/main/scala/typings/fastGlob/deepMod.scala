package typings.fastGlob

import typings.fastGlob.typesMod.EntryFilterFunction
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepMod {
  
  @JSImport("fast-glob/out/providers/filters/deep", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with DeepFilter {
    def this(_settings: typings.fastGlob.settingsMod.default, _micromatchOptions: MicromatchOptions) = this()
    
    /* private */ /* CompleteClass */
    var _filter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getEntryLevel: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getMatcher: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getNegativePatternsRe: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByDeep: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByNegativePatterns: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedByPositivePatterns: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _isSkippedSymbolicLink: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _micromatchOptions: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: js.Any = js.native
    
    /* CompleteClass */
    override def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
  }
  
  trait DeepFilter extends StObject {
    
    /* private */ var _filter: js.Any
    
    /* private */ var _getEntryLevel: js.Any
    
    /* private */ var _getMatcher: js.Any
    
    /* private */ var _getNegativePatternsRe: js.Any
    
    /* private */ var _isSkippedByDeep: js.Any
    
    /* private */ var _isSkippedByNegativePatterns: js.Any
    
    /* private */ var _isSkippedByPositivePatterns: js.Any
    
    /* private */ var _isSkippedSymbolicLink: js.Any
    
    /* private */ val _micromatchOptions: js.Any
    
    /* private */ val _settings: js.Any
    
    def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction
  }
  object DeepFilter {
    
    inline def apply(
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
    
    extension [Self <: DeepFilter](x: Self) {
      
      inline def setGetFilter(value: (String, js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction): Self = StObject.set(x, "getFilter", js.Any.fromFunction3(value))
      
      inline def set_filter(value: js.Any): Self = StObject.set(x, "_filter", value.asInstanceOf[js.Any])
      
      inline def set_getEntryLevel(value: js.Any): Self = StObject.set(x, "_getEntryLevel", value.asInstanceOf[js.Any])
      
      inline def set_getMatcher(value: js.Any): Self = StObject.set(x, "_getMatcher", value.asInstanceOf[js.Any])
      
      inline def set_getNegativePatternsRe(value: js.Any): Self = StObject.set(x, "_getNegativePatternsRe", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByDeep(value: js.Any): Self = StObject.set(x, "_isSkippedByDeep", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByNegativePatterns(value: js.Any): Self = StObject.set(x, "_isSkippedByNegativePatterns", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedByPositivePatterns(value: js.Any): Self = StObject.set(x, "_isSkippedByPositivePatterns", value.asInstanceOf[js.Any])
      
      inline def set_isSkippedSymbolicLink(value: js.Any): Self = StObject.set(x, "_isSkippedSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def set_micromatchOptions(value: js.Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
