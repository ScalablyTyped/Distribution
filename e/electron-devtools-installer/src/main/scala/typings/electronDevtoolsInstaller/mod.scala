package typings.electronDevtoolsInstaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-devtools-installer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(extensionReference: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensionReference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(extensionReference: String, forceDownload: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensionReference.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(extensionReference: js.Array[ExtensionReference | String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensionReference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(extensionReference: js.Array[ExtensionReference | String], forceDownload: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensionReference.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(extensionReference: ExtensionReference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensionReference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(extensionReference: ExtensionReference, forceDownload: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensionReference.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("electron-devtools-installer", "ANGULARJS_BATARANG")
  @js.native
  val ANGULARJS_BATARANG: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "APOLLO_DEVELOPER_TOOLS")
  @js.native
  val APOLLO_DEVELOPER_TOOLS: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "BACKBONE_DEBUGGER")
  @js.native
  val BACKBONE_DEBUGGER: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "CYCLEJS_DEVTOOL")
  @js.native
  val CYCLEJS_DEVTOOL: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "EMBER_INSPECTOR")
  @js.native
  val EMBER_INSPECTOR: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "JQUERY_DEBUGGER")
  @js.native
  val JQUERY_DEBUGGER: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "MOBX_DEVTOOLS")
  @js.native
  val MOBX_DEVTOOLS: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "REACT_DEVELOPER_TOOLS")
  @js.native
  val REACT_DEVELOPER_TOOLS: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "REACT_PERF")
  @js.native
  val REACT_PERF: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "REDUX_DEVTOOLS")
  @js.native
  val REDUX_DEVTOOLS: ExtensionReference = js.native
  
  @JSImport("electron-devtools-installer", "VUEJS_DEVTOOLS")
  @js.native
  val VUEJS_DEVTOOLS: ExtensionReference = js.native
  
  trait ExtensionReference extends StObject {
    
    var electron: String
    
    var id: String
  }
  object ExtensionReference {
    
    inline def apply(electron: String, id: String): ExtensionReference = {
      val __obj = js.Dynamic.literal(electron = electron.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtensionReference] (val x: Self) extends AnyVal {
      
      inline def setElectron(value: String): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
