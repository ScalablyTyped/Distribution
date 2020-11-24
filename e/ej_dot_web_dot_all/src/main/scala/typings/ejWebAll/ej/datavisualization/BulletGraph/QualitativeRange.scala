package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualitativeRange extends js.Object {
  
  /** Specifies the ending range to which the qualitative ranges will render.
    * @Default {3}
    */
  var rangeEnd: js.UndefOr[Double] = js.native
  
  /** Specifies the opacity for the qualitative ranges.
    * @Default {1}
    */
  var rangeOpacity: js.UndefOr[Double] = js.native
  
  /** Specifies the stroke for the qualitative ranges.
    * @Default {null}
    */
  var rangeStroke: js.UndefOr[String] = js.native
}
object QualitativeRange {
  
  @scala.inline
  def apply(): QualitativeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualitativeRange]
  }
  
  @scala.inline
  implicit class QualitativeRangeOps[Self <: QualitativeRange] (val x: Self) extends AnyVal {
    
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
    def setRangeEnd(value: Double): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeOpacity(value: Double): Self = this.set("rangeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeOpacity: Self = this.set("rangeOpacity", js.undefined)
    
    @scala.inline
    def setRangeStroke(value: String): Self = this.set("rangeStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeStroke: Self = this.set("rangeStroke", js.undefined)
  }
}
