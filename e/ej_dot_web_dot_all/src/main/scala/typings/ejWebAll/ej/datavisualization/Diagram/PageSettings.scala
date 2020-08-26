package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSettings extends js.Object {
  /** Defines the maximum distance to be left between the object and the scroll bar to trigger auto scrolling
    * @Default {{ left: 15, top: 15, right: 15, bottom: 15 }}
    */
  var autoScrollBorder: js.UndefOr[js.Any] = js.native
  /** Defines the draggable region of diagram elements.
    * @Default {ej.datavisualization.Diagram.BoundaryConstraints.Infinite}
    */
  var boundaryConstraints: js.UndefOr[BoundaryConstraints | String] = js.native
  /** Sets whether multiple pages can be created to fit all nodes and connectors
    * @Default {false}
    */
  var multiplePage: js.UndefOr[Boolean] = js.native
  /** Defines the background color of diagram pages
    * @Default {#ffffff}
    */
  var pageBackgroundColor: js.UndefOr[String] = js.native
  /** Defines the page border color
    * @Default {#565656}
    */
  var pageBorderColor: js.UndefOr[String] = js.native
  /** Sets the border width of diagram pages
    * @Default {0}
    */
  var pageBorderWidth: js.UndefOr[Double] = js.native
  /** Defines the height of a page
    * @Default {null}
    */
  var pageHeight: js.UndefOr[Double] = js.native
  /** Defines the page margin
    * @Default {24}
    */
  var pageMargin: js.UndefOr[Double] = js.native
  /** Sets the orientation of the page.
    * @Default {ej.datavisualization.Diagram.PageOrientations.Portrait}
    */
  var pageOrientation: js.UndefOr[PageOrientations | String] = js.native
  /** Defines the height of a diagram page
    * @Default {null}
    */
  var pageWidth: js.UndefOr[Double] = js.native
  /** Defines the scrollable region of diagram.
    * @Default {ej.datavisualization.Diagram.ScrollLimit.Infinite}
    */
  var scrollLimit: js.UndefOr[ScrollLimit | String] = js.native
  /** Defines the scrollable area of diagram. Applicable, if the scroll limit is &quot;limited&quot;.
    * @Default {null}
    */
  var scrollableArea: js.UndefOr[js.Any] = js.native
  /** Enables or disables the page breaks
    * @Default {false}
    */
  var showPageBreak: js.UndefOr[Boolean] = js.native
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
    def setAutoScrollBorder(value: js.Any): Self = this.set("autoScrollBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScrollBorder: Self = this.set("autoScrollBorder", js.undefined)
    @scala.inline
    def setBoundaryConstraints(value: BoundaryConstraints | String): Self = this.set("boundaryConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryConstraints: Self = this.set("boundaryConstraints", js.undefined)
    @scala.inline
    def setMultiplePage(value: Boolean): Self = this.set("multiplePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplePage: Self = this.set("multiplePage", js.undefined)
    @scala.inline
    def setPageBackgroundColor(value: String): Self = this.set("pageBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBackgroundColor: Self = this.set("pageBackgroundColor", js.undefined)
    @scala.inline
    def setPageBorderColor(value: String): Self = this.set("pageBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBorderColor: Self = this.set("pageBorderColor", js.undefined)
    @scala.inline
    def setPageBorderWidth(value: Double): Self = this.set("pageBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBorderWidth: Self = this.set("pageBorderWidth", js.undefined)
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
    @scala.inline
    def setPageMargin(value: Double): Self = this.set("pageMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageMargin: Self = this.set("pageMargin", js.undefined)
    @scala.inline
    def setPageOrientation(value: PageOrientations | String): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    @scala.inline
    def setPageWidth(value: Double): Self = this.set("pageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageWidth: Self = this.set("pageWidth", js.undefined)
    @scala.inline
    def setScrollLimit(value: ScrollLimit | String): Self = this.set("scrollLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollLimit: Self = this.set("scrollLimit", js.undefined)
    @scala.inline
    def setScrollableArea(value: js.Any): Self = this.set("scrollableArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollableArea: Self = this.set("scrollableArea", js.undefined)
    @scala.inline
    def setShowPageBreak(value: Boolean): Self = this.set("showPageBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPageBreak: Self = this.set("showPageBreak", js.undefined)
  }
  
}

