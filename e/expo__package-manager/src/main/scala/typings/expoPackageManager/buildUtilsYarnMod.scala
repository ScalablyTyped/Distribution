package typings.expoPackageManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsYarnMod {
  
  @JSImport("@expo/package-manager/build/utils/yarn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNpmProxy(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNpmProxy")().asInstanceOf[String | Null]
  
  inline def isYarnOfflineAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isYarnOfflineAsync")().asInstanceOf[js.Promise[Boolean]]
}
