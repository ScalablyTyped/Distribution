package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var details: js.UndefOr[js.Array[ApiClientObjectMap[Any]]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: js.Array[ApiClientObjectMap[Any]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: ApiClientObjectMap[Any]*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
