package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesPaletteItem extends js.Object {
  /** Defines whether the symbol should be drawn at its actual size regardless of precedence factors or not
    * @Default {true}
    */
  var enableScale: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the height of the symbol
    * @Default {0}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** To display a name for nodes in the symbol palette
    * @Default {null}
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the margin of the symbol item
    * @Default {{ left: 4, right: 4, top: 4, bottom: 4 }}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Defines the preview height of the symbol
    * @Default {undefined}
    */
  var previewHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the preview width of the symbol
    * @Default {undefined}
    */
  var previewWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the width of the symbol
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NodesPaletteItem {
  @scala.inline
  def apply(
    enableScale: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    margin: js.Any = null,
    previewHeight: scala.Int | scala.Double = null,
    previewWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): NodesPaletteItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableScale)) __obj.updateDynamic("enableScale")(enableScale)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (previewHeight != null) __obj.updateDynamic("previewHeight")(previewHeight.asInstanceOf[js.Any])
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesPaletteItem]
  }
}

