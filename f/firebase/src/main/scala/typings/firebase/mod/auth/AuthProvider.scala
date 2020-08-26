package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents an auth provider.
  */
@js.native
trait AuthProvider extends js.Object {
  var providerId: String = js.native
}

object AuthProvider {
  @scala.inline
  def apply(providerId: String): AuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProvider]
  }
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
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
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
  }
  
}

