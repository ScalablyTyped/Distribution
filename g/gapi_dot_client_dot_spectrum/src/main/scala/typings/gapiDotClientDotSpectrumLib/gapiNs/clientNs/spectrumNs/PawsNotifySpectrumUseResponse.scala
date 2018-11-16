package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PawsNotifySpectrumUseResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsNotifySpectrumUseResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
               *
               * Required field.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The PAWS version. Must be exactly 1.0.
               *
               * Required field.
               */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

