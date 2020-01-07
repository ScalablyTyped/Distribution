package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of authentication to perform against the specified resource or URL
  * that uses username and password. Currently, only Basic authentication is
  * supported in Uptime Monitoring.
  */
@js.native
trait Schema$BasicAuthentication extends js.Object {
  /**
    * The password to authenticate.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username to authenticate.
    */
  var username: js.UndefOr[String] = js.native
}

object Schema$BasicAuthentication {
  @scala.inline
  def apply(password: String = null, username: String = null): Schema$BasicAuthentication = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BasicAuthentication]
  }
}

