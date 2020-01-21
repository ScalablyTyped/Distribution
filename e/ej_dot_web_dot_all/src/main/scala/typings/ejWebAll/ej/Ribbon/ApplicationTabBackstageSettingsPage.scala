package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationTabBackstageSettingsPage extends js.Object {
  /** Specifies the id of HTML elements like div,ul, etc., as ribbon backstage page's tab content.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.undefined
  /** Specifies the separator between backstage page's tab and button elements.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.undefined
  /** Specifies the id for ribbon backstage page's tab and button elements.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Specifies the type for ribbon backstage page's contents. Set &quot;ej.Ribbon.BackStageItemType.Tab&quot; to render the tab or &quot;ej.Ribbon.BackStageItemType.Button&quot; to
    * render the button.
    * @Default {ej.Ribbon.ItemType.Tab}
    */
  var itemType: js.UndefOr[ItemType | String] = js.undefined
  /** Specifies the text for ribbon backstage page's tab header and button elements.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
}

object ApplicationTabBackstageSettingsPage {
  @scala.inline
  def apply(
    contentID: String = null,
    enableSeparator: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemType: ItemType | String = null,
    text: String = null
  ): ApplicationTabBackstageSettingsPage = {
    val __obj = js.Dynamic.literal()
    if (contentID != null) __obj.updateDynamic("contentID")(contentID.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeparator)) __obj.updateDynamic("enableSeparator")(enableSeparator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationTabBackstageSettingsPage]
  }
}

