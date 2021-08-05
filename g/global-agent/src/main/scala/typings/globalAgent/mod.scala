package typings.globalAgent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("global-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bootstrap(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrap")().asInstanceOf[Boolean]
  inline def bootstrap(configurationInput: ProxyAgentConfigurationInputType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrap")(configurationInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def createGlobalProxyAgent(configurationInput: ProxyAgentConfigurationInputType): ProxyAgentConfigurationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalProxyAgent")(configurationInput.asInstanceOf[js.Any]).asInstanceOf[ProxyAgentConfigurationType]
  
  trait ProxyAgentConfigurationInputType extends StObject {
    
    var environmentVariableNamespace: js.UndefOr[String] = js.undefined
    
    var forceGlobalAgent: js.UndefOr[Boolean] = js.undefined
    
    var socketConnectionTimeout: js.UndefOr[Double] = js.undefined
  }
  object ProxyAgentConfigurationInputType {
    
    inline def apply(): ProxyAgentConfigurationInputType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyAgentConfigurationInputType]
    }
    
    extension [Self <: ProxyAgentConfigurationInputType](x: Self) {
      
      inline def setEnvironmentVariableNamespace(value: String): Self = StObject.set(x, "environmentVariableNamespace", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentVariableNamespaceUndefined: Self = StObject.set(x, "environmentVariableNamespace", js.undefined)
      
      inline def setForceGlobalAgent(value: Boolean): Self = StObject.set(x, "forceGlobalAgent", value.asInstanceOf[js.Any])
      
      inline def setForceGlobalAgentUndefined: Self = StObject.set(x, "forceGlobalAgent", js.undefined)
      
      inline def setSocketConnectionTimeout(value: Double): Self = StObject.set(x, "socketConnectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketConnectionTimeoutUndefined: Self = StObject.set(x, "socketConnectionTimeout", js.undefined)
    }
  }
  
  trait ProxyAgentConfigurationType extends StObject {
    
    val HTTPS_PROXY: String | Null
    
    val HTTP_PROXY: String | Null
    
    val NO_PROXY: String | Null
  }
  object ProxyAgentConfigurationType {
    
    inline def apply(): ProxyAgentConfigurationType = {
      val __obj = js.Dynamic.literal(HTTPS_PROXY = null, HTTP_PROXY = null, NO_PROXY = null)
      __obj.asInstanceOf[ProxyAgentConfigurationType]
    }
    
    extension [Self <: ProxyAgentConfigurationType](x: Self) {
      
      inline def setHTTPS_PROXY(value: String): Self = StObject.set(x, "HTTPS_PROXY", value.asInstanceOf[js.Any])
      
      inline def setHTTPS_PROXYNull: Self = StObject.set(x, "HTTPS_PROXY", null)
      
      inline def setHTTP_PROXY(value: String): Self = StObject.set(x, "HTTP_PROXY", value.asInstanceOf[js.Any])
      
      inline def setHTTP_PROXYNull: Self = StObject.set(x, "HTTP_PROXY", null)
      
      inline def setNO_PROXY(value: String): Self = StObject.set(x, "NO_PROXY", value.asInstanceOf[js.Any])
      
      inline def setNO_PROXYNull: Self = StObject.set(x, "NO_PROXY", null)
    }
  }
}
