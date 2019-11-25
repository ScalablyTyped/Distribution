package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateChain extends js.Object {
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[Boolean] = js.undefined
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[Boolean] = js.undefined
}

object Anon_CertificateChain {
  @scala.inline
  def apply(certificateChain: js.UndefOr[Boolean] = js.undefined, rawDER: js.UndefOr[Boolean] = js.undefined): Anon_CertificateChain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(certificateChain)) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (!js.isUndefined(rawDER)) __obj.updateDynamic("rawDER")(rawDER.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateChain]
  }
}

