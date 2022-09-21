package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppMakerSqlSetupNotification extends StObject {
  
  /**
    * List of applications with requests for default SQL set up.
    */
  var requestInfo: js.UndefOr[js.Array[SchemaRequestInfo]] = js.undefined
}
object SchemaAppMakerSqlSetupNotification {
  
  inline def apply(): SchemaAppMakerSqlSetupNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppMakerSqlSetupNotification]
  }
  
  extension [Self <: SchemaAppMakerSqlSetupNotification](x: Self) {
    
    inline def setRequestInfo(value: js.Array[SchemaRequestInfo]): Self = StObject.set(x, "requestInfo", value.asInstanceOf[js.Any])
    
    inline def setRequestInfoUndefined: Self = StObject.set(x, "requestInfo", js.undefined)
    
    inline def setRequestInfoVarargs(value: SchemaRequestInfo*): Self = StObject.set(x, "requestInfo", js.Array(value*))
  }
}
