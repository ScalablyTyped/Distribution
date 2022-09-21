package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEgress extends StObject {
  
  /**
    * A VPC from the consumer project.
    */
  var peeredVpc: js.UndefOr[SchemaPeeredVpc] = js.undefined
}
object SchemaEgress {
  
  inline def apply(): SchemaEgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEgress]
  }
  
  extension [Self <: SchemaEgress](x: Self) {
    
    inline def setPeeredVpc(value: SchemaPeeredVpc): Self = StObject.set(x, "peeredVpc", value.asInstanceOf[js.Any])
    
    inline def setPeeredVpcUndefined: Self = StObject.set(x, "peeredVpc", js.undefined)
  }
}
