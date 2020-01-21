package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The page settings including: orientation, scale, background, margins, headers, footers. */
trait PageSettings extends js.Object {
  /** The spacing between the bottom of the footers and the bottom edge of the paper (inches). Default: 0. */
  var edgeBottom: js.UndefOr[Double] = js.undefined
  /** The spacing between the left header/footer and the left edge of the paper (inches). Default: 0. */
  var edgeLeft: js.UndefOr[Double] = js.undefined
  /** The spacing between the right header/footer and the right edge of the paper (inches). Default: 0. */
  var edgeRight: js.UndefOr[Double] = js.undefined
  /** The spacing between the top of the headers and the top edge of the paper (inches). Default: 0 */
  var edgeTop: js.UndefOr[Double] = js.undefined
  /** The text for the page's center footer. Default: ''. */
  var footerCenter: js.UndefOr[String] = js.undefined
  /** The text for the page's left footer. Default: '&PT'. */
  var footerLeft: js.UndefOr[String] = js.undefined
  /** The text for the page's right footer. Default: '&D'. */
  var footerRight: js.UndefOr[String] = js.undefined
  /** The text for the page's center header. Default: ''. */
  var headerCenter: js.UndefOr[String] = js.undefined
  /** The text for the page's left header. Default: '&T'. */
  var headerLeft: js.UndefOr[String] = js.undefined
  /** The text for the page's right header. Default: '&U'. */
  var headerRight: js.UndefOr[String] = js.undefined
  /** The margin between the page content and the bottom edge of the paper (inches). Default: 0.5. */
  var marginBottom: js.UndefOr[Double] = js.undefined
  /** The margin between the page content and the left edge of the paper (inches). Default: 0.5. */
  var marginLeft: js.UndefOr[Double] = js.undefined
  /** The margin between the page content and the right edge of the paper (inches). Default: 0.5. */
  var marginRight: js.UndefOr[Double] = js.undefined
  /** The margin between the page content and the top edge of the paper (inches). Default: 0.5. */
  var marginTop: js.UndefOr[Double] = js.undefined
  /** The page content orientation: 0 = portrait, 1 = landscape. Default: 0. */
  var orientation: js.UndefOr[Double] = js.undefined
  /** The paper height in paper size units. Default: 11.0. */
  var paperHeight: js.UndefOr[Double] = js.undefined
  /** The page size unit: 0 = inches, 1 = millimeters. Default: 0. */
  var paperSizeUnit: js.UndefOr[Double] = js.undefined
  /** The paper width in paper size units. Default: 8.5. */
  var paperWidth: js.UndefOr[Double] = js.undefined
  /** The page content scaling factor: 1.0 = 100% = normal size. Default: 1.0. */
  var scaling: js.UndefOr[Double] = js.undefined
  /** Whether the page background colors should be shown. Default: false. */
  var showBackgroundColors: js.UndefOr[Boolean] = js.undefined
  /** Whether the page background images should be shown. Default: false. */
  var showBackgroundImages: js.UndefOr[Boolean] = js.undefined
  /** Whether the page content should shrink to fit the page width (overrides scaling). Default: true. */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
}

object PageSettings {
  @scala.inline
  def apply(
    edgeBottom: Int | Double = null,
    edgeLeft: Int | Double = null,
    edgeRight: Int | Double = null,
    edgeTop: Int | Double = null,
    footerCenter: String = null,
    footerLeft: String = null,
    footerRight: String = null,
    headerCenter: String = null,
    headerLeft: String = null,
    headerRight: String = null,
    marginBottom: Int | Double = null,
    marginLeft: Int | Double = null,
    marginRight: Int | Double = null,
    marginTop: Int | Double = null,
    orientation: Int | Double = null,
    paperHeight: Int | Double = null,
    paperSizeUnit: Int | Double = null,
    paperWidth: Int | Double = null,
    scaling: Int | Double = null,
    showBackgroundColors: js.UndefOr[Boolean] = js.undefined,
    showBackgroundImages: js.UndefOr[Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined
  ): PageSettings = {
    val __obj = js.Dynamic.literal()
    if (edgeBottom != null) __obj.updateDynamic("edgeBottom")(edgeBottom.asInstanceOf[js.Any])
    if (edgeLeft != null) __obj.updateDynamic("edgeLeft")(edgeLeft.asInstanceOf[js.Any])
    if (edgeRight != null) __obj.updateDynamic("edgeRight")(edgeRight.asInstanceOf[js.Any])
    if (edgeTop != null) __obj.updateDynamic("edgeTop")(edgeTop.asInstanceOf[js.Any])
    if (footerCenter != null) __obj.updateDynamic("footerCenter")(footerCenter.asInstanceOf[js.Any])
    if (footerLeft != null) __obj.updateDynamic("footerLeft")(footerLeft.asInstanceOf[js.Any])
    if (footerRight != null) __obj.updateDynamic("footerRight")(footerRight.asInstanceOf[js.Any])
    if (headerCenter != null) __obj.updateDynamic("headerCenter")(headerCenter.asInstanceOf[js.Any])
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(headerLeft.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(headerRight.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paperHeight != null) __obj.updateDynamic("paperHeight")(paperHeight.asInstanceOf[js.Any])
    if (paperSizeUnit != null) __obj.updateDynamic("paperSizeUnit")(paperSizeUnit.asInstanceOf[js.Any])
    if (paperWidth != null) __obj.updateDynamic("paperWidth")(paperWidth.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackgroundColors)) __obj.updateDynamic("showBackgroundColors")(showBackgroundColors.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackgroundImages)) __obj.updateDynamic("showBackgroundImages")(showBackgroundImages.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSettings]
  }
}

