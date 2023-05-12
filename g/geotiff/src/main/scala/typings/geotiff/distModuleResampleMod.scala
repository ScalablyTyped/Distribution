package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleResampleMod {
  
  @JSImport("geotiff/dist-module/resample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resample(
    valueArrays: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
    ],
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resample")(valueArrays.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ]]
  inline def resample(
    valueArrays: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
    ],
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double,
    method: String
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resample")(valueArrays.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ]]
  
  inline def resampleBilinear(
    valueArrays: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
    ],
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resampleBilinear")(valueArrays.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ]]
  
  inline def resampleBilinearInterleaved(
    valueArray: Any,
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double,
    samples: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resampleBilinearInterleaved")(valueArray.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resampleInterleaved(
    valueArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any,
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double,
    samples: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resampleInterleaved")(valueArray.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resampleInterleaved(
    valueArray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any,
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double,
    samples: Double,
    method: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resampleInterleaved")(valueArray.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resampleNearest(
    valueArrays: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
    ],
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resampleNearest")(valueArrays.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedArray */ Any
  ]]
  
  inline def resampleNearestInterleaved(
    valueArray: Any,
    inWidth: Double,
    inHeight: Double,
    outWidth: Double,
    outHeight: Double,
    samples: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resampleNearestInterleaved")(valueArray.asInstanceOf[js.Any], inWidth.asInstanceOf[js.Any], inHeight.asInstanceOf[js.Any], outWidth.asInstanceOf[js.Any], outHeight.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[Any]
}
