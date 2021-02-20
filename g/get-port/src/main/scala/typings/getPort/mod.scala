package typings.getPort

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("get-port", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Double] = js.native
  @JSImport("get-port", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[Double] = js.native
  
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
  @JSImport("get-port", "makeRange")
  @js.native
  def makeRange(from: Double, to: Double): Iterable[Double] = js.native
  
  /* Inlined parent std.Omit<node.net.ListenOptions, 'port'> */
  @js.native
  trait Options extends StObject {
    
    var backlog: js.UndefOr[Double] = js.native
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    /**
    		The host on which port resolution should be performed. Can be either an IPv4 or IPv6 address.
    		*/
    val host: js.UndefOr[String] = js.native
    
    var ipv6Only: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    /**
    		A preferred port or an iterable of preferred ports to use.
    		*/
    val port: js.UndefOr[Double | Iterable[Double]] = js.native
    
    var readableAll: js.UndefOr[Boolean] = js.native
    
    var writableAll: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIpv6Only(value: Boolean): Self = StObject.set(x, "ipv6Only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6OnlyUndefined: Self = StObject.set(x, "ipv6Only", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double | Iterable[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReadableAll(value: Boolean): Self = StObject.set(x, "readableAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableAllUndefined: Self = StObject.set(x, "readableAll", js.undefined)
      
      @scala.inline
      def setWritableAll(value: Boolean): Self = StObject.set(x, "writableAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableAllUndefined: Self = StObject.set(x, "writableAll", js.undefined)
    }
  }
}
