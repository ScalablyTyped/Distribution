package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third Party Authentication Token
  */
@js.native
trait Schema$ThirdPartyAuthenticationToken extends js.Object {
  /**
    * Name of the third-party authentication token.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of the third-party authentication token. This is a read-only,
    * auto-generated field.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$ThirdPartyAuthenticationToken {
  @scala.inline
  def apply(name: String = null, value: String = null): Schema$ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThirdPartyAuthenticationToken]
  }
}

