package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Task")
@js.native
class Task protected () extends StObject {
  def this(modem: js.Any, id: String) = this()
  
  var id: String = js.native
  
  def inspect(): js.Promise[js.Any] = js.native
  def inspect(callback: Callback[js.Any]): Unit = js.native
  
  var modem: js.Any = js.native
}
