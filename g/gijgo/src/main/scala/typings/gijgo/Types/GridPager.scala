package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Grid
@js.native
trait GridPager extends js.Object {
  
  var leftControls: js.UndefOr[js.Array[_]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var rightControls: js.UndefOr[js.Array[_]] = js.native
  
  var sizes: js.UndefOr[js.Array[Double]] = js.native
}
object GridPager {
  
  @scala.inline
  def apply(): GridPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPager]
  }
  
  @scala.inline
  implicit class GridPagerOps[Self <: GridPager] (val x: Self) extends AnyVal {
    
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
    def setLeftControlsVarargs(value: js.Any*): Self = this.set("leftControls", js.Array(value :_*))
    
    @scala.inline
    def setLeftControls(value: js.Array[_]): Self = this.set("leftControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftControls: Self = this.set("leftControls", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setRightControlsVarargs(value: js.Any*): Self = this.set("rightControls", js.Array(value :_*))
    
    @scala.inline
    def setRightControls(value: js.Array[_]): Self = this.set("rightControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightControls: Self = this.set("rightControls", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
  }
}
