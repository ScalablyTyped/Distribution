package typings.electronGet

import typings.electronGet.esmTypesMod.ElectronDownloadRequestOptions
import typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetailsWithDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("@electron/get/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def download(version: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def download(version: String, options: ElectronDownloadRequestOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def downloadArtifact(_artifactDetails: ElectronPlatformArtifactDetailsWithDefaults): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadArtifact")(_artifactDetails.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getHostArch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostArch")().asInstanceOf[String]
  
  inline def initializeProxy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeProxy")().asInstanceOf[Unit]
}
