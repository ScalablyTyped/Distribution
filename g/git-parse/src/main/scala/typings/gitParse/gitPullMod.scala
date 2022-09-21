package typings.gitParse

import typings.gitParse.anon.Stderr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitPullMod {
  
  @JSImport("git-parse/dist/git_pull", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pathToRepo: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
}
