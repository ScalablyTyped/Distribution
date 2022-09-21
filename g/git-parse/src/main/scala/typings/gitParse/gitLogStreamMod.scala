package typings.gitParse

import typings.gitParse.anon.AddErrorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitLogStreamMod {
  
  @JSImport("git-parse/dist/git_log_stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pathToRepo: String): AddErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any]).asInstanceOf[AddErrorHandler]
  inline def default(pathToRepo: String, options: GitLogStreamOptions): AddErrorHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AddErrorHandler]
  
  type GitLogStreamErrorHandler = js.Function1[/* error */ js.Error, Unit]
  
  trait GitLogStreamOptions extends StObject {
    
    var sinceCommit: js.UndefOr[String] = js.undefined
  }
  object GitLogStreamOptions {
    
    inline def apply(): GitLogStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitLogStreamOptions]
    }
    
    extension [Self <: GitLogStreamOptions](x: Self) {
      
      inline def setSinceCommit(value: String): Self = StObject.set(x, "sinceCommit", value.asInstanceOf[js.Any])
      
      inline def setSinceCommitUndefined: Self = StObject.set(x, "sinceCommit", js.undefined)
    }
  }
}
