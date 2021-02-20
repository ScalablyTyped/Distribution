package typings.electronGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDownloaderMod {
  
  @js.native
  trait Downloader[T] extends StObject {
    
    def download(url: String, targetFilePath: String, options: T): js.Promise[Unit] = js.native
  }
  object Downloader {
    
    @scala.inline
    def apply[T](download: (String, String, T) => js.Promise[Unit]): Downloader[T] = {
      val __obj = js.Dynamic.literal(download = js.Any.fromFunction3(download))
      __obj.asInstanceOf[Downloader[T]]
    }
    
    @scala.inline
    implicit class DownloaderMutableBuilder[Self <: Downloader[_], T] (val x: Self with Downloader[T]) extends AnyVal {
      
      @scala.inline
      def setDownload(value: (String, String, T) => js.Promise[Unit]): Self = StObject.set(x, "download", js.Any.fromFunction3(value))
    }
  }
}
