package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandPinSettings extends js.Object {
  /** Specifies the custom tooltip for expand pin.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.undefined
  /** Sets tooltip for the expand pin.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.undefined
}

object ExpandPinSettings {
  @scala.inline
  def apply(customToolTip: js.Any = null, toolTip: String = null): ExpandPinSettings = {
    val __obj = js.Dynamic.literal()
    if (customToolTip != null) __obj.updateDynamic("customToolTip")(customToolTip.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandPinSettings]
  }
}

