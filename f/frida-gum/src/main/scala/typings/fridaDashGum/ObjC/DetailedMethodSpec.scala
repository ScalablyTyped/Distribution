package typings.fridaDashGum.ObjC

import typings.fridaDashGum.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedMethodSpec extends MethodSpec {
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: AnyFunction = js.native
  /**
    * Signature.
    */
  var types: String = js.native
  /**
    * Implementation.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

