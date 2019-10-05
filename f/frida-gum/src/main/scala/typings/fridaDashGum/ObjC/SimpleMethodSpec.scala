package typings.fridaDashGum.ObjC

import typings.fridaDashGum.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMethodSpec extends MethodSpec {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: AnyFunction = js.native
  /**
    * Return type.
    */
  var retType: String = js.native
  /**
    * Implementation.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

