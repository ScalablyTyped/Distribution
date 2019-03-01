package typings
package expressDashBruteDashMemcachedLib.expressDashBruteDashMemcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemcachedStoreOptions extends js.Object {
  /**
    * @summary Hashing algorithm used to generate the  hashRing  values
    * @type {string}
    */
  var algorithm: java.lang.String
  /**
    * @summary An array of  server_locations  to replace servers that fail and that are removed from the consistent hashing scheme.
    * @type {Array}
    */
  var failOverServers: js.Array[_]
  /**
    * @summary Number of failed-attempts to a server before it is regarded as 'dead'.
    * @type {number}
    */
  var failures: scala.Double
  /**
    * @summary Idle timeout for the connections.
    * @type {number}
    */
  var idle: scala.Double
  /**
    * @summary True, whether to use  md5  as hashing scheme when keys exceed  maxKeySize .
    * @type
    */
  var keyCompression: scala.Boolean
  /**
    * @summary Maximum expiration time of keys (in seconds).
    * @type {number}
    */
  var maxExpiration: scala.Double
  /**
    * @summary Maximum key size allowed.
    * @type {number}
    */
  var maxKeySize: scala.Double
  /**
    * @summary Maximum size of a value.
    * @type {number}
    */
  var maxValue: scala.Double
  /**
    * @summary Maximum size of the connection pool.
    * @type {number}
    */
  var poolSize: scala.Double
  var prefix: java.lang.String
  /**
    * @summary Time between reconnection attempts (in milliseconds).
    * @type {number}
    */
  var reconnect: scala.Double
  /**
    * @summary If true, authorizes the automatic removal of dead servers from the pool.
    * @type {boolean}
    */
  var remove: scala.Boolean
  /**
    * @summary Number of socket allocation retries per request.
    * @type {number}
    */
  var retries: scala.Double
  /**
    * @summary Time between a server failure and an attempt to set it up back in service.
    * @type {number}
    */
  var retry: scala.Double
  /**
    * @summary Time after which Memcached sends a connection timeout (in milliseconds).
    * @type {number}
    */
  var timeout: scala.Double
}

object MemcachedStoreOptions {
  @scala.inline
  def apply(
    algorithm: java.lang.String,
    failOverServers: js.Array[_],
    failures: scala.Double,
    idle: scala.Double,
    keyCompression: scala.Boolean,
    maxExpiration: scala.Double,
    maxKeySize: scala.Double,
    maxValue: scala.Double,
    poolSize: scala.Double,
    prefix: java.lang.String,
    reconnect: scala.Double,
    remove: scala.Boolean,
    retries: scala.Double,
    retry: scala.Double,
    timeout: scala.Double
  ): MemcachedStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("failOverServers")(failOverServers)
    __obj.updateDynamic("failures")(failures)
    __obj.updateDynamic("idle")(idle)
    __obj.updateDynamic("keyCompression")(keyCompression)
    __obj.updateDynamic("maxExpiration")(maxExpiration)
    __obj.updateDynamic("maxKeySize")(maxKeySize)
    __obj.updateDynamic("maxValue")(maxValue)
    __obj.updateDynamic("poolSize")(poolSize)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("reconnect")(reconnect)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("retries")(retries)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[MemcachedStoreOptions]
  }
}

