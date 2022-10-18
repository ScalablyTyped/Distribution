package typings.dnsOverHttpResolver

import typings.dnsOverHttpResolver.distSrcUtilsMod.DNSJSON
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * DNS over HTTP resolver.
    * Uses a list of servers to resolve DNS records with HTTP requests.
    */
  @JSImport("dns-over-http-resolver", JSImport.Default)
  @js.native
  /**
    * @class
    * @param {object} [options]
    * @param {number} [options.maxCache = 100] - maximum number of cached dns records
    * @param {Request} [options.request] - function to return DNSJSON
    */
  open class default ()
    extends StObject
       with Resolver {
    def this(options: ResolverOptions) = this()
  }
  
  type Request = js.Function2[/* resource */ String, /* signal */ AbortSignal, js.Promise[DNSJSON]]
  
  /**
    * DNS over HTTP resolver.
    * Uses a list of servers to resolve DNS records with HTTP requests.
    */
  @js.native
  trait Resolver extends StObject {
    
    /* private */ val _TXTcache: Any = js.native
    
    /* private */ var _abortControllers: Any = js.native
    
    /* private */ val _cache: Any = js.native
    
    /**
      * Get a shuffled array of the IP addresses currently configured for DNS resolution.
      * These addresses are formatted according to RFC 5952. It can include a custom port.
      */
    def _getShuffledServers(): js.Array[String] = js.native
    
    /* private */ val _request: Any = js.native
    
    /* private */ var _servers: Any = js.native
    
    /**
      * Cancel all outstanding DNS queries made by this resolver. Any outstanding
      * requests will be aborted and promises rejected.
      */
    def cancel(): Unit = js.native
    
    def clearCache(): Unit = js.native
    
    /**
      * Get an array of the IP addresses currently configured for DNS resolution.
      * These addresses are formatted according to RFC 5952. It can include a custom port.
      */
    def getServers(): js.Array[String] = js.native
    
    /**
      * Uses the DNS protocol to resolve the given host name into the appropriate DNS record
      *
      * @param {string} hostname - host name to resolve
      * @param {string} [rrType = 'A'] - resource record type
      */
    def resolve(hostname: String): js.Promise[js.Array[js.Array[String] | String]] = js.native
    def resolve(hostname: String, rrType: String): js.Promise[js.Array[js.Array[String] | String]] = js.native
    
    /**
      * Uses the DNS protocol to resolve the given host name into IPv4 addresses
      *
      * @param {string} hostname - host name to resolve
      */
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Uses the DNS protocol to resolve the given host name into IPv6 addresses
      *
      * @param {string} hostname - host name to resolve
      */
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Uses the DNS protocol to resolve the given host name into a Text record
      *
      * @param {string} hostname - host name to resolve
      */
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
    
    /**
      * Sets the IP address and port of servers to be used when performing DNS resolution.
      *
      * @param {string[]} servers - array of RFC 5952 formatted addresses.
      */
    def setServers(servers: js.Array[String]): Unit = js.native
  }
  
  trait ResolverOptions extends StObject {
    
    var maxCache: js.UndefOr[Double] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
  }
  object ResolverOptions {
    
    inline def apply(): ResolverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverOptions]
    }
    
    extension [Self <: ResolverOptions](x: Self) {
      
      inline def setMaxCache(value: Double): Self = StObject.set(x, "maxCache", value.asInstanceOf[js.Any])
      
      inline def setMaxCacheUndefined: Self = StObject.set(x, "maxCache", js.undefined)
      
      inline def setRequest(value: (/* resource */ String, /* signal */ AbortSignal) => js.Promise[DNSJSON]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
}
