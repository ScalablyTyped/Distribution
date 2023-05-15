package typings.glob

import typings.glob.distMjsIgnoreMod.IgnoreLike
import typings.glob.distMjsPatternMod.Pattern
import typings.glob.distMjsProcessorMod.Processor
import typings.glob.globBooleans.`false`
import typings.glob.globBooleans.`true`
import typings.minipass.mod.Minipass
import typings.minipass.mod.Minipass.Events
import typings.node.processMod.global.NodeJS.Platform
import typings.std.AbortSignal
import typings.std.Set
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsWalkerMod {
  
  @JSImport("glob/dist/mjs/walker", "GlobStream")
  @js.native
  open class GlobStream[O /* <: GlobWalkerOpts */] protected () extends GlobUtil[O] {
    def this(
      patterns: js.Array[Pattern],
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      opts: O
    ) = this()
    
    var results: /* import warning: importer.ImportType#apply Failed type conversion: O extends glob.glob/dist/mjs/walker.GWOFileTypesTrue ? minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> : O extends glob.glob/dist/mjs/walker.GWOFileTypesFalse ? minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>> : O extends glob.glob/dist/mjs/walker.GWOFileTypesUnset ? minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>> : minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string>> */ js.Any = js.native
    
    def stream(): MatchStream[O] = js.native
    
    def streamSync(): MatchStream[O] = js.native
  }
  
  /* note: abstract class */ @JSImport("glob/dist/mjs/walker", "GlobUtil")
  @js.native
  open class GlobUtil[O /* <: GlobWalkerOpts */] protected () extends StObject {
    def this(
      patterns: js.Array[Pattern],
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      opts: O
    ) = this()
    
    var aborted: Boolean = js.native
    
    def `match`(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      absolute: Boolean,
      ifDir: Boolean
    ): js.Promise[Unit] = js.native
    
    def matchCheck(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      ifDir: Boolean
    ): js.Promise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    
    def matchCheckSync(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      ifDir: Boolean
    ): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    
    def matchCheckTest(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      ifDir: Boolean
    ): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def matchCheckTest(e: Unit, ifDir: Boolean): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    
    def matchEmit(p: Result[O] | String): Unit = js.native
    def matchEmit(
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ): Unit = js.native
    
    def matchFinish(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      absolute: Boolean
    ): Unit = js.native
    
    def matchSync(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      absolute: Boolean,
      ifDir: Boolean
    ): Unit = js.native
    
    var maxDepth: Double = js.native
    
    def onResume(fn: js.Function0[Any]): Unit = js.native
    
    var opts: O = js.native
    
    var path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any = js.native
    
    var patterns: js.Array[Pattern] = js.native
    
    def pause(): Unit = js.native
    
    var paused: Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def resume(): Unit = js.native
    
    var seen: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    
    var signal: js.UndefOr[AbortSignal] = js.native
    
    def walkCB(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      patterns: js.Array[Pattern],
      cb: js.Function0[Any]
    ): Unit = js.native
    
    def walkCB2(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      patterns: js.Array[Pattern],
      processor: Processor,
      cb: js.Function0[Any]
    ): Any = js.native
    
    def walkCB2Sync(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      patterns: js.Array[Pattern],
      processor: Processor,
      cb: js.Function0[Any]
    ): Any = js.native
    
    def walkCB3(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      entries: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ],
      processor: Processor,
      cb: js.Function0[Any]
    ): Unit = js.native
    
    def walkCB3Sync(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      entries: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ],
      processor: Processor,
      cb: js.Function0[Any]
    ): Unit = js.native
    
    def walkCBSync(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      patterns: js.Array[Pattern],
      cb: js.Function0[Any]
    ): Unit = js.native
  }
  
  @JSImport("glob/dist/mjs/walker", "GlobWalker")
  @js.native
  open class GlobWalker[O /* <: GlobWalkerOpts */] protected () extends GlobUtil[O] {
    def this(
      patterns: js.Array[Pattern],
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any,
      opts: O
    ) = this()
    
    var matches: /* import warning: importer.ImportType#apply Failed type conversion: O extends glob.glob/dist/mjs/walker.GWOFileTypesTrue ? std.Set</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> : O extends glob.glob/dist/mjs/walker.GWOFileTypesFalse ? std.Set<string> : O extends glob.glob/dist/mjs/walker.GWOFileTypesUnset ? std.Set<string> : std.Set</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string> */ js.Any = js.native
    
    def walk(): js.Promise[Matches[O]] = js.native
    
    def walkSync(): Matches[O] = js.native
  }
  
  trait GWOFileTypesFalse
    extends StObject
       with GlobWalkerOpts {
    
    @JSName("withFileTypes")
    var withFileTypes_GWOFileTypesFalse: `false`
  }
  object GWOFileTypesFalse {
    
    inline def apply(): GWOFileTypesFalse = {
      val __obj = js.Dynamic.literal(withFileTypes = false)
      __obj.asInstanceOf[GWOFileTypesFalse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GWOFileTypesFalse] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait GWOFileTypesTrue
    extends StObject
       with GlobWalkerOpts {
    
    @JSName("withFileTypes")
    var withFileTypes_GWOFileTypesTrue: `true`
  }
  object GWOFileTypesTrue {
    
    inline def apply(): GWOFileTypesTrue = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[GWOFileTypesTrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GWOFileTypesTrue] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait GWOFileTypesUnset
    extends StObject
       with GlobWalkerOpts {
    
    @JSName("withFileTypes")
    var withFileTypes_GWOFileTypesUnset: Unit
  }
  object GWOFileTypesUnset {
    
    inline def apply(withFileTypes: Unit): GWOFileTypesUnset = {
      val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GWOFileTypesUnset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GWOFileTypesUnset] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: Unit): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobWalkerOpts extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var allowWindowsEscape: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var dotRelative: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String] | IgnoreLike] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    var nodir: js.UndefOr[Boolean] = js.undefined
    
    var noext: js.UndefOr[Boolean] = js.undefined
    
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    var platform: js.UndefOr[Platform] = js.undefined
    
    var posix: js.UndefOr[Boolean] = js.undefined
    
    var realpath: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var stat: js.UndefOr[Boolean] = js.undefined
    
    var windowsPathsNoEscape: js.UndefOr[Boolean] = js.undefined
    
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object GlobWalkerOpts {
    
    inline def apply(): GlobWalkerOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobWalkerOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobWalkerOpts] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setAllowWindowsEscape(value: Boolean): Self = StObject.set(x, "allowWindowsEscape", value.asInstanceOf[js.Any])
      
      inline def setAllowWindowsEscapeUndefined: Self = StObject.set(x, "allowWindowsEscape", js.undefined)
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotRelative(value: Boolean): Self = StObject.set(x, "dotRelative", value.asInstanceOf[js.Any])
      
      inline def setDotRelativeUndefined: Self = StObject.set(x, "dotRelative", js.undefined)
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String] | IgnoreLike): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStat(value: Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      inline def setWindowsPathsNoEscape(value: Boolean): Self = StObject.set(x, "windowsPathsNoEscape", value.asInstanceOf[js.Any])
      
      inline def setWindowsPathsNoEscapeUndefined: Self = StObject.set(x, "windowsPathsNoEscape", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends glob.glob/dist/mjs/walker.GWOFileTypesTrue ? minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> : O extends glob.glob/dist/mjs/walker.GWOFileTypesFalse ? minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>> : O extends glob.glob/dist/mjs/walker.GWOFileTypesUnset ? minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>> : minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string>>
    }}}
    */
  type MatchStream[O /* <: GlobWalkerOpts */] = Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends glob.glob/dist/mjs/walker.GWOFileTypesTrue ? std.Set</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> : O extends glob.glob/dist/mjs/walker.GWOFileTypesFalse ? std.Set<string> : O extends glob.glob/dist/mjs/walker.GWOFileTypesUnset ? std.Set<string> : std.Set</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string>
    }}}
    */
  type Matches[O /* <: GlobWalkerOpts */] = Set[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends glob.glob/dist/mjs/walker.GWOFileTypesTrue ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any : O extends glob.glob/dist/mjs/walker.GWOFileTypesFalse ? string : O extends glob.glob/dist/mjs/walker.GWOFileTypesUnset ? string : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any | string
    }}}
    */
  type Result[O /* <: GlobWalkerOpts */] = String
}
