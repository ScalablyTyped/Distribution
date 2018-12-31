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

