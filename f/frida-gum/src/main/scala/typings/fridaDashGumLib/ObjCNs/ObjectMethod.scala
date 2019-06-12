package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ObjC.ObjectMethod")
@js.native
class ObjectMethod ()
  extends fridaDashGumLib.ObjectWrapper {
  /**
    * Argument type names.
    */
  var argumentTypes: java.lang.String = js.native
  /* CompleteClass */
  override var handle: fridaDashGumLib.NativePointer = js.native
  /**
    * Current implementation.
    *
    * You may replace it by assigning to this property. See `ObjC.implement()` for details.
    */
  var implementation: fridaDashGumLib.AnyFunction | fridaDashGumLib.NativePointer = js.native
  /**
    * Return type name.
    */
  var returnType: java.lang.String = js.native
  /**
    * Objective-C selector. Use `ObjC.selectorAsString()` to convert it to a string.
    */
  var selector: fridaDashGumLib.NativePointer = js.native
  /**
    * Signature.
    */
  var types: java.lang.String = js.native
}

