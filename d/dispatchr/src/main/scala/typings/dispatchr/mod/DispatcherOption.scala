package typings.dispatchr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherOption extends js.Object {
  var errorHandler: js.UndefOr[js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, Unit]] = js.native
  var stores: js.UndefOr[js.Array[StoreClass]] = js.native
}

object DispatcherOption {
  @scala.inline
  def apply(): DispatcherOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherOption]
  }
  @scala.inline
  implicit class DispatcherOptionOps[Self <: DispatcherOption] (val x: Self) extends AnyVal {
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
    def setErrorHandler(value: (/* e */ DispatcherError, /* context */ DispatcherContext) => Unit): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setStoresVarargs(value: StoreClass*): Self = this.set("stores", js.Array(value :_*))
    @scala.inline
    def setStores(value: js.Array[StoreClass]): Self = this.set("stores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStores: Self = this.set("stores", js.undefined)
  }
  
}

