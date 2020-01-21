package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportImageSettings extends js.Object {
  /** to export any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /** name of the file to be downloaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** format of the exported file/data.
    */
  var format: js.UndefOr[FileFormats] = js.undefined
  /** to set margin to the exported data.
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** to export the diagram into multiple pages
    */
  var multiplePage: js.UndefOr[Boolean] = js.undefined
  /** to set the page height of the diagram while exporting the diagram into multiple pages.
    */
  var pageHeight: js.UndefOr[Double] = js.undefined
  /** to sets the orientation of the page.
    */
  var pageOrientation: js.UndefOr[PageOrientations] = js.undefined
  /** to set the page width of the diagram while exporting the diagram into multiple pages.
    */
  var pageWidth: js.UndefOr[Double] = js.undefined
  /** to set the region of the diagram to be exported.
    */
  var region: js.UndefOr[Region] = js.undefined
}

object ExportImageSettings {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    fileName: String = null,
    format: FileFormats = null,
    margin: js.Any = null,
    multiplePage: js.UndefOr[Boolean] = js.undefined,
    pageHeight: Int | Double = null,
    pageOrientation: PageOrientations = null,
    pageWidth: Int | Double = null,
    region: Region = null
  ): ExportImageSettings = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplePage)) __obj.updateDynamic("multiplePage")(multiplePage.asInstanceOf[js.Any])
    if (pageHeight != null) __obj.updateDynamic("pageHeight")(pageHeight.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (pageWidth != null) __obj.updateDynamic("pageWidth")(pageWidth.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportImageSettings]
  }
}

