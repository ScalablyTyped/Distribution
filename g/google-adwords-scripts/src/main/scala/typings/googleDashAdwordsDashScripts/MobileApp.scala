package typings.googleDashAdwordsDashScripts

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
  def clearLinkUrl(): Unit = js.native
  def getAppId(): String = js.native
  def getId(): Double = js.native
  def getLinkText(): String = js.native
  def getStore(): AppStore = js.native
  def setAppId(appId: String): Unit = js.native
  def setLinkText(linkText: String): Unit = js.native
  def setStore(): AppStore = js.native
  def urls(): MobileAppUrls = js.native
}

