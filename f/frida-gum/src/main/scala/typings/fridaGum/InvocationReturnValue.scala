package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
