package typings.ejWebAll.ej.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentBorder extends js.Object {
  
  /** Segment Border color of the sunburst.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Width of the Sunburst segment border.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}
object SegmentBorder {
  
  @scala.inline
  def apply(): SegmentBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentBorder]
  }
  
  @scala.inline
  implicit class SegmentBorderOps[Self <: SegmentBorder] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
