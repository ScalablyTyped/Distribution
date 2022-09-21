package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEkmConnection extends StObject {
  
  /**
    * Output only. The time at which the EkmConnection was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name for the EkmConnection in the format `projects/x/locations/x/ekmConnections/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported.
    */
  var serviceResolvers: js.UndefOr[js.Array[SchemaServiceResolver]] = js.undefined
}
object SchemaEkmConnection {
  
  inline def apply(): SchemaEkmConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEkmConnection]
  }
  
  extension [Self <: SchemaEkmConnection](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceResolvers(value: js.Array[SchemaServiceResolver]): Self = StObject.set(x, "serviceResolvers", value.asInstanceOf[js.Any])
    
    inline def setServiceResolversUndefined: Self = StObject.set(x, "serviceResolvers", js.undefined)
    
    inline def setServiceResolversVarargs(value: SchemaServiceResolver*): Self = StObject.set(x, "serviceResolvers", js.Array(value*))
  }
}
