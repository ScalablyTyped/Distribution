package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * The value of the placement. Interpretation depends on the placement type, e.g. URL for a site placement, channel name for a channel placement, app id
    * for a mobile app placement.
    */
  var token: js.UndefOr[String] = js.undefined
  /** The type of the placement. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Token {
  @scala.inline
  def apply(token: String = null, `type`: String = null): Token = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

