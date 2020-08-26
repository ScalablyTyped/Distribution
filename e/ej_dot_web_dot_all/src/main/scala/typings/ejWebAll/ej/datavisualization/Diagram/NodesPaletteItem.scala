package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesPaletteItem extends js.Object {
  /** Defines whether the symbol should be drawn at its actual size regardless of precedence factors or not
    * @Default {true}
    */
  var enableScale: js.UndefOr[Boolean] = js.native
  /** Defines the height of the symbol
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** To display a name for nodes in the symbol palette
    * @Default {null}
    */
  var label: js.UndefOr[String] = js.native
  /** Defines the margin of the symbol item
    * @Default {{ left: 4, right: 4, top: 4, bottom: 4 }}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines the preview height of the symbol
    * @Default {undefined}
    */
  var previewHeight: js.UndefOr[Double] = js.native
  /** Defines the preview width of the symbol
    * @Default {undefined}
    */
  var previewWidth: js.UndefOr[Double] = js.native
  /** Defines the width of the symbol
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object NodesPaletteItem {
  @scala.inline
  def apply(): NodesPaletteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPaletteItem]
  }
  @scala.inline
  implicit class NodesPaletteItemOps[Self <: NodesPaletteItem] (val x: Self) extends AnyVal {
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
    def setEnableScale(value: Boolean): Self = this.set("enableScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableScale: Self = this.set("enableScale", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPreviewHeight(value: Double): Self = this.set("previewHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewHeight: Self = this.set("previewHeight", js.undefined)
    @scala.inline
    def setPreviewWidth(value: Double): Self = this.set("previewWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewWidth: Self = this.set("previewWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

