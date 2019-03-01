package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateChain extends js.Object {
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[scala.Boolean] = js.undefined
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CertificateChain {
  @scala.inline
  def apply(
    certificateChain: js.UndefOr[scala.Boolean] = js.undefined,
    rawDER: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CertificateChain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(certificateChain)) __obj.updateDynamic("certificateChain")(certificateChain)
    if (!js.isUndefined(rawDER)) __obj.updateDynamic("rawDER")(rawDER)
    __obj.asInstanceOf[Anon_CertificateChain]
  }
}

