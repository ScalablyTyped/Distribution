package typings.geetest.geetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var api_server: js.UndefOr[String] = js.undefined
  var geetest_id: String
  var geetest_key: String
  var protocol: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(geetest_id: String, geetest_key: String, api_server: String = null, protocol: String = null): Options = {
    val __obj = js.Dynamic.literal(geetest_id = geetest_id, geetest_key = geetest_key)
    if (api_server != null) __obj.updateDynamic("api_server")(api_server)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[Options]
  }
}

