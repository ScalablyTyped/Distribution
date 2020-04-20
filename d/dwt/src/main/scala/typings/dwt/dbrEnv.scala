package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dbrEnv extends js.Object {
  var bAutoConnectService: Boolean
  var disableAutoDownloadModule: Boolean
  var hideDWASInstallDialog: Boolean
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
    disableAutoDownloadModule: Boolean,
    hideDWASInstallDialog: Boolean,
    logLevel: Double,
    onAutoConnectServiceError: js.Any => Unit,
    onAutoConnectServiceSuccess: () => Unit,
    productKey: String,
    resourcesPath: String
  ): dbrEnv = {
    val __obj = js.Dynamic.literal(bAutoConnectService = bAutoConnectService.asInstanceOf[js.Any], disableAutoDownloadModule = disableAutoDownloadModule.asInstanceOf[js.Any], hideDWASInstallDialog = hideDWASInstallDialog.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onAutoConnectServiceError = js.Any.fromFunction1(onAutoConnectServiceError), onAutoConnectServiceSuccess = js.Any.fromFunction0(onAutoConnectServiceSuccess), productKey = productKey.asInstanceOf[js.Any], resourcesPath = resourcesPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[dbrEnv]
  }
}

