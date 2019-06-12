package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  /**
    * Method argument types.
    */
  var argumentTypes: js.Array[Type] = js.native
  /**
    * Pointer to the VM's underlying method object.
    */
  var handle: fridaDashGumLib.NativePointer = js.native
  /**
    * Class that this method belongs to.
    */
  var holder: Wrapper = js.native
  /**
    * Name of this method.
    */
  var methodName: java.lang.String = js.native
  /**
    * Method return type.
    */
  var returnType: Type = js.native
  /**
    * What kind of method this is, i.e. constructor vs static vs instance.
    */
  var `type`: MethodType = js.native
  def apply(params: js.Any*): js.Any = js.native
  /**
    * Queries whether the method may be invoked with a given argument list.
    */
  def canInvokeWith(args: js.Any*): scala.Boolean = js.native
  /**
    * Implementation. Assign to this property to replace it.
    */
  def implementation(params: js.Any*): js.Any = js.native
}

