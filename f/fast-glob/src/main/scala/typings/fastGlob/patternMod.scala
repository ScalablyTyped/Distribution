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
  
  inline def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[PatternRe] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPatternsToRe")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PatternRe]]
  
  inline def convertToNegativePattern(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToNegativePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  
  inline def convertToPositivePattern(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPositivePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  
  inline def endsWithSlashGlobStar(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWithSlashGlobStar")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def expandBraceExpansion(pattern: Pattern): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBraceExpansion")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  inline def expandPatternsWithBraceExpansion(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPatternsWithBraceExpansion")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  inline def getBaseDirectory(pattern: Pattern): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDirectory")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNegativePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  inline def getPatternParts(pattern: Pattern, options: MicromatchOptions): js.Array[Pattern] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPatternParts")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pattern]]
  
  inline def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositivePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  inline def hasGlobStar(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGlobStar")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAffectDepthOfReadingPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDynamicPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDynamicPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNegativePattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPositivePattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositivePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStaticPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isStaticPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPattern")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeRe(pattern: Pattern, options: MicromatchOptions): PatternRe = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PatternRe]
  
  inline def matchAny(entry: String, patternsRe: js.Array[PatternRe]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchAny")(entry.asInstanceOf[js.Any], patternsRe.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait PatternTypeOptions extends StObject {
    
    var braceExpansion: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
    
    var extglob: js.UndefOr[Boolean] = js.undefined
  }
  object PatternTypeOptions {
    
    inline def apply(): PatternTypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternTypeOptions]
    }
    
    extension [Self <: PatternTypeOptions](x: Self) {
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
    }
  }
}
