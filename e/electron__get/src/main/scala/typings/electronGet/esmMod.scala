package typings.electronGet

import typings.electronGet.esmTypesMod.ElectronDownloadRequestOptions
import typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetailsWithDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@electron/get/dist/esm", JSImport.Namespace)
@js.native
object esmMod extends js.Object {
  
  def download(version: String): js.Promise[String] = js.native
  def download(version: String, options: ElectronDownloadRequestOptions): js.Promise[String] = js.native
  
  def downloadArtifact(_artifactDetails: ElectronPlatformArtifactDetailsWithDefaults): js.Promise[String] = js.native
  
  def getHostArch(): String = js.native
  
  def initializeProxy(): Unit = js.native
}
