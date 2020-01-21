package typings.getStdin

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("get-stdin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  	Get [`stdin`](https://nodejs.org/api/process.html#process_process_stdin) as a `string`.
  	@returns A promise that is resolved when the `end` event fires on the `stdin` stream, indicating that there is no more data to be read. In a TTY context, an empty `string` is returned.
  	@example
  	```
  	// example.ts
  	import getStdin = require('get-stdin');
  	(async () => {
  		console.log(await getStdin());
  		//=> 'unicorns'
  	})
  	// $ echo unicorns | ts-node example.ts
  	// unicorns
  	```
  	*/
  def apply(): js.Promise[String] = js.native
  /**
  	Get [`stdin`](https://nodejs.org/api/process.html#process_process_stdin) as a `Buffer`.
  	@returns A promise that is resolved when the `end` event fires on the `stdin` stream, indicating that there is no more data to be read. In a TTY context, an empty `Buffer` is returned.
  	*/
  def buffer(): js.Promise[Buffer] = js.native
}

