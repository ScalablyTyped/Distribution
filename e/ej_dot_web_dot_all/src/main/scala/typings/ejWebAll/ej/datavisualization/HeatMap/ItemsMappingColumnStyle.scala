package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsMappingColumnStyle extends js.Object {
  
  /** Specifies the template id of the column header.
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  
  /** Specifies the template id of all individual cell data.
    */
  var templateID: js.UndefOr[String] = js.native
  
  /** Specifies the text align mode of the heat map column.
    * @Default {ej.HeatMap.TextAlign.Center}
    */
  var textAlign: js.UndefOr[String] = js.native
  
  /** Specifies the width of the heat map column.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}
object ItemsMappingColumnStyle {
  
  @scala.inline
  def apply(): ItemsMappingColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsMappingColumnStyle]
  }
  
  @scala.inline
  implicit class ItemsMappingColumnStyleOps[Self <: ItemsMappingColumnStyle] (val x: Self) extends AnyVal {
    
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
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
