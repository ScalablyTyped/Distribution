package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.native
  var modem: js.Any = js.native
  def attach(options: js.Object): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def attach(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def changes(): stdLib.Promise[_] = js.native
  def changes(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def commit(): stdLib.Promise[_] = js.native
  def commit(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def commit(options: js.Object): stdLib.Promise[_] = js.native
  def commit(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(): stdLib.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object): stdLib.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def exec(options: js.Object): stdLib.Promise[_] = js.native
  def exec(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def export(): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def export(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getArchive(options: js.Object): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getArchive(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def infoArchive(options: js.Object): stdLib.Promise[_] = js.native
  def infoArchive(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def inspect(): stdLib.Promise[ContainerInspectInfo] = js.native
  def inspect(callback: dockerodeLib.Callback[ContainerInspectInfo]): scala.Unit = js.native
  def inspect(options: js.Object): stdLib.Promise[ContainerInspectInfo] = js.native
  def inspect(options: js.Object, callback: dockerodeLib.Callback[ContainerInspectInfo]): scala.Unit = js.native
  def kill(): stdLib.Promise[_] = js.native
  def kill(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def kill(options: js.Object): stdLib.Promise[_] = js.native
  def kill(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def logs(): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def logs(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def logs(options: ContainerLogsOptions): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def logs(options: ContainerLogsOptions, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def pause(): stdLib.Promise[_] = js.native
  def pause(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def pause(options: js.Object): stdLib.Promise[_] = js.native
  def pause(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def putArchive(file: java.lang.String, options: js.Object): stdLib.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(
    file: java.lang.String,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def putArchive(file: nodeLib.Buffer, options: js.Object): stdLib.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(
    file: nodeLib.Buffer,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def putArchive(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): stdLib.Promise[nodeLib.NodeJSNs.ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.WritableStream]
  ): scala.Unit = js.native
  def remove(): stdLib.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): stdLib.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def rename(options: js.Object): stdLib.Promise[_] = js.native
  def rename(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def resize(): stdLib.Promise[_] = js.native
  def resize(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def resize(options: js.Object): stdLib.Promise[_] = js.native
  def resize(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def restart(): stdLib.Promise[_] = js.native
  def restart(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def restart(options: js.Object): stdLib.Promise[_] = js.native
  def restart(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def start(): stdLib.Promise[_] = js.native
  def start(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def start(options: js.Object): stdLib.Promise[_] = js.native
  def start(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def stats(): stdLib.Promise[_] = js.native
  def stats(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def stats(options: js.Object): stdLib.Promise[_] = js.native
  def stats(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def stop(): stdLib.Promise[_] = js.native
  def stop(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def stop(options: js.Object): stdLib.Promise[_] = js.native
  def stop(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def top(): stdLib.Promise[_] = js.native
  def top(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def top(options: js.Object): stdLib.Promise[_] = js.native
  def top(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def unpause(): stdLib.Promise[_] = js.native
  def unpause(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def unpause(options: js.Object): stdLib.Promise[_] = js.native
  def unpause(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def update(options: js.Object): stdLib.Promise[_] = js.native
  def update(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def wait(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

