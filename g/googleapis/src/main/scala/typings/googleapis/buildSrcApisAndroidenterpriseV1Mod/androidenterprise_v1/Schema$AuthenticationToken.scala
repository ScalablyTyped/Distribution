package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An AuthenticationToken is used by the EMM&#39;s device policy client on a
  * device to provision the given EMM-managed user on that device.
  */
@js.native
trait Schema$AuthenticationToken extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#authenticationToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The authentication token to be passed to the device policy client on the
    * device where it can be used to provision the account for which this token
    * was generated.
    */
  var token: js.UndefOr[String] = js.native
}

object Schema$AuthenticationToken {
  @scala.inline
  def apply(kind: String = null, token: String = null): Schema$AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthenticationToken]
  }
}

