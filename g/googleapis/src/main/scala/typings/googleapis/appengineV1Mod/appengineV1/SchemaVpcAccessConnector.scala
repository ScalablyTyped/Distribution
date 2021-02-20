package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VPC access connector specification.
  */
@js.native
trait SchemaVpcAccessConnector extends StObject {
  
  /**
    * Full Serverless VPC Access Connector name e.g.
    * /projects/my-project/locations/us-central1/connectors/c1.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaVpcAccessConnector {
  
  @scala.inline
  def apply(): SchemaVpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcAccessConnector]
  }
  
  @scala.inline
  implicit class SchemaVpcAccessConnectorMutableBuilder[Self <: SchemaVpcAccessConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
