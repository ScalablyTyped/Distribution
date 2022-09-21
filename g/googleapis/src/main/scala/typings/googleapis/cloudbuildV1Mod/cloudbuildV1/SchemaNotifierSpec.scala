package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotifierSpec extends StObject {
  
  /**
    * The configuration of this particular notifier.
    */
  var notification: js.UndefOr[SchemaNotification] = js.undefined
  
  /**
    * Configurations for secret resources used by this particular notifier.
    */
  var secrets: js.UndefOr[js.Array[SchemaNotifierSecret]] = js.undefined
}
object SchemaNotifierSpec {
  
  inline def apply(): SchemaNotifierSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifierSpec]
  }
  
  extension [Self <: SchemaNotifierSpec](x: Self) {
    
    inline def setNotification(value: SchemaNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setSecrets(value: js.Array[SchemaNotifierSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: SchemaNotifierSecret*): Self = StObject.set(x, "secrets", js.Array(value*))
  }
}
