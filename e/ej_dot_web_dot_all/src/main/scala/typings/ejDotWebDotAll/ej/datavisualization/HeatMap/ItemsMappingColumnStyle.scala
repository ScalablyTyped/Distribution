package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsMappingColumnStyle extends js.Object {
  /** Specifies the template id of the column header.
    */
  var headerTemplateID: js.UndefOr[String] = js.undefined
  /** Specifies the template id of all individual cell data.
    */
  var templateID: js.UndefOr[String] = js.undefined
  /** Specifies the text align mode of the heat map column.
    * @Default {ej.HeatMap.TextAlign.Center}
    */
  var textAlign: js.UndefOr[String] = js.undefined
  /** Specifies the width of the heat map column.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ItemsMappingColumnStyle {
  @scala.inline
  def apply(
    headerTemplateID: String = null,
    templateID: String = null,
    textAlign: String = null,
    width: Int | Double = null
  ): ItemsMappingColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (headerTemplateID != null) __obj.updateDynamic("headerTemplateID")(headerTemplateID)
    if (templateID != null) __obj.updateDynamic("templateID")(templateID)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsMappingColumnStyle]
  }
}

