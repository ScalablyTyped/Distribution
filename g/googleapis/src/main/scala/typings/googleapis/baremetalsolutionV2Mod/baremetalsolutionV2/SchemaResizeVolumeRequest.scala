package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResizeVolumeRequest extends StObject {
  
  /**
    * New Volume size, in GiB.
    */
  var sizeGib: js.UndefOr[String | Null] = js.undefined
}
object SchemaResizeVolumeRequest {
  
  inline def apply(): SchemaResizeVolumeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResizeVolumeRequest]
  }
  
  extension [Self <: SchemaResizeVolumeRequest](x: Self) {
    
    inline def setSizeGib(value: String): Self = StObject.set(x, "sizeGib", value.asInstanceOf[js.Any])
    
    inline def setSizeGibNull: Self = StObject.set(x, "sizeGib", null)
    
    inline def setSizeGibUndefined: Self = StObject.set(x, "sizeGib", js.undefined)
  }
}
