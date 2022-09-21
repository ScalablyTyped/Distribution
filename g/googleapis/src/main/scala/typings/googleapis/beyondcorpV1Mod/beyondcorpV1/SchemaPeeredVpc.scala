package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPeeredVpc extends StObject {
  
  /**
    * Required. The name of the peered VPC owned by the consumer project.
    */
  var networkVpc: js.UndefOr[String | Null] = js.undefined
}
object SchemaPeeredVpc {
  
  inline def apply(): SchemaPeeredVpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeeredVpc]
  }
  
  extension [Self <: SchemaPeeredVpc](x: Self) {
    
    inline def setNetworkVpc(value: String): Self = StObject.set(x, "networkVpc", value.asInstanceOf[js.Any])
    
    inline def setNetworkVpcNull: Self = StObject.set(x, "networkVpc", null)
    
    inline def setNetworkVpcUndefined: Self = StObject.set(x, "networkVpc", js.undefined)
  }
}
