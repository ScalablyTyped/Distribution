package typings
package expressDashBruteDashRedisLib.expressDashBruteDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Redis store for Express Brute
  */
@js.native
trait express_brute_redis extends js.Object {
  /**
    * @summary Gets a key in Redis storage.
    */
  def get(key: java.lang.String): scala.Unit = js.native
  def get(
    key: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @summary Resets a key in Redis storage.
    */
  def reset(key: java.lang.String): scala.Unit = js.native
  def reset(
    key: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit],
    args: js.Any*
  ): scala.Unit = js.native
  /**
    * @summary Sets a key in Redis storage.
    */
  def set(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, value: java.lang.String, lifetime: scala.Double): scala.Unit = js.native
  def set(
    key: java.lang.String,
    value: java.lang.String,
    lifetime: scala.Double,
    callback: js.Function1[/* sender */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

