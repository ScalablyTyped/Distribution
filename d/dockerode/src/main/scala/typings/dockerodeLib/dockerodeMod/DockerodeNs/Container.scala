package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def attach(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  def attach(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadWriteStream]): scala.Unit = js.native
  def changes(): js.Promise[_] = js.native
  def changes(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def commit(): js.Promise[_] = js.native
  def commit(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def commit(options: js.Object): js.Promise[_] = js.native
  def commit(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(): js.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object): js.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def exec(options: js.Object): js.Promise[_] = js.native
  def exec(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def export(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def export(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getArchive(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getArchive(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def infoArchive(options: js.Object): js.Promise[_] = js.native
  def infoArchive(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def inspect(): js.Promise[ContainerInspectInfo] = js.native
  def inspect(callback: dockerodeLib.Callback[ContainerInspectInfo]): scala.Unit = js.native
  def inspect(options: js.Object): js.Promise[ContainerInspectInfo] = js.native
  def inspect(options: js.Object, callback: dockerodeLib.Callback[ContainerInspectInfo]): scala.Unit = js.native
  def kill(): js.Promise[_] = js.native
  def kill(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def kill(options: js.Object): js.Promise[_] = js.native
  def kill(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def logs(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def logs(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def logs(options: ContainerLogsOptions): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def logs(options: ContainerLogsOptions, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def pause(): js.Promise[_] = js.native
  def pause(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def pause(options: js.Object): js.Promise[_] = js.native
  def pause(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def putArchive(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(
    file: java.lang.String,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def putArchive(file: nodeLib.Buffer, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(
    file: nodeLib.Buffer,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def putArchive(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def rename(options: js.Object): js.Promise[_] = js.native
  def rename(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def resize(): js.Promise[_] = js.native
  def resize(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def resize(options: js.Object): js.Promise[_] = js.native
  def resize(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def restart(): js.Promise[_] = js.native
  def restart(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def restart(options: js.Object): js.Promise[_] = js.native
  def restart(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def start(): js.Promise[_] = js.native
  def start(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def start(options: js.Object): js.Promise[_] = js.native
  def start(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def stats(): js.Promise[ContainerStats] = js.native
  def stats(callback: dockerodeLib.Callback[ContainerStats]): scala.Unit = js.native
  def stats(options: js.Object): js.Promise[ContainerStats] = js.native
  def stats(options: js.Object, callback: dockerodeLib.Callback[ContainerStats]): scala.Unit = js.native
  def stop(): js.Promise[_] = js.native
  def stop(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def stop(options: js.Object): js.Promise[_] = js.native
  def stop(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def top(): js.Promise[_] = js.native
  def top(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def top(options: js.Object): js.Promise[_] = js.native
  def top(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def unpause(): js.Promise[_] = js.native
  def unpause(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def unpause(options: js.Object): js.Promise[_] = js.native
  def unpause(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def update(options: js.Object): js.Promise[_] = js.native
  def update(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def wait(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

