package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverInfo extends StObject {
  
  var coverInfo: js.UndefOr[LeftImageOffset] = js.undefined
  
  var coverPhoto: js.UndefOr[Height] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
}
object CoverInfo {
  
  inline def apply(): CoverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverInfo]
  }
  
  extension [Self <: CoverInfo](x: Self) {
    
    inline def setCoverInfo(value: LeftImageOffset): Self = StObject.set(x, "coverInfo", value.asInstanceOf[js.Any])
    
    inline def setCoverInfoUndefined: Self = StObject.set(x, "coverInfo", js.undefined)
    
    inline def setCoverPhoto(value: Height): Self = StObject.set(x, "coverPhoto", value.asInstanceOf[js.Any])
    
    inline def setCoverPhotoUndefined: Self = StObject.set(x, "coverPhoto", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
