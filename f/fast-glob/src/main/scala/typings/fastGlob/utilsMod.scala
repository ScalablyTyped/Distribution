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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object array {
    
    @JSImport("fast-glob/out/utils", "array.flatten")
    @js.native
    def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = js.native
    
    @JSImport("fast-glob/out/utils", "array.splitWhen")
    @js.native
    def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = js.native
  }
  
  object errno {
    
    @JSImport("fast-glob/out/utils", "errno.isEnoentCodeError")
    @js.native
    def isEnoentCodeError(error: ErrnoException): Boolean = js.native
  }
  
  object fs {
    
    @JSImport("fast-glob/out/utils", "fs.createDirentFromStats")
    @js.native
    def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
  }
  
  object path {
    
    @JSImport("fast-glob/out/utils", "path.escape")
    @js.native
    def escape(pattern: Pattern): Pattern = js.native
    
    @JSImport("fast-glob/out/utils", "path.makeAbsolute")
    @js.native
    def makeAbsolute(cwd: String, filepath: String): String = js.native
    
    @JSImport("fast-glob/out/utils", "path.removeLeadingDotSegment")
    @js.native
    def removeLeadingDotSegment(entry: String): String = js.native
    
    @JSImport("fast-glob/out/utils", "path.unixify")
    @js.native
    def unixify(filepath: String): String = js.native
  }
  
  object pattern {
    
    @JSImport("fast-glob/out/utils", "pattern.convertPatternsToRe")
    @js.native
    def convertPatternsToRe(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[PatternRe] = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.convertToNegativePattern")
    @js.native
    def convertToNegativePattern(pattern: Pattern): Pattern = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.convertToPositivePattern")
    @js.native
    def convertToPositivePattern(pattern: Pattern): Pattern = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.endsWithSlashGlobStar")
    @js.native
    def endsWithSlashGlobStar(pattern: Pattern): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.expandBraceExpansion")
    @js.native
    def expandBraceExpansion(pattern: Pattern): js.Array[Pattern] = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.expandPatternsWithBraceExpansion")
    @js.native
    def expandPatternsWithBraceExpansion(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.getBaseDirectory")
    @js.native
    def getBaseDirectory(pattern: Pattern): String = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.getNegativePatterns")
    @js.native
    def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.getPatternParts")
    @js.native
    def getPatternParts(pattern: Pattern, options: MicromatchOptions): js.Array[Pattern] = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.getPositivePatterns")
    @js.native
    def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.hasGlobStar")
    @js.native
    def hasGlobStar(pattern: Pattern): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.isAffectDepthOfReadingPattern")
    @js.native
    def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.isDynamicPattern")
    @js.native
    def isDynamicPattern(pattern: Pattern): Boolean = js.native
    @JSImport("fast-glob/out/utils", "pattern.isDynamicPattern")
    @js.native
    def isDynamicPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.isNegativePattern")
    @js.native
    def isNegativePattern(pattern: Pattern): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.isPositivePattern")
    @js.native
    def isPositivePattern(pattern: Pattern): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.isStaticPattern")
    @js.native
    def isStaticPattern(pattern: Pattern): Boolean = js.native
    @JSImport("fast-glob/out/utils", "pattern.isStaticPattern")
    @js.native
    def isStaticPattern(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.makeRe")
    @js.native
    def makeRe(pattern: Pattern, options: MicromatchOptions): PatternRe = js.native
    
    @JSImport("fast-glob/out/utils", "pattern.matchAny")
    @js.native
    def matchAny(entry: String, patternsRe: js.Array[PatternRe]): Boolean = js.native
  }
  
  object stream {
    
    @JSImport("fast-glob/out/utils", "stream.merge")
    @js.native
    def merge(streams: js.Array[Readable]): ReadableStream = js.native
  }
  
  object string {
    
    @JSImport("fast-glob/out/utils", "string.isEmpty")
    @js.native
    def isEmpty(input: String): Boolean = js.native
    
    @JSImport("fast-glob/out/utils", "string.isString")
    @js.native
    def isString(input: js.Any): /* is string */ Boolean = js.native
  }
}
