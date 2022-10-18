package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFilesMatchMod.FilesMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibArtifactsMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/artifacts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArtifacts(): FilesMatch = ^.asInstanceOf[js.Dynamic].applyDynamic("getArtifacts")().asInstanceOf[FilesMatch]
  inline def getArtifacts(force: Boolean): FilesMatch = ^.asInstanceOf[js.Dynamic].applyDynamic("getArtifacts")(force.asInstanceOf[js.Any]).asInstanceOf[FilesMatch]
  
  inline def invalidateArtifacts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateArtifacts")().asInstanceOf[Unit]
  
  inline def registerArtifacts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerArtifacts")().asInstanceOf[Unit]
}
