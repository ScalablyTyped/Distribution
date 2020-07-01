package typings.egg.anon

import typings.node.urlMod.URL_
import typings.urllib.mod.HttpClientResponse
import typings.urllib.mod.RequestOptions2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, callback: typings.urllib.mod.Callback[T]): Unit = js.native
  def apply[T](url: String, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, options: RequestOptions2, callback: typings.urllib.mod.Callback[T]): Unit = js.native
  def apply[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL_, callback: typings.urllib.mod.Callback[T]): Unit = js.native
  def apply[T](url: URL_, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL_, options: RequestOptions2, callback: typings.urllib.mod.Callback[T]): Unit = js.native
}

