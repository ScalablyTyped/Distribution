package typings.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataViewModel extends IModel {
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
}

object IDataViewModel {
  @scala.inline
  def apply(): IDataViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataViewModel]
  }
  @scala.inline
  implicit class IDataViewModelOps[Self <: IDataViewModel] (val x: Self) extends AnyVal {
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
    def setEnableKeyNav(value: Boolean): Self = this.set("enableKeyNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyNav: Self = this.set("enableKeyNav", js.undefined)
  }
  
}

