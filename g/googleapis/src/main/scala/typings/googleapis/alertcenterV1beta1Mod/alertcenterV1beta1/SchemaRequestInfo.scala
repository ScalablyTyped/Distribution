package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestInfo extends StObject {
  
  /**
    * List of app developers who triggered notifications for above application.
    */
  var appDeveloperEmail: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The application that requires the SQL setup.
    */
  var appKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Number of requests sent for this application to set up default SQL instance.
    */
  var numberOfRequests: js.UndefOr[String | Null] = js.undefined
}
object SchemaRequestInfo {
  
  inline def apply(): SchemaRequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestInfo]
  }
  
  extension [Self <: SchemaRequestInfo](x: Self) {
    
    inline def setAppDeveloperEmail(value: js.Array[String]): Self = StObject.set(x, "appDeveloperEmail", value.asInstanceOf[js.Any])
    
    inline def setAppDeveloperEmailNull: Self = StObject.set(x, "appDeveloperEmail", null)
    
    inline def setAppDeveloperEmailUndefined: Self = StObject.set(x, "appDeveloperEmail", js.undefined)
    
    inline def setAppDeveloperEmailVarargs(value: String*): Self = StObject.set(x, "appDeveloperEmail", js.Array(value*))
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setAppKeyNull: Self = StObject.set(x, "appKey", null)
    
    inline def setAppKeyUndefined: Self = StObject.set(x, "appKey", js.undefined)
    
    inline def setNumberOfRequests(value: String): Self = StObject.set(x, "numberOfRequests", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRequestsNull: Self = StObject.set(x, "numberOfRequests", null)
    
    inline def setNumberOfRequestsUndefined: Self = StObject.set(x, "numberOfRequests", js.undefined)
  }
}
