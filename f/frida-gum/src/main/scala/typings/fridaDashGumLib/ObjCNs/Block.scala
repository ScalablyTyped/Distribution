package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C block. Also supports implementing a block from
  * scratch by passing in a MethodDefinition.
  */
@JSGlobal("ObjC.Block")
@js.native
class Block protected ()
  extends fridaDashGumLib.ObjectWrapper {
  def this(target: fridaDashGumLib.NativePointer) = this()
  def this(target: MethodSpec) = this()
  /* CompleteClass */
  override var handle: fridaDashGumLib.NativePointer = js.native
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  @JSName("implementation")
  var implementation_Original: fridaDashGumLib.AnyFunction = js.native
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

