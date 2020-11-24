package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodDispatcher[Holder /* <: Members[Holder] */] extends Method[Holder] {
  
  /**
    * Obtains a specific overload.
    *
    * @param args Signature of the overload to obtain.
    *             For example: `"java.lang.String", "int"`.
    */
  def overload(args: String*): Method[Holder] = js.native
  
  /**
    * Available overloads.
    */
  var overloads: js.Array[Method[Holder]] = js.native
}
