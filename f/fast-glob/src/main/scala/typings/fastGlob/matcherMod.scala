package typings.fastGlob

import typings.fastGlob.fastGlobBooleans.`false`
import typings.fastGlob.fastGlobBooleans.`true`
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("fast-glob/out/providers/matchers/matcher", JSImport.Default)
  @js.native
  abstract class default protected () extends Matcher {
    def this(
      _patterns: js.Array[Pattern],
      _settings: typings.fastGlob.settingsMod.default,
      _micromatchOptions: MicromatchOptions
    ) = this()
  }
  
  @js.native
  trait DynamicPatternSegment extends PatternSegment {
    
    var dynamic: `true` = js.native
    
    var pattern: Pattern = js.native
    
    var patternRe: PatternRe = js.native
  }
  object DynamicPatternSegment {
    
    @scala.inline
    def apply(dynamic: `true`, pattern: Pattern, patternRe: PatternRe): DynamicPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicPatternSegment]
    }
    
    @scala.inline
    implicit class DynamicPatternSegmentMutableBuilder[Self <: DynamicPatternSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamic(value: `true`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternRe(value: PatternRe): Self = StObject.set(x, "patternRe", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Matcher extends StObject {
    
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
    implicit class MatcherMutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_fillStorage(value: js.Any): Self = StObject.set(x, "_fillStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getPatternSegments(value: js.Any): Self = StObject.set(x, "_getPatternSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_micromatchOptions(value: js.Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_patterns(value: js.Any): Self = StObject.set(x, "_patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_splitSegmentsIntoSections(value: js.Any): Self = StObject.set(x, "_splitSegmentsIntoSections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_storage(value: js.Array[PatternInfo]): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_storageVarargs(value: PatternInfo*): Self = StObject.set(x, "_storage", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PatternInfo extends StObject {
    
    /**
      * Indicates that the pattern has a globstar (more than a single section).
      */
    var complete: Boolean = js.native
    
    var pattern: Pattern = js.native
    
    var sections: js.Array[PatternSection] = js.native
    
    var segments: js.Array[PatternSegment] = js.native
  }
  object PatternInfo {
    
    @scala.inline
    def apply(
      complete: Boolean,
      pattern: Pattern,
      sections: js.Array[PatternSection],
      segments: js.Array[PatternSegment]
    ): PatternInfo = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatternInfo]
    }
    
    @scala.inline
    implicit class PatternInfoMutableBuilder[Self <: PatternInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSections(value: js.Array[PatternSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsVarargs(value: PatternSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setSegments(value: js.Array[PatternSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: PatternSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    }
  }
  
  type PatternSection = js.Array[PatternSegment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastGlob.matcherMod.StaticPatternSegment
    - typings.fastGlob.matcherMod.DynamicPatternSegment
  */
  trait PatternSegment extends StObject
  object PatternSegment {
    
    @scala.inline
    def DynamicPatternSegment(dynamic: `true`, pattern: Pattern, patternRe: PatternRe): typings.fastGlob.matcherMod.DynamicPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.matcherMod.DynamicPatternSegment]
    }
    
    @scala.inline
    def StaticPatternSegment(dynamic: `false`, pattern: Pattern): typings.fastGlob.matcherMod.StaticPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.matcherMod.StaticPatternSegment]
    }
  }
  
  @js.native
  trait StaticPatternSegment extends PatternSegment {
    
    var dynamic: `false` = js.native
    
    var pattern: Pattern = js.native
  }
  object StaticPatternSegment {
    
    @scala.inline
    def apply(dynamic: `false`, pattern: Pattern): StaticPatternSegment = {
      val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticPatternSegment]
    }
    
    @scala.inline
    implicit class StaticPatternSegmentMutableBuilder[Self <: StaticPatternSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamic(value: `false`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
