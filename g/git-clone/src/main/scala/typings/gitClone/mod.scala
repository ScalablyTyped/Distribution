package typings.gitClone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(repo: String): Unit = ^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(repo: String, opts: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(repo: String, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(repo: String, opts: Options, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(repo: String, targetPath: String): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    repo: String,
    targetPath: String,
    opts: Unit,
    cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(repo: String, targetPath: String, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    repo: String,
    targetPath: String,
    opts: Options,
    cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Revision/branch/tag to check out.
      */
    var checkout: js.UndefOr[String] = js.undefined
    
    /**
      * Path to git binary; defaults to `git`.
      */
    var git: js.UndefOr[String] = js.undefined
    
    /**
      * When `true`, clone with depth 1.
      */
    var shallow: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCheckout(value: String): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
      
      inline def setCheckoutUndefined: Self = StObject.set(x, "checkout", js.undefined)
      
      inline def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
}
