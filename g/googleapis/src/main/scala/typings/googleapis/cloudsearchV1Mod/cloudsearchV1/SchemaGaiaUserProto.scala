package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGaiaUserProto extends StObject {
  
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGaiaUserProto {
  
  inline def apply(): SchemaGaiaUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGaiaUserProto]
  }
  
  extension [Self <: SchemaGaiaUserProto](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
