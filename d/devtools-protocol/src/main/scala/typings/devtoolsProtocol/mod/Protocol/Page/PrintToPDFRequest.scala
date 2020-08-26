package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsBase64
import typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintToPDFRequest extends js.Object {
  /**
    * Display header and footer. Defaults to false.
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.native
  /**
    * HTML template for the print footer. Should use the same format as the `headerTemplate`.
    */
  var footerTemplate: js.UndefOr[String] = js.native
  /**
    * HTML template for the print header. Should be valid HTML markup with following
    * classes used to inject printing values into them:
    * - `date`: formatted print date
    * - `title`: document title
    * - `url`: document location
    * - `pageNumber`: current page number
    * - `totalPages`: total pages in the document
    * 
    * For example, `<span class=title></span>` would generate span containing the title.
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /**
    * Whether to silently ignore invalid but successfully parsed page ranges, such as '3-2'.
    * Defaults to false.
    */
  var ignoreInvalidPageRanges: js.UndefOr[Boolean] = js.native
  /**
    * Paper orientation. Defaults to false.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  /**
    * Bottom margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginBottom: js.UndefOr[Double] = js.native
  /**
    * Left margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /**
    * Right margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginRight: js.UndefOr[Double] = js.native
  /**
    * Top margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginTop: js.UndefOr[Double] = js.native
  /**
    * Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty string, which means
    * print all pages.
    */
  var pageRanges: js.UndefOr[String] = js.native
  /**
    * Paper height in inches. Defaults to 11 inches.
    */
  var paperHeight: js.UndefOr[Double] = js.native
  /**
    * Paper width in inches. Defaults to 8.5 inches.
    */
  var paperWidth: js.UndefOr[Double] = js.native
  /**
    * Whether or not to prefer page size as defined by css. Defaults to false,
    * in which case the content will be scaled to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.native
  /**
    * Print background graphics. Defaults to false.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  /**
    * Scale of the webpage rendering. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * return as stream (PrintToPDFRequestTransferMode enum)
    */
  var transferMode: js.UndefOr[ReturnAsBase64 | ReturnAsStream] = js.native
}

object PrintToPDFRequest {
  @scala.inline
  def apply(): PrintToPDFRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFRequest]
  }
  @scala.inline
  implicit class PrintToPDFRequestOps[Self <: PrintToPDFRequest] (val x: Self) extends AnyVal {
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
    def setDisplayHeaderFooter(value: Boolean): Self = this.set("displayHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayHeaderFooter: Self = this.set("displayHeaderFooter", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setIgnoreInvalidPageRanges(value: Boolean): Self = this.set("ignoreInvalidPageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreInvalidPageRanges: Self = this.set("ignoreInvalidPageRanges", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setPageRanges(value: String): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageRanges: Self = this.set("pageRanges", js.undefined)
    @scala.inline
    def setPaperHeight(value: Double): Self = this.set("paperHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperHeight: Self = this.set("paperHeight", js.undefined)
    @scala.inline
    def setPaperWidth(value: Double): Self = this.set("paperWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidth: Self = this.set("paperWidth", js.undefined)
    @scala.inline
    def setPreferCSSPageSize(value: Boolean): Self = this.set("preferCSSPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferCSSPageSize: Self = this.set("preferCSSPageSize", js.undefined)
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTransferMode(value: ReturnAsBase64 | ReturnAsStream): Self = this.set("transferMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferMode: Self = this.set("transferMode", js.undefined)
  }
  
}

