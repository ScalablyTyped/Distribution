package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkArounds extends StObject {
  
  /**
    * Ensures all `<input type='file'>` elements tracked by Fine Uploader always have a `multiple` attribute present.
    *
    * This only applies to iOS8 Chrome and iOS8 UIWebView, and is put in place to work around an issue that causes the browser to crash when a file input element does not contain a `multiple` attribute inside of a `UIWebView` container created by an iOS8 app compiled with and iOS7 SDK
    *
    * @default `false`
    */
  var ios8BrowserCrash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disables Fine Uploader and displays a message to the user in iOS 8.0.0 Safari.
    *
    * Due to serious bugs in iOS 8.0.0 Safari, uploading is not possible.
    * This was apparently fixed in subsequent builds of iOS8, so this workaround only targets 8.0.0
    *
    * @default `true`
    */
  var ios8SafariUploads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ensures all `<input type='file'>` elements tracked by Fine Uploader do NOT contain a `multiple` attribute to work around an issue present in iOS7 & 8 that otherwise results in 0-sized uploaded videos
    *
    * @default `true`
    */
  var iosEmptyVideos: js.UndefOr[Boolean] = js.undefined
}
object WorkArounds {
  
  inline def apply(): WorkArounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkArounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkArounds] (val x: Self) extends AnyVal {
    
    inline def setIos8BrowserCrash(value: Boolean): Self = StObject.set(x, "ios8BrowserCrash", value.asInstanceOf[js.Any])
    
    inline def setIos8BrowserCrashUndefined: Self = StObject.set(x, "ios8BrowserCrash", js.undefined)
    
    inline def setIos8SafariUploads(value: Boolean): Self = StObject.set(x, "ios8SafariUploads", value.asInstanceOf[js.Any])
    
    inline def setIos8SafariUploadsUndefined: Self = StObject.set(x, "ios8SafariUploads", js.undefined)
    
    inline def setIosEmptyVideos(value: Boolean): Self = StObject.set(x, "iosEmptyVideos", value.asInstanceOf[js.Any])
    
    inline def setIosEmptyVideosUndefined: Self = StObject.set(x, "iosEmptyVideos", js.undefined)
  }
}
