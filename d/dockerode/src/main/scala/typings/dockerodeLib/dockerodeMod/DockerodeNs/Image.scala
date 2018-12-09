package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.native
  var modem: js.Any = js.native
  def get(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def history(): js.Promise[_] = js.native
  def history(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def inspect(): js.Promise[ImageInspectInfo] = js.native
  def inspect(callback: dockerodeLib.Callback[ImageInspectInfo]): scala.Unit = js.native
  def push(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def push(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def push(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def push(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[ImageRemoveInfo]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[ImageRemoveInfo]): scala.Unit = js.native
  def tag(): js.Promise[_] = js.native
  def tag(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def tag(options: js.Object): js.Promise[_] = js.native
  def tag(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

