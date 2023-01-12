package typings.dwt.anon

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPixelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BDuplex extends StObject {
  
  /**
    * Whether to enable duplex scan.
    */
  var bDuplex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable document feader.
    */
  var bFeeder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * "ignore" (default) or "fail".
    */
  var exception: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the pixel type.
    */
  var pixelType: js.UndefOr[EnumDWTPixelType | Double] = js.undefined
  
  /**
    * Specify the resolution.
    */
  var resolution: js.UndefOr[Double] = js.undefined
}
object BDuplex {
  
  inline def apply(): BDuplex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BDuplex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BDuplex] (val x: Self) extends AnyVal {
    
    inline def setBDuplex(value: Boolean): Self = StObject.set(x, "bDuplex", value.asInstanceOf[js.Any])
    
    inline def setBDuplexUndefined: Self = StObject.set(x, "bDuplex", js.undefined)
    
    inline def setBFeeder(value: Boolean): Self = StObject.set(x, "bFeeder", value.asInstanceOf[js.Any])
    
    inline def setBFeederUndefined: Self = StObject.set(x, "bFeeder", js.undefined)
    
    inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setPixelType(value: EnumDWTPixelType | Double): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    inline def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
