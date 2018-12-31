package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationTabBackstageSettingsPage extends js.Object {
  /** Specifies the id of HTML elements like div,ul, etc., as ribbon backstage page's tab content.
    * @Default {null}
    */
  var contentID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the separator between backstage page's tab and button elements.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the id for ribbon backstage page's tab and button elements.
    * @Default {null}
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type for ribbon backstage page's contents. Set &quot;ej.Ribbon.BackStageItemType.Tab&quot; to render the tab or &quot;ej.Ribbon.BackStageItemType.Button&quot; to
    * render the button.
    * @Default {ej.Ribbon.ItemType.Tab}
    */
  var itemType: js.UndefOr[ItemType | java.lang.String] = js.undefined
  /** Specifies the text for ribbon backstage page's tab header and button elements.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

