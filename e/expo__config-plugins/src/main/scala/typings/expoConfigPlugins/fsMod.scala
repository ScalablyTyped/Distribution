package typings.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@expo/config-plugins/build/utils/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyFilePathToPathAsync(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFilePathToPathAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def removeFile(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
