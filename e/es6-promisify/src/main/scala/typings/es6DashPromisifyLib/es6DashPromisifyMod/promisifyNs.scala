package typings
package es6DashPromisifyLib.es6DashPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-promisify", "promisify")
@js.native
object promisifyNs extends js.Object {
  @js.native
  class Promise[T] protected ()
    extends stdLib.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
          /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
          scala.Unit
        ]) = this()
  }
  
  /**
    * The user can supply their own Promise implementation by setting it
    * here. Otherwise, the global Promise object will be used.
    */
  var Promise: stdLib.PromiseConstructor = js.native
  /**
    * This symbol can be placed on the function to be promisified to
    * provide names as an array of strings for the values in a success
    * callback.
    */
  val argumentNames: js.Symbol = js.native
}

