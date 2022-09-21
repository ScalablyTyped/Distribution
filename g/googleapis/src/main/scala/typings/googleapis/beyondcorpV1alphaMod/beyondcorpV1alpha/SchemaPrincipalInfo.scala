package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrincipalInfo extends StObject {
  
  /**
    * A GCP service account.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
}
object SchemaPrincipalInfo {
  
  inline def apply(): SchemaPrincipalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipalInfo]
  }
  
  extension [Self <: SchemaPrincipalInfo](x: Self) {
    
    inline def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
