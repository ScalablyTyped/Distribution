package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMethodSpec extends MethodSpec {
  /**
    * Argument types.
    */
  var argTypes: js.Array[java.lang.String] = js.native
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: fridaDashGumLib.AnyFunction = js.native
  /**
    * Return type.
    */
  var retType: java.lang.String = js.native
  /**
    * Implementation.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

