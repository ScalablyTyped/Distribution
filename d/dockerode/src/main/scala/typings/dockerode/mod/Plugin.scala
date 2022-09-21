package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Plugin")
@js.native
open class Plugin protected () extends StObject {
  def this(modem: Any, name: String) = this()
  def this(modem: Any, name: String, remote: Any) = this()
  
  def configure(): js.Promise[Any] = js.native
  def configure(callback: Callback[Any]): Unit = js.native
  def configure(options: js.Object): js.Promise[Any] = js.native
  def configure(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def disable(): js.Promise[Any] = js.native
  def disable(callback: Callback[Any]): Unit = js.native
  def disable(options: js.Object): js.Promise[Any] = js.native
  def disable(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def enable(): js.Promise[Any] = js.native
  def enable(callback: Callback[Any]): Unit = js.native
  def enable(options: js.Object): js.Promise[Any] = js.native
  def enable(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def inspect(): js.Promise[PluginInspectInfo] = js.native
  def inspect(callback: Callback[PluginInspectInfo]): Unit = js.native
  def inspect(options: js.Object): js.Promise[PluginInspectInfo] = js.native
  def inspect(options: js.Object, callback: Callback[PluginInspectInfo]): Unit = js.native
  
  var modem: Any = js.native
  
  var name: String = js.native
  
  def privileges(): js.Promise[Any] = js.native
  def privileges(callback: Callback[Any]): Unit = js.native
  def privileges(options: js.Object): js.Promise[Any] = js.native
  def privileges(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def pull(options: js.Object): js.Promise[Any] = js.native
  def pull(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def push(): js.Promise[Any] = js.native
  def push(callback: Callback[Any]): Unit = js.native
  def push(options: js.Object): js.Promise[Any] = js.native
  def push(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  var remote: Any = js.native
  
  def remove(): js.Promise[Any] = js.native
  def remove(callback: Callback[Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[Any] = js.native
  def remove(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def upgrade(auth: Any): js.Promise[Any] = js.native
  def upgrade(auth: Any, callback: Callback[Any]): Unit = js.native
  def upgrade(auth: Any, options: js.Object): js.Promise[Any] = js.native
  def upgrade(auth: Any, options: js.Object, callback: Callback[Any]): Unit = js.native
}
