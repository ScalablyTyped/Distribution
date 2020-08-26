package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientProxy
  extends typings.extjs.Ext.data.proxy.IProxy {
  /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
}

object IClientProxy {
  @scala.inline
  def apply(): IClientProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientProxy]
  }
  @scala.inline
  implicit class IClientProxyOps[Self <: IClientProxy] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
  }
  
}

