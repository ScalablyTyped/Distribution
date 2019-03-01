package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VcardTelephone extends js.Object {
  /** A nested telephone URI of the form: tel:+1-123-456-7890. */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object VcardTelephone {
  @scala.inline
  def apply(uri: java.lang.String = null): VcardTelephone = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[VcardTelephone]
  }
}

