package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VPC access connector specification.
  */
trait SchemaVpcAccessConnector extends StObject {
  
  /**
    * Full Serverless VPC Access Connector name e.g.
    * /projects/my-project/locations/us-central1/connectors/c1.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaVpcAccessConnector {
  
  inline def apply(): SchemaVpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcAccessConnector]
  }
  
  extension [Self <: SchemaVpcAccessConnector](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
