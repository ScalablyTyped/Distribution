package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsContext extends js.Object {
  
  /**
    * The fill color to use for the overlay. Colors are typically specified by their RGB hex values, but you can also use a [friendly CSS color
    * name](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /**
    * The line color to use for the overlay. Colors are typically specified by their RGB hex values, but you can also use a
    * [friendly CSS color name](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /**
    * The line weight or thickness to use for the overlay.
    */
  var lineWeight: js.UndefOr[String] = js.native
}
object GraphicsContext {
  
  @scala.inline
  def apply(): GraphicsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsContext]
  }
  
  @scala.inline
  implicit class GraphicsContextOps[Self <: GraphicsContext] (val x: Self) extends AnyVal {
    
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineWeight(value: String): Self = this.set("lineWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWeight: Self = this.set("lineWeight", js.undefined)
  }
}
