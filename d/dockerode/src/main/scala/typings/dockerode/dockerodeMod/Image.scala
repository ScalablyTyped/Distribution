package typings.dockerode.dockerodeMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Image")
@js.native
class Image protected () extends js.Object {
  def this(modem: js.Any, name: String) = this()
  var id: String = js.native
  var modem: js.Any = js.native
  def get(): js.Promise[ReadableStream] = js.native
  def get(callback: Callback[ReadableStream]): Unit = js.native
  def history(): js.Promise[_] = js.native
  def history(callback: Callback[_]): Unit = js.native
  def inspect(): js.Promise[ImageInspectInfo] = js.native
  def inspect(callback: Callback[ImageInspectInfo]): Unit = js.native
  def push(): js.Promise[ReadableStream] = js.native
  def push(callback: Callback[ReadableStream]): Unit = js.native
  def push(options: js.Object): js.Promise[ReadableStream] = js.native
  def push(options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[ImageRemoveInfo]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[ImageRemoveInfo]): Unit = js.native
  def tag(): js.Promise[_] = js.native
  def tag(callback: Callback[_]): Unit = js.native
  def tag(options: js.Object): js.Promise[_] = js.native
  def tag(options: js.Object, callback: Callback[_]): Unit = js.native
}

