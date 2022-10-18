package typings.gitParse

import typings.gitParse.distTypesGitCommitTypeMod.GitCommit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseCommitMod {
  
  @JSImport("git-parse/dist/parse_commit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(commit: js.Array[String]): GitCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(commit.asInstanceOf[js.Any]).asInstanceOf[GitCommit]
}
