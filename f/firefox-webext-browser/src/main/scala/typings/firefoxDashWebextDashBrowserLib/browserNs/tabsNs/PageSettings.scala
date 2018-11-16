package typings
package firefoxDashWebextDashBrowserLib.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The page settings including: orientation, scale, background, margins, headers, footers. */

trait PageSettings extends js.Object {
  /** The spacing between the bottom of the footers and the bottom edge of the paper (inches). Default: 0. */
  var edgeBottom: js.UndefOr[scala.Double] = js.undefined
  /** The spacing between the left header/footer and the left edge of the paper (inches). Default: 0. */
  var edgeLeft: js.UndefOr[scala.Double] = js.undefined
  /** The spacing between the right header/footer and the right edge of the paper (inches). Default: 0. */
  var edgeRight: js.UndefOr[scala.Double] = js.undefined
  /** The spacing between the top of the headers and the top edge of the paper (inches). Default: 0 */
  var edgeTop: js.UndefOr[scala.Double] = js.undefined
  /** The text for the page's center footer. Default: ''. */
  var footerCenter: js.UndefOr[java.lang.String] = js.undefined
  /** The text for the page's left footer. Default: '&PT'. */
  var footerLeft: js.UndefOr[java.lang.String] = js.undefined
  /** The text for the page's right footer. Default: '&D'. */
  var footerRight: js.UndefOr[java.lang.String] = js.undefined
  /** The text for the page's center header. Default: ''. */
  var headerCenter: js.UndefOr[java.lang.String] = js.undefined
  /** The text for the page's left header. Default: '&T'. */
  var headerLeft: js.UndefOr[java.lang.String] = js.undefined
  /** The text for the page's right header. Default: '&U'. */
  var headerRight: js.UndefOr[java.lang.String] = js.undefined
  /** The margin between the page content and the bottom edge of the paper (inches). Default: 0.5. */
  var marginBottom: js.UndefOr[scala.Double] = js.undefined
  /** The margin between the page content and the left edge of the paper (inches). Default: 0.5. */
  var marginLeft: js.UndefOr[scala.Double] = js.undefined
  /** The margin between the page content and the right edge of the paper (inches). Default: 0.5. */
  var marginRight: js.UndefOr[scala.Double] = js.undefined
  /** The margin between the page content and the top edge of the paper (inches). Default: 0.5. */
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  /** The page content orientation: 0 = portrait, 1 = landscape. Default: 0. */
  var orientation: js.UndefOr[scala.Double] = js.undefined
  /** The paper height in paper size units. Default: 11.0. */
  var paperHeight: js.UndefOr[scala.Double] = js.undefined
  /** The page size unit: 0 = inches, 1 = millimeters. Default: 0. */
  var paperSizeUnit: js.UndefOr[scala.Double] = js.undefined
  /** The paper width in paper size units. Default: 8.5. */
  var paperWidth: js.UndefOr[scala.Double] = js.undefined
  /** The page content scaling factor: 1.0 = 100% = normal size. Default: 1.0. */
  var scaling: js.UndefOr[scala.Double] = js.undefined
  /** Whether the page background colors should be shown. Default: false. */
  var showBackgroundColors: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the page background images should be shown. Default: false. */
  var showBackgroundImages: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the page content should shrink to fit the page width (overrides scaling). Default: true. */
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
}

