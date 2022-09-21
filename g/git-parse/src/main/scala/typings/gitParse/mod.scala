package typings.gitParse

import typings.gitParse.anon.Stderr
import typings.gitParse.checkoutCommitMod.CheckoutCommmitOptions
import typings.gitParse.gitCommitTypeMod.GitCommit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-parse/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkoutCommit(pathToRepo: String, hash: String): js.Promise[Stderr] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkoutCommit")(pathToRepo.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stderr]]
  inline def checkoutCommit(pathToRepo: String, hash: String, options: CheckoutCommmitOptions): js.Promise[Stderr] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkoutCommit")(pathToRepo.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stderr]]
  
  inline def gitDiff(pathToRepo: Any, commit1: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def gitDiff(pathToRepo: Any, commit1: Any, commit2: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any], commit2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def gitDiff(pathToRepo: Any, commit1: Any, commit2: String, file: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any], commit2.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def gitDiff(pathToRepo: Any, commit1: Any, commit2: Unit, file: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any], commit2.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def gitPull(pathToRepo: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("gitPull")(pathToRepo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
  
  inline def gitToJs(repoPath: String): js.Promise[js.Array[GitCommit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gitToJs")(repoPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GitCommit]]]
  inline def gitToJs(repoPath: String, options: GitToJsOptions): js.Promise[js.Array[GitCommit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitToJs")(repoPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[GitCommit]]]
  
  trait GitToJsOptions extends StObject {
    
    var sinceCommit: js.UndefOr[String] = js.undefined
  }
  object GitToJsOptions {
    
    inline def apply(): GitToJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitToJsOptions]
    }
    
    extension [Self <: GitToJsOptions](x: Self) {
      
      inline def setSinceCommit(value: String): Self = StObject.set(x, "sinceCommit", value.asInstanceOf[js.Any])
      
      inline def setSinceCommitUndefined: Self = StObject.set(x, "sinceCommit", js.undefined)
    }
  }
}
