package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesktopCapturerSource extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/desktop-capturer-source
  /**
    * An icon image of the application that owns the window or null if the source has
    * a type screen. The size of the icon is not known in advance and depends on what
    * the application provides.
    */
  var appIcon: NativeImage_
  
  /**
    * A unique identifier that will correspond to the `id` of the matching Display
    * returned by the Screen API. On some platforms, this is equivalent to the `XX`
    * portion of the `id` field above and on others it will differ. It will be an
    * empty string if not available.
    */
  var display_id: String
  
  /**
    * The identifier of a window or screen that can be used as a `chromeMediaSourceId`
    * constraint when calling [`navigator.webkitGetUserMedia`]. The format of the
    * identifier will be `window:XX` or `screen:XX`, where `XX` is a random generated
    * number.
    */
  var id: String
  
  /**
    * A screen source will be named either `Entire Screen` or `Screen <index>`, while
    * the name of a window source will match the window title.
    */
  var name: String
  
  /**
    * A thumbnail image. **Note:** There is no guarantee that the size of the
    * thumbnail is the same as the `thumbnailSize` specified in the `options` passed
    * to `desktopCapturer.getSources`. The actual size depends on the scale of the
    * screen or window.
    */
  var thumbnail: NativeImage_
}
object DesktopCapturerSource {
  
  inline def apply(appIcon: NativeImage_, display_id: String, id: String, name: String, thumbnail: NativeImage_): DesktopCapturerSource = {
    val __obj = js.Dynamic.literal(appIcon = appIcon.asInstanceOf[js.Any], display_id = display_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopCapturerSource]
  }
  
  extension [Self <: DesktopCapturerSource](x: Self) {
    
    inline def setAppIcon(value: NativeImage_): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
    
    inline def setDisplay_id(value: String): Self = StObject.set(x, "display_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: NativeImage_): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
