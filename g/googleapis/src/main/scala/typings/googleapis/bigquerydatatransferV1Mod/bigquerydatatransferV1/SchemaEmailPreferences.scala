package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailPreferences extends StObject {
  
  /**
    * If true, email notifications will be sent on transfer run failures.
    */
  var enableFailureEmail: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaEmailPreferences {
  
  inline def apply(): SchemaEmailPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailPreferences]
  }
  
  extension [Self <: SchemaEmailPreferences](x: Self) {
    
    inline def setEnableFailureEmail(value: Boolean): Self = StObject.set(x, "enableFailureEmail", value.asInstanceOf[js.Any])
    
    inline def setEnableFailureEmailNull: Self = StObject.set(x, "enableFailureEmail", null)
    
    inline def setEnableFailureEmailUndefined: Self = StObject.set(x, "enableFailureEmail", js.undefined)
  }
}
