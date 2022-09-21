package typings.googlePublisherTag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The command array accepts a sequence of functions and invokes them in
  * order. It is intended to replace a standard array that is used to enqueue
  * functions to be invoked once GPT is loaded.
  */
trait CommandArray extends StObject {
  
  /**
    * Executes the sequence of functions specified in the arguments in order.
    * @example
    *   googletag.cmd.push(function() {
    *     googletag.defineSlot('/1234567/sports', [160, 600])
    *              .addService(googletag.pubads());
    *   });
    *  @param f A JavaScript function to be executed. The runtime binding will
    * always be
    * [`globalThis`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/globalThis).
    * Consider passing an arrow function to retain the <code>this</code> value
    * of the enclosing lexical context.
    *  @return The number of commands processed so far. This is compatible with
    * <code>Array.push</code>'s return value (the current length of the array).
    */
  def push(f: (js.ThisFunction0[/* globalThis */ /* this */ Any, Unit])*): Double
}
object CommandArray {
  
  inline def apply(push: /* repeated */ js.ThisFunction0[/* globalThis */ /* this */ Any, Unit] => Double): CommandArray = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[CommandArray]
  }
  
  extension [Self <: CommandArray](x: Self) {
    
    inline def setPush(value: /* repeated */ js.ThisFunction0[/* globalThis */ /* this */ Any, Unit] => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
