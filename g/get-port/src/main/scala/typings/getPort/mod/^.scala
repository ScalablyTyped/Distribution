package typings.getPort.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-port", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(): js.Promise[Double] = js.native
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
  def makeRange(from: Double, to: Double): Iterable[Double] = js.native
}
