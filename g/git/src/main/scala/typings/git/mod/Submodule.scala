package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Submodule")
@js.native
open class Submodule protected () extends StObject {
  def this(repo: Any, id: Any, mode: Any, name: Any) = this()
  
  var basename: Any = js.native
  
  var id: Any = js.native
  
  var mode: Any = js.native
  
  var name: Any = js.native
  
  var repo: Any = js.native
}
/* static members */
object Submodule {
  
  @JSImport("git", "Submodule")
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(repo: Any, ref: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(repo.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(repo: Any, attributes: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
