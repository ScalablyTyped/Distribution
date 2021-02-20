package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Blob")
@js.native
class Blob protected () extends StObject {
  def this(repo: js.Any, id: js.Any, mode: js.Any, name: js.Any) = this()
  
  var basename: js.Any = js.native
  
  var data: js.Any = js.native
  
  var id: js.Any = js.native
  
  var mine_type: js.Any = js.native
  
  var mode: js.Any = js.native
  
  var name: js.Any = js.native
  
  var repo: Repo = js.native
  
  var size: js.Any = js.native
}
/* static members */
object Blob {
  
  @JSImport("git", "Blob.blame")
  @js.native
  def blame(repo: js.Any, commit: js.Any, file: js.Any, callback: js.Function): Unit = js.native
}
