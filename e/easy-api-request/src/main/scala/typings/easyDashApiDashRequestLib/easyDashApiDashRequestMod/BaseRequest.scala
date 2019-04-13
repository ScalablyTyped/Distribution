package typings
package easyDashApiDashRequestLib.easyDashApiDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRequest extends js.Object {
  var base: requestLib.requestMod.Request = js.native
  var jSend: scala.Boolean = js.native
  var log: bunyanLib.bunyanMod.^ = js.native
  var replyCookies: js.Array[java.lang.String] = js.native
  var req: expressLib.expressMod.Request = js.native
  def _do(args: stdLib.IArguments): js.Any = js.native
  def _do(args: stdLib.IArguments, `type`: java.lang.String): js.Any = js.native
  def _parseOptions(args: stdLib.IArguments, `type`: java.lang.String): easyDashApiDashRequestLib.Anon_Cb = js.native
  def _request(): js.Any = js.native
  def _request(opts: js.Any): js.Any = js.native
  def _request(opts: js.Any, cb: js.Any): js.Any = js.native
  def del(): js.Any = js.native
  def del(url: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  def get(): js.Any = js.native
  def get(url: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  def patch(): js.Any = js.native
  def patch(url: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  def post(): js.Any = js.native
  def post(url: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
}

