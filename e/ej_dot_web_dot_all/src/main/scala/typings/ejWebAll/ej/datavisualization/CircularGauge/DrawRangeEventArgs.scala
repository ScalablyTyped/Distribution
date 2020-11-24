package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawRangeEventArgs extends js.Object {
  
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.native
  
  /** returns the gauge model
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  
  /** returns the startX and startY of the range
    */
  var position: js.UndefOr[js.Any] = js.native
  
  /** returns the current range element.
    */
  var rangeElement: js.UndefOr[js.Any] = js.native
  
  /** returns the index of the range.
    */
  var rangeIndex: js.UndefOr[Double] = js.native
  
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.native
  
  /** returns the scaleIndex to which the range belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.native
  
  /** returns the range style
    */
  var style: js.UndefOr[String] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object DrawRangeEventArgs {
  
  @scala.inline
  def apply(): DrawRangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawRangeEventArgs]
  }
  
  @scala.inline
  implicit class DrawRangeEventArgsOps[Self <: DrawRangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRangeElement(value: js.Any): Self = this.set("rangeElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeElement: Self = this.set("rangeElement", js.undefined)
    
    @scala.inline
    def setRangeIndex(value: Double): Self = this.set("rangeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeIndex: Self = this.set("rangeIndex", js.undefined)
    
    @scala.inline
    def setScaleElement(value: js.Any): Self = this.set("scaleElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleElement: Self = this.set("scaleElement", js.undefined)
    
    @scala.inline
    def setScaleIndex(value: Double): Self = this.set("scaleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleIndex: Self = this.set("scaleIndex", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
