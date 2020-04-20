package typings.fridaGum.ObjC

import typings.fridaGum.NativePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyInstance extends js.Object {
  var handle: NativePointer
}

object ProxyInstance {
  @scala.inline
  def apply(handle: NativePointer): ProxyInstance = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyInstance]
  }
}

