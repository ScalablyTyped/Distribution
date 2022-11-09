package typings.expoDevServer

import typings.expoDevServer.expoDevServerStrings.Hermes
import typings.expoDevServer.expoDevServerStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildJsInspectorMod {
  
  @JSImport("@expo/dev-server/build/JsInspector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeJsInspector(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeJsInspector")().asInstanceOf[js.Promise[Unit]]
  
  inline def openJsInspector(app: MetroInspectorProxyApp): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openJsInspector")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def queryAllInspectorAppsAsync(metroServerOrigin: String): js.Promise[js.Array[MetroInspectorProxyApp]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllInspectorAppsAsync")(metroServerOrigin.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MetroInspectorProxyApp]]]
  
  inline def queryInspectorAppAsync(metroServerOrigin: String, appId: String): js.Promise[MetroInspectorProxyApp | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryInspectorAppAsync")(metroServerOrigin.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MetroInspectorProxyApp | Null]]
  
  trait MetroInspectorProxyApp extends StObject {
    
    var description: String
    
    var devtoolsFrontendUrl: String
    
    var faviconUrl: String
    
    var id: String
    
    var title: String
    
    var `type`: node
    
    var vm: Hermes | (/* don't use */ String)
    
    var webSocketDebuggerUrl: String
  }
  object MetroInspectorProxyApp {
    
    inline def apply(
      description: String,
      devtoolsFrontendUrl: String,
      faviconUrl: String,
      id: String,
      title: String,
      vm: Hermes | (/* don't use */ String),
      webSocketDebuggerUrl: String
    ): MetroInspectorProxyApp = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], devtoolsFrontendUrl = devtoolsFrontendUrl.asInstanceOf[js.Any], faviconUrl = faviconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], vm = vm.asInstanceOf[js.Any], webSocketDebuggerUrl = webSocketDebuggerUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("node")
      __obj.asInstanceOf[MetroInspectorProxyApp]
    }
    
    extension [Self <: MetroInspectorProxyApp](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDevtoolsFrontendUrl(value: String): Self = StObject.set(x, "devtoolsFrontendUrl", value.asInstanceOf[js.Any])
      
      inline def setFaviconUrl(value: String): Self = StObject.set(x, "faviconUrl", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVm(value: Hermes | (/* don't use */ String)): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
      
      inline def setWebSocketDebuggerUrl(value: String): Self = StObject.set(x, "webSocketDebuggerUrl", value.asInstanceOf[js.Any])
    }
  }
}
