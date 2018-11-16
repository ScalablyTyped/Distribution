package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LayersLabelSettings extends js.Object {
  /** enable or disable the enableSmartLabel property
               * @Default {false}
               */
  var enableSmartLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the data label font.
               */
  var font: js.UndefOr[LayersLabelSettingsFont] = js.undefined
  /** set the labelLength property
               * @Default {'2'}
               */
  var labelLength: js.UndefOr[scala.Double] = js.undefined
  /** set the labelPath property
               * @Default {null}
               */
  var labelPath: js.UndefOr[java.lang.String] = js.undefined
  /** The property specifies whether to show labels or not.
               * @Default {false}
               */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** set the smartLabelSize property
               * @Default {fixed}
               */
  var smartLabelSize: js.UndefOr[LabelSize | java.lang.String] = js.undefined
}

