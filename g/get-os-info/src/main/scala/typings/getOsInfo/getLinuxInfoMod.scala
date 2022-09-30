package typings.getOsInfo

import typings.getOsInfo.mod.OSInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLinuxInfoMod {
  
  @JSImport("get-os-info/lib/utils/get-linux-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[OSInfo | Null]]
}
