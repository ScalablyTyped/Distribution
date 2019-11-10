package typings.fridaDashGum.ObjC

import typings.fridaDashGum.AnyFunction
import typings.fridaDashGum.NativePointer
import typings.fridaDashGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C block.
  *
  * Also supports implementing a block from scratch by passing in an
  * implementation.
  */
@JSGlobal("ObjC.Block")
@js.native
class Block protected () extends ObjectWrapper {
  def this(target: NativePointer) = this()
  def this(target: MethodSpec[BlockMethodImplementation]) = this()
  /* CompleteClass */
  override var handle: NativePointer = js.native
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  @JSName("implementation")
  var implementation_Original: AnyFunction = js.native
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

