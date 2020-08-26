package typings.findMyWay.mod

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
  def acl(path: String, handler: Handler[V]): Unit = js.native
  def acl(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def acl(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def acl(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def all(path: String, handler: Handler[V]): Unit = js.native
  def all(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def all(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def all(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def bind(path: String, handler: Handler[V]): Unit = js.native
  def bind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def bind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def bind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def checkout(path: String, handler: Handler[V]): Unit = js.native
  def checkout(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def checkout(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def checkout(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def connect(path: String, handler: Handler[V]): Unit = js.native
  def connect(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def connect(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def connect(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def copy(path: String, handler: Handler[V]): Unit = js.native
  def copy(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def copy(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def copy(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def delete(path: String, handler: Handler[V]): Unit = js.native
  def delete(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def delete(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def delete(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def find(method: HTTPMethod, path: String): FindResult[V] | Null = js.native
  def find(method: HTTPMethod, path: String, version: String): FindResult[V] | Null = js.native
  def get(path: String, handler: Handler[V]): Unit = js.native
  def get(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def get(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def get(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def head(path: String, handler: Handler[V]): Unit = js.native
  def head(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def head(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def head(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def link(path: String, handler: Handler[V]): Unit = js.native
  def link(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def link(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def link(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def lock(path: String, handler: Handler[V]): Unit = js.native
  def lock(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def lock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def lock(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def lookup[Context](req: Req[V], res: Res[V]): Unit = js.native
  def lookup[Context](req: Req[V], res: Res[V], ctx: Context): Unit = js.native
  def `m-search`(path: String, handler: Handler[V]): Unit = js.native
  def `m-search`(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def `m-search`(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def `m-search`(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def merge(path: String, handler: Handler[V]): Unit = js.native
  def merge(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def merge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def merge(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def mkactivity(path: String, handler: Handler[V]): Unit = js.native
  def mkactivity(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def mkactivity(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def mkactivity(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def mkcalendar(path: String, handler: Handler[V]): Unit = js.native
  def mkcalendar(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def mkcol(path: String, handler: Handler[V]): Unit = js.native
  def mkcol(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def mkcol(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def mkcol(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def move(path: String, handler: Handler[V]): Unit = js.native
  def move(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def move(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def move(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def notify(path: String, handler: Handler[V]): Unit = js.native
  def notify(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def notify(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def notify(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def off(method: js.Array[HTTPMethod], path: String): Unit = js.native
  def off(method: HTTPMethod, path: String): Unit = js.native
  def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V]): Unit = js.native
  def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def on(method: js.Array[HTTPMethod], path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
  def on(
    method: js.Array[HTTPMethod],
    path: String,
    options: RouteOptions,
    handler: Handler[V],
    store: js.Any
  ): Unit = js.native
  def on(method: HTTPMethod, path: String, handler: Handler[V]): Unit = js.native
  def on(method: HTTPMethod, path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
  def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def options(path: String, handler: Handler[V]): Unit = js.native
  def options(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def options(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def options(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def patch(path: String, handler: Handler[V]): Unit = js.native
  def patch(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def patch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def patch(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def post(path: String, handler: Handler[V]): Unit = js.native
  def post(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def post(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def post(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def prettyPrint(): String = js.native
  def propfind(path: String, handler: Handler[V]): Unit = js.native
  def propfind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def propfind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def propfind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def proppatch(path: String, handler: Handler[V]): Unit = js.native
  def proppatch(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def proppatch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def proppatch(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def purge(path: String, handler: Handler[V]): Unit = js.native
  def purge(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def purge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def purge(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def put(path: String, handler: Handler[V]): Unit = js.native
  def put(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def put(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def put(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def rebind(path: String, handler: Handler[V]): Unit = js.native
  def rebind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def rebind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def rebind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def report(path: String, handler: Handler[V]): Unit = js.native
  def report(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def report(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def report(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def reset(): Unit = js.native
  def search(path: String, handler: Handler[V]): Unit = js.native
  def search(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def search(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def search(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def source(path: String, handler: Handler[V]): Unit = js.native
  def source(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def source(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def source(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def subscribe(path: String, handler: Handler[V]): Unit = js.native
  def subscribe(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def subscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def subscribe(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def trace(path: String, handler: Handler[V]): Unit = js.native
  def trace(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def trace(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def trace(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def unbind(path: String, handler: Handler[V]): Unit = js.native
  def unbind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def unbind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def unbind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def unlink(path: String, handler: Handler[V]): Unit = js.native
  def unlink(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def unlink(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def unlink(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def unlock(path: String, handler: Handler[V]): Unit = js.native
  def unlock(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def unlock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def unlock(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  def unsubscribe(path: String, handler: Handler[V]): Unit = js.native
  def unsubscribe(path: String, handler: Handler[V], store: js.Any): Unit = js.native
  def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
  def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
}

