package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesktopCapturer_ extends js.Object {
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
  def getSources(options: SourcesOptions): js.Promise[js.Array[DesktopCapturerSource]]
}

object DesktopCapturer_ {
  @scala.inline
  def apply(getSources: SourcesOptions => js.Promise[js.Array[DesktopCapturerSource]]): DesktopCapturer_ = {
    val __obj = js.Dynamic.literal(getSources = js.Any.fromFunction1(getSources))
  
    __obj.asInstanceOf[DesktopCapturer_]
  }
}

