package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defaults to
  * {
  *    allow_display_name: false,
  *    require_display_name: false,
  *    allow_utf8_local_part: true,
  *    require_tld: true
  * }
  */
trait IsEmailOptions extends js.Object {
  var allow_display_name: js.UndefOr[scala.Boolean] = js.undefined
  var allow_utf8_local_part: js.UndefOr[scala.Boolean] = js.undefined
  var require_tld: js.UndefOr[scala.Boolean] = js.undefined
}

