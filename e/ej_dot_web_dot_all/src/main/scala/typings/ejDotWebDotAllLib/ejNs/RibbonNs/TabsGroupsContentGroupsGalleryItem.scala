package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentGroupsGalleryItem extends js.Object {
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the custom tooltip for gallery content. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.undefined
  /** Sets text for the gallery content.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Sets tooltip for the gallery content.
    * @Default {null}
    */
  var toolTip: js.UndefOr[java.lang.String] = js.undefined
}

object TabsGroupsContentGroupsGalleryItem {
  @scala.inline
  def apply(
    buttonSettings: js.Any = null,
    customToolTip: js.Any = null,
    text: java.lang.String = null,
    toolTip: java.lang.String = null
  ): TabsGroupsContentGroupsGalleryItem = {
    val __obj = js.Dynamic.literal()
    if (buttonSettings != null) __obj.updateDynamic("buttonSettings")(buttonSettings)
    if (customToolTip != null) __obj.updateDynamic("customToolTip")(customToolTip)
    if (text != null) __obj.updateDynamic("text")(text)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    __obj.asInstanceOf[TabsGroupsContentGroupsGalleryItem]
  }
}

