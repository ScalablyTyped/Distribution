package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CaptionSettingsIndicator extends js.Object {
  /** Contains property to customize the font of indicator.
               */
  var font: js.UndefOr[CaptionSettingsIndicatorFont] = js.undefined
  /** Contains property to customize the location of indicator.
               */
  var location: js.UndefOr[CaptionSettingsIndicatorLocation] = js.undefined
  /** Specifies the padding to be applied when text position is used.
               * @Default {2}
               */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Contains property to customize the symbol of indicator.
               */
  var symbol: js.UndefOr[CaptionSettingsIndicatorSymbol] = js.undefined
  /** Specifies the text to be displayed as indicator text. By default difference between current value and target will be displayed
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of indicator with respect to scale based on text position
               * @Default {'Near'}
               */
  var textAlignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Specifies where indicator text should be anchored when indicator overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
               * position. Anchoring is not applicable for float position.
               * @Default {'start'}
               */
  var textAnchor: js.UndefOr[TextAnchor | java.lang.String] = js.undefined
  /** indicator text render in the specified angle.
               * @Default {0}
               */
  var textAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies where indicator should be placed
               * @Default {'float'}
               */
  var textPosition: js.UndefOr[TextPosition | java.lang.String] = js.undefined
  /** Specifies the space between indicator symbol and text.
               * @Default {3}
               */
  var textSpacing: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether indicator will be visible or not.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

