package typings.globPromise

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.glob.distMjsGlobMod.GlobOptions
import typings.glob.mod.Glob_
import typings.globPromise.anon.TypeofglobEscape
import typings.globPromise.anon.Typeofsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("glob-promise", JSImport.Namespace)
  @js.native
  val ^ : Export = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob-promise", "Glob")
  @js.native
  open class Glob[Opts /* <: GlobOptions */] protected () extends Glob_[Opts] {
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
  }
  
  @js.native
  trait Export extends GlobPromise {
    
    val Glob: Instantiable2[
        /* pattern */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam Opts */ /* opts */ Any, 
        Glob_[GlobOptions]
      ] = js.native
    
    val glob: TypeofglobEscape = js.native
    
    def hasMagic(pattern: String): Boolean = js.native
    def hasMagic(pattern: String, options: GlobOptions): Boolean = js.native
    def hasMagic(pattern: js.Array[String]): Boolean = js.native
    def hasMagic(pattern: js.Array[String], options: GlobOptions): Boolean = js.native
    
    def promise(pattern: String): js.Promise[js.Array[String]] = js.native
    def promise(
      pattern: String,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify glob.IOptions */ Any
    ): js.Promise[js.Array[String]] = js.native
    
    val sync: Typeofsync = js.native
  }
  
  type GlobPromise = js.Function2[
    /* pattern */ String, 
    /* options */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify glob.IOptions */ Any
    ], 
    js.Promise[js.Array[String]]
  ]
  
  type _To = Export
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Export = ^
}
