package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileApp
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules
     with hasStats {
  def clearLinkUrl(): scala.Unit = js.native
  def getAppId(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getLinkText(): java.lang.String = js.native
  def getStore(): AppStore = js.native
  def setAppId(appId: java.lang.String): scala.Unit = js.native
  def setLinkText(linkText: java.lang.String): scala.Unit = js.native
  def setStore(): AppStore = js.native
  def urls(): MobileAppUrls = js.native
}

