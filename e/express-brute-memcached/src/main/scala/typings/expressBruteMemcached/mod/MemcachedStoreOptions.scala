package typings.expressBruteMemcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemcachedStoreOptions extends js.Object {
  /**
    * @summary Hashing algorithm used to generate the  hashRing  values
    * @type {string}
    */
  var algorithm: String
  /**
    * @summary An array of  server_locations  to replace servers that fail and that are removed from the consistent hashing scheme.
    * @type {Array}
    */
  var failOverServers: js.Array[_]
  /**
    * @summary Number of failed-attempts to a server before it is regarded as 'dead'.
    * @type {number}
    */
  var failures: Double
  /**
    * @summary Idle timeout for the connections.
    * @type {number}
    */
  var idle: Double
  /**
    * @summary True, whether to use  md5  as hashing scheme when keys exceed  maxKeySize .
    * @type
    */
  var keyCompression: Boolean
  /**
    * @summary Maximum expiration time of keys (in seconds).
    * @type {number}
    */
  var maxExpiration: Double
  /**
    * @summary Maximum key size allowed.
    * @type {number}
    */
  var maxKeySize: Double
  /**
    * @summary Maximum size of a value.
    * @type {number}
    */
  var maxValue: Double
  /**
    * @summary Maximum size of the connection pool.
    * @type {number}
    */
  var poolSize: Double
  var prefix: String
  /**
    * @summary Time between reconnection attempts (in milliseconds).
    * @type {number}
    */
  var reconnect: Double
  /**
    * @summary If true, authorizes the automatic removal of dead servers from the pool.
    * @type {boolean}
    */
  var remove: Boolean
  /**
    * @summary Number of socket allocation retries per request.
    * @type {number}
    */
  var retries: Double
  /**
    * @summary Time between a server failure and an attempt to set it up back in service.
    * @type {number}
    */
  var retry: Double
  /**
    * @summary Time after which Memcached sends a connection timeout (in milliseconds).
    * @type {number}
    */
  var timeout: Double
}

object MemcachedStoreOptions {
  @scala.inline
  def apply(
    algorithm: String,
    failOverServers: js.Array[_],
    failures: Double,
    idle: Double,
    keyCompression: Boolean,
    maxExpiration: Double,
    maxKeySize: Double,
    maxValue: Double,
    poolSize: Double,
    prefix: String,
    reconnect: Double,
    remove: Boolean,
    retries: Double,
    retry: Double,
    timeout: Double
  ): MemcachedStoreOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], failOverServers = failOverServers.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], keyCompression = keyCompression.asInstanceOf[js.Any], maxExpiration = maxExpiration.asInstanceOf[js.Any], maxKeySize = maxKeySize.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], poolSize = poolSize.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemcachedStoreOptions]
  }
}

