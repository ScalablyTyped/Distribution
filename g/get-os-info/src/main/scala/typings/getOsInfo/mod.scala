package typings.getOsInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-os-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[OSInfo | Null]]
  
  inline def getLinuxInfo(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinuxInfo")().asInstanceOf[js.Promise[OSInfo | Null]]
  
  inline def getMacInfo(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMacInfo")().asInstanceOf[js.Promise[OSInfo | Null]]
  inline def getMacInfo(release: String): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMacInfo")(release.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OSInfo | Null]]
  
  inline def getOSInfo(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOSInfo")().asInstanceOf[js.Promise[OSInfo | Null]]
  
  inline def getWindowsInfo(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowsInfo")().asInstanceOf[js.Promise[OSInfo | Null]]
  inline def getWindowsInfo(release: String): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowsInfo")(release.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OSInfo | Null]]
  
  trait OSInfo extends StObject {
    
    var name: String
    
    var version: String
  }
  object OSInfo {
    
    inline def apply(name: String, version: String): OSInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OSInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OSInfo] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
