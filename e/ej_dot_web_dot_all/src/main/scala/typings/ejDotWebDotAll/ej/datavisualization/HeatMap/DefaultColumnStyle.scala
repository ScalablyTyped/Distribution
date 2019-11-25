package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultColumnStyle extends js.Object {
  /** Specifies the template id of the heat map column header.
    */
  var headerTemplateID: js.UndefOr[String] = js.undefined
  /** Specifies the template id of all individual cell data of the heat map.
    */
  var templateID: js.UndefOr[String] = js.undefined
  /** Specifies the alignment mode of the heat map column.
    * @Default {ej.HeatMap.TextAlign.Center}
    */
  var textAlign: js.UndefOr[js.Any] = js.undefined
}

object DefaultColumnStyle {
  @scala.inline
  def apply(headerTemplateID: String = null, templateID: String = null, textAlign: js.Any = null): DefaultColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (headerTemplateID != null) __obj.updateDynamic("headerTemplateID")(headerTemplateID.asInstanceOf[js.Any])
    if (templateID != null) __obj.updateDynamic("templateID")(templateID.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultColumnStyle]
  }
}

