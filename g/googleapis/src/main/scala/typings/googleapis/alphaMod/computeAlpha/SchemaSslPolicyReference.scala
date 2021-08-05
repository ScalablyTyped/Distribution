package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslPolicyReference extends StObject {
  
  /**
    * URL of the SSL policy resource. Set this to empty string to clear any
    * existing SSL policy associated with the target proxy resource.
    */
  var sslPolicy: js.UndefOr[String] = js.undefined
}
object SchemaSslPolicyReference {
  
  inline def apply(): SchemaSslPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPolicyReference]
  }
  
  extension [Self <: SchemaSslPolicyReference](x: Self) {
    
    inline def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    
    inline def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
  }
}
