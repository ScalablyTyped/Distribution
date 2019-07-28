package typings.easyDashApiDashRequest.easyDashApiDashRequestMod

import typings.node.streamMod.Stream
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBPromiseRequest extends BaseRequest {
  def _request(opts: js.Object): Stream = js.native
  def del(opts: js.Object): Promise[Result] = js.native
  def del(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def del(url: String): Promise[Result] = js.native
  def del(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
  def del(url: String, params: js.Object): Promise[Result] = js.native
  def del(
    url: String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def get(opts: js.Object): Promise[Result] = js.native
  def get(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def get(url: String): Promise[Result] = js.native
  def get(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
  def get(url: String, params: js.Object): Promise[Result] = js.native
  def get(
    url: String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def patch(opts: js.Object): Promise[Result] = js.native
  def patch(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def patch(url: String): Promise[Result] = js.native
  def patch(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
  def patch(url: String, params: js.Object): Promise[Result] = js.native
  def patch(
    url: String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def post(opts: js.Object): Promise[Result] = js.native
  def post(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
  def post(url: String): Promise[Result] = js.native
  def post(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
  def post(url: String, params: js.Object): Promise[Result] = js.native
  def post(
    url: String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
  ): Unit = js.native
}

