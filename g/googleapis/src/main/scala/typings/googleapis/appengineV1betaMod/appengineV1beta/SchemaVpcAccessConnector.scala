package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpcAccessConnector extends StObject {
  
  /**
    * The egress setting for the connector, controlling what traffic is diverted through it.
    */
  var egressSetting: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpcAccessConnector {
  
  inline def apply(): SchemaVpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcAccessConnector]
  }
  
  extension [Self <: SchemaVpcAccessConnector](x: Self) {
    
    inline def setEgressSetting(value: String): Self = StObject.set(x, "egressSetting", value.asInstanceOf[js.Any])
    
    inline def setEgressSettingNull: Self = StObject.set(x, "egressSetting", null)
    
    inline def setEgressSettingUndefined: Self = StObject.set(x, "egressSetting", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
