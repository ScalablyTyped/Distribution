package typings.electronGet

import typings.electronGet.esmDownloaderMod.Downloader
import typings.got.mod.GotOptions
import typings.got.mod.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmGotDownloaderMod {
  
  @JSImport("@electron/get/dist/esm/GotDownloader", "GotDownloader")
  @js.native
  class GotDownloader ()
    extends StObject
       with Downloader[GotDownloaderOptions] {
    
    def download(url: String, targetFilePath: String): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def download(url: String, targetFilePath: String, options: GotDownloaderOptions): js.Promise[Unit] = js.native
  }
  
  trait GotDownloaderOptions
    extends StObject
       with GotOptions[String | Null] {
    
    /**
      * if defined, triggers every time `got`'s `downloadProgress` event callback is triggered.
      */
    var getProgressCallback: js.UndefOr[js.Function1[/* progress */ Progress, js.Promise[Unit]]] = js.undefined
    
    /**
      * if `true`, disables the console progress bar (setting the `ELECTRON_GET_NO_PROGRESS`
      * environment variable to a non-empty value also does this).
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object GotDownloaderOptions {
    
    inline def apply(): GotDownloaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GotDownloaderOptions]
    }
    
    extension [Self <: GotDownloaderOptions](x: Self) {
      
      inline def setGetProgressCallback(value: /* progress */ Progress => js.Promise[Unit]): Self = StObject.set(x, "getProgressCallback", js.Any.fromFunction1(value))
      
      inline def setGetProgressCallbackUndefined: Self = StObject.set(x, "getProgressCallback", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
