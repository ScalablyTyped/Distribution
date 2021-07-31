package typings.fastGlob

import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternMod {
  
  @JSImport("fast-glob/out/utils/pattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[PatternRe] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPatternsToRe")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PatternRe]]
  
  @scala.inline
  def convertToNegativePattern(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToNegativePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  
  @scala.inline
  def convertToPositivePattern(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPositivePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  
  @scala.inline
  def endsWithSlashGlobStar(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWithSlashGlobStar")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def expandBraceExpansion(pattern: Pattern): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBraceExpansion")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  @scala.inline
  def expandPatternsWithBraceExpansion(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPatternsWithBraceExpansion")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  @scala.inline
  def getBaseDirectory(pattern: Pattern): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDirectory")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNegativePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  @scala.inline
  def getPatternParts(pattern: Pattern, options: MicromatchOptions): js.Array[Pattern] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPatternParts")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pattern]]
  
  @scala.inline
  def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositivePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  @scala.inline
  def hasGlobStar(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGlobStar")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAffectDepthOfReadingPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDynamicPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isDynamicPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isNegativePattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPositivePattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositivePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isStaticPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isStaticPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPattern")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def makeRe(pattern: Pattern, options: MicromatchOptions): PatternRe = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PatternRe]
  
  @scala.inline
  def matchAny(entry: String, patternsRe: js.Array[PatternRe]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchAny")(entry.asInstanceOf[js.Any], patternsRe.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait PatternTypeOptions extends StObject {
    
    var braceExpansion: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
    
    var extglob: js.UndefOr[Boolean] = js.undefined
  }
  object PatternTypeOptions {
    
    @scala.inline
    def apply(): PatternTypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternTypeOptions]
    }
    
    @scala.inline
    implicit class PatternTypeOptionsMutableBuilder[Self <: PatternTypeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      @scala.inline
      def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      @scala.inline
      def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
    }
  }
}
