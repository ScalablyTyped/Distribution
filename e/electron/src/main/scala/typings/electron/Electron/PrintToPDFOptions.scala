package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintToPDFOptions extends js.Object {
  /**
    * the header and footer for the PDF.
    */
  var headerFooter: js.UndefOr[Record[String, String]] = js.native
  /**
    * `true` for landscape, `false` for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the type of margins to use. Uses 0 for default margin, 1 for no
    * margin, and 2 for minimum margin. and `width` in microns.
    */
  var marginsType: js.UndefOr[Double] = js.native
  /**
    * The page range to print.
    */
  var pageRanges: js.UndefOr[Record[String, Double]] = js.native
  /**
    * Specify page size of the generated PDF. Can be `A3`, `A4`, `A5`, `Legal`,
    * `Letter`, `Tabloid` or an Object containing `height`
    */
  var pageSize: js.UndefOr[String | Size] = js.native
  /**
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  /**
    * Whether to print selection only.
    */
  var printSelectionOnly: js.UndefOr[Boolean] = js.native
  /**
    * The scale factor of the web page. Can range from 0 to 100.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
}

object PrintToPDFOptions {
  @scala.inline
  def apply(): PrintToPDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFOptions]
  }
  @scala.inline
  implicit class PrintToPDFOptionsOps[Self <: PrintToPDFOptions] (val x: Self) extends AnyVal {
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
    def setHeaderFooter(value: Record[String, String]): Self = this.set("headerFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFooter: Self = this.set("headerFooter", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMarginsType(value: Double): Self = this.set("marginsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginsType: Self = this.set("marginsType", js.undefined)
    @scala.inline
    def setPageRanges(value: Record[String, Double]): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageRanges: Self = this.set("pageRanges", js.undefined)
    @scala.inline
    def setPageSize(value: String | Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    @scala.inline
    def setPrintSelectionOnly(value: Boolean): Self = this.set("printSelectionOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintSelectionOnly: Self = this.set("printSelectionOnly", js.undefined)
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
  }
  
}

