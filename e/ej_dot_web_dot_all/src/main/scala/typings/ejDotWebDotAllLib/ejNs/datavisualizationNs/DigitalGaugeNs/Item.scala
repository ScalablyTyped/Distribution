package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Item extends js.Object {
  /** Specifies the Character settings for the DigitalGauge.
               * @Default {null}
               */
  var characterSettings: js.UndefOr[ItemsCharacterSettings] = js.undefined
  /** Enable/Disable the custom font to be applied to the text in the gauge.
               * @Default {false}
               */
  var enableCustomFont: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the specific font for the text, when the enableCustomFont is set to true
               * @Default {null}
               */
  var font: js.UndefOr[ItemsFont] = js.undefined
  /** Set the location for the text, where it needs to be placed within the gauge.
               * @Default {null}
               */
  var position: js.UndefOr[ItemsPosition] = js.undefined
  /** Set the segment settings for the digital gauge.
               * @Default {null}
               */
  var segmentSettings: js.UndefOr[ItemsSegmentSettings] = js.undefined
  /** Set the value for enabling/disabling the blurring effect for the shadows of the text
               * @Default {0}
               */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the color of the text shadow.
               * @Default {null}
               */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set the x offset value for the shadow of the text, indicating the location where it needs to be displayed.
               * @Default {1}
               */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /** Set the y offset value for the shadow of the text, indicating the location where it needs to be displayed.
               * @Default {1}
               */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /** Set the alignment of the text that is displayed within the gauge.See TextAlign
               * @Default {left}
               */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the color of the text.
               * @Default {null}
               */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text value.
               * @Default {null}
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

