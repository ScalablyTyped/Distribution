package typings.getStdin

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Get [`stdin`](https://nodejs.org/api/process.html#process_process_stdin) as a `string`.
    	@returns A promise that is resolved when the `end` event fires on the `stdin` stream, indicating that there is no more data to be read. In a TTY context, an empty `string` is returned.
    	@example
    	```
    	// example.ts
    	import getStdin from 'get-stdin';
    	console.log(await getStdin());
    	//=> 'unicorns'
    	// $ echo unicorns | ts-node example.ts
    	// unicorns
    	```
    	*/
    inline def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
    
    @JSImport("get-stdin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Get [`stdin`](https://nodejs.org/api/process.html#process_process_stdin) as a `Buffer`.
    	@returns A promise that is resolved when the `end` event fires on the `stdin` stream, indicating that there is no more data to be read. In a TTY context, an empty `Buffer` is returned.
    	*/
    inline def buffer(): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")().asInstanceOf[js.Promise[Buffer]]
  }
}
