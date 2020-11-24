package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawQualitativeRangesEventArgs extends js.Object {
  
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  
  /** returns the end value of current range.
    */
  var rangeEndValue: js.UndefOr[Double] = js.native
  
  /** returns the index of current range.
    */
  var rangeIndex: js.UndefOr[Double] = js.native
  
  /** returns the settings for current range.
    */
  var rangeOptions: js.UndefOr[js.Any] = js.native
}
object DrawQualitativeRangesEventArgs {
  
  @scala.inline
  def apply(): DrawQualitativeRangesEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawQualitativeRangesEventArgs]
  }
  
  @scala.inline
  implicit class DrawQualitativeRangesEventArgsOps[Self <: DrawQualitativeRangesEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRangeEndValue(value: Double): Self = this.set("rangeEndValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEndValue: Self = this.set("rangeEndValue", js.undefined)
    
    @scala.inline
    def setRangeIndex(value: Double): Self = this.set("rangeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeIndex: Self = this.set("rangeIndex", js.undefined)
    
    @scala.inline
    def setRangeOptions(value: js.Any): Self = this.set("rangeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeOptions: Self = this.set("rangeOptions", js.undefined)
  }
}
