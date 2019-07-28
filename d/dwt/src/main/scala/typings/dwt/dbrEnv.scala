package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dbrEnv extends js.Object {
  var bAutoConnectService: Boolean
  var logLevel: Double
  var productKey: String
  var resourcesPath: String
  def onAutoConnectServiceError(status: js.Any): Unit
  def onAutoConnectServiceSuccess(): Unit
}

object dbrEnv {
  @scala.inline
  def apply(
    bAutoConnectService: Boolean,
    logLevel: Double,
    onAutoConnectServiceError: js.Any => Unit,
    onAutoConnectServiceSuccess: () => Unit,
    productKey: String,
    resourcesPath: String
  ): dbrEnv = {
    val __obj = js.Dynamic.literal(bAutoConnectService = bAutoConnectService, logLevel = logLevel, onAutoConnectServiceError = js.Any.fromFunction1(onAutoConnectServiceError), onAutoConnectServiceSuccess = js.Any.fromFunction0(onAutoConnectServiceSuccess), productKey = productKey, resourcesPath = resourcesPath)
  
    __obj.asInstanceOf[dbrEnv]
  }
}

