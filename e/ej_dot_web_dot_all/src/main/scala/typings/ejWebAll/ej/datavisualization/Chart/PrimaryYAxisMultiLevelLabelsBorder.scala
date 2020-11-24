package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryYAxisMultiLevelLabelsBorder extends js.Object {
  
  /** Border color of the multi level labels.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Border type of the multi level labels.
    * @Default {rectangle. See Type}
    */
  var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.native
  
  /** Border width of the multi level labels.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object PrimaryYAxisMultiLevelLabelsBorder {
  
  @scala.inline
  def apply(): PrimaryYAxisMultiLevelLabelsBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisMultiLevelLabelsBorder]
  }
  
  @scala.inline
  implicit class PrimaryYAxisMultiLevelLabelsBorderOps[Self <: PrimaryYAxisMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setType(value: MultiLevelLabelsBorderType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
