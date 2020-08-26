package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.collapsed
import typings.devextreme.devextremeStrings.disabled
import typings.devextreme.devextremeStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs extends js.Object {
  var tabs: js.UndefOr[js.Array[Groups]] = js.native
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.native
}

object Tabs {
  @scala.inline
  def apply(): Tabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tabs]
  }
  @scala.inline
  implicit class TabsOps[Self <: Tabs] (val x: Self) extends AnyVal {
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
    def setTabsVarargs(value: Groups*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Groups]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setVisibility(value: auto | visible | collapsed | disabled): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

