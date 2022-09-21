package typings.gitClone

import typings.gitClone.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  inline def apply(repo: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(repo: String, opts: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Clone `repo` to `targetPath` asynchronously.
    */
  inline def apply(repo: String, targetPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(repo: String, targetPath: String, opts: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(repo.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("git-clone/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
