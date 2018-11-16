package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Fires, on clicking the gauge.
               */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Fires, on double clicking the digital gauge.
               */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the responsiveness of the Digital gauge
               * @Default {false}
               */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** This provides options for customizing export settings
               */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Specifies the frame of the Digital gauge.
               * @Default {{backgroundImageUrl: null, innerWidth: 6, outerWidth: 10}}
               */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Specifies the height of the DigitalGauge.
               * @Default {150}
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when the gauge is initialized.
               */
  var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, scala.Unit]] = js.undefined
  /** Specifies the resize option of the DigitalGauge.
               * @Default {false}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the gauge item rendering.
               */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the items for the DigitalGauge.
               * @Default {null}
               */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  /** Triggers when the gauge is start to load.
               */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Specifies the matrixSegmentData for the DigitalGauge.
               */
  var matrixSegmentData: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the gauge render is completed.
               */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires, on right clicking the digital gauge.
               */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the segmentData for the DigitalGauge.
               */
  var segmentData: js.UndefOr[js.Any] = js.undefined
  /** Specifies the themes for the Digital gauge. See Themes
               * @Default {flatlight}
               */
  var themes: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the value to the DigitalGauge.
               * @Default {text}
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width for the Digital gauge.
               * @Default {400}
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

