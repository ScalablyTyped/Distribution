package typings.fridaGum.ObjC

import typings.fridaGum.NativePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyInstance extends js.Object {
  var handle: NativePointer = js.native
}

object ProxyInstance {
  @scala.inline
  def apply(handle: NativePointer): ProxyInstance = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyInstance]
  }
  @scala.inline
  implicit class ProxyInstanceOps[Self <: ProxyInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandle(value: NativePointer): Self = this.set("handle", value.asInstanceOf[js.Any])
  }
  
}

