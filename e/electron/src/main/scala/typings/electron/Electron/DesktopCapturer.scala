package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesktopCapturer extends EventEmitter {
  def getSources(options: SourcesOptions): js.Promise[js.Array[DesktopCapturerSource]] = js.native
  // Docs: http://electronjs.org/docs/api/desktop-capturer
  /**
    * Starts gathering information about all available desktop media sources, and
    * calls callback(error, sources) when finished. sources is an array of
    * DesktopCapturerSource objects, each DesktopCapturerSource represents a screen or
    * an individual window that can be captured. Deprecated Soon
    */
  def getSources(
    options: SourcesOptions,
    callback: js.Function2[/* error */ Error, /* sources */ js.Array[DesktopCapturerSource], Unit]
  ): Unit = js.native
}

@JSGlobal("Electron.desktopCapturer")
@js.native
object desktopCapturer extends TopLevel[DesktopCapturer]

