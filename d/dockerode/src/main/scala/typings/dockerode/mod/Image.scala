package typings.dockerode.mod

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Image")
@js.native
class Image protected () extends StObject {
  def this(modem: js.Any, name: String) = this()
  
  def get(): js.Promise[ReadableStream] = js.native
  def get(callback: Callback[ReadableStream]): Unit = js.native
  
  def history(): js.Promise[js.Any] = js.native
  def history(callback: Callback[js.Any]): Unit = js.native
  
  var id: String = js.native
  
  def inspect(): js.Promise[ImageInspectInfo] = js.native
  def inspect(callback: Callback[ImageInspectInfo]): Unit = js.native
  
  var modem: js.Any = js.native
  
  def push(): js.Promise[ReadableStream] = js.native
  def push(callback: Callback[ReadableStream]): Unit = js.native
  def push(options: js.Object): js.Promise[ReadableStream] = js.native
  def push(options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  
  def remove(): js.Promise[js.Any] = js.native
  def remove(callback: Callback[ImageRemoveInfo]): Unit = js.native
  def remove(options: js.Object): js.Promise[js.Any] = js.native
  def remove(options: js.Object, callback: Callback[ImageRemoveInfo]): Unit = js.native
  
  def tag(): js.Promise[js.Any] = js.native
  def tag(callback: Callback[js.Any]): Unit = js.native
  def tag(options: js.Object): js.Promise[js.Any] = js.native
  def tag(options: js.Object, callback: Callback[js.Any]): Unit = js.native
}
