package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroup extends js.Object {
  /** Specifies the alignment of controls in the groups in 'row' type or 'column' type. Value for row type is &quot;ej.Ribbon.AlignType.Rows&quot; and for column type is
    * &quot;ej.Ribbon.alignType.columns&quot;.
    * @Default {ej.Ribbon.AlignType.Rows}
    */
  var alignType: js.UndefOr[AlignType | java.lang.String] = js.undefined
  /** Specifies the Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls to the groups in the ribbon control.
    * @Default {Array}
    */
  var content: js.UndefOr[js.Array[TabsGroupsContent]] = js.undefined
  /** Specifies the ID of custom items to be placed in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the HTML contents to place into the groups.
    * @Default {null}
    */
  var customContent: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the group expander for groups in the ribbon control. Set &quot;true&quot; to enable the group expander.
    * @Default {false}
    */
  var enableGroupExpander: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets custom setting to the groups in the ribbon control.
    * @Default {Object}
    */
  var groupExpanderSettings: js.UndefOr[TabsGroupsGroupExpanderSettings] = js.undefined
  /** Specifies the text to the groups in the ribbon control.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the custom items such as div, table, controls by using the &quot;custom&quot; type.
    * @Default {null}
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TabsGroup {
  @scala.inline
  def apply(
    alignType: AlignType | java.lang.String = null,
    content: js.Array[TabsGroupsContent] = null,
    contentID: java.lang.String = null,
    customContent: java.lang.String = null,
    enableGroupExpander: js.UndefOr[scala.Boolean] = js.undefined,
    groupExpanderSettings: TabsGroupsGroupExpanderSettings = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): TabsGroup = {
    val __obj = js.Dynamic.literal()
    if (alignType != null) __obj.updateDynamic("alignType")(alignType.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentID != null) __obj.updateDynamic("contentID")(contentID)
    if (customContent != null) __obj.updateDynamic("customContent")(customContent)
    if (!js.isUndefined(enableGroupExpander)) __obj.updateDynamic("enableGroupExpander")(enableGroupExpander)
    if (groupExpanderSettings != null) __obj.updateDynamic("groupExpanderSettings")(groupExpanderSettings)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabsGroup]
  }
}

