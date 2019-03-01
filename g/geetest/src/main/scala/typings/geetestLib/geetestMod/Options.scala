package typings
package geetestLib.geetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var api_server: js.UndefOr[java.lang.String] = js.undefined
  var geetest_id: java.lang.String
  var geetest_key: java.lang.String
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    geetest_id: java.lang.String,
    geetest_key: java.lang.String,
    api_server: java.lang.String = null,
    protocol: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geetest_id")(geetest_id)
    __obj.updateDynamic("geetest_key")(geetest_key)
    if (api_server != null) __obj.updateDynamic("api_server")(api_server)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[Options]
  }
}

