package typings.dogapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apihost extends js.Object {
  var api_host: js.UndefOr[String] = js.undefined
  var api_key: String
  var app_key: String
}

object Apihost {
  @scala.inline
  def apply(api_key: String, app_key: String, api_host: String = null): Apihost = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], app_key = app_key.asInstanceOf[js.Any])
    if (api_host != null) __obj.updateDynamic("api_host")(api_host.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apihost]
  }
}

