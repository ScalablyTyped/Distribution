package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportImageSettings extends js.Object {
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
}

