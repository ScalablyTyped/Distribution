package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesktopCapturer extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/desktop-capturer
  /**
       * Starts gathering information about all available desktop media sources, and
       * calls callback(error, sources) when finished. sources is an array of
       * DesktopCapturerSource objects, each DesktopCapturerSource represents a screen or
       * an individual window that can be captured.
       */
  def getSources(
    options: SourcesOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* sources */ js.Array[DesktopCapturerSource], scala.Unit]
  ): scala.Unit = js.native
}

