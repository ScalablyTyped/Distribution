package typings.fastGlob

import typings.fastGlob.patternMod.PatternTypeOptions
import typings.fastGlob.typesMod.ErrnoException
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.nodelibFsScandir.typesMod.Dirent
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object array {
    
    @JSImport("fast-glob/out/utils", "array")
    @js.native
    val ^ : js.Any = js.native
    
    inline def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitWhen")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  }
  
  object errno {
    
    @JSImport("fast-glob/out/utils", "errno")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEnoentCodeError(error: ErrnoException): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnoentCodeError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object fs {
    
    @JSImport("fast-glob/out/utils", "fs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDirentFromStats(name: String, stats: Stats): Dirent = (^.asInstanceOf[js.Dynamic].applyDynamic("createDirentFromStats")(name.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Dirent]
  }
  
  object path {
    
    @JSImport("fast-glob/out/utils", "path")
    @js.native
    val ^ : js.Any = js.native
    
    inline def escape(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
    
    inline def makeAbsolute(cwd: String, filepath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsolute")(cwd.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def removeLeadingDotSegment(entry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLeadingDotSegment")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def unixify(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unixify")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object pattern {
    
    @JSImport("fast-glob/out/utils", "pattern")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[js.RegExp] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPatternsToRe")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.RegExp]]
    
    inline def convertToNegativePattern(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToNegativePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
    
    inline def convertToPositivePattern(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPositivePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
    
    inline def endsWithSlashGlobStar(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWithSlashGlobStar")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def expandBraceExpansion(pattern: Pattern): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBraceExpansion")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
    
    inline def expandPatternsWithBraceExpansion(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPatternsWithBraceExpansion")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
    
    inline def getBaseDirectory(pattern: Pattern): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDirectory")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNegativePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
    
    inline def getPatternParts(pattern: Pattern, options: MicromatchOptions): js.Array[Pattern] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPatternParts")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pattern]]
    
    inline def getPatternsInsideCurrentDirectory(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPatternsInsideCurrentDirectory")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
    
    inline def getPatternsOutsideCurrentDirectory(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPatternsOutsideCurrentDirectory")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
    
    inline def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositivePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
    
    inline def hasGlobStar(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGlobStar")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAffectDepthOfReadingPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDynamicPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isDynamicPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNegativePattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPatternRelatedToParentDirectory(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternRelatedToParentDirectory")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPositivePattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositivePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isStaticPattern(pattern: Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isStaticPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPattern")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def makeRe(pattern: Pattern, options: MicromatchOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
    
    inline def matchAny(entry: String, patternsRe: js.Array[js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchAny")(entry.asInstanceOf[js.Any], patternsRe.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object stream {
    
    @JSImport("fast-glob/out/utils", "stream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def merge(streams: js.Array[Readable]): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(streams.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  }
  
  object string {
    
    @JSImport("fast-glob/out/utils", "string")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmpty(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isString(input: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(input.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
}
