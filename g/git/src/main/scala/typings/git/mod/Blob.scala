package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Blob")
@js.native
open class Blob protected () extends StObject {
  def this(repo: Any, id: Any, mode: Any, name: Any) = this()
  
  var basename: Any = js.native
  
  var data: Any = js.native
  
  var id: Any = js.native
  
  var mine_type: Any = js.native
  
  var mode: Any = js.native
  
  var name: Any = js.native
  
  var repo: Repo = js.native
  
  var size: Any = js.native
}
/* static members */
object Blob {
  
  @JSImport("git", "Blob")
  @js.native
  val ^ : js.Any = js.native
  
  inline def blame(repo: Any, commit: Any, file: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blame")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
