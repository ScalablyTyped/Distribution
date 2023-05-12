package typings.glob

import typings.glob.globStrings._empty
import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsPatternMod {
  
  @JSImport("glob/dist/mjs/pattern", "Pattern")
  @js.native
  open class Pattern protected () extends StObject {
    def this(patternList: js.Array[MMPattern], globList: js.Array[String], index: Double, platform: Platform) = this()
    
    /**
      * Check to see if the current globstar pattern is allowed to follow
      * a symbolic link.
      */
    def checkFollowGlobstar(): Boolean = js.native
    
    /**
      * The /-joined set of glob parts that make up this pattern
      */
    def globString(): String = js.native
    
    /**
      * true if there are more pattern parts after this one
      */
    def hasMore(): Boolean = js.native
    
    /**
      * True if the pattern is rooted on an absolute path
      */
    def isAbsolute(): Boolean = js.native
    
    /**
      * True if the pattern starts with a drive letter on Windows
      */
    def isDrive(): Boolean = js.native
    
    /**
      * true of if pattern() returns GLOBSTAR
      */
    def isGlobstar(): Boolean = js.native
    
    /**
      * true if pattern() returns a regexp
      */
    def isRegExp(): Boolean = js.native
    
    /**
      * true of if pattern() returns a string
      */
    def isString(): Boolean = js.native
    
    /**
      * true if the pattern represents a //unc/path/ on windows
      */
    def isUNC(): Boolean = js.native
    
    val length: Double = js.native
    
    /**
      * Mark that the current globstar pattern is following a symbolic link
      */
    def markFollowGlobstar(): Boolean = js.native
    
    /**
      * The first entry in the parsed list of patterns
      */
    def pattern(): MMPattern = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * The rest of the pattern after this part, or null if this is the end
      */
    def rest(): Pattern | Null = js.native
    
    /**
      * consume the root of the pattern, and return it
      */
    def root(): String = js.native
  }
  
  type AbsolutePatternList = /* rest */ Array[_empty | MMPattern]
  
  type DrivePatternList = /* rest */ Array[String | MMPattern]
  
  type GlobList = /* rest */ Array[String]
  
  type MMPattern = String | js.RegExp | js.Symbol
  
  type PatternList = /* rest */ Array[MMPattern]
  
  type UNCPatternList = /* rest */ Array[_empty | String | MMPattern]
}
