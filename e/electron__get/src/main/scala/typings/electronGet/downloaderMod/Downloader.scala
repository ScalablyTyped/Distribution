package typings.electronGet.downloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Downloader[T] extends js.Object {
  def download(url: String, targetFilePath: String, options: T): js.Promise[Unit] = js.native
}

object Downloader {
  @scala.inline
  def apply[T](download: (String, String, T) => js.Promise[Unit]): Downloader[T] = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction3(download))
    __obj.asInstanceOf[Downloader[T]]
  }
  @scala.inline
  implicit class DownloaderOps[Self <: Downloader[_], T] (val x: Self with Downloader[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDownload(value: (String, String, T) => js.Promise[Unit]): Self = this.set("download", js.Any.fromFunction3(value))
  }
  
}

