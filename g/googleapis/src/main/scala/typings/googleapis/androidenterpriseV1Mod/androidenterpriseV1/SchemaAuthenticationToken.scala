package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An AuthenticationToken is used by the EMM&#39;s device policy client on a
  * device to provision the given EMM-managed user on that device.
  */
@js.native
trait SchemaAuthenticationToken extends js.Object {
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

object SchemaAuthenticationToken {
  @scala.inline
  def apply(): SchemaAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationToken]
  }
  @scala.inline
  implicit class SchemaAuthenticationTokenOps[Self <: SchemaAuthenticationToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

