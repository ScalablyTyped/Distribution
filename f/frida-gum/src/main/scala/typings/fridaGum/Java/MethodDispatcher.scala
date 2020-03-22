package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDispatcher[Holder /* <: Members[Holder] */] extends Method[Holder] {
  /**
    * Available overloads.
    */
  var overloads: js.Array[Method[Holder]] = js.native
  /**
    * Obtains a specific overload.
    *
    * @param args Signature of the overload to obtain.
    *             For example: `"java.lang.String", "int"`.
    */
  def overload(args: String*): Method[Holder] = js.native
}

