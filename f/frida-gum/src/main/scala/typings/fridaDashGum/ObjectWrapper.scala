package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWrapper extends NativePointerValue {
  var handle: NativePointer
}

object ObjectWrapper {
  @scala.inline
  def apply(handle: NativePointer): ObjectWrapper = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectWrapper]
  }
}

