package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ssl extends js.Object {
  /*ignored
    OnCreatWS  OnDetectNext  OnWebTwainPostExecute  OnWebTwainPreExecute  StartWSByIPTimeoutId  StartWSTimeoutId
    aryReconnectSTwains  arySTwains  arySTwainsByIP  bFirst  bNeedUpgradeEvent  bNoControlEvent  bOK  bPromptJSOrServerOutdated
    cUrlIndex  dcpCallbackType  dcpStatus  detectType  getVersionArray  global_dlg  hideMask  isDWTVersionLatest  onNoControl
    onNotAllowedForChrome  ports  scriptLoaded  showMask  starting  tryTimes*/
  var ssl: Boolean
}

object Ssl {
  @scala.inline
  def apply(ssl: Boolean): Ssl = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssl]
  }
}

