package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSsl extends js.Object {
  /*ignored
    OnCreatWS  OnDetectNext  OnWebTwainPostExecute  OnWebTwainPreExecute  StartWSByIPTimeoutId  StartWSTimeoutId
    aryReconnectSTwains  arySTwains  arySTwainsByIP  bFirst  bNeedUpgradeEvent  bNoControlEvent  bOK  bPromptJSOrServerOutdated
    cUrlIndex  dcpCallbackType  dcpStatus  detectType  getVersionArray  global_dlg  hideMask  isDWTVersionLatest  onNoControl
    onNotAllowedForChrome  ports  scriptLoaded  showMask  starting  tryTimes*/
  var ssl: Boolean
}

object AnonSsl {
  @scala.inline
  def apply(ssl: Boolean): AnonSsl = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSsl]
  }
}

