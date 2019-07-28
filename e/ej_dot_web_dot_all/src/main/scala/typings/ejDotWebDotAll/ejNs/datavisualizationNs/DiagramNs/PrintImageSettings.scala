package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintImageSettings extends js.Object {
  /** to print any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /** to export the diagram into multiple pages
    */
  var multiplePage: js.UndefOr[Boolean] = js.undefined
  /** to set the page height of the diagram while printing the diagram into multiple pages.
    */
  var pageHeight: js.UndefOr[Double] = js.undefined
  /** to sets the orientation of the page.
    */
  var pageOrientation: js.UndefOr[PageOrientations] = js.undefined
  /** to set the page width of the diagram while printing the diagram into multiple pages.
    */
  var pageWidth: js.UndefOr[Double] = js.undefined
  /** to set the region of the diagram to be printed.
    */
  var region: js.UndefOr[Region] = js.undefined
}

object PrintImageSettings {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    multiplePage: js.UndefOr[Boolean] = js.undefined,
    pageHeight: Int | Double = null,
    pageOrientation: PageOrientations = null,
    pageWidth: Int | Double = null,
    region: Region = null
  ): PrintImageSettings = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (!js.isUndefined(multiplePage)) __obj.updateDynamic("multiplePage")(multiplePage)
    if (pageHeight != null) __obj.updateDynamic("pageHeight")(pageHeight.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation)
    if (pageWidth != null) __obj.updateDynamic("pageWidth")(pageWidth.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[PrintImageSettings]
  }
}

