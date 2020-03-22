package typings.electron.Electron

import typings.electron.electronStrings.longEdge
import typings.electron.electronStrings.shortEdge
import typings.electron.electronStrings.simplex
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebContentsPrintOptions extends js.Object {
  /**
    * Whether the web page should be collated.
    */
  var collate: js.UndefOr[Boolean] = js.undefined
  /**
    * Set whether the printed web page will be in color or grayscale. Default is
    * `true`.
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of copies of the web page to print.
    */
  var copies: js.UndefOr[Double] = js.undefined
  /**
    * Set the printer device name to use. Must be the system-defined name and not the
    * 'friendly' name, e.g 'Brother_QL_820NWB' and not 'Brother QL-820NWB'.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  var dpi: js.UndefOr[Dpi] = js.undefined
  /**
    * Set the duplex mode of the printed web page. Can be `simplex`, `shortEdge`, or
    * `longEdge`.
    */
  var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.undefined
  /**
    * String to be printed as page footer.
    */
  var footer: js.UndefOr[String] = js.undefined
  /**
    * String to be printed as page header.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * Whether the web page should be printed in landscape mode. Default is `false`.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  var margins: js.UndefOr[Margins] = js.undefined
  /**
    * The page range to print. Should have two keys: `from` and `to`.
    */
  var pageRanges: js.UndefOr[Record[String, Double]] = js.undefined
  /**
    * The number of pages to print per page sheet.
    */
  var pagesPerSheet: js.UndefOr[Double] = js.undefined
  /**
    * Prints the background color and image of the web page. Default is `false`.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * The scale factor of the web page.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  /**
    * Don't ask user for print settings. Default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object WebContentsPrintOptions {
  @scala.inline
  def apply(
    collate: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    copies: Int | Double = null,
    deviceName: String = null,
    dpi: Dpi = null,
    duplexMode: simplex | shortEdge | longEdge = null,
    footer: String = null,
    header: String = null,
    landscape: js.UndefOr[Boolean] = js.undefined,
    margins: Margins = null,
    pageRanges: Record[String, Double] = null,
    pagesPerSheet: Int | Double = null,
    printBackground: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): WebContentsPrintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collate)) __obj.updateDynamic("collate")(collate.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (copies != null) __obj.updateDynamic("copies")(copies.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (duplexMode != null) __obj.updateDynamic("duplexMode")(duplexMode.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (pageRanges != null) __obj.updateDynamic("pageRanges")(pageRanges.asInstanceOf[js.Any])
    if (pagesPerSheet != null) __obj.updateDynamic("pagesPerSheet")(pagesPerSheet.asInstanceOf[js.Any])
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebContentsPrintOptions]
  }
}

