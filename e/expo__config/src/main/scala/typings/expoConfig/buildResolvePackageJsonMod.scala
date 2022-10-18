package typings.expoConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildResolvePackageJsonMod {
  
  @JSImport("@expo/config/build/resolvePackageJson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRootPackageJsonPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootPackageJsonPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
}
