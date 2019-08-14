package typings.fridaDashGum.ObjCNs

import typings.fridaDashGum.NativePointer
import typings.fridaDashGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ObjC.ObjectMethod")
@js.native
class ObjectMethod () extends ObjectWrapper {
  /**
    * Argument type names.
    */
  var argumentTypes: String = js.native
  /* CompleteClass */
  override var handle: NativePointer = js.native
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
}

