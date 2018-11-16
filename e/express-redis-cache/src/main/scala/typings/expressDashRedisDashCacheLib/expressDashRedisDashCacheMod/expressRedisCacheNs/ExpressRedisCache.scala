package typings
package expressDashRedisDashCacheLib.expressDashRedisDashCacheMod.expressRedisCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressRedisCache
  extends nodeLib.eventsMod.EventEmitter {
  val FOREVER: scala.Double = js.native
  var auth_pass: java.lang.String = js.native
  var client: redisLib.redisMod.RedisClient = js.native
  var connected: scala.Boolean = js.native
  var expire: scala.Double = js.native
  var host: java.lang.String = js.native
  var options: Options = js.native
  var port: java.lang.String | scala.Double = js.native
  var prefix: java.lang.String = js.native
  def add(
    name: java.lang.String,
    body: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* added */ Entry, scala.Unit]
  ): scala.Unit = js.native
  def add(
    name: java.lang.String,
    body: java.lang.String,
    options: AddOptions,
    callback: js.Function2[/* error */ js.Any, /* added */ Entry, scala.Unit]
  ): scala.Unit = js.native
  def del(
    name: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* deleted */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def get(callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], scala.Unit]): scala.Unit = js.native
  def get(
    name: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], scala.Unit]
  ): scala.Unit = js.native
  def route(): expressLib.expressMod.eNs.RequestHandler = js.native
  def route(expire: scala.Double): expressLib.expressMod.eNs.RequestHandler = js.native
  def route(nameOrOptions: RouteOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def route(nameOrOptions: RouteOptions, expire: ExpireOption): expressLib.expressMod.eNs.RequestHandler = js.native
  def route(nameOrOptions: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def route(nameOrOptions: java.lang.String, expire: ExpireOption): expressLib.expressMod.eNs.RequestHandler = js.native
  def size(callback: js.Function2[/* error */ js.Any, /* bytes */ scala.Double, scala.Unit]): scala.Unit = js.native
}

