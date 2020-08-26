package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultColumnStyle extends js.Object {
  /** Specifies the template id of the heat map column header.
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  /** Specifies the template id of all individual cell data of the heat map.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Specifies the alignment mode of the heat map column.
    * @Default {ej.HeatMap.TextAlign.Center}
    */
  var textAlign: js.UndefOr[js.Any] = js.native
}

object DefaultColumnStyle {
  @scala.inline
  def apply(): DefaultColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultColumnStyle]
  }
  @scala.inline
  implicit class DefaultColumnStyleOps[Self <: DefaultColumnStyle] (val x: Self) extends AnyVal {
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
    def setHeaderTemplateID(value: String): Self = this.set("headerTemplateID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplateID: Self = this.set("headerTemplateID", js.undefined)
    @scala.inline
    def setTemplateID(value: String): Self = this.set("templateID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateID: Self = this.set("templateID", js.undefined)
    @scala.inline
    def setTextAlign(value: js.Any): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
  
}

