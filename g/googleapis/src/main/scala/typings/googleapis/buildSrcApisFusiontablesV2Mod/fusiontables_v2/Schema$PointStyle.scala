package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a PointStyle within a StyleSetting
  */
@js.native
trait Schema$PointStyle extends js.Object {
  /**
    * Name of the icon. Use values defined in
    * http://www.google.com/fusiontables/DataSource?dsrcid=308519
    */
  var iconName: js.UndefOr[String] = js.native
  /**
    * Column or a bucket value from which the icon name is to be determined.
    */
  var iconStyler: js.UndefOr[Schema$StyleFunction] = js.native
}

object Schema$PointStyle {
  @scala.inline
  def apply(iconName: String = null, iconStyler: Schema$StyleFunction = null): Schema$PointStyle = {
    val __obj = js.Dynamic.literal()
    if (iconName != null) __obj.updateDynamic("iconName")(iconName.asInstanceOf[js.Any])
    if (iconStyler != null) __obj.updateDynamic("iconStyler")(iconStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PointStyle]
  }
}

