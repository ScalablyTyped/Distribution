package typings.electron.Electron

import typings.electron.electronStrings.longEdge
import typings.electron.electronStrings.shortEdge
import typings.electron.electronStrings.simplex
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebContentsPrintOptions extends js.Object {
  /**
    * Whether the web page should be collated.
    */
  var collate: js.UndefOr[Boolean] = js.native
  /**
    * Set whether the printed web page will be in color or grayscale. Default is
    * `true`.
    */
  var color: js.UndefOr[Boolean] = js.native
  /**
    * The number of copies of the web page to print.
    */
  var copies: js.UndefOr[Double] = js.native
  /**
    * Set the printer device name to use. Must be the system-defined name and not the
    * 'friendly' name, e.g 'Brother_QL_820NWB' and not 'Brother QL-820NWB'.
    */
  var deviceName: js.UndefOr[String] = js.native
  var dpi: js.UndefOr[Record[String, Double]] = js.native
  /**
    * Set the duplex mode of the printed web page. Can be `simplex`, `shortEdge`, or
    * `longEdge`.
    */
  var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.native
  /**
    * String to be printed as page footer.
    */
  var footer: js.UndefOr[String] = js.native
  /**
    * String to be printed as page header.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Whether the web page should be printed in landscape mode. Default is `false`.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  var margins: js.UndefOr[Margins] = js.native
  /**
    * The page range to print.
    */
  var pageRanges: js.UndefOr[Record[String, Double]] = js.native
  /**
    * Specify page size of the printed document. Can be `A3`, `A4`, `A5`, `Legal`,
    * `Letter`, `Tabloid` or an Object containing `height`.
    */
  var pageSize: js.UndefOr[String | Size] = js.native
  /**
    * The number of pages to print per page sheet.
    */
  var pagesPerSheet: js.UndefOr[Double] = js.native
  /**
    * Prints the background color and image of the web page. Default is `false`.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  /**
    * The scale factor of the web page.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
  /**
    * Don't ask user for print settings. Default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.native
}

object WebContentsPrintOptions {
  @scala.inline
  def apply(): WebContentsPrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebContentsPrintOptions]
  }
  @scala.inline
  implicit class WebContentsPrintOptionsOps[Self <: WebContentsPrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollate(value: Boolean): Self = this.set("collate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollate: Self = this.set("collate", js.undefined)
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopies: Self = this.set("copies", js.undefined)
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setDpi(value: Record[String, Double]): Self = this.set("dpi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    @scala.inline
    def setDuplexMode(value: simplex | shortEdge | longEdge): Self = this.set("duplexMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplexMode: Self = this.set("duplexMode", js.undefined)
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMargins(value: Margins): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    @scala.inline
    def setPageRanges(value: Record[String, Double]): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageRanges: Self = this.set("pageRanges", js.undefined)
    @scala.inline
    def setPageSize(value: String | Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPagesPerSheet(value: Double): Self = this.set("pagesPerSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagesPerSheet: Self = this.set("pagesPerSheet", js.undefined)
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

