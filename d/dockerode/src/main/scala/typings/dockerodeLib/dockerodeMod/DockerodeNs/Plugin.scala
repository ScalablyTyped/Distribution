package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var modem: js.Any = js.native
  var name: java.lang.String = js.native
  var remote: js.Any = js.native
  def configure(): stdLib.Promise[_] = js.native
  def configure(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def configure(options: js.Object): stdLib.Promise[_] = js.native
  def configure(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def disable(): stdLib.Promise[_] = js.native
  def disable(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def disable(options: js.Object): stdLib.Promise[_] = js.native
  def disable(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def enable(): stdLib.Promise[_] = js.native
  def enable(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def enable(options: js.Object): stdLib.Promise[_] = js.native
  def enable(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def inspect(): stdLib.Promise[PluginInspectInfo] = js.native
  def inspect(callback: dockerodeLib.Callback[PluginInspectInfo]): scala.Unit = js.native
  def privileges(): stdLib.Promise[_] = js.native
  def privileges(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def pull(options: js.Object): stdLib.Promise[_] = js.native
  def pull(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def push(): stdLib.Promise[_] = js.native
  def push(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def push(options: js.Object): stdLib.Promise[_] = js.native
  def push(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(): stdLib.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): stdLib.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def upgrade(auth: js.Any): stdLib.Promise[_] = js.native
  def upgrade(auth: js.Any, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def upgrade(auth: js.Any, options: js.Object): stdLib.Promise[_] = js.native
  def upgrade(auth: js.Any, options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

