package typings.electronGet

import typings.electronGet.downloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@electron/get/dist/cjs/GotDownloader", JSImport.Namespace)
@js.native
object gotDownloaderMod extends js.Object {
  @js.native
  class GotDownloader ()
    extends Downloader[js.Any] {
    /**
      * @param options - see [`got#options`](https://github.com/sindresorhus/got#options) for possible keys/values.
      */
    def download(url: String, targetFilePath: String): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def download(url: String, targetFilePath: String, options: js.Any): js.Promise[Unit] = js.native
  }
  
}

