package typings.gitParse

import typings.gitParse.gitCommitTypeMod.GitCommit
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseGitLogMod {
  
  @JSImport("git-parse/dist/parse_git_log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(stream: ReadableStream[Any]): js.Promise[js.Array[GitCommit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GitCommit]]]
}
