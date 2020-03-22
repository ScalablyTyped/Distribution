package typings.electronGet

import typings.electronGet.typesMod.ElectronDownloadRequestOptions
import typings.electronGet.typesMod.ElectronPlatformArtifactDetailsWithDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@electron/get/dist/cjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def download(version: String): js.Promise[String] = js.native
  def download(version: String, options: ElectronDownloadRequestOptions): js.Promise[String] = js.native
  def downloadArtifact(_artifactDetails: ElectronPlatformArtifactDetailsWithDefaults): js.Promise[String] = js.native
  def getHostArch(): String = js.native
  def initializeProxy(): Unit = js.native
}

