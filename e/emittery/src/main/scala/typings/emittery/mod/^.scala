package typings.emittery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emittery", JSImport.Namespace)
@js.native
class ^ () extends Emittery
@JSImport("emittery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Fires when an event listener was added.
  	An object with `listener` and `eventName` (if `on` or `off` was used) is provided as event data.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	emitter.on(Emittery.listenerAdded, ({listener, eventName}) => {
  		console.log(listener);
  		//=> data => {}
  		console.log(eventName);
  		//=> '🦄'
  	});
  	emitter.on('🦄', data => {
  		// Handle data
  	});
  	```
  	*/
  val listenerAdded: js.Symbol = js.native
  
  /**
  	Fires when an event listener was removed.
  	An object with `listener` and `eventName` (if `on` or `off` was used) is provided as event data.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	const off = emitter.on('🦄', data => {
  		// Handle data
  	});
  	emitter.on(Emittery.listenerRemoved, ({listener, eventName}) => {
  		console.log(listener);
  		//=> data => {}
  		console.log(eventName);
  		//=> '🦄'
  	});
  	off();
  	```
  	*/
  val listenerRemoved: js.Symbol = js.native
  
  /**
  	In TypeScript, it returns a decorator which mixins `Emittery` as property `emitteryPropertyName` and `methodNames`, or all `Emittery` methods if `methodNames` is not defined, into the target class.
  	@example
  	```
  	import Emittery = require('emittery');
  	@Emittery.mixin('emittery')
  	class MyClass {}
  	const instance = new MyClass();
  	instance.emit('event');
  	```
  	*/
  def mixin(emitteryPropertyName: String): js.Function = js.native
  def mixin(emitteryPropertyName: String, methodNames: js.Array[String]): js.Function = js.native
  def mixin(emitteryPropertyName: js.Symbol): js.Function = js.native
  def mixin(emitteryPropertyName: js.Symbol, methodNames: js.Array[String]): js.Function = js.native
}
