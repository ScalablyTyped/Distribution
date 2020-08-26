package typings.googleCloudCommon.serviceMod

import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleCloudCommon.serviceObjectMod.Interceptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions extends GoogleAuthOptions {
  var email: js.UndefOr[String] = js.native
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var token: js.UndefOr[String] = js.native
  var userAgent: js.UndefOr[String] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply(): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self <: ServiceOptions] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInterceptors_Varargs(value: Interceptor*): Self = this.set("interceptors_", js.Array(value :_*))
    @scala.inline
    def setInterceptors_(value: js.Array[Interceptor]): Self = this.set("interceptors_", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterceptors_ : Self = this.set("interceptors_", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
  
}

