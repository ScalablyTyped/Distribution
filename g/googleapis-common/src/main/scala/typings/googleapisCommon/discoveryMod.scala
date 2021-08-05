package typings.googleapisCommon

import typings.googleapisCommon.anon.Url
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.endpointMod.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoveryMod {
  
  @JSImport("googleapis-common/build/src/discovery", "Discovery")
  @js.native
  class Discovery protected () extends StObject {
    /**
      * Discovery for discovering API endpoints
      *
      * @param options Options for discovery
      */
    def this(options: DiscoveryOptions) = this()
    
    /**
      * Generate API file given discovery URL
      *
      * @param apiDiscoveryUrl URL or filename of discovery doc for API
      * @returns A promise that resolves with a function that creates the endpoint
      */
    def discoverAPI(apiDiscoveryUrl: String): js.Promise[EndpointCreator] = js.native
    def discoverAPI(apiDiscoveryUrl: Url): js.Promise[EndpointCreator] = js.native
    
    /**
      * Generate all APIs and return as in-memory object.
      * @param discoveryUrl
      */
    def discoverAllAPIs(discoveryUrl: String): js.Promise[js.Object] = js.native
    
    /**
      * Log output of generator. Works just like console.log
      */
    /* private */ var log: js.Any = js.native
    
    /**
      * Generate and Endpoint from an endpoint schema object.
      *
      * @param schema The schema from which to generate the Endpoint.
      * @return A function that creates an endpoint.
      */
    /* private */ var makeEndpoint: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var transporter: js.Any = js.native
  }
  
  trait DiscoveryOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var includePrivate: js.UndefOr[Boolean] = js.undefined
  }
  object DiscoveryOptions {
    
    inline def apply(): DiscoveryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscoveryOptions]
    }
    
    extension [Self <: DiscoveryOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIncludePrivate(value: Boolean): Self = StObject.set(x, "includePrivate", value.asInstanceOf[js.Any])
      
      inline def setIncludePrivateUndefined: Self = StObject.set(x, "includePrivate", js.undefined)
    }
  }
  
  type EndpointCreator = js.Function2[/* options */ GlobalOptions, /* google */ js.Object, Endpoint]
}
