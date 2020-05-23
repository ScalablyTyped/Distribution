package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateChain extends js.Object {
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[Boolean] = js.undefined
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[Boolean] = js.undefined
}

object CertificateChain {
  @scala.inline
  def apply(certificateChain: js.UndefOr[Boolean] = js.undefined, rawDER: js.UndefOr[Boolean] = js.undefined): CertificateChain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(certificateChain)) __obj.updateDynamic("certificateChain")(certificateChain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rawDER)) __obj.updateDynamic("rawDER")(rawDER.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateChain]
  }
}

