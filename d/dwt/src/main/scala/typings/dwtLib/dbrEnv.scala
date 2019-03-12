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
    onAutoConnectServiceError: js.Any => scala.Unit,
    onAutoConnectServiceSuccess: () => scala.Unit,
    productKey: java.lang.String,
    resourcesPath: java.lang.String
  ): dbrEnv = {
    val __obj = js.Dynamic.literal(bAutoConnectService = bAutoConnectService, logLevel = logLevel, onAutoConnectServiceError = js.Any.fromFunction1(onAutoConnectServiceError), onAutoConnectServiceSuccess = js.Any.fromFunction0(onAutoConnectServiceSuccess), productKey = productKey, resourcesPath = resourcesPath)
  
    __obj.asInstanceOf[dbrEnv]
  }
}

