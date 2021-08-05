package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Submodule")
@js.native
class Submodule protected () extends StObject {
  def this(repo: js.Any, id: js.Any, mode: js.Any, name: js.Any) = this()
  
  var basename: js.Any = js.native
  
  var id: js.Any = js.native
  
  var mode: js.Any = js.native
  
  var name: js.Any = js.native
  
  var repo: js.Any = js.native
}
/* static members */
object Submodule {
  
  @JSImport("git", "Submodule")
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(repo: js.Any, ref: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(repo.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(repo: js.Any, attributes: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
