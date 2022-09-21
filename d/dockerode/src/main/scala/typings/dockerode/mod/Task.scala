package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Task")
@js.native
open class Task protected () extends StObject {
  def this(modem: Any, id: String) = this()
  
  var id: String = js.native
  
  def inspect(): js.Promise[Any] = js.native
  def inspect(callback: Callback[Any]): Unit = js.native
  def inspect(options: js.Object): js.Promise[Any] = js.native
  def inspect(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  var modem: Any = js.native
}
