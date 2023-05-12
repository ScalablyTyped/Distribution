package typings.forgeApis.anon

import typings.forgeApis.mod.DownloadResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseType extends StObject {
  
  var objectKey: String
  
  var responseType: js.UndefOr[DownloadResponseType] = js.undefined
}
object ResponseType {
  
  inline def apply(objectKey: String): ResponseType = {
    val __obj = js.Dynamic.literal(objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseType] (val x: Self) extends AnyVal {
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: DownloadResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
