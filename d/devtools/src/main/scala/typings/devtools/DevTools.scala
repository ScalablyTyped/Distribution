package typings.devtools

import typings.devtools.devtoolsStrings.tab
import typings.devtools.devtoolsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DevTools {
  
  // generated typings
  // devtools types
  @js.native
  trait Client extends StObject {
    
    def acceptAlert(): Unit = js.native
    
    def addCookie(cookie: js.Object): Unit = js.native
    
    def back(): Unit = js.native
    
    def closeWindow(): Unit = js.native
    
    @JSName("createWindow")
    def createWindow_tab(`type`: tab): js.Object = js.native
    @JSName("createWindow")
    def createWindow_window(`type`: window): js.Object = js.native
    
    def deleteAllCookies(): Unit = js.native
    
    def deleteCookie(name: String): Unit = js.native
    
    def deleteSession(): Unit = js.native
    
    def dismissAlert(): Unit = js.native
    
    def elementClear(): Unit = js.native
    
    def elementClick(): Unit = js.native
    
    def elementSendKeys(text: String): Unit = js.native
    
    def executeAsyncScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): js.Any = js.native
    
    def executeScript(script: String): js.Any = js.native
    def executeScript(script: String, args: js.Array[js.UndefOr[String | js.Object | Double | Boolean]]): js.Any = js.native
    
    def findElement(`using`: String, value: String): String = js.native
    
    def findElementFromElement(`using`: String, value: String): String = js.native
    
    def findElements(`using`: String, value: String): js.Array[String] = js.native
    
    def findElementsFromElement(`using`: String, value: String): js.Array[String] = js.native
    
    def forward(): Unit = js.native
    
    def fullscreenWindow(): js.Object = js.native
    
    def getActiveElement(): String = js.native
    
    def getAlertText(): String = js.native
    
    def getAllCookies(): js.Array[js.Object] = js.native
    
    def getElementAttribute(name: String): String = js.native
    
    def getElementCSSValue(propertyName: String): String = js.native
    
    def getElementProperty(name: String): String = js.native
    
    def getElementRect(): js.Object = js.native
    
    def getElementTagName(): String = js.native
    
    def getElementText(): String = js.native
    
    def getNamedCookie(name: String): js.Object = js.native
    
    def getPageSource(): String = js.native
    
    def getTimeouts(): js.Object = js.native
    
    def getTitle(): String = js.native
    
    def getUrl(): String = js.native
    
    def getWindowHandle(): String = js.native
    
    def getWindowHandles(): js.Array[String] = js.native
    
    def getWindowRect(): js.Object = js.native
    
    def isElementDisplayed(): Boolean = js.native
    
    def isElementEnabled(): Boolean = js.native
    
    def isElementSelected(): Boolean = js.native
    
    def maximizeWindow(): js.Object = js.native
    
    def minimizeWindow(): js.Object = js.native
    
    def navigateTo(url: String): String = js.native
    
    def newSession(capabilities: js.Object): js.Object = js.native
    
    def performActions(actions: js.Array[js.Object]): Unit = js.native
    
    def printPage(
      orientation: js.UndefOr[String],
      scale: js.UndefOr[Double],
      background: js.UndefOr[Boolean],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      top: js.UndefOr[Double],
      bottom: js.UndefOr[Double],
      left: js.UndefOr[Double],
      right: js.UndefOr[Double],
      shrinkToFit: js.UndefOr[Boolean],
      pageRanges: js.UndefOr[js.Array[js.Object]]
    ): String = js.native
    
    def refresh(): Unit = js.native
    
    def releaseActions(): Unit = js.native
    
    def sendAlertText(text: String): Unit = js.native
    
    def setTimeouts(): Unit = js.native
    def setTimeouts(`implicit`: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Unit, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Unit, script: Double): Unit = js.native
    
    def setWindowRect(): js.Object = js.native
    def setWindowRect(x: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Double, width: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Double, width: Double, height: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Double, width: Null, height: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Null, width: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Null, width: Double, height: Double): js.Object = js.native
    def setWindowRect(x: Double, y: Null, width: Null, height: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Double, width: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Double, width: Double, height: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Double, width: Null, height: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Null, width: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Null, width: Double, height: Double): js.Object = js.native
    def setWindowRect(x: Null, y: Null, width: Null, height: Double): js.Object = js.native
    
    def status(): js.Object = js.native
    
    def switchToFrame(): Unit = js.native
    def switchToFrame(id: js.Object): Unit = js.native
    def switchToFrame(id: Double): Unit = js.native
    
    def switchToParentFrame(): Unit = js.native
    
    def switchToWindow(handle: String): Unit = js.native
    
    def takeElementScreenshot(): String = js.native
    def takeElementScreenshot(scroll: Boolean): String = js.native
    
    def takeScreenshot(): String = js.native
  }
}
