package typings.fridaGum.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gc")
@js.native
object gc extends js.Object {
  
  /**
    * Forces garbage collection.
    *
    * Useful for testing `WeakRef.bind()` logic, but also sometimes needed when
    * using the Duktape runtime and its default GC heuristics proving a bit too
    * lazy.
    */
  def apply(): Unit = js.native
}
