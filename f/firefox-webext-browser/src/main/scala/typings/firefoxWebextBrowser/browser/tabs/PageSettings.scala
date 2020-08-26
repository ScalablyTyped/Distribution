package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the page settings to be used when saving a page as a pdf file. */
@js.native
trait PageSettings extends js.Object {
  /** The spacing between the bottom of the footers and the bottom edge of the paper (inches). Default: 0. */
  var edgeBottom: js.UndefOr[Double] = js.native
  /** The spacing between the left header/footer and the left edge of the paper (inches). Default: 0. */
  var edgeLeft: js.UndefOr[Double] = js.native
  /** The spacing between the right header/footer and the right edge of the paper (inches). Default: 0. */
  var edgeRight: js.UndefOr[Double] = js.native
  /** The spacing between the top of the headers and the top edge of the paper (inches). Default: 0 */
  var edgeTop: js.UndefOr[Double] = js.native
  /** The text for the page's center footer. Default: ''. */
  var footerCenter: js.UndefOr[String] = js.native
  /** The text for the page's left footer. Default: '&PT'. */
  var footerLeft: js.UndefOr[String] = js.native
  /** The text for the page's right footer. Default: '&D'. */
  var footerRight: js.UndefOr[String] = js.native
  /** The text for the page's center header. Default: ''. */
  var headerCenter: js.UndefOr[String] = js.native
  /** The text for the page's left header. Default: '&T'. */
  var headerLeft: js.UndefOr[String] = js.native
  /** The text for the page's right header. Default: '&U'. */
  var headerRight: js.UndefOr[String] = js.native
  /** The margin between the page content and the bottom edge of the paper (inches). Default: 0.5. */
  var marginBottom: js.UndefOr[Double] = js.native
  /** The margin between the page content and the left edge of the paper (inches). Default: 0.5. */
  var marginLeft: js.UndefOr[Double] = js.native
  /** The margin between the page content and the right edge of the paper (inches). Default: 0.5. */
  var marginRight: js.UndefOr[Double] = js.native
  /** The margin between the page content and the top edge of the paper (inches). Default: 0.5. */
  var marginTop: js.UndefOr[Double] = js.native
  /** The page content orientation: 0 = portrait, 1 = landscape. Default: 0. */
  var orientation: js.UndefOr[Double] = js.native
  /** The paper height in paper size units. Default: 11.0. */
  var paperHeight: js.UndefOr[Double] = js.native
  /** The page size unit: 0 = inches, 1 = millimeters. Default: 0. */
  var paperSizeUnit: js.UndefOr[Double] = js.native
  /** The paper width in paper size units. Default: 8.5. */
  var paperWidth: js.UndefOr[Double] = js.native
  /** The page content scaling factor: 1.0 = 100% = normal size. Default: 1.0. */
  var scaling: js.UndefOr[Double] = js.native
  /** Whether the page background colors should be shown. Default: false. */
  var showBackgroundColors: js.UndefOr[Boolean] = js.native
  /** Whether the page background images should be shown. Default: false. */
  var showBackgroundImages: js.UndefOr[Boolean] = js.native
  /** Whether the page content should shrink to fit the page width (overrides scaling). Default: true. */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  /** The name of the file. May include optional .pdf extension. */
  var toFileName: js.UndefOr[String] = js.native
}

object PageSettings {
  @scala.inline
  def apply(): PageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSettings]
  }
  @scala.inline
  implicit class PageSettingsOps[Self <: PageSettings] (val x: Self) extends AnyVal {
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
    def setEdgeBottom(value: Double): Self = this.set("edgeBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeBottom: Self = this.set("edgeBottom", js.undefined)
    @scala.inline
    def setEdgeLeft(value: Double): Self = this.set("edgeLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeLeft: Self = this.set("edgeLeft", js.undefined)
    @scala.inline
    def setEdgeRight(value: Double): Self = this.set("edgeRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeRight: Self = this.set("edgeRight", js.undefined)
    @scala.inline
    def setEdgeTop(value: Double): Self = this.set("edgeTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeTop: Self = this.set("edgeTop", js.undefined)
    @scala.inline
    def setFooterCenter(value: String): Self = this.set("footerCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterCenter: Self = this.set("footerCenter", js.undefined)
    @scala.inline
    def setFooterLeft(value: String): Self = this.set("footerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterLeft: Self = this.set("footerLeft", js.undefined)
    @scala.inline
    def setFooterRight(value: String): Self = this.set("footerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterRight: Self = this.set("footerRight", js.undefined)
    @scala.inline
    def setHeaderCenter(value: String): Self = this.set("headerCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCenter: Self = this.set("headerCenter", js.undefined)
    @scala.inline
    def setHeaderLeft(value: String): Self = this.set("headerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderLeft: Self = this.set("headerLeft", js.undefined)
    @scala.inline
    def setHeaderRight(value: String): Self = this.set("headerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRight: Self = this.set("headerRight", js.undefined)
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
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPaperHeight(value: Double): Self = this.set("paperHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperHeight: Self = this.set("paperHeight", js.undefined)
    @scala.inline
    def setPaperSizeUnit(value: Double): Self = this.set("paperSizeUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperSizeUnit: Self = this.set("paperSizeUnit", js.undefined)
    @scala.inline
    def setPaperWidth(value: Double): Self = this.set("paperWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidth: Self = this.set("paperWidth", js.undefined)
    @scala.inline
    def setScaling(value: Double): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
    @scala.inline
    def setShowBackgroundColors(value: Boolean): Self = this.set("showBackgroundColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackgroundColors: Self = this.set("showBackgroundColors", js.undefined)
    @scala.inline
    def setShowBackgroundImages(value: Boolean): Self = this.set("showBackgroundImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackgroundImages: Self = this.set("showBackgroundImages", js.undefined)
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkToFit: Self = this.set("shrinkToFit", js.undefined)
    @scala.inline
    def setToFileName(value: String): Self = this.set("toFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToFileName: Self = this.set("toFileName", js.undefined)
  }
  
}

