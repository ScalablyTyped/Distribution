package typings.fridaDashGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDispatcher extends Method {
  /**
    * Available overloads.
    */
  var overloads: js.Array[Method] = js.native
  /**
    * Obtains a specific overload.
    *
    * @param args Signature of the overload to obtain.
    *             For example: `"java.lang.String", "int"`.
    */
  def overload(args: String*): Method = js.native
}

