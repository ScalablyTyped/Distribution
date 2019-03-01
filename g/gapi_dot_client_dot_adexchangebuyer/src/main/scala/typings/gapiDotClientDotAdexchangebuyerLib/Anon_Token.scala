package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Token extends js.Object {
  /**
    * The value of the placement. Interpretation depends on the placement type, e.g. URL for a site placement, channel name for a channel placement, app id
    * for a mobile app placement.
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the placement. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Token {
  @scala.inline
  def apply(token: java.lang.String = null, `type`: java.lang.String = null): Anon_Token = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Token]
  }
}

