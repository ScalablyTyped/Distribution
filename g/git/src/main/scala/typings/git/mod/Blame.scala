package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Blame")
@js.native
class Blame protected () extends StObject {
  def this(repo: Repo, file: String, callback: js.Function2[/* err */ js.Any, /* blame */ Blame, Unit]) = this()
  def this(
    repo: Repo,
    file: String,
    commit: String,
    callback: js.Function2[/* err */ js.Any, /* blame */ Blame, Unit]
  ) = this()
  
  var commit: String = js.native
  
  var file: String = js.native
  
  var lines: js.Array[BlameLine] = js.native
  
  var repo: Repo = js.native
}
