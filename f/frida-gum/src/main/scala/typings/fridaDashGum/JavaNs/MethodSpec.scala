package typings.fridaDashGum.JavaNs

import typings.fridaDashGum.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSpec extends js.Object {
  /**
    * Argument types. Defaults to `[]` if omitted.
    */
  var argumentTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: AnyFunction = js.native
  /**
    * Return type. Defaults to `void` if omitted.
    */
  var returnType: js.UndefOr[String] = js.native
  /**
    * Implementation.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

