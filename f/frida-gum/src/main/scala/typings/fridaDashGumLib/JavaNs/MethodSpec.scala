package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSpec extends js.Object {
  /**
    * Argument types. Defaults to `[]` if omitted.
    */
  var argumentTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: fridaDashGumLib.AnyFunction = js.native
  /**
    * Return type. Defaults to `void` if omitted.
    */
  var returnType: js.UndefOr[java.lang.String] = js.native
  /**
    * Implementation.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

