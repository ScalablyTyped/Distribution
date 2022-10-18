package typings.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsModulesMod {
  
  @JSImport("@expo/config-plugins/build/utils/modules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def directoryExistsAsync(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("directoryExistsAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def fileExists(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fileExistsAsync(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
