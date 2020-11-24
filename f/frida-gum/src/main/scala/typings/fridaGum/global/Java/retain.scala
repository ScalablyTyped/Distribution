package typings.fridaGum.global.Java

import typings.fridaGum.Java.Members
import typings.fridaGum.Java.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Java.retain")
@js.native
object retain extends js.Object {
  
  /**
    * Duplicates a JavaScript wrapper for later use outside replacement method.
    *
    * @param obj An existing wrapper retrieved from `this` in replacement method.
    */
  def apply[T /* <: Members[T] */](obj: Wrapper[T]): Wrapper[T] = js.native
}
