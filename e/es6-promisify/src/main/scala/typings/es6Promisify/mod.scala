package typings.es6Promisify

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object promisify {
    
    inline def apply(original: CallbackFunction): PromiseFunction = ^.asInstanceOf[js.Dynamic].apply(original.asInstanceOf[js.Any]).asInstanceOf[PromiseFunction]
    inline def apply[T](original: js.Function1[/* cb */ Callback[T], Any]): js.Function0[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].apply(original.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[T]]]
    inline def apply[T, U](original: js.Function2[/* param1 */ U, /* cb */ Callback[T], Any]): js.Function1[/* param1 */ U, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].apply(original.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param1 */ U, js.Promise[T]]]
    inline def apply[T, U, V](original: js.Function3[/* param1 */ U, /* param2 */ V, /* cb */ Callback[T], Any]): js.Function2[/* param1 */ U, /* param2 */ V, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].apply(original.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* param1 */ U, /* param2 */ V, js.Promise[T]]]
    inline def apply[T, U, V, W](original: js.Function4[/* param1 */ U, /* param2 */ V, /* param3 */ W, /* cb */ Callback[T], Any]): js.Function3[/* param1 */ U, /* param2 */ V, /* param3 */ W, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].apply(original.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* param1 */ U, /* param2 */ V, /* param3 */ W, js.Promise[T]]]
    
    @JSImport("es6-promisify", "promisify")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("es6-promisify", "promisify.Promise")
    @js.native
    open class Promise[T] protected ()
      extends StObject
         with typings.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      /* standard es2015.promise */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
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
    inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * This symbol can be placed on the function to be promisified to
      * provide names as an array of strings for the values in a success
      * callback.
      */
    @JSImport("es6-promisify", "promisify.argumentNames")
    @js.native
    val argumentNames: js.Symbol = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ Any, /* arg */ js.UndefOr[T], Any]
  
  @js.native
  trait CallbackFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  @js.native
  trait PromiseFunction extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
}
