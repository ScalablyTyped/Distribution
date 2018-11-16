package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScalesLabel extends js.Object {
  /** Specifies the angle of labels.
               * @Default {0}
               */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the DistanceFromScale of labels.
               * @Default {null}
               */
  var distanceFromScale: js.UndefOr[ScalesLabelsDistanceFromScale] = js.undefined
  /** Specifies the font of labels.
               * @Default {null}
               */
  var font: js.UndefOr[ScalesLabelsFont] = js.undefined
  /** need to includeFirstValue.
               * @Default {true}
               */
  var includeFirstValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the opacity of label.
               * @Default {0}
               */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label Placement of label. See
               * @Default {Near}
               */
  var placement: js.UndefOr[PointerPlacement | java.lang.String] = js.undefined
  /** Specifies the textColor of font.
               * @Default {null}
               */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label Style of label. See
               * @Default {ej.datavisualization.LinearGauge.LabelType.Major}
               */
  var `type`: js.UndefOr[ScaleType | java.lang.String] = js.undefined
  /** Specifies the unitText of label.
               */
  var unitText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the unitText Position of label.See
               * @Default {Back}
               */
  var unitTextPlacement: js.UndefOr[UnitTextPlacement | java.lang.String] = js.undefined
}

