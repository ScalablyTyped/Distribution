package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopCapturer extends js.Object {
  // Docs: http://electronjs.org/docs/api/desktop-capturer
  /**
    * Resolves with an array of `DesktopCapturerSource` objects, each
    * `DesktopCapturerSource` represents a screen or an individual window that can be
    * captured.
    *
    * **Note** Capturing the screen contents requires user consent on macOS 10.15
    * Catalina or higher, which can detected by
    * `systemPreferences.getMediaAccessStatus`.
    */
  def getSources(options: SourcesOptions): js.Promise[js.Array[DesktopCapturerSource]] = js.native
}

object DesktopCapturer {
  @scala.inline
  def apply(getSources: SourcesOptions => js.Promise[js.Array[DesktopCapturerSource]]): DesktopCapturer = {
    val __obj = js.Dynamic.literal(getSources = js.Any.fromFunction1(getSources))
    __obj.asInstanceOf[DesktopCapturer]
  }
  @scala.inline
  implicit class DesktopCapturerOps[Self <: DesktopCapturer] (val x: Self) extends AnyVal {
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
    def setGetSources(value: SourcesOptions => js.Promise[js.Array[DesktopCapturerSource]]): Self = this.set("getSources", js.Any.fromFunction1(value))
  }
  
}

