package typings.electronGet.esmGotDownloaderMod

import typings.electronGet.esmDownloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@electron/get/dist/esm/GotDownloader", "GotDownloader")
@js.native
class GotDownloader () extends Downloader[GotDownloaderOptions] {
  
  def download(url: String, targetFilePath: String): js.Promise[Unit] = js.native
}
