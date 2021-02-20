package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "CommitStats")
@js.native
class CommitStats protected () extends StObject {
  def this(repo: js.Any, id: js.Any, files: js.Array[_]) = this()
  
  var additions: js.Any = js.native
  
  var deletions: js.Any = js.native
  
  var files: js.Array[_] = js.native
  
  var id: js.Any = js.native
  
  var repo: js.Any = js.native
  
  var total: js.Any = js.native
}
/* static members */
object CommitStats {
  
  @JSImport("git", "CommitStats.find_all")
  @js.native
  def find_all(repo: js.Any, reference: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "CommitStats.find_all")
  @js.native
  def find_all(repo: js.Any, reference: js.Any, options: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "CommitStats.list_from_string")
  @js.native
  def list_from_string(repo: js.Any, text: String): js.Array[CommitStats] = js.native
}
