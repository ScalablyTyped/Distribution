package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsePinSettings extends js.Object {
  /** Specifies the custom tooltip for collapse pin.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.undefined
  /** Sets tooltip for the collapse pin .
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.undefined
}

object CollapsePinSettings {
  @scala.inline
  def apply(customToolTip: js.Any = null, toolTip: String = null): CollapsePinSettings = {
    val __obj = js.Dynamic.literal()
    if (customToolTip != null) __obj.updateDynamic("customToolTip")(customToolTip)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    __obj.asInstanceOf[CollapsePinSettings]
  }
}

