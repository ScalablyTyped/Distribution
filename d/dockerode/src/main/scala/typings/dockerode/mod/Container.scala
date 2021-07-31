package typings.dockerode.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Container")
@js.native
class Container protected () extends StObject {
  def this(modem: js.Any, id: String) = this()
  
  def attach(options: js.Object): js.Promise[ReadWriteStream] = js.native
  def attach(options: js.Object, callback: Callback[ReadWriteStream]): Unit = js.native
  
  def changes(): js.Promise[js.Any] = js.native
  def changes(callback: Callback[js.Any]): Unit = js.native
  
  def commit(): js.Promise[js.Any] = js.native
  def commit(callback: Callback[js.Any]): Unit = js.native
  def commit(options: js.Object): js.Promise[js.Any] = js.native
  def commit(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  /** Deprecated since RAPI v1.20 */
  def copy(): js.Promise[js.Any] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(callback: Callback[js.Any]): Unit = js.native
  def copy(options: js.Object): js.Promise[js.Any] = js.native
  /** Deprecated since RAPI v1.20 */
  def copy(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def exec(options: ExecCreateOptions): js.Promise[Exec] = js.native
  def exec(options: ExecCreateOptions, callback: Callback[Exec]): Unit = js.native
  
  def `export`(): js.Promise[ReadableStream] = js.native
  def `export`(callback: Callback[ReadableStream]): Unit = js.native
  
  def getArchive(options: js.Object): js.Promise[ReadableStream] = js.native
  def getArchive(options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  
  var id: String = js.native
  
  def infoArchive(options: js.Object): js.Promise[js.Any] = js.native
  def infoArchive(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def inspect(): js.Promise[ContainerInspectInfo] = js.native
  def inspect(callback: Callback[ContainerInspectInfo]): Unit = js.native
  def inspect(options: js.Object): js.Promise[ContainerInspectInfo] = js.native
  def inspect(options: js.Object, callback: Callback[ContainerInspectInfo]): Unit = js.native
  
  def kill(): js.Promise[js.Any] = js.native
  def kill(callback: Callback[js.Any]): Unit = js.native
  def kill(options: js.Object): js.Promise[js.Any] = js.native
  def kill(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def logs(): js.Promise[ReadableStream] = js.native
  def logs(callback: Callback[ReadableStream]): Unit = js.native
  def logs(options: ContainerLogsOptions): js.Promise[ReadableStream] = js.native
  def logs(options: ContainerLogsOptions, callback: Callback[ReadableStream]): Unit = js.native
  
  var modem: js.Any = js.native
  
  def pause(): js.Promise[js.Any] = js.native
  def pause(callback: Callback[js.Any]): Unit = js.native
  def pause(options: js.Object): js.Promise[js.Any] = js.native
  def pause(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def putArchive(file: String, options: js.Object): js.Promise[ReadWriteStream] = js.native
  /** @param file Filename (will read synchronously), Buffer or stream */
  def putArchive(file: String, options: js.Object, callback: Callback[WritableStream]): Unit = js.native
  def putArchive(file: Buffer, options: js.Object): js.Promise[ReadWriteStream] = js.native
  def putArchive(file: Buffer, options: js.Object, callback: Callback[WritableStream]): Unit = js.native
  def putArchive(file: ReadableStream, options: js.Object): js.Promise[ReadWriteStream] = js.native
  def putArchive(file: ReadableStream, options: js.Object, callback: Callback[WritableStream]): Unit = js.native
  
  def remove(): js.Promise[js.Any] = js.native
  def remove(callback: Callback[js.Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[js.Any] = js.native
  def remove(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def rename(options: js.Object): js.Promise[js.Any] = js.native
  def rename(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def resize(): js.Promise[js.Any] = js.native
  def resize(callback: Callback[js.Any]): Unit = js.native
  def resize(options: js.Object): js.Promise[js.Any] = js.native
  def resize(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def restart(): js.Promise[js.Any] = js.native
  def restart(callback: Callback[js.Any]): Unit = js.native
  def restart(options: js.Object): js.Promise[js.Any] = js.native
  def restart(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def start(): js.Promise[js.Any] = js.native
  def start(callback: Callback[js.Any]): Unit = js.native
  def start(options: js.Object): js.Promise[js.Any] = js.native
  def start(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def stats(): js.Promise[ContainerStats] = js.native
  def stats(callback: Callback[ContainerStats]): Unit = js.native
  def stats(options: js.Object): js.Promise[ContainerStats] = js.native
  def stats(options: js.Object, callback: Callback[ContainerStats]): Unit = js.native
  
  def stop(): js.Promise[js.Any] = js.native
  def stop(callback: Callback[js.Any]): Unit = js.native
  def stop(options: js.Object): js.Promise[js.Any] = js.native
  def stop(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def top(): js.Promise[js.Any] = js.native
  def top(callback: Callback[js.Any]): Unit = js.native
  def top(options: js.Object): js.Promise[js.Any] = js.native
  def top(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def unpause(): js.Promise[js.Any] = js.native
  def unpause(callback: Callback[js.Any]): Unit = js.native
  def unpause(options: js.Object): js.Promise[js.Any] = js.native
  def unpause(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def update(options: js.Object): js.Promise[js.Any] = js.native
  def update(options: js.Object, callback: Callback[js.Any]): Unit = js.native
  
  def wait(callback: Callback[js.Any]): Unit = js.native
  def wait(options: ContainerWaitOptions): js.Promise[js.Any] = js.native
  def wait(options: ContainerWaitOptions, callback: Callback[js.Any]): Unit = js.native
}
