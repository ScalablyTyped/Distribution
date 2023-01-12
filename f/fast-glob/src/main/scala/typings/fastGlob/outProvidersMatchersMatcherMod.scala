package typings.fastGlob

import typings.fastGlob.fastGlobBooleans.`false`
import typings.fastGlob.fastGlobBooleans.`true`
import typings.fastGlob.outTypesMod.MicromatchOptions
import typings.fastGlob.outTypesMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersMatchersMatcherMod {
  
  /* note: abstract class */ @JSImport("fast-glob/out/providers/matchers/matcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Matcher {
    def this(
      _patterns: js.Array[Pattern],
      _settings: typings.fastGlob.outSettingsMod.default,
      _micromatchOptions: MicromatchOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fillStorage: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getPatternSegments: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _micromatchOptions: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _patterns: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* private */ /* CompleteClass */
    var _splitSegmentsIntoSections: Any = js.native
    
    /* protected */ /* CompleteClass */
    override val _storage: js.Array[PatternInfo] = js.native
  }
  
  trait DynamicPatternSegment
    extends StObject
       with PatternSegment {
    
    var dynamic: `true`
    
    var pattern: Pattern
    
    var patternRe: js.RegExp
  }
  object DynamicPatternSegment {
    
    inline def apply(pattern: Pattern, patternRe: js.RegExp): DynamicPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = true, pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicPatternSegment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicPatternSegment] (val x: Self) extends AnyVal {
      
      inline def setDynamic(value: `true`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternRe(value: js.RegExp): Self = StObject.set(x, "patternRe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matcher extends StObject {
    
    /* private */ var _fillStorage: Any
    
    /* private */ var _getPatternSegments: Any
    
    /* private */ val _micromatchOptions: Any
    
    /* private */ val _patterns: Any
    
    /* private */ val _settings: Any
    
    /* private */ var _splitSegmentsIntoSections: Any
    
    /* protected */ val _storage: js.Array[PatternInfo]
  }
  object Matcher {
    
    inline def apply(
      _fillStorage: Any,
      _getPatternSegments: Any,
      _micromatchOptions: Any,
      _patterns: Any,
      _settings: Any,
      _splitSegmentsIntoSections: Any,
      _storage: js.Array[PatternInfo]
    ): Matcher = {
      val __obj = js.Dynamic.literal(_fillStorage = _fillStorage.asInstanceOf[js.Any], _getPatternSegments = _getPatternSegments.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _patterns = _patterns.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _splitSegmentsIntoSections = _splitSegmentsIntoSections.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
      
      inline def set_fillStorage(value: Any): Self = StObject.set(x, "_fillStorage", value.asInstanceOf[js.Any])
      
      inline def set_getPatternSegments(value: Any): Self = StObject.set(x, "_getPatternSegments", value.asInstanceOf[js.Any])
      
      inline def set_micromatchOptions(value: Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      inline def set_patterns(value: Any): Self = StObject.set(x, "_patterns", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_splitSegmentsIntoSections(value: Any): Self = StObject.set(x, "_splitSegmentsIntoSections", value.asInstanceOf[js.Any])
      
      inline def set_storage(value: js.Array[PatternInfo]): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
      
      inline def set_storageVarargs(value: PatternInfo*): Self = StObject.set(x, "_storage", js.Array(value*))
    }
  }
  
  trait PatternInfo extends StObject {
    
    /**
      * Indicates that the pattern has a globstar (more than a single section).
      */
    var complete: Boolean
    
    var pattern: Pattern
    
    var sections: js.Array[PatternSection]
    
    var segments: js.Array[PatternSegment]
  }
  object PatternInfo {
    
    inline def apply(
      complete: Boolean,
      pattern: Pattern,
      sections: js.Array[PatternSection],
      segments: js.Array[PatternSegment]
    ): PatternInfo = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatternInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternInfo] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setSections(value: js.Array[PatternSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsVarargs(value: PatternSection*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setSegments(value: js.Array[PatternSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: PatternSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    }
  }
  
  type PatternSection = js.Array[PatternSegment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastGlob.outProvidersMatchersMatcherMod.StaticPatternSegment
    - typings.fastGlob.outProvidersMatchersMatcherMod.DynamicPatternSegment
  */
  trait PatternSegment extends StObject
  object PatternSegment {
    
    inline def DynamicPatternSegment(pattern: Pattern, patternRe: js.RegExp): typings.fastGlob.outProvidersMatchersMatcherMod.DynamicPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = true, pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.outProvidersMatchersMatcherMod.DynamicPatternSegment]
    }
    
    inline def StaticPatternSegment(pattern: Pattern): typings.fastGlob.outProvidersMatchersMatcherMod.StaticPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = false, pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.outProvidersMatchersMatcherMod.StaticPatternSegment]
    }
  }
  
  trait StaticPatternSegment
    extends StObject
       with PatternSegment {
    
    var dynamic: `false`
    
    var pattern: Pattern
  }
  object StaticPatternSegment {
    
    inline def apply(pattern: Pattern): StaticPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = false, pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticPatternSegment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticPatternSegment] (val x: Self) extends AnyVal {
      
      inline def setDynamic(value: `false`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
