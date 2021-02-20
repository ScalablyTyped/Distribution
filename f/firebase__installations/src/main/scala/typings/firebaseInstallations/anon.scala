package typings.firebaseInstallations

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Code extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
    
    var status: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, message: String, status: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@firebase/installations.@firebase/installations/dist/src/interfaces/app-config.AppConfig> */
  @js.native
  trait PartialAppConfig extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var appId: js.UndefOr[String] = js.native
    
    var appName: js.UndefOr[String] = js.native
    
    var projectId: js.UndefOr[String] = js.native
  }
  object PartialAppConfig {
    
    @scala.inline
    def apply(): PartialAppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAppConfig]
    }
    
    @scala.inline
    implicit class PartialAppConfigMutableBuilder[Self <: PartialAppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
  
  @js.native
  trait ValueName extends StObject {
    
    var valueName: String = js.native
  }
  object ValueName {
    
    @scala.inline
    def apply(valueName: String): ValueName = {
      val __obj = js.Dynamic.literal(valueName = valueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueName]
    }
    
    @scala.inline
    implicit class ValueNameMutableBuilder[Self <: ValueName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValueName(value: String): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  requestName :string, [index: string] : string | number} & @firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData */
  @js.native
  trait requestNamestringindexstr extends /* index */ StringDictionary[String | Double] {
    
    var requestName: String = js.native
    
    var serverCode: Double = js.native
    
    var serverMessage: String = js.native
    
    var serverStatus: String = js.native
  }
  object requestNamestringindexstr {
    
    @scala.inline
    def apply(requestName: String, serverCode: Double, serverMessage: String, serverStatus: String): requestNamestringindexstr = {
      val __obj = js.Dynamic.literal(requestName = requestName.asInstanceOf[js.Any], serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[requestNamestringindexstr]
    }
    
    @scala.inline
    implicit class requestNamestringindexstrMutableBuilder[Self <: requestNamestringindexstr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestName(value: String): Self = StObject.set(x, "requestName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerCode(value: Double): Self = StObject.set(x, "serverCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerMessage(value: String): Self = StObject.set(x, "serverMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerStatus(value: String): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
    }
  }
}
