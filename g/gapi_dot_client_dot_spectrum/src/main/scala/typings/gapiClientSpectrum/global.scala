package typings.gapiClientSpectrum

import typings.gapiClientSpectrum.gapi.client.spectrum.PawsResource
import typings.gapiClientSpectrum.gapiClientSpectrumStrings.spectrum
import typings.gapiClientSpectrum.gapiClientSpectrumStrings.v1explorer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val paws: PawsResource = js.native
      /** Load Google Spectrum Database API v1explorer */
      def load(name: spectrum, version: v1explorer): js.Thenable[Unit] = js.native
      def load(name: spectrum, version: v1explorer, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

