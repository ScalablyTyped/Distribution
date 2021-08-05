package typings.firebaseInstallations

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: Double
    
    var message: String
    
    var status: String
  }
  object Code {
    
    inline def apply(code: Double, message: String, status: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@firebase/installations.@firebase/installations/dist/src/interfaces/app-config.AppConfig> */
  trait PartialAppConfig extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var appId: js.UndefOr[String] = js.undefined
    
    var appName: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
  }
  object PartialAppConfig {
    
    inline def apply(): PartialAppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAppConfig]
    }
    
    extension [Self <: PartialAppConfig](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
  
  trait ValueName extends StObject {
    
    var valueName: String
  }
  object ValueName {
    
    inline def apply(valueName: String): ValueName = {
      val __obj = js.Dynamic.literal(valueName = valueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueName]
    }
    
    extension [Self <: ValueName](x: Self) {
      
      inline def setValueName(value: String): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  requestName :string, [index: string] : string | number} & @firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData */
  trait requestNamestringindexstr
    extends StObject
       with /* index */ StringDictionary[String | Double] {
    
    var requestName: String
    
    var serverCode: Double
    
    var serverMessage: String
    
    var serverStatus: String
  }
  object requestNamestringindexstr {
    
    inline def apply(requestName: String, serverCode: Double, serverMessage: String, serverStatus: String): requestNamestringindexstr = {
      val __obj = js.Dynamic.literal(requestName = requestName.asInstanceOf[js.Any], serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[requestNamestringindexstr]
    }
    
    extension [Self <: requestNamestringindexstr](x: Self) {
      
      inline def setRequestName(value: String): Self = StObject.set(x, "requestName", value.asInstanceOf[js.Any])
      
      inline def setServerCode(value: Double): Self = StObject.set(x, "serverCode", value.asInstanceOf[js.Any])
      
      inline def setServerMessage(value: String): Self = StObject.set(x, "serverMessage", value.asInstanceOf[js.Any])
      
      inline def setServerStatus(value: String): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
    }
  }
}
