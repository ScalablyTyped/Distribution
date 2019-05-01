package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Container")
@js.native
class Container protected () extends js.Object {
  def this(modem: js.Any, id: java.lang.String) = this()
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def attach(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def attach(options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadWriteStream]): scala.Unit = js.native
  def changes(): js.Promise[_] = js.native
  def changes(callback: Callback[_]): scala.Unit = js.native
  def commit(): js.Promise[_] = js.native
  def commit(callback: Callback[_]): scala.Unit = js.native
  def commit(options: js.Object): js.Promise[_] = js.native
  def commit(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(): js.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(callback: Callback[_]): scala.Unit = js.native
  def copy(options: js.Object): js.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def exec(options: js.Object): js.Promise[_] = js.native
  def exec(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def export(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def export(callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getArchive(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getArchive(options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def infoArchive(options: js.Object): js.Promise[_] = js.native
  def infoArchive(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def inspect(): js.Promise[ContainerInspectInfo] = js.native
  def inspect(callback: Callback[ContainerInspectInfo]): scala.Unit = js.native
  def inspect(options: js.Object): js.Promise[ContainerInspectInfo] = js.native
  def inspect(options: js.Object, callback: Callback[ContainerInspectInfo]): scala.Unit = js.native
  def kill(): js.Promise[_] = js.native
  def kill(callback: Callback[_]): scala.Unit = js.native
  def kill(options: js.Object): js.Promise[_] = js.native
  def kill(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def logs(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def logs(callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def logs(options: ContainerLogsOptions): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def logs(options: ContainerLogsOptions, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def pause(): js.Promise[_] = js.native
  def pause(callback: Callback[_]): scala.Unit = js.native
  def pause(options: js.Object): js.Promise[_] = js.native
  def pause(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def putArchive(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(file: java.lang.String, options: js.Object, callback: Callback[nodeLib.NodeJSNs.WritableStream]): scala.Unit = js.native
  def putArchive(file: nodeLib.Buffer, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def putArchive(file: nodeLib.Buffer, options: js.Object, callback: Callback[nodeLib.NodeJSNs.WritableStream]): scala.Unit = js.native
  def putArchive(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def putArchive(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def rename(options: js.Object): js.Promise[_] = js.native
  def rename(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def resize(): js.Promise[_] = js.native
  def resize(callback: Callback[_]): scala.Unit = js.native
  def resize(options: js.Object): js.Promise[_] = js.native
  def resize(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def restart(): js.Promise[_] = js.native
  def restart(callback: Callback[_]): scala.Unit = js.native
  def restart(options: js.Object): js.Promise[_] = js.native
  def restart(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def start(): js.Promise[_] = js.native
  def start(callback: Callback[_]): scala.Unit = js.native
  def start(options: js.Object): js.Promise[_] = js.native
  def start(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def stats(): js.Promise[ContainerStats] = js.native
  def stats(callback: Callback[ContainerStats]): scala.Unit = js.native
  def stats(options: js.Object): js.Promise[ContainerStats] = js.native
  def stats(options: js.Object, callback: Callback[ContainerStats]): scala.Unit = js.native
  def stop(): js.Promise[_] = js.native
  def stop(callback: Callback[_]): scala.Unit = js.native
  def stop(options: js.Object): js.Promise[_] = js.native
  def stop(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def top(): js.Promise[_] = js.native
  def top(callback: Callback[_]): scala.Unit = js.native
  def top(options: js.Object): js.Promise[_] = js.native
  def top(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def unpause(): js.Promise[_] = js.native
  def unpause(callback: Callback[_]): scala.Unit = js.native
  def unpause(options: js.Object): js.Promise[_] = js.native
  def unpause(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def update(options: js.Object): js.Promise[_] = js.native
  def update(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def wait(callback: Callback[_]): scala.Unit = js.native
}

