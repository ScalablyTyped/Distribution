package typings.firefoxWebextBrowser.browser.privacy.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object which describes TLS minimum and maximum versions. */
trait tlsVersionRestrictionConfig extends js.Object {
  /** The maximum TLS version supported. */
  var maximum: js.UndefOr[TlsVersionRestrictionConfigMaximum] = js.undefined
  /** The minimum TLS version supported. */
  var minimum: js.UndefOr[TlsVersionRestrictionConfigMinimum] = js.undefined
}

object tlsVersionRestrictionConfig {
  @scala.inline
  def apply(
    maximum: TlsVersionRestrictionConfigMaximum = null,
    minimum: TlsVersionRestrictionConfigMinimum = null
  ): tlsVersionRestrictionConfig = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[tlsVersionRestrictionConfig]
  }
}

