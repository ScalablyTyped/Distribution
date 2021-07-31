package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileApp
  extends StObject
     with AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules
     with hasStats
     with isAdGroupChild {
  
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
