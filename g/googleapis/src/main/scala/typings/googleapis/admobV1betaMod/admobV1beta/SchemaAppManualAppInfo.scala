package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppManualAppInfo extends StObject {
  
  /**
    * The display name of the app as shown in the AdMob UI, which is provided by the user. The maximum length allowed is 80 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppManualAppInfo {
  
  inline def apply(): SchemaAppManualAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppManualAppInfo]
  }
  
  extension [Self <: SchemaAppManualAppInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
