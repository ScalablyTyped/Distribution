package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesMatchMod.FilesMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependencies(): FilesMatch = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")().asInstanceOf[FilesMatch]
  inline def getDependencies(force: Boolean): FilesMatch = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")(force.asInstanceOf[js.Any]).asInstanceOf[FilesMatch]
  
  inline def invalidateDependencies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateDependencies")().asInstanceOf[Unit]
}
