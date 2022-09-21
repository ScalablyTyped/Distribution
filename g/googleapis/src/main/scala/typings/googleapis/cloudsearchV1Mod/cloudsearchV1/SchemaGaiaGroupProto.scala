package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGaiaGroupProto extends StObject {
  
  var groupId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGaiaGroupProto {
  
  inline def apply(): SchemaGaiaGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGaiaGroupProto]
  }
  
  extension [Self <: SchemaGaiaGroupProto](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
