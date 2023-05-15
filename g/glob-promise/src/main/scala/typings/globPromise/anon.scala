package typings.globPromise

import org.scalablytyped.runtime.Instantiable2
import typings.glob.anon.Fn0
import typings.glob.anon.Fn1
import typings.glob.anon.Fn2
import typings.glob.anon.Fn3
import typings.glob.anon.FnCallPatternOptions
import typings.glob.anon.NonepatternstringArraystr
import typings.glob.anon.NonepatternstringArraystrCall
import typings.glob.anon.NonepatternstringArraystrSync
import typings.glob.anon.PickMinimatchOptionswindo
import typings.glob.distMjsGlobMod.GlobOptions
import typings.glob.distMjsGlobMod.GlobOptionsWithFileTypesFalse
import typings.glob.distMjsGlobMod.GlobOptionsWithFileTypesTrue
import typings.glob.distMjsGlobMod.GlobOptionsWithFileTypesUnset
import typings.glob.mod.Glob_
import typings.minipass.mod.Minipass
import typings.minipass.mod.Minipass.Events
import typings.std.AsyncGenerator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(pattern: String): Boolean = js.native
    def apply(pattern: String, options: GlobOptions): Boolean = js.native
    def apply(pattern: js.Array[String]): Boolean = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): Boolean = js.native
  }
  
  @js.native
  trait Typeof extends StObject {
    
    def apply(pattern: String): js.Promise[js.Array[String]] = js.native
    def apply(pattern: String, options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = js.native
    def apply(pattern: js.Array[String]): js.Promise[js.Array[String]] = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = js.native
    
    var Glob: Instantiable2[
        /* pattern */ String | js.Array[String], 
        /* import warning: RewrittenClass.unapply cls was tparam Opts */ /* opts */ Any, 
        typings.glob.distMjsGlobMod.Glob[GlobOptions]
      ] = js.native
    
    def escape(s: String): String = js.native
    def escape(s: String, param1: PickMinimatchOptionswindo): String = js.native
    
    def glob(pattern: String): js.Promise[js.Array[String]] = js.native
    def glob(pattern: String, options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def glob(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def glob(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def glob(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = js.native
    def glob(pattern: js.Array[String]): js.Promise[js.Array[String]] = js.native
    def glob(pattern: js.Array[String], options: GlobOptions): js.Promise[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def glob(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def glob(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def glob(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Promise[js.Array[String]] = js.native
    
    def globIterate(pattern: String): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    
    def globIterateSync(pattern: String): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    @JSName("globIterateSync")
    var globIterateSync_Original: FnCallPatternOptions = js.native
    
    @JSName("globIterate")
    var globIterate_Original: Fn3 = js.native
    
    def globStream(pattern: String): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: js.Array[String]): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    
    def globStreamSync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    @JSName("globStreamSync")
    var globStreamSync_Original: typings.glob.anon.FnCall = js.native
    
    @JSName("globStream")
    var globStream_Original: Fn2 = js.native
    
    def globSync(pattern: String): js.Array[String] = js.native
    def globSync(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def globSync(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def globSync(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def globSync(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    def globSync(pattern: js.Array[String]): js.Array[String] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    @JSName("globSync")
    var globSync_Original: Fn1 = js.native
    
    @JSName("glob")
    var glob_Original: Fn0 = js.native
    
    def hasMagic(pattern: String): Boolean = js.native
    def hasMagic(pattern: String, options: GlobOptions): Boolean = js.native
    def hasMagic(pattern: js.Array[String]): Boolean = js.native
    def hasMagic(pattern: js.Array[String], options: GlobOptions): Boolean = js.native
    
    def iterate(pattern: String): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    
    def iterateSync(pattern: String): Generator[String, Unit, Unit] = js.native
    def iterateSync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def iterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def iterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    def iterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = js.native
    def iterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def iterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    @JSName("iterateSync")
    var iterateSync_Original: FnCallPatternOptions = js.native
    
    @JSName("iterate")
    var iterate_Original: NonepatternstringArraystrSync = js.native
    
    def stream(pattern: String): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def stream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def stream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: js.Array[String]): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    
    def streamSync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def streamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def streamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def streamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def streamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def streamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    @JSName("streamSync")
    var streamSync_Original: typings.glob.anon.FnCall = js.native
    
    @JSName("stream")
    var stream_Original: NonepatternstringArraystrCall = js.native
    
    def sync(pattern: String): js.Array[String] = js.native
    def sync(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    def sync(pattern: js.Array[String]): js.Array[String] = js.native
    def sync(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    @JSName("sync")
    var sync_Original: NonepatternstringArraystr = js.native
    
    def unescape(s: String): String = js.native
    def unescape(s: String, param1: PickMinimatchOptionswindo): String = js.native
  }
  
  @js.native
  trait Typeofglob
    extends StObject
       with Typeof
  
  @js.native
  trait TypeofglobEscape extends StObject {
    
    var Glob: Instantiable2[
        /* pattern */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam Opts */ /* opts */ Any, 
        Glob_[GlobOptions]
      ] = js.native
    
    def escape(s: String): String = js.native
    def escape(s: String, param1: typings.minimatch.anon.PickMinimatchOptionswindo): String = js.native
    
    val glob: Typeofglob = js.native
    
    def globIterate(pattern: String): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    
    def globIterateSync(pattern: String): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: js.Array[String]): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def globIterateSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    
    def globStream(pattern: String): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: js.Array[String]): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    
    def globStreamSync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStreamSync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def globStreamSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    
    def globSync(pattern: String): js.Array[String] = js.native
    def globSync(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def globSync(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def globSync(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def globSync(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    def globSync(pattern: js.Array[String]): js.Array[String] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def globSync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    
    def hasMagic(pattern: String): Boolean = js.native
    def hasMagic(pattern: String, options: GlobOptions): Boolean = js.native
    def hasMagic(pattern: js.Array[String]): Boolean = js.native
    def hasMagic(pattern: js.Array[String], options: GlobOptions): Boolean = js.native
    
    /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.AsyncGenerator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.AsyncGenerator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.AsyncGenerator<string, void, void>} & {  sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>}} */
    val iterate: Typeofiterate = js.native
    
    val iterateSync: TypeofiterateSync = js.native
    
    /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>} & {  sync :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>}} */
    val stream: Typeofstream = js.native
    
    val streamSync: TypeofstreamSync = js.native
    
    /* Inlined {None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any> | std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Array<string>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Array<string>} & {  stream :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>> | minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): minipass.minipass.Minipass<string, string, minipass.minipass.Minipass.Events<string>>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): minipass.minipass.Minipass</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, minipass.minipass.Minipass.Events</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any>>},   iterate :{None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptions): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void> | std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesFalse): std.Generator<string, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesTrue): std.Generator</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path * / any, void, void>, None (pattern : string | std.Array<string>, options : glob.glob/dist/mjs/glob.GlobOptionsWithFileTypesUnset | undefined): std.Generator<string, void, void>}} */
    val sync: Typeofsync = js.native
    
    def unescape(s: String): String = js.native
    def unescape(s: String, param1: typings.minimatch.anon.PickMinimatchOptionswindo): String = js.native
  }
  
  @js.native
  trait Typeofiterate extends StObject {
    
    def apply(pattern: String): AsyncGenerator[String, Unit, Unit] = js.native
    def apply(pattern: String, options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    def apply(pattern: js.Array[String]): AsyncGenerator[String, Unit, Unit] = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): AsyncGenerator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): AsyncGenerator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): AsyncGenerator[String, Unit, Unit] = js.native
    
    def sync(pattern: String): Generator[String, Unit, Unit] = js.native
    def sync(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    def sync(pattern: js.Array[String]): Generator[String, Unit, Unit] = js.native
    def sync(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    @JSName("sync")
    var sync_Original: FnCallPatternOptions = js.native
  }
  
  @js.native
  trait TypeofiterateSync extends StObject {
    
    def apply(pattern: String): Generator[String, Unit, Unit] = js.native
    def apply(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    def apply(pattern: js.Array[String]): Generator[String, Unit, Unit] = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
  }
  
  @js.native
  trait Typeofstream extends StObject {
    
    def apply(pattern: String): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: js.Array[String]): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    
    def sync(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def sync(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def sync(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def sync(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    @JSName("sync")
    var sync_Original: typings.glob.anon.FnCall = js.native
  }
  
  @js.native
  trait TypeofstreamSync extends StObject {
    
    def apply(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
  }
  
  @js.native
  trait Typeofsync extends StObject {
    
    def apply(pattern: String): js.Array[String] = js.native
    def apply(pattern: String, options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def apply(pattern: String, options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    def apply(pattern: js.Array[String]): js.Array[String] = js.native
    def apply(pattern: js.Array[String], options: GlobOptions): js.Array[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): js.Array[String] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
      ] = js.native
    def apply(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): js.Array[String] = js.native
    
    def iterate(pattern: String): Generator[String, Unit, Unit] = js.native
    def iterate(pattern: String, options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: String, options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterate(pattern: String, options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: String, options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    def iterate(pattern: js.Array[String]): Generator[String, Unit, Unit] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptions): Generator[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Generator[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Unit, 
        Unit
      ] = js.native
    def iterate(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Generator[String, Unit, Unit] = js.native
    @JSName("iterate")
    var iterate_Original: FnCallPatternOptions = js.native
    
    def stream(pattern: String, options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def stream(pattern: String, options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: String, options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def stream(pattern: String, options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: js.Array[String], options: GlobOptions): Minipass[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String, 
        Events[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any) | String
        ]
      ] = js.native
    def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesFalse): Minipass[String, String, Events[String]] = js.native
    def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesTrue): Minipass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any, 
        Events[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
        ]
      ] = js.native
    def stream(pattern: js.Array[String], options: GlobOptionsWithFileTypesUnset): Minipass[String, String, Events[String]] = js.native
    @JSName("stream")
    var stream_Original: typings.glob.anon.FnCall = js.native
  }
}
