package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReprojectImageOptions extends StObject {
  
  var cutline: js.UndefOr[Geometry] = js.undefined
  
  var dst: Dataset
  
  var dstAlphaBand: js.UndefOr[Double] = js.undefined
  
  var dstBands: js.UndefOr[js.Array[Double]] = js.undefined
  
  var dstNodata: js.UndefOr[Double] = js.undefined
  
  var maxError: js.UndefOr[Double] = js.undefined
  
  var memoryLimit: js.UndefOr[Double] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[js.Array[String] | js.Object] = js.undefined
  
  var resampling: js.UndefOr[String] = js.undefined
  
  var s_srs: SpatialReference
  
  var src: Dataset
  
  var srcAlphaBand: js.UndefOr[Double] = js.undefined
  
  var srcBands: js.UndefOr[js.Array[Double]] = js.undefined
  
  var srcNodata: js.UndefOr[Double] = js.undefined
  
  var t_srs: SpatialReference
}
object ReprojectImageOptions {
  
  @scala.inline
  def apply(dst: Dataset, s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
  
  @scala.inline
  implicit class ReprojectImageOptionsMutableBuilder[Self <: ReprojectImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCutline(value: Geometry): Self = StObject.set(x, "cutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutlineUndefined: Self = StObject.set(x, "cutline", js.undefined)
    
    @scala.inline
    def setDst(value: Dataset): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstAlphaBand(value: Double): Self = StObject.set(x, "dstAlphaBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstAlphaBandUndefined: Self = StObject.set(x, "dstAlphaBand", js.undefined)
    
    @scala.inline
    def setDstBands(value: js.Array[Double]): Self = StObject.set(x, "dstBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstBandsUndefined: Self = StObject.set(x, "dstBands", js.undefined)
    
    @scala.inline
    def setDstBandsVarargs(value: Double*): Self = StObject.set(x, "dstBands", js.Array(value :_*))
    
    @scala.inline
    def setDstNodata(value: Double): Self = StObject.set(x, "dstNodata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstNodataUndefined: Self = StObject.set(x, "dstNodata", js.undefined)
    
    @scala.inline
    def setMaxError(value: Double): Self = StObject.set(x, "maxError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorUndefined: Self = StObject.set(x, "maxError", js.undefined)
    
    @scala.inline
    def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[String] | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setResampling(value: String): Self = StObject.set(x, "resampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResamplingUndefined: Self = StObject.set(x, "resampling", js.undefined)
    
    @scala.inline
    def setS_srs(value: SpatialReference): Self = StObject.set(x, "s_srs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: Dataset): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcAlphaBand(value: Double): Self = StObject.set(x, "srcAlphaBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcAlphaBandUndefined: Self = StObject.set(x, "srcAlphaBand", js.undefined)
    
    @scala.inline
    def setSrcBands(value: js.Array[Double]): Self = StObject.set(x, "srcBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcBandsUndefined: Self = StObject.set(x, "srcBands", js.undefined)
    
    @scala.inline
    def setSrcBandsVarargs(value: Double*): Self = StObject.set(x, "srcBands", js.Array(value :_*))
    
    @scala.inline
    def setSrcNodata(value: Double): Self = StObject.set(x, "srcNodata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcNodataUndefined: Self = StObject.set(x, "srcNodata", js.undefined)
    
    @scala.inline
    def setT_srs(value: SpatialReference): Self = StObject.set(x, "t_srs", value.asInstanceOf[js.Any])
  }
}
