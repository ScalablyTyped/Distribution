package typings.glob

import org.scalablytyped.runtime.Instantiable2
import typings.glob.anon.Fn0
import typings.glob.anon.Fn1
import typings.glob.anon.Fn2
import typings.glob.anon.Fn3
import typings.glob.anon.FnCall
import typings.glob.anon.FnCallPatternOptions
import typings.glob.anon.NonepatternstringArraystr
import typings.glob.anon.NonepatternstringArraystrCall
import typings.glob.anon.NonepatternstringArraystrSync
import typings.glob.distMjsGlobMod.Glob
import typings.glob.distMjsGlobMod.GlobOptions
import typings.glob.distMjsGlobMod.GlobOptionsWithFileTypesFalse
import typings.glob.distMjsGlobMod.GlobOptionsWithFileTypesTrue
import typings.glob.distMjsGlobMod.GlobOptionsWithFileTypesUnset
import typings.minimatch.anon.PickMinimatchOptionswindo
import typings.minipass.mod.Minipass
import typings.minipass.mod.Minipass.Events
import typings.std.AsyncGenerator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("glob", "Glob")
  @js.native
  open class Glob_[Opts /* <: GlobOptions */] protected () extends Glob[Opts] {
    /**
      * All options are stored as properties on the `Glob` object.
      *
      * See {@link GlobOptions} for full options descriptions.
      *
      * Note that a previous `Glob` object can be passed as the
      * `GlobOptions` to another `Glob` instantiation to re-use settings
      * and caches with a new pattern.
      *
      * Traversal functions can be called multiple times to run the walk
      * again.
      */
    def this(pattern: String, opts: Opts) = this()
    def this(pattern: js.Array[String], opts: Opts) = this()
  }
  
  inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Promise<std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> | std.Array<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Promise<std.Array<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Promise<std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Promise<std.Array<string>>} & {  glob :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Promise<std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> | std.Array<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Promise<std.Array<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Promise<std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Promise<std.Array<string>>},   globSync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> | std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Array<string>},   sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> | std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Array<string>} & {  stream :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>},   iterate :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>}},   globStream :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>},   stream :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>} & {  sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>}},   globStreamSync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>},   streamSync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>},   globIterate :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.AsyncGenerator<string, void, void>},   iterate :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.AsyncGenerator<string, void, void>} & {  sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>}},   globIterateSync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>},   iterateSync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>},   Glob :new <Opts extends glob.glob/dist/mjs/glob.GlobOptions>(pattern : string | std.Array<string>, opts : / * import warning: RewrittenClass.unapply cls was tparam Opts * / any): glob.glob/dist/mjs/glob.Glob<Opts>, hasMagic (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions | undefined): boolean, escape (s : string, param1 : std.Pick<minimatch.minimatch.MinimatchOptions, 'windowsPathsNoEscape'> | undefined): string, unescape (s : string, param1 : std.Pick<minimatch.minimatch.MinimatchOptions, 'windowsPathsNoEscape'> | undefined): string} */
  object glob {
    
    inline def apply(pattern: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def apply(pattern: String, options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def apply(pattern: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def apply(pattern: js.Array[String], options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    @JSImport("glob", "glob")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("glob", "glob.Glob")
    @js.native
    open class GlobCls[Opts /* <: GlobOptions */] protected () extends Glob[Opts] {
      /**
        * All options are stored as properties on the `Glob` object.
        *
        * See {@link GlobOptions} for full options descriptions.
        *
        * Note that a previous `Glob` object can be passed as the
        * `GlobOptions` to another `Glob` instantiation to re-use settings
        * and caches with a new pattern.
        *
        * Traversal functions can be called multiple times to run the walk
        * again.
        */
      def this(pattern: String, opts: /* import warning: RewrittenClass.unapply cls was tparam Opts */ Any) = this()
      def this(
        pattern: js.Array[String],
        opts: /* import warning: RewrittenClass.unapply cls was tparam Opts */ Any
      ) = this()
    }
    
    @JSImport("glob", "glob.Glob")
    @js.native
    def Glob_ : Instantiable2[
        /* pattern */ String | js.Array[String], 
        /* import warning: RewrittenClass.unapply cls was tparam Opts */ /* opts */ Any, 
        Glob[GlobOptions]
      ] = js.native
    
    inline def Glob__=(
      x: Instantiable2[
          /* pattern */ String | js.Array[String], 
          /* import warning: RewrittenClass.unapply cls was tparam Opts */ /* opts */ Any, 
          Glob[GlobOptions]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Glob")(x.asInstanceOf[js.Any])
    
    inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def escape(s: String, param1: typings.glob.anon.PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("glob", "glob.glob")
    @js.native
    def glob: Fn0 = js.native
    inline def glob(pattern: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def glob(pattern: String, options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def glob(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def glob(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def glob(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def glob(pattern: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def glob(pattern: js.Array[String], options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def glob(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def glob(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def glob(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    @JSImport("glob", "glob.globIterate")
    @js.native
    def globIterate: Fn3 = js.native
    inline def globIterate(pattern: String): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def globIterate(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def globIterate(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def globIterate(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def globIterate(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def globIterate(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def globIterate(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    
    @JSImport("glob", "glob.globIterateSync")
    @js.native
    def globIterateSync: FnCallPatternOptions = js.native
    inline def globIterateSync(pattern: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def globIterateSync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def globIterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def globIterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def globIterateSync_=(x: FnCallPatternOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globIterateSync")(x.asInstanceOf[js.Any])
    
    inline def globIterate_=(x: Fn3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globIterate")(x.asInstanceOf[js.Any])
    
    @JSImport("glob", "glob.globStream")
    @js.native
    def globStream: Fn2 = js.native
    inline def globStream(pattern: String): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def globStream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def globStream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStream(pattern: js.Array[String]): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    
    @JSImport("glob", "glob.globStreamSync")
    @js.native
    def globStreamSync: FnCall = js.native
    inline def globStreamSync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStreamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def globStreamSync_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globStreamSync")(x.asInstanceOf[js.Any])
    
    inline def globStream_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globStream")(x.asInstanceOf[js.Any])
    
    @JSImport("glob", "glob.globSync")
    @js.native
    def globSync: Fn1 = js.native
    inline def globSync(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def globSync(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ]]
    inline def globSync(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def globSync(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ]]
    inline def globSync(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def globSync(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def globSync(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ]]
    inline def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ]]
    inline def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def globSync_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globSync")(x.asInstanceOf[js.Any])
    
    inline def glob_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glob")(x.asInstanceOf[js.Any])
    
    inline def hasMagic(pattern: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def hasMagic(pattern: String, options: GlobOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasMagic(pattern: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def hasMagic(pattern: js.Array[String], options: GlobOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("glob", "glob.iterate")
    @js.native
    def iterate: NonepatternstringArraystrSync = js.native
    inline def iterate(pattern: String): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def iterate(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def iterate(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def iterate(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def iterate(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    
    @JSImport("glob", "glob.iterateSync")
    @js.native
    def iterateSync: FnCallPatternOptions = js.native
    inline def iterateSync(pattern: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterateSync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def iterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def iterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterateSync_=(x: FnCallPatternOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterateSync")(x.asInstanceOf[js.Any])
    
    inline def iterate_=(x: NonepatternstringArraystrSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterate")(x.asInstanceOf[js.Any])
    
    @JSImport("glob", "glob.stream")
    @js.native
    def stream: NonepatternstringArraystrCall = js.native
    inline def stream(pattern: String): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def stream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def stream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: js.Array[String]): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    
    @JSImport("glob", "glob.streamSync")
    @js.native
    def streamSync: FnCall = js.native
    inline def streamSync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def streamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def streamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def streamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def streamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def streamSync_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("streamSync")(x.asInstanceOf[js.Any])
    
    inline def stream_=(x: NonepatternstringArraystrCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
    
    @JSImport("glob", "glob.sync")
    @js.native
    def sync: NonepatternstringArraystr = js.native
    inline def sync(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def sync(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def sync(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def sync(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def sync_=(x: NonepatternstringArraystr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
    
    inline def unescape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unescape(s: String, param1: typings.glob.anon.PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def globIterate(pattern: String): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def globIterate(pattern: String, options: GlobOptions): AsyncGenerator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ]]
  inline def globIterate(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def globIterate(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ]]
  inline def globIterate(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def globIterate(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def globIterate(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ]]
  inline def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ]]
  inline def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  
  inline def globIterateSync(pattern: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
  inline def globIterateSync(pattern: String, options: GlobOptions): Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ]]
  inline def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ]]
  inline def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def globIterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
  inline def globIterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ]]
  inline def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ]]
  inline def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("globIterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  
  inline def globStream(pattern: String): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStream(pattern: String, options: GlobOptions): Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ]]
  inline def globStream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]]
  inline def globStream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStream(pattern: js.Array[String]): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStream(pattern: js.Array[String], options: GlobOptions): Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ]]
  inline def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]]
  inline def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  
  inline def globStreamSync(pattern: String, options: GlobOptions): Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ]]
  inline def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]]
  inline def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStreamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ]]
  inline def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]]
  inline def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globStreamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  
  inline def globSync(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def globSync(pattern: String, options: GlobOptions): js.Array[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
  ]]
  inline def globSync(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def globSync(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
  ]]
  inline def globSync(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def globSync(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def globSync(pattern: js.Array[String], options: GlobOptions): js.Array[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
  ]]
  inline def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
  ]]
  inline def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def hasMagic(pattern: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasMagic(pattern: String, options: GlobOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasMagic(pattern: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasMagic(pattern: js.Array[String], options: GlobOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMagic")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.AsyncGenerator<string, void, void>} & {  sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>}} */
  object iterate {
    
    inline def apply(pattern: String): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def apply(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def apply(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def apply(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
    
    @JSImport("glob", "iterate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("glob", "iterate.sync")
    @js.native
    def sync: FnCallPatternOptions = js.native
    inline def sync(pattern: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def sync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def sync(pattern: js.Array[String]): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def sync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def sync_=(x: FnCallPatternOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
  }
  
  inline def iterateSync(pattern: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
  inline def iterateSync(pattern: String, options: GlobOptions): Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ]]
  inline def iterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def iterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ]]
  inline def iterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def iterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
  inline def iterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Unit, 
    Unit
  ]]
  inline def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Unit, 
    Unit
  ]]
  inline def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  
  /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>} & {  sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>}} */
  object stream {
    
    inline def apply(pattern: String): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def apply(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def apply(pattern: js.Array[String]): Minipass[String, String, Events[String]] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def apply(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    
    @JSImport("glob", "stream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("glob", "stream.sync")
    @js.native
    def sync: FnCall = js.native
    inline def sync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def sync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def sync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def sync_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
  }
  
  inline def streamSync(pattern: String, options: GlobOptions): Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ]]
  inline def streamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def streamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]]
  inline def streamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def streamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
    Events[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
    ]
  ]]
  inline def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  inline def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
    Events[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ]
  ]]
  inline def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamSync")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
  
  /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> | std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Array<string>} & {  stream :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>},   iterate :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>}} */
  object sync {
    
    inline def apply(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def apply(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ]]
    inline def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def apply(pattern: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def apply(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ]]
    inline def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @JSImport("glob", "sync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("glob", "sync.iterate")
    @js.native
    def iterate: FnCallPatternOptions = js.native
    inline def iterate(pattern: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterate(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterate(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterate(pattern: js.Array[String]): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterate(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ]]
    inline def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
    inline def iterate_=(x: FnCallPatternOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterate")(x.asInstanceOf[js.Any])
    
    @JSImport("glob", "sync.stream")
    @js.native
    def stream: FnCall = js.native
    inline def stream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def stream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def stream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ]]
    inline def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ]]
    inline def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Minipass[String, String, Events[String]]]
    inline def stream_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  }
  
  inline def unescape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unescape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
}
