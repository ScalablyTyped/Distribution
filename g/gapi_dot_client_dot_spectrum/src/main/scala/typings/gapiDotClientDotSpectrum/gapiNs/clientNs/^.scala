package typings.gapiDotClientDotSpectrum.gapiNs.clientNs

import typings.gapiDotClientDotSpectrum.gapiDotClientDotSpectrumStrings.spectrum
import typings.gapiDotClientDotSpectrum.gapiDotClientDotSpectrumStrings.v1explorer
import typings.gapiDotClientDotSpectrum.gapiNs.clientNs.spectrumNs.PawsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val paws: PawsResource = js.native
  /** Load Google Spectrum Database API v1explorer */
  def load(name: spectrum, version: v1explorer): js.Thenable[Unit] = js.native
  def load(name: spectrum, version: v1explorer, callback: js.Function0[_]): Unit = js.native
}

