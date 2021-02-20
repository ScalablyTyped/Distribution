package typings.fastGlob

import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternMod {
  
  @JSImport("fast-glob/out/utils/pattern", "convertPatternsToRe")
  @js.native
  def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[PatternRe] = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "convertToNegativePattern")
  @js.native
  def convertToNegativePattern(pattern: Pattern): Pattern = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "convertToPositivePattern")
  @js.native
  def convertToPositivePattern(pattern: Pattern): Pattern = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "endsWithSlashGlobStar")
  @js.native
  def endsWithSlashGlobStar(pattern: Pattern): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "expandBraceExpansion")
  @js.native
  def expandBraceExpansion(pattern: Pattern): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "expandPatternsWithBraceExpansion")
  @js.native
  def expandPatternsWithBraceExpansion(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "getBaseDirectory")
  @js.native
  def getBaseDirectory(pattern: Pattern): String = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "getNegativePatterns")
  @js.native
  def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "getPatternParts")
  @js.native
  def getPatternParts(pattern: Pattern, options: MicromatchOptions): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "getPositivePatterns")
  @js.native
  def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "hasGlobStar")
  @js.native
  def hasGlobStar(pattern: Pattern): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "isAffectDepthOfReadingPattern")
  @js.native
  def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "isDynamicPattern")
  @js.native
  def isDynamicPattern(pattern: Pattern): Boolean = js.native
  @JSImport("fast-glob/out/utils/pattern", "isDynamicPattern")
  @js.native
  def isDynamicPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "isNegativePattern")
  @js.native
  def isNegativePattern(pattern: Pattern): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "isPositivePattern")
  @js.native
  def isPositivePattern(pattern: Pattern): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "isStaticPattern")
  @js.native
  def isStaticPattern(pattern: Pattern): Boolean = js.native
  @JSImport("fast-glob/out/utils/pattern", "isStaticPattern")
  @js.native
  def isStaticPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "makeRe")
  @js.native
  def makeRe(pattern: Pattern, options: MicromatchOptions): PatternRe = js.native
  
  @JSImport("fast-glob/out/utils/pattern", "matchAny")
  @js.native
  def matchAny(entry: String, patternsRe: js.Array[PatternRe]): Boolean = js.native
  
  @js.native
  trait PatternTypeOptions extends StObject {
    
    var braceExpansion: js.UndefOr[Boolean] = js.native
    
    var caseSensitiveMatch: js.UndefOr[Boolean] = js.native
    
    var extglob: js.UndefOr[Boolean] = js.native
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
