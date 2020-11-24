package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedWarpOutputOptions extends js.Object {
  
  var maxError: js.UndefOr[Double] = js.native
  
  var s_srs: SpatialReference = js.native
  
  var src: Dataset = js.native
  
  var t_srs: SpatialReference = js.native
}
object SuggestedWarpOutputOptions {
  
  @scala.inline
  def apply(s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): SuggestedWarpOutputOptions = {
    val __obj = js.Dynamic.literal(s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedWarpOutputOptions]
  }
  
  @scala.inline
  implicit class SuggestedWarpOutputOptionsOps[Self <: SuggestedWarpOutputOptions] (val x: Self) extends AnyVal {
    
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
    def setS_srs(value: SpatialReference): Self = this.set("s_srs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: Dataset): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT_srs(value: SpatialReference): Self = this.set("t_srs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxError(value: Double): Self = this.set("maxError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxError: Self = this.set("maxError", js.undefined)
  }
}
