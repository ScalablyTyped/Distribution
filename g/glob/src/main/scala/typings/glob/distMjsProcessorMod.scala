package typings.glob

import typings.glob.distMjsPatternMod.Pattern
import typings.glob.distMjsWalkerMod.GlobWalkerOpts
import typings.minimatch.mod.MMRegExp
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsProcessorMod {
  
  @JSImport("glob/dist/mjs/processor", "HasWalkedCache")
  @js.native
  open class HasWalkedCache () extends StObject {
    def this(store: Map[String, Set[String]]) = this()
    
    def copy(): HasWalkedCache = js.native
    
    def hasWalked(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      pattern: Pattern
    ): js.UndefOr[Boolean] = js.native
    
    var store: Map[String, Set[String]] = js.native
    
    def storeWalked(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      pattern: Pattern
    ): Unit = js.native
  }
  
  @JSImport("glob/dist/mjs/processor", "MatchRecord")
  @js.native
  open class MatchRecord () extends StObject {
    
    def add(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      absolute: Boolean,
      ifDir: Boolean
    ): Unit = js.native
    
    def entries(): js.Array[
        js.Tuple3[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
          Boolean, 
          Boolean
        ]
      ] = js.native
    
    var store: Map[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Double
      ] = js.native
  }
  
  @JSImport("glob/dist/mjs/processor", "Processor")
  @js.native
  open class Processor protected () extends StObject {
    def this(opts: GlobWalkerOpts) = this()
    def this(opts: GlobWalkerOpts, hasWalkedCache: HasWalkedCache) = this()
    
    def child(): Processor = js.native
    
    var dot: Boolean = js.native
    
    def filterEntries(
      parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      entries: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
    ): Processor = js.native
    
    var follow: Boolean = js.native
    
    var hasWalkedCache: HasWalkedCache = js.native
    
    var matches: MatchRecord = js.native
    
    var opts: GlobWalkerOpts = js.native
    
    var patterns: js.UndefOr[js.Array[Pattern]] = js.native
    
    def processPatterns(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      patterns: js.Array[Pattern]
    ): this.type = js.native
    
    def subwalkTargets(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    
    var subwalks: SubWalks = js.native
    
    def testGlobstar(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      pattern: Pattern,
      rest: Null,
      absolute: Boolean
    ): Unit = js.native
    def testGlobstar(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      pattern: Pattern,
      rest: Pattern,
      absolute: Boolean
    ): Unit = js.native
    
    def testRegExp(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      p: MMRegExp,
      rest: Null,
      absolute: Boolean
    ): Unit = js.native
    def testRegExp(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      p: MMRegExp,
      rest: Pattern,
      absolute: Boolean
    ): Unit = js.native
    
    def testString(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      p: String,
      rest: Null,
      absolute: Boolean
    ): Unit = js.native
    def testString(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      p: String,
      rest: Pattern,
      absolute: Boolean
    ): Unit = js.native
  }
  
  @JSImport("glob/dist/mjs/processor", "SubWalks")
  @js.native
  open class SubWalks () extends StObject {
    
    def add(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      pattern: Pattern
    ): Unit = js.native
    
    def entries(): js.Array[
        js.Tuple2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
          js.Array[Pattern]
        ]
      ] = js.native
    
    def get(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ): js.Array[Pattern] = js.native
    
    def keys(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    
    var store: Map[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        js.Array[Pattern]
      ] = js.native
  }
}
