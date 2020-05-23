package typings.fridaGum.ObjC

import typings.fridaGum.AnyFunction
import typings.fridaGum.ObjectWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamically generated language binding for any Objective-C block.
  *
  * Also supports implementing a block from scratch by passing in an
  * implementation.
  */
@js.native
trait Block extends ObjectWrapper {
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  @JSName("implementation")
  var implementation_Original: AnyFunction = js.native
  /**
    * Signature, if available.
    */
  var types: js.UndefOr[String] = js.native
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  def implementation(args: js.Any*): js.Any = js.native
}

