package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedVideoReference extends StObject {
  
  /**
    * Available transcode format. Value is defined in video/storage/proto/content_header.proto
    */
  var format: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Transcode status
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedVideoReference {
  
  inline def apply(): SchemaAppsDynamiteSharedVideoReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedVideoReference]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedVideoReference](x: Self) {
    
    inline def setFormat(value: js.Array[Double]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: Double*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
