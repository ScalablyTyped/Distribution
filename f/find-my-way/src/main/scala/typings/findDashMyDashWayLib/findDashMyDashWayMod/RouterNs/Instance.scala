package typings
package findDashMyDashWayLib.findDashMyDashWayMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[V /* <: HTTPVersion */] extends js.Object {
  @JSName("acl")
  var acl_Original: ShortHandRoute[V] = js.native
  @JSName("all")
  var all_Original: ShortHandRoute[V] = js.native
  @JSName("bind")
  var bind_Original: ShortHandRoute[V] = js.native
  @JSName("checkout")
  var checkout_Original: ShortHandRoute[V] = js.native
  @JSName("connect")
  var connect_Original: ShortHandRoute[V] = js.native
  @JSName("copy")
  var copy_Original: ShortHandRoute[V] = js.native
  @JSName("delete")
  var delete_Original: ShortHandRoute[V] = js.native
  @JSName("get")
  var get_Original: ShortHandRoute[V] = js.native
  @JSName("head")
  var head_Original: ShortHandRoute[V] = js.native
  @JSName("link")
  var link_Original: ShortHandRoute[V] = js.native
  @JSName("lock")
  var lock_Original: ShortHandRoute[V] = js.native
  @JSName("m-search")
  var `m-search_Original`: ShortHandRoute[V] = js.native
  @JSName("merge")
  var merge_Original: ShortHandRoute[V] = js.native
  @JSName("mkactivity")
  var mkactivity_Original: ShortHandRoute[V] = js.native
  @JSName("mkcalendar")
  var mkcalendar_Original: ShortHandRoute[V] = js.native
  @JSName("mkcol")
  var mkcol_Original: ShortHandRoute[V] = js.native
  @JSName("move")
  var move_Original: ShortHandRoute[V] = js.native
  @JSName("notify")
  var notify_Original: ShortHandRoute[V] = js.native
  @JSName("options")
  var options_Original: ShortHandRoute[V] = js.native
  @JSName("patch")
  var patch_Original: ShortHandRoute[V] = js.native
  @JSName("post")
  var post_Original: ShortHandRoute[V] = js.native
  @JSName("propfind")
  var propfind_Original: ShortHandRoute[V] = js.native
  @JSName("proppatch")
  var proppatch_Original: ShortHandRoute[V] = js.native
  @JSName("purge")
  var purge_Original: ShortHandRoute[V] = js.native
  @JSName("put")
  var put_Original: ShortHandRoute[V] = js.native
  @JSName("rebind")
  var rebind_Original: ShortHandRoute[V] = js.native
  @JSName("report")
  var report_Original: ShortHandRoute[V] = js.native
  @JSName("search")
  var search_Original: ShortHandRoute[V] = js.native
  @JSName("source")
  var source_Original: ShortHandRoute[V] = js.native
  @JSName("subscribe")
  var subscribe_Original: ShortHandRoute[V] = js.native
  @JSName("trace")
  var trace_Original: ShortHandRoute[V] = js.native
  @JSName("unbind")
  var unbind_Original: ShortHandRoute[V] = js.native
  @JSName("unlink")
  var unlink_Original: ShortHandRoute[V] = js.native
  @JSName("unlock")
  var unlock_Original: ShortHandRoute[V] = js.native
  @JSName("unsubscribe")
  var unsubscribe_Original: ShortHandRoute[V] = js.native
  def acl(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def acl(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def acl(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def acl(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def all(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def all(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def all(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def all(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def bind(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def bind(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def bind(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def bind(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def checkout(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def checkout(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def checkout(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def checkout(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def connect(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def connect(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def connect(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def connect(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def copy(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def copy(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def copy(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def copy(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def delete(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def delete(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def delete(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def delete(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def find(method: HTTPMethod, path: java.lang.String): FindResult[V] | scala.Null = js.native
  def find(method: HTTPMethod, path: java.lang.String, version: java.lang.String): FindResult[V] | scala.Null = js.native
  def get(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def get(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def get(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def get(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def head(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def head(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def head(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def head(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def link(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def link(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def link(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def link(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def lock(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def lock(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def lock(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def lock(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def lookup[Context](req: nodeLib.http2Mod.Http2ServerRequest, res: nodeLib.http2Mod.Http2ServerResponse): scala.Unit = js.native
  def lookup[Context](req: nodeLib.http2Mod.Http2ServerRequest, res: nodeLib.http2Mod.Http2ServerResponse, ctx: Context): scala.Unit = js.native
  def lookup[Context](req: nodeLib.http2Mod.Http2ServerRequest, res: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
  def lookup[Context](req: nodeLib.http2Mod.Http2ServerRequest, res: nodeLib.httpMod.ServerResponse, ctx: Context): scala.Unit = js.native
  def lookup[Context](req: nodeLib.httpMod.IncomingMessage, res: nodeLib.http2Mod.Http2ServerResponse): scala.Unit = js.native
  def lookup[Context](req: nodeLib.httpMod.IncomingMessage, res: nodeLib.http2Mod.Http2ServerResponse, ctx: Context): scala.Unit = js.native
  def lookup[Context](req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
  def lookup[Context](req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse, ctx: Context): scala.Unit = js.native
  def `m-search`(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def `m-search`(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def `m-search`(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def `m-search`(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def merge(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def merge(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def merge(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def merge(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def mkactivity(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def mkactivity(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def mkactivity(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def mkactivity(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def mkcalendar(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def mkcalendar(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def mkcalendar(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def mkcalendar(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def mkcol(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def mkcol(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def mkcol(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def mkcol(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def move(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def move(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def move(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def move(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def notify(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def notify(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def notify(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def notify(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def off(method: HTTPMethod, path: java.lang.String): scala.Unit = js.native
  def off(method: js.Array[HTTPMethod], path: java.lang.String): scala.Unit = js.native
  def on(method: HTTPMethod, path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def on(method: HTTPMethod, path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def on(method: HTTPMethod, path: java.lang.String, options: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def on(
    method: HTTPMethod,
    path: java.lang.String,
    options: RouteOptions,
    handler: Handler[V],
    store: js.Any
  ): scala.Unit = js.native
  def on(method: js.Array[HTTPMethod], path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def on(method: js.Array[HTTPMethod], path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def on(method: js.Array[HTTPMethod], path: java.lang.String, options: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def on(
    method: js.Array[HTTPMethod],
    path: java.lang.String,
    options: RouteOptions,
    handler: Handler[V],
    store: js.Any
  ): scala.Unit = js.native
  def options(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def options(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def options(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def options(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def patch(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def patch(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def patch(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def patch(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def post(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def post(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def post(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def post(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def prettyPrint(): java.lang.String = js.native
  def propfind(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def propfind(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def propfind(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def propfind(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def proppatch(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def proppatch(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def proppatch(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def proppatch(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def purge(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def purge(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def purge(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def purge(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def put(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def put(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def put(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def put(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def rebind(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def rebind(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def rebind(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def rebind(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def report(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def report(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def report(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def report(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def search(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def search(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def search(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def search(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def source(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def source(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def source(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def source(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def subscribe(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def subscribe(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def subscribe(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def subscribe(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def trace(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def trace(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def trace(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def trace(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unbind(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def unbind(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unbind(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def unbind(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unlink(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def unlink(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unlink(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def unlink(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unlock(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def unlock(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unlock(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def unlock(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unsubscribe(path: java.lang.String, handler: Handler[V]): scala.Unit = js.native
  def unsubscribe(path: java.lang.String, handler: Handler[V], store: js.Any): scala.Unit = js.native
  def unsubscribe(path: java.lang.String, opts: RouteOptions, handler: Handler[V]): scala.Unit = js.native
  def unsubscribe(path: java.lang.String, opts: RouteOptions, handler: Handler[V], store: js.Any): scala.Unit = js.native
}

