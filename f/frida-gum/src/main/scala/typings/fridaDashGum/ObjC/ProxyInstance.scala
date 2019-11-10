package typings.fridaDashGum.ObjC

import typings.fridaDashGum.NativePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyInstance extends js.Object {
  var handle: NativePointer
}

object ProxyInstance {
  @scala.inline
  def apply(handle: NativePointer): ProxyInstance = {
    val __obj = js.Dynamic.literal(handle = handle)
  
    __obj.asInstanceOf[ProxyInstance]
  }
}

