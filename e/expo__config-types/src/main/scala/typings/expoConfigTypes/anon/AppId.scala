package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var apiKey: js.UndefOr[String] = js.undefined
  
  var appId: js.UndefOr[String] = js.undefined
  
  var authDomain: js.UndefOr[String] = js.undefined
  
  var databaseURL: js.UndefOr[String] = js.undefined
  
  var measurementId: js.UndefOr[String] = js.undefined
  
  var messagingSenderId: js.UndefOr[String] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
  
  var storageBucket: js.UndefOr[String] = js.undefined
}
object AppId {
  
  inline def apply(): AppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppId]
  }
  
  extension [Self <: AppId](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
    
    inline def setAuthDomainUndefined: Self = StObject.set(x, "authDomain", js.undefined)
    
    inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
    
    inline def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
    
    inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    
    inline def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
    
    inline def setMessagingSenderIdUndefined: Self = StObject.set(x, "messagingSenderId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    
    inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
  }
}
