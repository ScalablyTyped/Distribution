package typings.expressBruteMemcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemcachedStoreOptions extends js.Object {
  /**
    * @summary Hashing algorithm used to generate the  hashRing  values
    * @type {string}
    */
  var algorithm: String = js.native
  /**
    * @summary An array of  server_locations  to replace servers that fail and that are removed from the consistent hashing scheme.
    * @type {Array}
    */
  var failOverServers: js.Array[_] = js.native
  /**
    * @summary Number of failed-attempts to a server before it is regarded as 'dead'.
    * @type {number}
    */
  var failures: Double = js.native
  /**
    * @summary Idle timeout for the connections.
    * @type {number}
    */
  var idle: Double = js.native
  /**
    * @summary True, whether to use  md5  as hashing scheme when keys exceed  maxKeySize .
    * @type
    */
  var keyCompression: Boolean = js.native
  /**
    * @summary Maximum expiration time of keys (in seconds).
    * @type {number}
    */
  var maxExpiration: Double = js.native
  /**
    * @summary Maximum key size allowed.
    * @type {number}
    */
  var maxKeySize: Double = js.native
  /**
    * @summary Maximum size of a value.
    * @type {number}
    */
  var maxValue: Double = js.native
  /**
    * @summary Maximum size of the connection pool.
    * @type {number}
    */
  var poolSize: Double = js.native
  var prefix: String = js.native
  /**
    * @summary Time between reconnection attempts (in milliseconds).
    * @type {number}
    */
  var reconnect: Double = js.native
  /**
    * @summary If true, authorizes the automatic removal of dead servers from the pool.
    * @type {boolean}
    */
  var remove: Boolean = js.native
  /**
    * @summary Number of socket allocation retries per request.
    * @type {number}
    */
  var retries: Double = js.native
  /**
    * @summary Time between a server failure and an attempt to set it up back in service.
    * @type {number}
    */
  var retry: Double = js.native
  /**
    * @summary Time after which Memcached sends a connection timeout (in milliseconds).
    * @type {number}
    */
  var timeout: Double = js.native
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
  @scala.inline
  implicit class MemcachedStoreOptionsOps[Self <: MemcachedStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailOverServersVarargs(value: js.Any*): Self = this.set("failOverServers", js.Array(value :_*))
    @scala.inline
    def setFailOverServers(value: js.Array[_]): Self = this.set("failOverServers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdle(value: Double): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyCompression(value: Boolean): Self = this.set("keyCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxExpiration(value: Double): Self = this.set("maxExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxKeySize(value: Double): Self = this.set("maxKeySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoolSize(value: Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setReconnect(value: Double): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

