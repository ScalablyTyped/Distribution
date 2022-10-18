package typings.getOsInfo

import typings.getOsInfo.mod.OSInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetWindowsInfoMod {
  
  @JSImport("get-os-info/lib/utils/get-windows-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[OSInfo | Null]]
  inline def default(release: String): js.Promise[OSInfo | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(release.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OSInfo | Null]]
}
