package typings.dockerode.mod

import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Exec")
@js.native
open class Exec protected () extends StObject {
  def this(modem: Any, id: String) = this()
  
  var id: String = js.native
  
  def inspect(): js.Promise[ExecInspectInfo] = js.native
  def inspect(callback: Callback[ExecInspectInfo]): Unit = js.native
  def inspect(options: ExecInspectOptions): js.Promise[ExecInspectInfo] = js.native
  def inspect(options: ExecInspectOptions, callback: Callback[ExecInspectInfo]): Unit = js.native
  
  var modem: Any = js.native
  
  def resize(options: js.Object): js.Promise[Any] = js.native
  def resize(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def start(options: ExecStartOptions): js.Promise[Duplex] = js.native
  def start(options: ExecStartOptions, callback: Callback[Duplex]): Unit = js.native
}
