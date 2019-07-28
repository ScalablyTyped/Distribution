package typings.easyDashApiDashRequest.easyDashApiDashRequestMod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamRequest extends BaseRequest {
  def _request(opts: js.Object): Stream = js.native
  def del(opts: js.Object): Stream = js.native
  def del(url: String): Stream = js.native
  def del(url: String, params: js.Object): Stream = js.native
  def get(opts: js.Object): Stream = js.native
  def get(url: String): Stream = js.native
  def get(url: String, params: js.Object): Stream = js.native
  def patch(opts: js.Object): Stream = js.native
  def patch(url: String): Stream = js.native
  def patch(url: String, params: js.Object): Stream = js.native
  def post(opts: js.Object): Stream = js.native
  def post(url: String): Stream = js.native
  def post(url: String, params: js.Object): Stream = js.native
}

