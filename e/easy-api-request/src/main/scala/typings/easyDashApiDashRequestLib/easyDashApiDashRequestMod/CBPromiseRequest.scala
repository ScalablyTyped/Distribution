package typings
package easyDashApiDashRequestLib.easyDashApiDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBPromiseRequest extends BaseRequest {
  def _request(opts: js.Object): nodeLib.streamMod.Stream = js.native
  def del(opts: js.Object): qLib.qMod.Promise[Result] = js.native
  def del(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def del(url: java.lang.String): qLib.qMod.Promise[Result] = js.native
  def del(
    url: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def del(url: java.lang.String, params: js.Object): qLib.qMod.Promise[Result] = js.native
  def del(
    url: java.lang.String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def get(opts: js.Object): qLib.qMod.Promise[Result] = js.native
  def get(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def get(url: java.lang.String): qLib.qMod.Promise[Result] = js.native
  def get(
    url: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def get(url: java.lang.String, params: js.Object): qLib.qMod.Promise[Result] = js.native
  def get(
    url: java.lang.String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def patch(opts: js.Object): qLib.qMod.Promise[Result] = js.native
  def patch(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def patch(url: java.lang.String): qLib.qMod.Promise[Result] = js.native
  def patch(
    url: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def patch(url: java.lang.String, params: js.Object): qLib.qMod.Promise[Result] = js.native
  def patch(
    url: java.lang.String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def post(opts: js.Object): qLib.qMod.Promise[Result] = js.native
  def post(
    opts: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def post(url: java.lang.String): qLib.qMod.Promise[Result] = js.native
  def post(
    url: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
  def post(url: java.lang.String, params: js.Object): qLib.qMod.Promise[Result] = js.native
  def post(
    url: java.lang.String,
    params: js.Object,
    cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], scala.Unit]
  ): scala.Unit = js.native
}

