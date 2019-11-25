package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesPaletteItem extends js.Object {
  /** Defines whether the symbol should be drawn at its actual size regardless of precedence factors or not
    * @Default {true}
    */
  var enableScale: js.UndefOr[Boolean] = js.undefined
  /** Defines the height of the symbol
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** To display a name for nodes in the symbol palette
    * @Default {null}
    */
  var label: js.UndefOr[String] = js.undefined
  /** Defines the margin of the symbol item
    * @Default {{ left: 4, right: 4, top: 4, bottom: 4 }}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Defines the preview height of the symbol
    * @Default {undefined}
    */
  var previewHeight: js.UndefOr[Double] = js.undefined
  /** Defines the preview width of the symbol
    * @Default {undefined}
    */
  var previewWidth: js.UndefOr[Double] = js.undefined
  /** Defines the width of the symbol
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NodesPaletteItem {
  @scala.inline
  def apply(
    enableScale: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    label: String = null,
    margin: js.Any = null,
    previewHeight: Int | Double = null,
    previewWidth: Int | Double = null,
    width: Int | Double = null
  ): NodesPaletteItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableScale)) __obj.updateDynamic("enableScale")(enableScale.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesPaletteItem]
  }
}

