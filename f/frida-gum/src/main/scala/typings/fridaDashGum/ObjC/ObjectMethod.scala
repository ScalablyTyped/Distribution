package typings.fridaDashGum.ObjC

import typings.fridaDashGum.AnyFunction
import typings.fridaDashGum.NativeFunctionOptions
import typings.fridaDashGum.NativePointer
import typings.fridaDashGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMethod
  extends AnyFunction
     with ObjectWrapper {
  /**
    * Argument type names.
    */
  var argumentTypes: js.Array[String] = js.native
  /**
    * Current implementation.
    *
    * You may replace it by assigning to this property. See `ObjC.implement()` for details.
    */
  var implementation: NativePointer = js.native
  /**
    * Return type name.
    */
  var returnType: String = js.native
  /**
    * Objective-C selector. Use `ObjC.selectorAsString()` to convert it to a string.
    */
  var selector: NativePointer = js.native
  /**
    * Signature.
    */
  var types: String = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* repeated */ js.Any): js.Any = js.native
  /**
    * Makes a new method wrapper with custom NativeFunction options.
    *
    * Useful for e.g. setting `traps: "all"` to perform execution tracing
    * in conjunction with Stalker.
    */
  def clone(options: NativeFunctionOptions): ObjectMethod = js.native
}

