package typings.electronGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDownloaderMod {
  
  trait Downloader[T] extends StObject {
    
    def download(url: String, targetFilePath: String, options: T): js.Promise[Unit]
  }
  object Downloader {
    
    inline def apply[T](download: (String, String, T) => js.Promise[Unit]): Downloader[T] = {
      val __obj = js.Dynamic.literal(download = js.Any.fromFunction3(download))
      __obj.asInstanceOf[Downloader[T]]
    }
    
    extension [Self <: Downloader[?], T](x: Self & Downloader[T]) {
      
      inline def setDownload(value: (String, String, T) => js.Promise[Unit]): Self = StObject.set(x, "download", js.Any.fromFunction3(value))
    }
  }
}
