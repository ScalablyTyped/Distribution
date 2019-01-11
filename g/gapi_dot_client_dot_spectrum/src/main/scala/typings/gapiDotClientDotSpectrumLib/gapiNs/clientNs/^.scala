package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val paws: gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs.PawsResource = js.native
  /** Load Google Spectrum Database API v1explorer */
  def load(
    name: gapiDotClientDotSpectrumLib.gapiDotClientDotSpectrumLibStrings.spectrum,
    version: gapiDotClientDotSpectrumLib.gapiDotClientDotSpectrumLibStrings.v1explorer
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSpectrumLib.gapiDotClientDotSpectrumLibStrings.spectrum,
    version: gapiDotClientDotSpectrumLib.gapiDotClientDotSpectrumLibStrings.v1explorer,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

