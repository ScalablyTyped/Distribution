package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopCapturerSource extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/desktop-capturer-source
  /**
    * An icon image of the application that owns the window or null if the source has
    * a type screen. The size of the icon is not known in advance and depends on what
    * the the application provides.
    */
  var appIcon: NativeImage_ = js.native
  /**
    * A unique identifier that will correspond to the `id` of the matching Display
    * returned by the Screen API. On some platforms, this is equivalent to the `XX`
    * portion of the `id` field above and on others it will differ. It will be an
    * empty string if not available.
    */
  var display_id: String = js.native
  /**
    * The identifier of a window or screen that can be used as a `chromeMediaSourceId`
    * constraint when calling [`navigator.webkitGetUserMedia`]. The format of the
    * identifier will be `window:XX` or `screen:XX`, where `XX` is a random generated
    * number.
    */
  var id: String = js.native
  /**
    * A screen source will be named either `Entire Screen` or `Screen <index>`, while
    * the name of a window source will match the window title.
    */
  var name: String = js.native
  /**
    * A thumbnail image. **Note:** There is no guarantee that the size of the
    * thumbnail is the same as the `thumbnailSize` specified in the `options` passed
    * to `desktopCapturer.getSources`. The actual size depends on the scale of the
    * screen or window.
    */
  var thumbnail: NativeImage_ = js.native
}

object DesktopCapturerSource {
  @scala.inline
  def apply(appIcon: NativeImage_, display_id: String, id: String, name: String, thumbnail: NativeImage_): DesktopCapturerSource = {
    val __obj = js.Dynamic.literal(appIcon = appIcon.asInstanceOf[js.Any], display_id = display_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopCapturerSource]
  }
  @scala.inline
  implicit class DesktopCapturerSourceOps[Self <: DesktopCapturerSource] (val x: Self) extends AnyVal {
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
    def setAppIcon(value: NativeImage_): Self = this.set("appIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_id(value: String): Self = this.set("display_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: NativeImage_): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
  
}

