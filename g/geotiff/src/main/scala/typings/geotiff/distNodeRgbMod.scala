package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeRgbMod {
  
  @JSImport("geotiff/dist-node/rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBlackIsZero(raster: Any, max: Any): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlackIsZero")(raster.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromCIELab(cieLabRaster: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCIELab")(cieLabRaster.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromCMYK(cmykRaster: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCMYK")(cmykRaster.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromPalette(raster: Any, colorMap: Any): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPalette")(raster.asInstanceOf[js.Any], colorMap.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromWhiteIsZero(raster: Any, max: Any): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWhiteIsZero")(raster.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromYCbCr(yCbCrRaster: Any): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fromYCbCr")(yCbCrRaster.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
}
