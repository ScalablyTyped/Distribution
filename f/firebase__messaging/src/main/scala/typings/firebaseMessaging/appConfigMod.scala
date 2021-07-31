package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appConfigMod {
  
  trait AppConfig extends StObject {
    
    val apiKey: String
    
    val appId: String
    
    val appName: String
    
    val projectId: String
    
    /** Only used for old DB migration. */
    val senderId: String
  }
  object AppConfig {
    
    @scala.inline
    def apply(apiKey: String, appId: String, appName: String, projectId: String, senderId: String): AppConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], senderId = senderId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppConfig]
    }
    
    @scala.inline
    implicit class AppConfigMutableBuilder[Self <: AppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderId(value: String): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
    }
  }
}
