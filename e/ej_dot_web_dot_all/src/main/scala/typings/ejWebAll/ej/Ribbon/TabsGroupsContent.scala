package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContent extends js.Object {
  /** Specifies the height, width, type, isBig property to the controls in the group commonly.
    * @Default {Object}
    */
  var defaults: js.UndefOr[TabsGroupsContentDefaults] = js.native
  /** Specifies the controls such as Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls in the subgroup of the ribbon tab .
    * @Default {Array}
    */
  var groups: js.UndefOr[js.Array[TabsGroupsContentGroup]] = js.native
}

object TabsGroupsContent {
  @scala.inline
  def apply(): TabsGroupsContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContent]
  }
  @scala.inline
  implicit class TabsGroupsContentOps[Self <: TabsGroupsContent] (val x: Self) extends AnyVal {
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
    def setDefaults(value: TabsGroupsContentDefaults): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: TabsGroupsContentGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[TabsGroupsContentGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
  }
  
}

