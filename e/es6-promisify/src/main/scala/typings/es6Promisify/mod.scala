package typings.es6Promisify

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object promisify {
    
    @JSImport("es6-promisify", "promisify")
    @js.native
    def apply(original: CallbackFunction): PromiseFunction = js.native
    @JSImport("es6-promisify", "promisify")
    @js.native
    def apply[T, U](original: js.Function2[/* param1 */ U, /* cb */ Callback[T], _]): js.Function1[/* param1 */ U, js.Promise[T]] = js.native
    @JSImport("es6-promisify", "promisify")
    @js.native
    def apply[T, U, V](original: js.Function3[/* param1 */ U, /* param2 */ V, /* cb */ Callback[T], _]): js.Function2[/* param1 */ U, /* param2 */ V, js.Promise[T]] = js.native
    @JSImport("es6-promisify", "promisify")
    @js.native
    def apply[T, U, V, W](original: js.Function4[/* param1 */ U, /* param2 */ V, /* param3 */ W, /* cb */ Callback[T], _]): js.Function3[/* param1 */ U, /* param2 */ V, /* param3 */ W, js.Promise[T]] = js.native
    @JSImport("es6-promisify", "promisify")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("es6-promisify", "promisify.Promise")
    @js.native
    class Promise[T] protected ()
      extends typings.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    /**
      * The user can supply their own Promise implementation by setting it
      * here. Otherwise, the global Promise object will be used.
      */
    @JSImport("es6-promisify", "promisify.Promise")
    @js.native
    def Promise: PromiseConstructor = js.native
    @scala.inline
    def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * This symbol can be placed on the function to be promisified to
      * provide names as an array of strings for the values in a success
      * callback.
      */
    @JSImport("es6-promisify", "promisify.argumentNames")
    @js.native
    val argumentNames: js.Symbol = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* arg */ js.UndefOr[T], js.Any]
  
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type PromiseFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
}
