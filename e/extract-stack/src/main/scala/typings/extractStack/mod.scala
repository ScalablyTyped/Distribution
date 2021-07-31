package typings.extractStack

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Extract the actual stack of an error.
  	It gracefully handles cases where the stack is undefined or empty and returns an empty string.
  	@param error - Either an `Error` or the `.stack` of an `Error`.
  	@returns The actual stack part of the error stack.
  	@example
  	```
  	import extractStack = require('extract-stack');
  	const error = new Error('Missing unicorn');
  	console.log(error.stack);
  	Error: Missing unicorn
  	// 	at Object.<anonymous> (/Users/sindresorhus/dev/extract-stack/unicorn.js:2:15)
  	// 	at Module._compile (module.js:409:26)
  	// 	at Module.load (module.js:343:32)
  	// 	at startup (node.js:139:18)
  	console.log(extractStack(error));
  	// 	at Object.<anonymous> (/Users/sindresorhus/dev/extract-stack/unicorn.js:2:15)
  	// 	at Module._compile (module.js:409:26)
  	// 	at Module.load (module.js:343:32)
  	// 	at startup (node.js:139:18)
  	```
  	 */
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(error: String): String = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(error: Error): String = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("extract-stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Extract the actual stack of an error as an array of lines.
  	@param error - Either an `Error` or the `.stack` of an `Error`.
  	@returns The stack lines of the error stack without the noise.
  	@example
  	```
  	import extractStack = require('extract-stack');
  	const error = new Error('Missing unicorn');
  	console.log(error.stack);
  	Error: Missing unicorn
  	// 	at Object.<anonymous> (/Users/sindresorhus/dev/extract-stack/unicorn.js:2:15)
  	// 	at Module._compile (module.js:409:26)
  	// 	at Module.load (module.js:343:32)
  	// 	at startup (node.js:139:18)
  	console.log(extractStack.lines(error));
  	// [
  	// 	'Object.<anonymous> (/Users/sindresorhus/dev/extract-stack/unicorn.js:2:15)'
  	// 	'Module._compile (module.js:409:26)'
  	// 	'Module.load (module.js:343:32)'
  	// 	'startup (node.js:139:18)'
  	// ]
  	```
  	 */
  @scala.inline
  def lines(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lines")().asInstanceOf[js.Array[String]]
  @scala.inline
  def lines(error: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lines")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def lines(error: Error): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lines")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
