package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReprojectImageOptions extends js.Object {
  
  var cutline: js.UndefOr[Geometry] = js.native
  
  var dst: Dataset = js.native
  
  var dstAlphaBand: js.UndefOr[Double] = js.native
  
  var dstBands: js.UndefOr[js.Array[Double]] = js.native
  
  var dstNodata: js.UndefOr[Double] = js.native
  
  var maxError: js.UndefOr[Double] = js.native
  
  var memoryLimit: js.UndefOr[Double] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[js.Array[String] | js.Object] = js.native
  
  var resampling: js.UndefOr[String] = js.native
  
  var s_srs: SpatialReference = js.native
  
  var src: Dataset = js.native
  
  var srcAlphaBand: js.UndefOr[Double] = js.native
  
  var srcBands: js.UndefOr[js.Array[Double]] = js.native
  
  var srcNodata: js.UndefOr[Double] = js.native
  
  var t_srs: SpatialReference = js.native
}
object ReprojectImageOptions {
  
  @scala.inline
  def apply(dst: Dataset, s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
  
  @scala.inline
  implicit class ReprojectImageOptionsOps[Self <: ReprojectImageOptions] (val x: Self) extends AnyVal {
    
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
    def setDst(value: Dataset): Self = this.set("dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS_srs(value: SpatialReference): Self = this.set("s_srs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: Dataset): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT_srs(value: SpatialReference): Self = this.set("t_srs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutline(value: Geometry): Self = this.set("cutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCutline: Self = this.set("cutline", js.undefined)
    
    @scala.inline
    def setDstAlphaBand(value: Double): Self = this.set("dstAlphaBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstAlphaBand: Self = this.set("dstAlphaBand", js.undefined)
    
    @scala.inline
    def setDstBandsVarargs(value: Double*): Self = this.set("dstBands", js.Array(value :_*))
    
    @scala.inline
    def setDstBands(value: js.Array[Double]): Self = this.set("dstBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstBands: Self = this.set("dstBands", js.undefined)
    
    @scala.inline
    def setDstNodata(value: Double): Self = this.set("dstNodata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstNodata: Self = this.set("dstNodata", js.undefined)
    
    @scala.inline
    def setMaxError(value: Double): Self = this.set("maxError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxError: Self = this.set("maxError", js.undefined)
    
    @scala.inline
    def setMemoryLimit(value: Double): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryLimit: Self = this.set("memoryLimit", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String] | js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setResampling(value: String): Self = this.set("resampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResampling: Self = this.set("resampling", js.undefined)
    
    @scala.inline
    def setSrcAlphaBand(value: Double): Self = this.set("srcAlphaBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcAlphaBand: Self = this.set("srcAlphaBand", js.undefined)
    
    @scala.inline
    def setSrcBandsVarargs(value: Double*): Self = this.set("srcBands", js.Array(value :_*))
    
    @scala.inline
    def setSrcBands(value: js.Array[Double]): Self = this.set("srcBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcBands: Self = this.set("srcBands", js.undefined)
    
    @scala.inline
    def setSrcNodata(value: Double): Self = this.set("srcNodata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcNodata: Self = this.set("srcNodata", js.undefined)
  }
}
