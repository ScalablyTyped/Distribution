package typings.electronGet

import typings.electronGet.typesMod.ElectronDownloadRequestOptions
import typings.electronGet.typesMod.ElectronPlatformArtifactDetailsWithDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@electron/get/dist/cjs", "download")
  @js.native
  def download(version: String): js.Promise[String] = js.native
  @JSImport("@electron/get/dist/cjs", "download")
  @js.native
  def download(version: String, options: ElectronDownloadRequestOptions): js.Promise[String] = js.native
  
  @JSImport("@electron/get/dist/cjs", "downloadArtifact")
  @js.native
  def downloadArtifact(_artifactDetails: ElectronPlatformArtifactDetailsWithDefaults): js.Promise[String] = js.native
  
  @JSImport("@electron/get/dist/cjs", "getHostArch")
  @js.native
  def getHostArch(): String = js.native
  
  @JSImport("@electron/get/dist/cjs", "initializeProxy")
  @js.native
  def initializeProxy(): Unit = js.native
}
