package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroup extends js.Object {
  /** Specifies the alignment of controls in the groups in 'row' type or 'column' type. Value for row type is &quot;ej.Ribbon.AlignType.Rows&quot; and for column type is
    * &quot;ej.Ribbon.alignType.columns&quot;.
    * @Default {ej.Ribbon.AlignType.Rows}
    */
  var alignType: js.UndefOr[AlignType | String] = js.undefined
  /** Specifies the Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls to the groups in the ribbon control.
    * @Default {Array}
    */
  var content: js.UndefOr[js.Array[TabsGroupsContent]] = js.undefined
  /** Specifies the ID of custom items to be placed in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.undefined
  /** Specifies the HTML contents to place into the groups.
    * @Default {null}
    */
  var customContent: js.UndefOr[String] = js.undefined
  /** Specifies the group expander for groups in the ribbon control. Set &quot;true&quot; to enable the group expander.
    * @Default {false}
    */
  var enableGroupExpander: js.UndefOr[Boolean] = js.undefined
  /** Sets custom setting to the groups in the ribbon control.
    * @Default {Object}
    */
  var groupExpanderSettings: js.UndefOr[TabsGroupsGroupExpanderSettings] = js.undefined
  /** Specifies the text to the groups in the ribbon control.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the custom items such as div, table, controls by using the &quot;custom&quot; type.
    * @Default {null}
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TabsGroup {
  @scala.inline
  def apply(
    alignType: AlignType | String = null,
    content: js.Array[TabsGroupsContent] = null,
    contentID: String = null,
    customContent: String = null,
    enableGroupExpander: js.UndefOr[Boolean] = js.undefined,
    groupExpanderSettings: TabsGroupsGroupExpanderSettings = null,
    text: String = null,
    `type`: String = null
  ): TabsGroup = {
    val __obj = js.Dynamic.literal()
    if (alignType != null) __obj.updateDynamic("alignType")(alignType.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentID != null) __obj.updateDynamic("contentID")(contentID.asInstanceOf[js.Any])
    if (customContent != null) __obj.updateDynamic("customContent")(customContent.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupExpander)) __obj.updateDynamic("enableGroupExpander")(enableGroupExpander.get.asInstanceOf[js.Any])
    if (groupExpanderSettings != null) __obj.updateDynamic("groupExpanderSettings")(groupExpanderSettings.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsGroup]
  }
}

