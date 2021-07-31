package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Plugin")
@js.native
class Plugin protected () extends StObject {
  def this(modem: js.Any, name: String) = this()
  def this(modem: js.Any, name: String, remote: js.Any) = this()
  
  def configure(): js.Promise[js.Any] = js.native
  def configure(callback: Callback[js.Any]): Unit = js.native
  def configure(options: js.Object): js.Promise[js.Any] = js.native
  def configure(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def disable(): js.Promise[js.Any] = js.native
  def disable(callback: Callback[js.Any]): Unit = js.native
  def disable(options: js.Object): js.Promise[js.Any] = js.native
  def disable(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def enable(): js.Promise[js.Any] = js.native
  def enable(callback: Callback[js.Any]): Unit = js.native
  def enable(options: js.Object): js.Promise[js.Any] = js.native
  def enable(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def inspect(): js.Promise[PluginInspectInfo] = js.native
  def inspect(callback: Callback[PluginInspectInfo]): Unit = js.native
  
  var modem: js.Any = js.native
  
  var name: String = js.native
  
  def privileges(): js.Promise[js.Any] = js.native
  def privileges(callback: Callback[js.Any]): Unit = js.native
  
  def pull(options: js.Object): js.Promise[js.Any] = js.native
  def pull(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def push(): js.Promise[js.Any] = js.native
  def push(callback: Callback[js.Any]): Unit = js.native
  def push(options: js.Object): js.Promise[js.Any] = js.native
  def push(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  var remote: js.Any = js.native
  
  def remove(): js.Promise[js.Any] = js.native
  def remove(callback: Callback[js.Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[js.Any] = js.native
  def remove(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def upgrade(auth: js.Any): js.Promise[js.Any] = js.native
  def upgrade(auth: js.Any, callback: Callback[js.Any]): Unit = js.native
  def upgrade(auth: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  def upgrade(auth: js.Any, options: js.Object, callback: Callback[js.Any]): Unit = js.native
}
