package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Image")
@js.native
class Image protected () extends js.Object {
  def this(modem: js.Any, name: java.lang.String) = this()
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def get(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def history(): js.Promise[_] = js.native
  def history(callback: Callback[_]): scala.Unit = js.native
  def inspect(): js.Promise[ImageInspectInfo] = js.native
  def inspect(callback: Callback[ImageInspectInfo]): scala.Unit = js.native
  def push(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def push(callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def push(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def push(options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[ImageRemoveInfo]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[ImageRemoveInfo]): scala.Unit = js.native
  def tag(): js.Promise[_] = js.native
  def tag(callback: Callback[_]): scala.Unit = js.native
  def tag(options: js.Object): js.Promise[_] = js.native
  def tag(options: js.Object, callback: Callback[_]): scala.Unit = js.native
}

