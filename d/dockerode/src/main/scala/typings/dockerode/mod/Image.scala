package typings.dockerode.mod

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Image")
@js.native
open class Image protected () extends StObject {
  def this(modem: Any, name: String) = this()
  
  def distribution(): js.Promise[ImageDistributionInfo] = js.native
  def distribution(callback: Callback[ImageDistributionInfo]): Unit = js.native
  def distribution(options: ImageDistributionOptions): js.Promise[ImageDistributionInfo] = js.native
  def distribution(options: ImageDistributionOptions, callback: Callback[ImageDistributionInfo]): Unit = js.native
  
  def get(): js.Promise[ReadableStream] = js.native
  def get(callback: Callback[ReadableStream]): Unit = js.native
  
  def history(): js.Promise[Any] = js.native
  def history(callback: Callback[Any]): Unit = js.native
  
  var id: String = js.native
  
  def inspect(): js.Promise[ImageInspectInfo] = js.native
  def inspect(callback: Callback[ImageInspectInfo]): Unit = js.native
  
  var modem: Any = js.native
  
  def push(): js.Promise[ReadableStream] = js.native
  def push(callback: Callback[ReadableStream]): Unit = js.native
  def push(options: ImagePushOptions): js.Promise[ReadableStream] = js.native
  def push(options: ImagePushOptions, callback: Callback[ReadableStream]): Unit = js.native
  
  def remove(): js.Promise[Any] = js.native
  def remove(callback: Callback[ImageRemoveInfo]): Unit = js.native
  def remove(options: js.Object): js.Promise[Any] = js.native
  def remove(options: ImageRemoveOptions, callback: Callback[ImageRemoveInfo]): Unit = js.native
  
  def tag(): js.Promise[Any] = js.native
  def tag(callback: Callback[Any]): Unit = js.native
  def tag(options: js.Object): js.Promise[Any] = js.native
  def tag(options: js.Object, callback: Callback[Any]): Unit = js.native
}
