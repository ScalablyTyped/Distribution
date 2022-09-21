package typings.expoPackageManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isYarnOfflineAsyncMod {
  
  @JSImport("@expo/package-manager/build/utils/isYarnOfflineAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Boolean]]
  
  inline def getNpmProxy(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNpmProxy")().asInstanceOf[String | Null]
}
