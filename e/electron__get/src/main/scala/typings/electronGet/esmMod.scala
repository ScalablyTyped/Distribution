package typings.electronGet

import typings.electronGet.esmTypesMod.ElectronDownloadRequestOptions
import typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetailsWithDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("@electron/get/dist/esm", "download")
  @js.native
  def download(version: String): js.Promise[String] = js.native
  @JSImport("@electron/get/dist/esm", "download")
  @js.native
  def download(version: String, options: ElectronDownloadRequestOptions): js.Promise[String] = js.native
  
  @JSImport("@electron/get/dist/esm", "downloadArtifact")
  @js.native
  def downloadArtifact(_artifactDetails: ElectronPlatformArtifactDetailsWithDefaults): js.Promise[String] = js.native
  
  @JSImport("@electron/get/dist/esm", "getHostArch")
  @js.native
  def getHostArch(): String = js.native
  
  @JSImport("@electron/get/dist/esm", "initializeProxy")
  @js.native
  def initializeProxy(): Unit = js.native
}
