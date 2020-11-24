package typings.electronGet.gotDownloaderMod

import typings.electronGet.downloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@electron/get/dist/cjs/GotDownloader", "GotDownloader")
@js.native
class GotDownloader () extends Downloader[GotDownloaderOptions] {
  
  def download(url: String, targetFilePath: String): js.Promise[Unit] = js.native
}
