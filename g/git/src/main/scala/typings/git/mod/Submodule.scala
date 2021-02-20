package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("git", "Submodule.config")
  @js.native
  def config(repo: js.Any, ref: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "Submodule.create")
  @js.native
  def create(repo: js.Any, attributes: js.Any, callback: js.Function): Unit = js.native
}
