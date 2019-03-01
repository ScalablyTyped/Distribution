package typings
package easyDashXapiLib.easyDashXapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var app: expressLib.expressMod.eNs.Application
  var express: js.Any
  var log: bunyanLib.bunyanMod.namespaced
  var server: nodeLib.httpMod.Server
  def listen(): scala.Unit
}

object Result {
  @scala.inline
  def apply(
    app: expressLib.expressMod.eNs.Application,
    express: js.Any,
    listen: js.Function0[scala.Unit],
    log: bunyanLib.bunyanMod.namespaced,
    server: nodeLib.httpMod.Server
  ): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("express")(express)
    __obj.updateDynamic("listen")(listen)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Result]
  }
}

