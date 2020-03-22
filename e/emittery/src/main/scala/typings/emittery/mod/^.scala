package typings.emittery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emittery", JSImport.Namespace)
@js.native
class ^ () extends Emittery

@JSImport("emittery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

