package typings.electronGet.esmDownloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloader[T] extends js.Object {
  def download(url: String, targetFilePath: String, options: T): js.Promise[Unit]
}

object Downloader {
  @scala.inline
  def apply[T](download: (String, String, T) => js.Promise[Unit]): Downloader[T] = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction3(download))
  
    __obj.asInstanceOf[Downloader[T]]
  }
}

