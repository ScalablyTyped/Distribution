package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleBorder extends js.Object {
  
  /** color of the title border.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  
  /** opacity of the title border.
    * @Default {0.8}
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  
  /** opacity of the title border.
    * @Default {0.8}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Width of the title border.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object TitleBorder {
  
  @scala.inline
  def apply(): TitleBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleBorder]
  }
  
  @scala.inline
  implicit class TitleBorderOps[Self <: TitleBorder] (val x: Self) extends AnyVal {
    
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
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
