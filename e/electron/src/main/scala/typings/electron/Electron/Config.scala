package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: js.UndefOr[String] = js.undefined
  
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: js.UndefOr[String] = js.undefined
  
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: js.UndefOr[String] = js.undefined
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPacScript(value: String): Self = StObject.set(x, "pacScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacScriptUndefined: Self = StObject.set(x, "pacScript", js.undefined)
    
    @scala.inline
    def setProxyBypassRules(value: String): Self = StObject.set(x, "proxyBypassRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyBypassRulesUndefined: Self = StObject.set(x, "proxyBypassRules", js.undefined)
    
    @scala.inline
    def setProxyRules(value: String): Self = StObject.set(x, "proxyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyRulesUndefined: Self = StObject.set(x, "proxyRules", js.undefined)
  }
}
