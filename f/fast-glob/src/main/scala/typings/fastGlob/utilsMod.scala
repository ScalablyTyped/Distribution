package typings.fastGlob

import typings.fastGlob.patternMod.PatternTypeOptions
import typings.fastGlob.typesMod.ErrnoException
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.nodelibFsScandir.typesMod.Dirent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object array {
    
    @JSImport("fast-glob/out/utils", "array")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    @scala.inline
    def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitWhen")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  }
  
  object errno {
    
    @JSImport("fast-glob/out/utils", "errno")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isEnoentCodeError(error: ErrnoException): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnoentCodeError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object fs {
    
    @JSImport("fast-glob/out/utils", "fs")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createDirentFromStats(name: String, stats: Stats): Dirent = (^.asInstanceOf[js.Dynamic].applyDynamic("createDirentFromStats")(name.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Dirent]
  }
  
  object path {
    
    @JSImport("fast-glob/out/utils", "path")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def escape(pattern: Pattern): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(pattern.asInstanceOf[js.Any]).asInstanceOf[Pattern]
    
    @scala.inline
    def makeAbsolute(cwd: String, filepath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsolute")(cwd.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def removeLeadingDotSegment(entry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLeadingDotSegment")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def unixify(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unixify")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object pattern {
    
    @JSImport("fast-glob/out/utils", "pattern")
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
  }
  
  object stream {
    
    @JSImport("fast-glob/out/utils", "stream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def merge(streams: js.Array[Readable]): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(streams.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  }
  
  object string {
    
    @JSImport("fast-glob/out/utils", "string")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isEmpty(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isString(input: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(input.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
}
