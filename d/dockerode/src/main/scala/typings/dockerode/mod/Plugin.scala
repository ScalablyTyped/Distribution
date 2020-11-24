package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Plugin")
@js.native
class Plugin protected () extends js.Object {
  def this(modem: js.Any, name: String) = this()
  def this(modem: js.Any, name: String, remote: js.Any) = this()
  
  def configure(): js.Promise[_] = js.native
  def configure(callback: Callback[_]): Unit = js.native
  def configure(options: js.Object): js.Promise[_] = js.native
  def configure(options: js.Object, callback: Callback[_]): Unit = js.native
  
  def disable(): js.Promise[_] = js.native
  def disable(callback: Callback[_]): Unit = js.native
  def disable(options: js.Object): js.Promise[_] = js.native
  def disable(options: js.Object, callback: Callback[_]): Unit = js.native
  
  def enable(): js.Promise[_] = js.native
  def enable(callback: Callback[_]): Unit = js.native
  def enable(options: js.Object): js.Promise[_] = js.native
  def enable(options: js.Object, callback: Callback[_]): Unit = js.native
  
  def inspect(): js.Promise[PluginInspectInfo] = js.native
  def inspect(callback: Callback[PluginInspectInfo]): Unit = js.native
  
  var modem: js.Any = js.native
  
  var name: String = js.native
  
  def privileges(): js.Promise[_] = js.native
  def privileges(callback: Callback[_]): Unit = js.native
  
  def pull(options: js.Object): js.Promise[_] = js.native
  def pull(options: js.Object, callback: Callback[_]): Unit = js.native
  
  def push(): js.Promise[_] = js.native
  def push(callback: Callback[_]): Unit = js.native
  def push(options: js.Object): js.Promise[_] = js.native
  def push(options: js.Object, callback: Callback[_]): Unit = js.native
  
  var remote: js.Any = js.native
  
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): Unit = js.native
  
  def upgrade(auth: js.Any): js.Promise[_] = js.native
  def upgrade(auth: js.Any, callback: Callback[_]): Unit = js.native
  def upgrade(auth: js.Any, options: js.Object): js.Promise[_] = js.native
  def upgrade(auth: js.Any, options: js.Object, callback: Callback[_]): Unit = js.native
}
