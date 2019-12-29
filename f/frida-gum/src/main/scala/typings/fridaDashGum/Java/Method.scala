package typings.fridaDashGum.Java

import typings.fridaDashGum.NativeFunctionOptions
import typings.fridaDashGum.NativePointer
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
  var handle: NativePointer = js.native
  /**
    * Class that this method belongs to.
    */
  var holder: Wrapper = js.native
  /**
    * Implementation. Assign a new implementation to this property to
    * replace the original implementation. Assign `null` at a future point
    * to revert back to the original implementation.
    */
  var implementation: MethodImplementation | Null = js.native
  /**
    * Name of this method.
    */
  var methodName: String = js.native
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
  def canInvokeWith(args: js.Any*): Boolean = js.native
  /**
    * Makes a new method wrapper with custom NativeFunction options.
    *
    * Useful for e.g. setting `traps: "all"` to perform execution tracing
    * in conjunction with Stalker.
    */
  def clone(options: NativeFunctionOptions): Method = js.native
}

