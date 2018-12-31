package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLeadResponse extends js.Object {
  /**
    * Lead that was created depending on the outcome of
    * <a href="https://www.google.com/recaptcha/">reCaptcha</a> validation.
    */
  var lead: js.UndefOr[Lead] = js.undefined
  /**
    * The outcome of <a href="https://www.google.com/recaptcha/">reCaptcha</a>
    * validation.
    */
  var recaptchaStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

