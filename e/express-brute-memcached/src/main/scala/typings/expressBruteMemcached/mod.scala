package typings.expressBruteMemcached

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-brute-memcached", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MemcachedStore {
    /**
      * @summary Constructor.
      * @constructor
      * @param {string|Array}    hosts   The collection.
      * @param {Object}          options The otpions.
      */
    def this(hosts: String) = this()
    def this(hosts: js.Array[String]) = this()
    def this(hosts: String, options: MemcachedStoreOptions) = this()
    def this(hosts: js.Array[String], options: MemcachedStoreOptions) = this()
  }
  
  trait MemcachedStore extends StObject
  
  trait MemcachedStoreOptions extends StObject {
    
    /**
      * @summary Hashing algorithm used to generate the  hashRing  values
      * @type {string}
      */
    var algorithm: String
    
    /**
      * @summary An array of  server_locations  to replace servers that fail and that are removed from the consistent hashing scheme.
      * @type {Array}
      */
    var failOverServers: js.Array[Any]
    
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
    
    inline def apply(
      algorithm: String,
      failOverServers: js.Array[Any],
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
    implicit open class MutableBuilder[Self <: MemcachedStoreOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setFailOverServers(value: js.Array[Any]): Self = StObject.set(x, "failOverServers", value.asInstanceOf[js.Any])
      
      inline def setFailOverServersVarargs(value: Any*): Self = StObject.set(x, "failOverServers", js.Array(value*))
      
      inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setKeyCompression(value: Boolean): Self = StObject.set(x, "keyCompression", value.asInstanceOf[js.Any])
      
      inline def setMaxExpiration(value: Double): Self = StObject.set(x, "maxExpiration", value.asInstanceOf[js.Any])
      
      inline def setMaxKeySize(value: Double): Self = StObject.set(x, "maxKeySize", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: Double): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
