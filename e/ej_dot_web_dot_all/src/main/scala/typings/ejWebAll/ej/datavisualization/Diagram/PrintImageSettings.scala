package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintImageSettings extends js.Object {
  /** to print any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.native
  /** to export the diagram into multiple pages
    */
  var multiplePage: js.UndefOr[Boolean] = js.native
  /** to set the page height of the diagram while printing the diagram into multiple pages.
    */
  var pageHeight: js.UndefOr[Double] = js.native
  /** to sets the orientation of the page.
    */
  var pageOrientation: js.UndefOr[PageOrientations] = js.native
  /** to set the page width of the diagram while printing the diagram into multiple pages.
    */
  var pageWidth: js.UndefOr[Double] = js.native
  /** to set the region of the diagram to be printed.
    */
  var region: js.UndefOr[Region] = js.native
}

object PrintImageSettings {
  @scala.inline
  def apply(): PrintImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintImageSettings]
  }
  @scala.inline
  implicit class PrintImageSettingsOps[Self <: PrintImageSettings] (val x: Self) extends AnyVal {
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
    def setBounds(value: js.Any): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setMultiplePage(value: Boolean): Self = this.set("multiplePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplePage: Self = this.set("multiplePage", js.undefined)
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
    @scala.inline
    def setPageOrientation(value: PageOrientations): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    @scala.inline
    def setPageWidth(value: Double): Self = this.set("pageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageWidth: Self = this.set("pageWidth", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

