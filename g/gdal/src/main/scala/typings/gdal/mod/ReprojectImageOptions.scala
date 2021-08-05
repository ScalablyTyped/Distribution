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
  
  inline def apply(dst: Dataset, s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
  
  extension [Self <: ReprojectImageOptions](x: Self) {
    
    inline def setCutline(value: Geometry): Self = StObject.set(x, "cutline", value.asInstanceOf[js.Any])
    
    inline def setCutlineUndefined: Self = StObject.set(x, "cutline", js.undefined)
    
    inline def setDst(value: Dataset): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    inline def setDstAlphaBand(value: Double): Self = StObject.set(x, "dstAlphaBand", value.asInstanceOf[js.Any])
    
    inline def setDstAlphaBandUndefined: Self = StObject.set(x, "dstAlphaBand", js.undefined)
    
    inline def setDstBands(value: js.Array[Double]): Self = StObject.set(x, "dstBands", value.asInstanceOf[js.Any])
    
    inline def setDstBandsUndefined: Self = StObject.set(x, "dstBands", js.undefined)
    
    inline def setDstBandsVarargs(value: Double*): Self = StObject.set(x, "dstBands", js.Array(value :_*))
    
    inline def setDstNodata(value: Double): Self = StObject.set(x, "dstNodata", value.asInstanceOf[js.Any])
    
    inline def setDstNodataUndefined: Self = StObject.set(x, "dstNodata", js.undefined)
    
    inline def setMaxError(value: Double): Self = StObject.set(x, "maxError", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorUndefined: Self = StObject.set(x, "maxError", js.undefined)
    
    inline def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
    
    inline def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setOptions(value: js.Array[String] | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setResampling(value: String): Self = StObject.set(x, "resampling", value.asInstanceOf[js.Any])
    
    inline def setResamplingUndefined: Self = StObject.set(x, "resampling", js.undefined)
    
    inline def setS_srs(value: SpatialReference): Self = StObject.set(x, "s_srs", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: Dataset): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcAlphaBand(value: Double): Self = StObject.set(x, "srcAlphaBand", value.asInstanceOf[js.Any])
    
    inline def setSrcAlphaBandUndefined: Self = StObject.set(x, "srcAlphaBand", js.undefined)
    
    inline def setSrcBands(value: js.Array[Double]): Self = StObject.set(x, "srcBands", value.asInstanceOf[js.Any])
    
    inline def setSrcBandsUndefined: Self = StObject.set(x, "srcBands", js.undefined)
    
    inline def setSrcBandsVarargs(value: Double*): Self = StObject.set(x, "srcBands", js.Array(value :_*))
    
    inline def setSrcNodata(value: Double): Self = StObject.set(x, "srcNodata", value.asInstanceOf[js.Any])
    
    inline def setSrcNodataUndefined: Self = StObject.set(x, "srcNodata", js.undefined)
    
    inline def setT_srs(value: SpatialReference): Self = StObject.set(x, "t_srs", value.asInstanceOf[js.Any])
  }
}
