package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentDefaults extends js.Object {
  /** Specifies the controls height such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the controls size such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {false}
    */
  var isBig: js.UndefOr[Boolean] = js.native
  /** Specifies the controls type such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {ej.Ribbon.Type.Button}
    */
  var `type`: js.UndefOr[String] = js.native
  /** Specifies the controls width such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object TabsGroupsContentDefaults {
  @scala.inline
  def apply(): TabsGroupsContentDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentDefaults]
  }
  @scala.inline
  implicit class TabsGroupsContentDefaultsOps[Self <: TabsGroupsContentDefaults] (val x: Self) extends AnyVal {
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsBig(value: Boolean): Self = this.set("isBig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBig: Self = this.set("isBig", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

