package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Plugin")
@js.native
class Plugin protected () extends js.Object {
  def this(modem: js.Any, name: java.lang.String) = this()
  def this(modem: js.Any, name: java.lang.String, remote: js.Any) = this()
  var modem: js.Any = js.native
  var name: java.lang.String = js.native
  var remote: js.Any = js.native
  def configure(): js.Promise[_] = js.native
  def configure(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def configure(options: js.Object): js.Promise[_] = js.native
  def configure(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def disable(): js.Promise[_] = js.native
  def disable(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def disable(options: js.Object): js.Promise[_] = js.native
  def disable(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def enable(): js.Promise[_] = js.native
  def enable(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def enable(options: js.Object): js.Promise[_] = js.native
  def enable(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def inspect(): js.Promise[PluginInspectInfo] = js.native
  def inspect(callback: dockerodeLib.Callback[PluginInspectInfo]): scala.Unit = js.native
  def privileges(): js.Promise[_] = js.native
  def privileges(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def pull(options: js.Object): js.Promise[_] = js.native
  def pull(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def push(): js.Promise[_] = js.native
  def push(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def push(options: js.Object): js.Promise[_] = js.native
  def push(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def upgrade(auth: js.Any): js.Promise[_] = js.native
  def upgrade(auth: js.Any, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def upgrade(auth: js.Any, options: js.Object): js.Promise[_] = js.native
  def upgrade(auth: js.Any, options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

