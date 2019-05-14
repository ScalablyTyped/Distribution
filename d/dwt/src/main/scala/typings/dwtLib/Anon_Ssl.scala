package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ssl extends js.Object {
  /*ignored
    OnCreatWS  OnDetectNext  OnWebTwainPostExecute  OnWebTwainPreExecute  StartWSByIPTimeoutId  StartWSTimeoutId
    aryReconnectSTwains  arySTwains  arySTwainsByIP  bFirst  bNeedUpgradeEvent  bNoControlEvent  bOK  bPromptJSOrServerOutdated
    cUrlIndex  dcpCallbackType  dcpStatus  detectType  getVersionArray  global_dlg  hideMask  isDWTVersionLatest  onNoControl
    onNotAllowedForChrome  ports  scriptLoaded  showMask  starting  tryTimes*/
  var ssl: scala.Boolean
}

object Anon_Ssl {
  @scala.inline
  def apply(ssl: scala.Boolean): Anon_Ssl = {
    val __obj = js.Dynamic.literal(ssl = ssl)
  
    __obj.asInstanceOf[Anon_Ssl]
  }
}

