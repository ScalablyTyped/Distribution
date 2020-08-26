package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroup extends js.Object {
  /** Specifies the alignment of controls in the groups in 'row' type or 'column' type. Value for row type is &quot;ej.Ribbon.AlignType.Rows&quot; and for column type is
    * &quot;ej.Ribbon.alignType.columns&quot;.
    * @Default {ej.Ribbon.AlignType.Rows}
    */
  var alignType: js.UndefOr[AlignType | String] = js.native
  /** Specifies the Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls to the groups in the ribbon control.
    * @Default {Array}
    */
  var content: js.UndefOr[js.Array[TabsGroupsContent]] = js.native
  /** Specifies the ID of custom items to be placed in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.native
  /** Specifies the HTML contents to place into the groups.
    * @Default {null}
    */
  var customContent: js.UndefOr[String] = js.native
  /** Specifies the group expander for groups in the ribbon control. Set &quot;true&quot; to enable the group expander.
    * @Default {false}
    */
  var enableGroupExpander: js.UndefOr[Boolean] = js.native
  /** Sets custom setting to the groups in the ribbon control.
    * @Default {Object}
    */
  var groupExpanderSettings: js.UndefOr[TabsGroupsGroupExpanderSettings] = js.native
  /** Specifies the text to the groups in the ribbon control.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the custom items such as div, table, controls by using the &quot;custom&quot; type.
    * @Default {null}
    */
  var `type`: js.UndefOr[String] = js.native
}

object TabsGroup {
  @scala.inline
  def apply(): TabsGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroup]
  }
  @scala.inline
  implicit class TabsGroupOps[Self <: TabsGroup] (val x: Self) extends AnyVal {
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
    def setAlignType(value: AlignType | String): Self = this.set("alignType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignType: Self = this.set("alignType", js.undefined)
    @scala.inline
    def setContentVarargs(value: TabsGroupsContent*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[TabsGroupsContent]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentID(value: String): Self = this.set("contentID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentID: Self = this.set("contentID", js.undefined)
    @scala.inline
    def setCustomContent(value: String): Self = this.set("customContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomContent: Self = this.set("customContent", js.undefined)
    @scala.inline
    def setEnableGroupExpander(value: Boolean): Self = this.set("enableGroupExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGroupExpander: Self = this.set("enableGroupExpander", js.undefined)
    @scala.inline
    def setGroupExpanderSettings(value: TabsGroupsGroupExpanderSettings): Self = this.set("groupExpanderSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupExpanderSettings: Self = this.set("groupExpanderSettings", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

