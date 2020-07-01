package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the page settings to be used when saving a page as a pdf file. */
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
  /** The name of the file. May include optional .pdf extension. */
  var toFileName: js.UndefOr[String] = js.undefined
}

object PageSettings {
  @scala.inline
  def apply(
    edgeBottom: js.UndefOr[Double] = js.undefined,
    edgeLeft: js.UndefOr[Double] = js.undefined,
    edgeRight: js.UndefOr[Double] = js.undefined,
    edgeTop: js.UndefOr[Double] = js.undefined,
    footerCenter: String = null,
    footerLeft: String = null,
    footerRight: String = null,
    headerCenter: String = null,
    headerLeft: String = null,
    headerRight: String = null,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    orientation: js.UndefOr[Double] = js.undefined,
    paperHeight: js.UndefOr[Double] = js.undefined,
    paperSizeUnit: js.UndefOr[Double] = js.undefined,
    paperWidth: js.UndefOr[Double] = js.undefined,
    scaling: js.UndefOr[Double] = js.undefined,
    showBackgroundColors: js.UndefOr[Boolean] = js.undefined,
    showBackgroundImages: js.UndefOr[Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    toFileName: String = null
  ): PageSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edgeBottom)) __obj.updateDynamic("edgeBottom")(edgeBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeLeft)) __obj.updateDynamic("edgeLeft")(edgeLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeRight)) __obj.updateDynamic("edgeRight")(edgeRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeTop)) __obj.updateDynamic("edgeTop")(edgeTop.get.asInstanceOf[js.Any])
    if (footerCenter != null) __obj.updateDynamic("footerCenter")(footerCenter.asInstanceOf[js.Any])
    if (footerLeft != null) __obj.updateDynamic("footerLeft")(footerLeft.asInstanceOf[js.Any])
    if (footerRight != null) __obj.updateDynamic("footerRight")(footerRight.asInstanceOf[js.Any])
    if (headerCenter != null) __obj.updateDynamic("headerCenter")(headerCenter.asInstanceOf[js.Any])
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(headerLeft.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(headerRight.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paperHeight)) __obj.updateDynamic("paperHeight")(paperHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paperSizeUnit)) __obj.updateDynamic("paperSizeUnit")(paperSizeUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paperWidth)) __obj.updateDynamic("paperWidth")(paperWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaling)) __obj.updateDynamic("scaling")(scaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackgroundColors)) __obj.updateDynamic("showBackgroundColors")(showBackgroundColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackgroundImages)) __obj.updateDynamic("showBackgroundImages")(showBackgroundImages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit.get.asInstanceOf[js.Any])
    if (toFileName != null) __obj.updateDynamic("toFileName")(toFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSettings]
  }
}

