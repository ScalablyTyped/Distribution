package typings.fridaGum.global.Java

import typings.fridaGum.Java.Members
import typings.fridaGum.Java.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Java.use")
@js.native
object use extends js.Object {
  
  /**
    * Dynamically generates a JavaScript wrapper for `className` that you can
    * instantiate objects from by calling `$new()` on to invoke a constructor.
    * Call `$dispose()` on an instance to clean it up explicitly, or wait for
    * the JavaScript object to get garbage-collected, or script to get
    * unloaded. Static and non-static methods are available, and you can even
    * replace method implementations.
    *
    * Uses the app's class loader, but you may access classes on other loaders
    * by calling `Java.ClassFactory.get()`.
    *
    * @param className Canonical class name to get a wrapper for.
    */
  def apply[T /* <: Members[T] */](className: String): Wrapper[T] = js.native
}
