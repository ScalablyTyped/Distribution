package typings.ejWebAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawLabelsEventArgs extends js.Object {
  
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  
  /** returns the label type.
    */
  var labelType: js.UndefOr[String] = js.native
  
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.native
  
  /** returns the current label element.
    */
  var tickElement: js.UndefOr[HTMLElement] = js.native
}
object DrawLabelsEventArgs {
  
  @scala.inline
  def apply(): DrawLabelsEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawLabelsEventArgs]
  }
  
  @scala.inline
  implicit class DrawLabelsEventArgsOps[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
    
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
    def setObject(value: js.Any): Self = this.set("Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("Object", js.undefined)
    
    @scala.inline
    def setLabelType(value: String): Self = this.set("labelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelType: Self = this.set("labelType", js.undefined)
    
    @scala.inline
    def setScaleElement(value: HTMLElement): Self = this.set("scaleElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleElement: Self = this.set("scaleElement", js.undefined)
    
    @scala.inline
    def setTickElement(value: HTMLElement): Self = this.set("tickElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickElement: Self = this.set("tickElement", js.undefined)
  }
}
