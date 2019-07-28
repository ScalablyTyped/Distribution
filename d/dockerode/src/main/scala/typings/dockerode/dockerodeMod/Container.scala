package typings.dockerode.dockerodeMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Container")
@js.native
class Container protected () extends js.Object {
  def this(modem: js.Any, id: String) = this()
  var id: String = js.native
  var modem: js.Any = js.native
  def attach(options: js.Object): js.Promise[ReadWriteStream] = js.native
  def attach(options: js.Object, callback: Callback[ReadWriteStream]): Unit = js.native
  def changes(): js.Promise[_] = js.native
  def changes(callback: Callback[_]): Unit = js.native
  def commit(): js.Promise[_] = js.native
  def commit(callback: Callback[_]): Unit = js.native
  def commit(options: js.Object): js.Promise[_] = js.native
  def commit(options: js.Object, callback: Callback[_]): Unit = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(): js.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(callback: Callback[_]): Unit = js.native
  def copy(options: js.Object): js.Promise[_] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object, callback: Callback[_]): Unit = js.native
  def exec(options: js.Object): js.Promise[_] = js.native
  def exec(options: js.Object, callback: Callback[_]): Unit = js.native
  def export(): js.Promise[ReadableStream] = js.native
  def export(callback: Callback[ReadableStream]): Unit = js.native
  def getArchive(options: js.Object): js.Promise[ReadableStream] = js.native
  def getArchive(options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  def infoArchive(options: js.Object): js.Promise[_] = js.native
  def infoArchive(options: js.Object, callback: Callback[_]): Unit = js.native
  def inspect(): js.Promise[ContainerInspectInfo] = js.native
  def inspect(callback: Callback[ContainerInspectInfo]): Unit = js.native
  def inspect(options: js.Object): js.Promise[ContainerInspectInfo] = js.native
  def inspect(options: js.Object, callback: Callback[ContainerInspectInfo]): Unit = js.native
  def kill(): js.Promise[_] = js.native
  def kill(callback: Callback[_]): Unit = js.native
  def kill(options: js.Object): js.Promise[_] = js.native
  def kill(options: js.Object, callback: Callback[_]): Unit = js.native
  def logs(): js.Promise[ReadableStream] = js.native
  def logs(callback: Callback[ReadableStream]): Unit = js.native
  def logs(options: ContainerLogsOptions): js.Promise[ReadableStream] = js.native
  def logs(options: ContainerLogsOptions, callback: Callback[ReadableStream]): Unit = js.native
  def pause(): js.Promise[_] = js.native
  def pause(callback: Callback[_]): Unit = js.native
  def pause(options: js.Object): js.Promise[_] = js.native
  def pause(options: js.Object, callback: Callback[_]): Unit = js.native
  def putArchive(file: String, options: js.Object): js.Promise[ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(file: String, options: js.Object, callback: Callback[WritableStream]): Unit = js.native
  def putArchive(file: Buffer, options: js.Object): js.Promise[ReadWriteStream] = js.native
  def putArchive(file: Buffer, options: js.Object, callback: Callback[WritableStream]): Unit = js.native
  def putArchive(file: ReadableStream, options: js.Object): js.Promise[ReadWriteStream] = js.native
  def putArchive(file: ReadableStream, options: js.Object, callback: Callback[WritableStream]): Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): Unit = js.native
  def rename(options: js.Object): js.Promise[_] = js.native
  def rename(options: js.Object, callback: Callback[_]): Unit = js.native
  def resize(): js.Promise[_] = js.native
  def resize(callback: Callback[_]): Unit = js.native
  def resize(options: js.Object): js.Promise[_] = js.native
  def resize(options: js.Object, callback: Callback[_]): Unit = js.native
  def restart(): js.Promise[_] = js.native
  def restart(callback: Callback[_]): Unit = js.native
  def restart(options: js.Object): js.Promise[_] = js.native
  def restart(options: js.Object, callback: Callback[_]): Unit = js.native
  def start(): js.Promise[_] = js.native
  def start(callback: Callback[_]): Unit = js.native
  def start(options: js.Object): js.Promise[_] = js.native
  def start(options: js.Object, callback: Callback[_]): Unit = js.native
  def stats(): js.Promise[ContainerStats] = js.native
  def stats(callback: Callback[ContainerStats]): Unit = js.native
  def stats(options: js.Object): js.Promise[ContainerStats] = js.native
  def stats(options: js.Object, callback: Callback[ContainerStats]): Unit = js.native
  def stop(): js.Promise[_] = js.native
  def stop(callback: Callback[_]): Unit = js.native
  def stop(options: js.Object): js.Promise[_] = js.native
  def stop(options: js.Object, callback: Callback[_]): Unit = js.native
  def top(): js.Promise[_] = js.native
  def top(callback: Callback[_]): Unit = js.native
  def top(options: js.Object): js.Promise[_] = js.native
  def top(options: js.Object, callback: Callback[_]): Unit = js.native
  def unpause(): js.Promise[_] = js.native
  def unpause(callback: Callback[_]): Unit = js.native
  def unpause(options: js.Object): js.Promise[_] = js.native
  def unpause(options: js.Object, callback: Callback[_]): Unit = js.native
  def update(options: js.Object): js.Promise[_] = js.native
  def update(options: js.Object, callback: Callback[_]): Unit = js.native
  def wait(callback: Callback[_]): Unit = js.native
}

