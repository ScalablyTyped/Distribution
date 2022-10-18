package typings.egjsAgent

import typings.egjsAgent.egjsAgentStrings.architecture
import typings.egjsAgent.egjsAgentStrings.fullVersionList
import typings.egjsAgent.egjsAgentStrings.model
import typings.egjsAgent.egjsAgentStrings.platform
import typings.egjsAgent.egjsAgentStrings.platformVersion
import typings.egjsAgent.egjsAgentStrings.uaFullVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationTypesMod {
  
  trait AgentBrowserInfo
    extends StObject
       with AgentVersionInfo {
    
    var chromium: Boolean
    
    var chromiumVersion: String
    
    var webkit: Boolean
    
    var webkitVersion: String
    
    var webview: Boolean
  }
  object AgentBrowserInfo {
    
    inline def apply(
      chromium: Boolean,
      chromiumVersion: String,
      majorVersion: Double,
      name: String,
      version: String,
      webkit: Boolean,
      webkitVersion: String,
      webview: Boolean
    ): AgentBrowserInfo = {
      val __obj = js.Dynamic.literal(chromium = chromium.asInstanceOf[js.Any], chromiumVersion = chromiumVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any], webkitVersion = webkitVersion.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentBrowserInfo]
    }
    
    extension [Self <: AgentBrowserInfo](x: Self) {
      
      inline def setChromium(value: Boolean): Self = StObject.set(x, "chromium", value.asInstanceOf[js.Any])
      
      inline def setChromiumVersion(value: String): Self = StObject.set(x, "chromiumVersion", value.asInstanceOf[js.Any])
      
      inline def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
      
      inline def setWebkitVersion(value: String): Self = StObject.set(x, "webkitVersion", value.asInstanceOf[js.Any])
      
      inline def setWebview(value: Boolean): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
    }
  }
  
  trait AgentInfo extends StObject {
    
    var browser: AgentBrowserInfo
    
    var isHints: Boolean
    
    var isMobile: Boolean
    
    var os: AgentOSInfo
  }
  object AgentInfo {
    
    inline def apply(browser: AgentBrowserInfo, isHints: Boolean, isMobile: Boolean, os: AgentOSInfo): AgentInfo = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], isHints = isHints.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentInfo]
    }
    
    extension [Self <: AgentInfo](x: Self) {
      
      inline def setBrowser(value: AgentBrowserInfo): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setIsHints(value: Boolean): Self = StObject.set(x, "isHints", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setOs(value: AgentOSInfo): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
  
  type AgentOSInfo = AgentVersionInfo
  
  trait AgentVersionInfo extends StObject {
    
    var majorVersion: Double
    
    var name: String
    
    var version: String
  }
  object AgentVersionInfo {
    
    inline def apply(majorVersion: Double, name: String, version: String): AgentVersionInfo = {
      val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentVersionInfo]
    }
    
    extension [Self <: AgentVersionInfo](x: Self) {
      
      inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigatorUABrandVersion extends StObject {
    
    var brand: String
    
    var version: String
  }
  object NavigatorUABrandVersion {
    
    inline def apply(brand: String, version: String): NavigatorUABrandVersion = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigatorUABrandVersion]
    }
    
    extension [Self <: NavigatorUABrandVersion](x: Self) {
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigatorUAData extends StObject {
    
    var brands: js.UndefOr[js.Array[NavigatorUABrandVersion]] = js.native
    
    @JSName("getHighEntropyValues")
    def getHighEntropyValues_architecture(hints: js.Array[architecture]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'architecture' ]: @egjs/agent.@egjs/agent/declaration/types.UADataValues[key]} */ js.Any
      ] = js.native
    @JSName("getHighEntropyValues")
    def getHighEntropyValues_fullVersionList(hints: js.Array[fullVersionList]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'fullVersionList' ]: @egjs/agent.@egjs/agent/declaration/types.UADataValues[key]} */ js.Any
      ] = js.native
    @JSName("getHighEntropyValues")
    def getHighEntropyValues_model(hints: js.Array[model]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'model' ]: @egjs/agent.@egjs/agent/declaration/types.UADataValues[key]} */ js.Any
      ] = js.native
    @JSName("getHighEntropyValues")
    def getHighEntropyValues_platform(hints: js.Array[platform]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'platform' ]: @egjs/agent.@egjs/agent/declaration/types.UADataValues[key]} */ js.Any
      ] = js.native
    @JSName("getHighEntropyValues")
    def getHighEntropyValues_platformVersion(hints: js.Array[platformVersion]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'platformVersion' ]: @egjs/agent.@egjs/agent/declaration/types.UADataValues[key]} */ js.Any
      ] = js.native
    @JSName("getHighEntropyValues")
    def getHighEntropyValues_uaFullVersion(hints: js.Array[uaFullVersion]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'uaFullVersion' ]: @egjs/agent.@egjs/agent/declaration/types.UADataValues[key]} */ js.Any
      ] = js.native
    
    var mobile: Boolean = js.native
    
    var platform: String = js.native
    
    var uaList: js.UndefOr[js.Array[NavigatorUABrandVersion]] = js.native
  }
  
  trait PresetInfo extends StObject {
    
    var brand: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var test: String
    
    var versionAlias: js.UndefOr[String] = js.undefined
    
    var versionTest: js.UndefOr[String] = js.undefined
  }
  object PresetInfo {
    
    inline def apply(id: String, test: String): PresetInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetInfo]
    }
    
    extension [Self <: PresetInfo](x: Self) {
      
      inline def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setVersionAlias(value: String): Self = StObject.set(x, "versionAlias", value.asInstanceOf[js.Any])
      
      inline def setVersionAliasUndefined: Self = StObject.set(x, "versionAlias", js.undefined)
      
      inline def setVersionTest(value: String): Self = StObject.set(x, "versionTest", value.asInstanceOf[js.Any])
      
      inline def setVersionTestUndefined: Self = StObject.set(x, "versionTest", js.undefined)
    }
  }
  
  trait PresetResult extends StObject {
    
    var preset: PresetInfo | Null
    
    var version: String
  }
  object PresetResult {
    
    inline def apply(version: String): PresetResult = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], preset = null)
      __obj.asInstanceOf[PresetResult]
    }
    
    extension [Self <: PresetResult](x: Self) {
      
      inline def setPreset(value: PresetInfo): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetNull: Self = StObject.set(x, "preset", null)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait UADataValues extends StObject {
    
    var architecture: String
    
    var fullVersionList: js.Array[NavigatorUABrandVersion]
    
    var model: String
    
    var platform: String
    
    var platformVersion: String
    
    var uaFullVersion: String
  }
  object UADataValues {
    
    inline def apply(
      architecture: String,
      fullVersionList: js.Array[NavigatorUABrandVersion],
      model: String,
      platform: String,
      platformVersion: String,
      uaFullVersion: String
    ): UADataValues = {
      val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], fullVersionList = fullVersionList.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any], uaFullVersion = uaFullVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[UADataValues]
    }
    
    extension [Self <: UADataValues](x: Self) {
      
      inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setFullVersionList(value: js.Array[NavigatorUABrandVersion]): Self = StObject.set(x, "fullVersionList", value.asInstanceOf[js.Any])
      
      inline def setFullVersionListVarargs(value: NavigatorUABrandVersion*): Self = StObject.set(x, "fullVersionList", js.Array(value*))
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
      
      inline def setUaFullVersion(value: String): Self = StObject.set(x, "uaFullVersion", value.asInstanceOf[js.Any])
    }
  }
}
