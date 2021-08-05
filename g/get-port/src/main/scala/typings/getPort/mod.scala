package typings.getPort

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get an available TCP port number.
  	@returns Port number.
  	@example
  	```
  	import getPort = require('get-port');
  	(async () => {
  		console.log(await getPort());
  		//=> 51402
  		// Pass in a preferred port
  		console.log(await getPort({port: 3000}));
  		// Will use 3000 if available, otherwise fall back to a random port
  		// Pass in an array of preferred ports
  		console.log(await getPort({port: [3000, 3001, 3002]}));
  		// Will use any element in the preferred ports array if available, otherwise fall back to a random port
  	})();
  	```
  	*/
  inline def apply(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Double]]
  inline def apply(options: Options): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @JSImport("get-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Make a range of ports `from`...`to`.
  	@param from - First port of the range. Must be in the range `1024`...`65535`.
  	@param to - Last port of the range. Must be in the range `1024`...`65535` and must be greater than `from`.
  	@returns The ports in the range.
  	@example
  	```
  	import getPort = require('get-port');
  	(async () => {
  		console.log(await getPort({port: getPort.makeRange(3000, 3100)}));
  		// Will use any port from 3000 to 3100, otherwise fall back to a random port
  	})();
  	```
  	*/
  inline def makeRange(from: Double, to: Double): Iterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRange")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Iterable[Double]]
  
  /* Inlined parent std.Omit<node.net.ListenOptions, 'port'> */
  trait Options extends StObject {
    
    var backlog: js.UndefOr[Double] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
    		The host on which port resolution should be performed. Can be either an IPv4 or IPv6 address.
    		*/
    val host: js.UndefOr[String] = js.undefined
    
    var ipv6Only: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    /**
    		A preferred port or an iterable of preferred ports to use.
    		*/
    val port: js.UndefOr[Double | Iterable[Double]] = js.undefined
    
    var readableAll: js.UndefOr[Boolean] = js.undefined
    
    var writableAll: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIpv6Only(value: Boolean): Self = StObject.set(x, "ipv6Only", value.asInstanceOf[js.Any])
      
      inline def setIpv6OnlyUndefined: Self = StObject.set(x, "ipv6Only", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double | Iterable[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReadableAll(value: Boolean): Self = StObject.set(x, "readableAll", value.asInstanceOf[js.Any])
      
      inline def setReadableAllUndefined: Self = StObject.set(x, "readableAll", js.undefined)
      
      inline def setWritableAll(value: Boolean): Self = StObject.set(x, "writableAll", value.asInstanceOf[js.Any])
      
      inline def setWritableAllUndefined: Self = StObject.set(x, "writableAll", js.undefined)
    }
  }
}
