package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Value that is about to be returned.
  */
@js.native
trait InvocationReturnValue extends NativePointer {
  /**
    * Replaces the return value that would otherwise be returned.
    */
  def replace(value: NativePointerValue): Unit = js.native
}

