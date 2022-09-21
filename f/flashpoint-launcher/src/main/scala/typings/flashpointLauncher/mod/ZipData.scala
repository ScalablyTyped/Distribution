package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipData extends StObject {
  
  var attributes: js.UndefOr[String] = js.undefined
  
  var file: String
  
  var hash: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeCompressed: js.UndefOr[Double] = js.undefined
  
  var status: String
}
object ZipData {
  
  inline def apply(file: String, status: String): ZipData = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipData]
  }
  
  extension [Self <: ZipData](x: Self) {
    
    inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeCompressed(value: Double): Self = StObject.set(x, "sizeCompressed", value.asInstanceOf[js.Any])
    
    inline def setSizeCompressedUndefined: Self = StObject.set(x, "sizeCompressed", js.undefined)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
