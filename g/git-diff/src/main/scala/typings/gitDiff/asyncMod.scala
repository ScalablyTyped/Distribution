package typings.gitDiff

import typings.gitDiff.mod.GitDiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  /**
    * Asynchronously compare and generate the git diff of two strings if
    * they're different
    * @param oldString Old string to diff
    * @param newString New string to diff
    * @param options Optional git-diff options
    */
  inline def apply(oldString: String, newString: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].apply(oldString.asInstanceOf[js.Any], newString.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def apply(oldString: String, newString: String, options: GitDiffOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].apply(oldString.asInstanceOf[js.Any], newString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @JSImport("git-diff/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
