package typings.gitParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitDiffMod {
  
  @JSImport("git-parse/dist/git_diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pathToRepo: Any, commit1: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(pathToRepo: Any, commit1: Any, commit2: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any], commit2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(pathToRepo: Any, commit1: Any, commit2: String, file: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any], commit2.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(pathToRepo: Any, commit1: Any, commit2: Unit, file: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], commit1.asInstanceOf[js.Any], commit2.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
