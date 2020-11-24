package typings.easyApiRequest.mod

import typings.bunyan.mod.^
import typings.easyApiRequest.anon.Cb
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.request.mod.Request
import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRequest extends js.Object {
  
  def _do(args: IArguments): js.Any = js.native
  def _do(args: IArguments, `type`: String): js.Any = js.native
  
  def _parseOptions(args: IArguments, `type`: String): Cb = js.native
  
  def _request(): js.Any = js.native
  def _request(opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def _request(opts: js.Any): js.Any = js.native
  def _request(opts: js.Any, cb: js.Any): js.Any = js.native
  
  var base: Request = js.native
  
  def del(): js.Any = js.native
  def del(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def del(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
  def del(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
  def del(url: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  
  def get(): js.Any = js.native
  def get(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def get(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
  def get(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
  def get(url: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  
  var jSend: Boolean = js.native
  
  var log: ^ = js.native
  
  def patch(): js.Any = js.native
  def patch(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def patch(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
  def patch(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
  def patch(url: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  
  def post(): js.Any = js.native
  def post(url: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def post(url: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
  def post(url: js.UndefOr[scala.Nothing], opts: js.Any, cb: js.Any): js.Any = js.native
  def post(url: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  
  var replyCookies: js.Array[String] = js.native
  
  var req: Request_[ParamsDictionary, _, _, Query] = js.native
}
