package typings.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easBuildMod {
  
  @JSImport("@expo/config-plugins/build/android/EasBuild", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureEasBuildAsync(projectRoot: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureEasBuildAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getEasBuildGradlePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEasBuildGradlePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isEasBuildGradleConfiguredAsync(projectRoot: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEasBuildGradleConfiguredAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
