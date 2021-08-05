package typings.fastGlob

import typings.fastGlob.fastGlobBooleans.`false`
import typings.fastGlob.fastGlobBooleans.`true`
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("fast-glob/out/providers/matchers/matcher", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with Matcher {
    def this(
      _patterns: js.Array[Pattern],
      _settings: typings.fastGlob.settingsMod.default,
      _micromatchOptions: MicromatchOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fillStorage: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getPatternSegments: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _micromatchOptions: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _patterns: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _splitSegmentsIntoSections: js.Any = js.native
    
    /* protected */ /* CompleteClass */
    override val _storage: js.Array[PatternInfo] = js.native
  }
  
  trait DynamicPatternSegment
    extends StObject
       with PatternSegment {
    
    var dynamic: `true`
    
    var pattern: Pattern
    
    var patternRe: PatternRe
  }
  object DynamicPatternSegment {
    
    inline def apply(pattern: Pattern, patternRe: PatternRe): DynamicPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = true, pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicPatternSegment]
    }
    
    extension [Self <: DynamicPatternSegment](x: Self) {
      
      inline def setDynamic(value: `true`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternRe(value: PatternRe): Self = StObject.set(x, "patternRe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matcher extends StObject {
    
    /* private */ var _fillStorage: js.Any
    
    /* private */ var _getPatternSegments: js.Any
    
    /* private */ val _micromatchOptions: js.Any
    
    /* private */ val _patterns: js.Any
    
    /* private */ val _settings: js.Any
    
    /* private */ var _splitSegmentsIntoSections: js.Any
    
    /* protected */ val _storage: js.Array[PatternInfo]
  }
  object Matcher {
    
    inline def apply(
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
    
    extension [Self <: Matcher](x: Self) {
      
      inline def set_fillStorage(value: js.Any): Self = StObject.set(x, "_fillStorage", value.asInstanceOf[js.Any])
      
      inline def set_getPatternSegments(value: js.Any): Self = StObject.set(x, "_getPatternSegments", value.asInstanceOf[js.Any])
      
      inline def set_micromatchOptions(value: js.Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      inline def set_patterns(value: js.Any): Self = StObject.set(x, "_patterns", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_splitSegmentsIntoSections(value: js.Any): Self = StObject.set(x, "_splitSegmentsIntoSections", value.asInstanceOf[js.Any])
      
      inline def set_storage(value: js.Array[PatternInfo]): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
      
      inline def set_storageVarargs(value: PatternInfo*): Self = StObject.set(x, "_storage", js.Array(value :_*))
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
    
    extension [Self <: PatternInfo](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setSections(value: js.Array[PatternSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsVarargs(value: PatternSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      inline def setSegments(value: js.Array[PatternSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: PatternSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    }
  }
  
  type PatternSection = js.Array[PatternSegment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastGlob.matcherMod.StaticPatternSegment
    - typings.fastGlob.matcherMod.DynamicPatternSegment
  */
  trait PatternSegment extends StObject
  object PatternSegment {
    
    inline def DynamicPatternSegment(pattern: Pattern, patternRe: PatternRe): typings.fastGlob.matcherMod.DynamicPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = true, pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.matcherMod.DynamicPatternSegment]
    }
    
    inline def StaticPatternSegment(pattern: Pattern): typings.fastGlob.matcherMod.StaticPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = false, pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.matcherMod.StaticPatternSegment]
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
    
    extension [Self <: StaticPatternSegment](x: Self) {
      
      inline def setDynamic(value: `false`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
