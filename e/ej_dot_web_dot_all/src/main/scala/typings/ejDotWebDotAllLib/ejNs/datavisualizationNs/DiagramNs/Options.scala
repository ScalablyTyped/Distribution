package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** to export any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /** name of the file to be downloaded.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** format of the exported file/data.
    */
  var format: js.UndefOr[FileFormats] = js.undefined
  /** to set margin to the exported data.
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** to set whether to export diagram as a file or as raw data.
    */
  var mode: js.UndefOr[ExportModes] = js.undefined
  /** to export the diagram into multiple pages
    */
  var multiplePage: js.UndefOr[scala.Boolean] = js.undefined
  /** to set the page height of the diagram while exporting the diagram into multiple pages.
    */
  var pageHeight: js.UndefOr[scala.Double] = js.undefined
  /** to sets the orientation of the page.
    */
  var pageOrientation: js.UndefOr[PageOrientations] = js.undefined
  /** to set the page width of the diagram while exporting the diagram into multiple pages.
    */
  var pageWidth: js.UndefOr[scala.Double] = js.undefined
  /** to set the region of the diagram to be exported.
    */
  var region: js.UndefOr[Region] = js.undefined
  /** to resize the diagram content to fill its allocated space.
    */
  var stretch: js.UndefOr[Stretch] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    fileName: java.lang.String = null,
    format: FileFormats = null,
    margin: js.Any = null,
    mode: ExportModes = null,
    multiplePage: js.UndefOr[scala.Boolean] = js.undefined,
    pageHeight: scala.Int | scala.Double = null,
    pageOrientation: PageOrientations = null,
    pageWidth: scala.Int | scala.Double = null,
    region: Region = null,
    stretch: Stretch = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (format != null) __obj.updateDynamic("format")(format)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(multiplePage)) __obj.updateDynamic("multiplePage")(multiplePage)
    if (pageHeight != null) __obj.updateDynamic("pageHeight")(pageHeight.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation)
    if (pageWidth != null) __obj.updateDynamic("pageWidth")(pageWidth.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (stretch != null) __obj.updateDynamic("stretch")(stretch)
    __obj.asInstanceOf[Options]
  }
}

