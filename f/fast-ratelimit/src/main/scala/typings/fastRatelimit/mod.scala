package typings.fastRatelimit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-ratelimit", "FastRateLimit")
  @js.native
  class FastRateLimit protected () extends StObject {
    /**
      * FastRateLimit constructor
      * @param options
      */
    def this(options: FastRateLimitOptions) = this()
    
    /**
      * FastRateLimit.prototype.consume
      */
    def consume(namespace: String): js.Promise[Unit] = js.native
    
    /**
      * FastRateLimit.prototype.consumeSync
      */
    def consumeSync(namespace: String): Boolean = js.native
    
    /**
      * FastRateLimit.prototype.hasToken
      */
    def hasToken(namespace: String): js.Promise[Unit] = js.native
    
    /**
      * FastRateLimit.prototype.hasTokenSync
      */
    def hasTokenSync(namespace: String): Boolean = js.native
  }
  
  trait FastRateLimitOptions extends StObject {
    
    var threshold: Double
    
    // available tokens over timespan
    var ttl: Double
  }
  object FastRateLimitOptions {
    
    @scala.inline
    def apply(threshold: Double, ttl: Double): FastRateLimitOptions = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastRateLimitOptions]
    }
    
    @scala.inline
    implicit class FastRateLimitOptionsMutableBuilder[Self <: FastRateLimitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
}
