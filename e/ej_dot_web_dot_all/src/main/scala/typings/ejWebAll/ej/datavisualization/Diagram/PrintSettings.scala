package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintSettings extends js.Object {
  /** to print any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /** to print the diagram into multiple pages
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
  /** to resize the diagram content to fill its allocated space and printed.
    */
  var stretch: js.UndefOr[Stretch] = js.undefined
}

object PrintSettings {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    multiplePage: js.UndefOr[Boolean] = js.undefined,
    pageHeight: js.UndefOr[Double] = js.undefined,
    pageOrientation: PageOrientations = null,
    pageWidth: js.UndefOr[Double] = js.undefined,
    region: Region = null,
    stretch: Stretch = null
  ): PrintSettings = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplePage)) __obj.updateDynamic("multiplePage")(multiplePage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageHeight)) __obj.updateDynamic("pageHeight")(pageHeight.get.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(pageWidth)) __obj.updateDynamic("pageWidth")(pageWidth.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSettings]
  }
}

