package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dbrEnv extends js.Object {
  var bAutoConnectService: scala.Boolean
  var logLevel: scala.Double
  var productKey: java.lang.String
  var resourcesPath: java.lang.String
  def onAutoConnectServiceError(status: js.Any): scala.Unit
  def onAutoConnectServiceSuccess(): scala.Unit
}

object dbrEnv {
  @scala.inline
  def apply(
    bAutoConnectService: scala.Boolean,
    logLevel: scala.Double,
    onAutoConnectServiceError: js.Function1[js.Any, scala.Unit],
    onAutoConnectServiceSuccess: js.Function0[scala.Unit],
    productKey: java.lang.String,
    resourcesPath: java.lang.String
  ): dbrEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bAutoConnectService")(bAutoConnectService)
    __obj.updateDynamic("logLevel")(logLevel)
    __obj.updateDynamic("onAutoConnectServiceError")(onAutoConnectServiceError)
    __obj.updateDynamic("onAutoConnectServiceSuccess")(onAutoConnectServiceSuccess)
    __obj.updateDynamic("productKey")(productKey)
    __obj.updateDynamic("resourcesPath")(resourcesPath)
    __obj.asInstanceOf[dbrEnv]
  }
}

