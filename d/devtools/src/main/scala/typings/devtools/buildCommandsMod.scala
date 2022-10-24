package typings.devtools

import typings.devtools.anon.Actions
import typings.devtools.anon.Args
import typings.devtools.anon.Capabilities
import typings.devtools.anon.Cookie
import typings.devtools.anon.ElementId
import typings.devtools.anon.ElementIdName
import typings.devtools.anon.Handle
import typings.devtools.anon.HandleString
import typings.devtools.anon.Height
import typings.devtools.anon.HeightWidth
import typings.devtools.anon.Id
import typings.devtools.anon.IdNull
import typings.devtools.anon.Implicit
import typings.devtools.anon.Message
import typings.devtools.anon.Name
import typings.devtools.anon.PageLoad
import typings.devtools.anon.PropertyName
import typings.devtools.anon.SessionId
import typings.devtools.anon.Shadow606611e4a52e4f735466cecf
import typings.devtools.anon.ShadowId
import typings.devtools.anon.Text
import typings.devtools.anon.TextString
import typings.devtools.anon.Type
import typings.devtools.anon.Url
import typings.devtools.anon.Using
import typings.devtools.anon.Value
import typings.devtools.anon.Width
import typings.node.bufferMod.global.Buffer
import typings.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsMod {
  
  @JSImport("devtools/build/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptAlert(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptAlert")().asInstanceOf[js.Promise[Null]]
  
  inline def addCookie(param1: Cookie): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCookie")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def back(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[js.Promise[Null]]
  
  inline def closeWindow(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")().asInstanceOf[js.Promise[String]]
  
  inline def createWindow(param1: Type): js.Promise[Handle] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWindow")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Handle]]
  
  inline def deleteAllCookies(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAllCookies")().asInstanceOf[js.Promise[Null]]
  
  inline def deleteCookie(param1: Name): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookie")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def deleteSession(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSession")().asInstanceOf[js.Promise[Null]]
  
  inline def dismissAlert(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAlert")().asInstanceOf[js.Promise[Null]]
  
  inline def elementClear(param1: ElementId): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementClear")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def elementClick(param1: ElementId): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementClick")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def elementSendKeys(param1: Text): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementSendKeys")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def executeAsyncScript(param1: Args): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeAsyncScript")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def executeScript(param1: Args): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def findElement(param1: Using): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElementFromElement(param1: Value): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementFromElement")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElementFromShadowRoot(param1: ShadowId): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementFromShadowRoot")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElements(param1: Using): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def findElementsFromElement(param1: Value): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementsFromElement")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def findElementsFromShadowRoot(param1: ShadowId): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementsFromShadowRoot")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def forward(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[js.Promise[Null]]
  
  inline def getActiveElement(): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def getAlertText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertText")().asInstanceOf[String]
  
  inline def getAllCookies(): js.Promise[js.Array[typings.devtoolsProtocol.mod.Protocol.Network.Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCookies")().asInstanceOf[js.Promise[js.Array[typings.devtoolsProtocol.mod.Protocol.Network.Cookie]]]
  
  inline def getElementAttribute(param1: ElementIdName): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementAttribute")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def getElementCSSValue(param1: PropertyName): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementCSSValue")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getElementComputedLabel(param1: ElementId): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementComputedLabel")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getElementComputedRole(param1: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementComputedRole")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getElementProperty(param1: ElementIdName): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementProperty")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getElementRect(param1: ElementId): js.Promise[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Height]]
  
  inline def getElementShadowRoot(param1: ElementId): js.Promise[Shadow606611e4a52e4f735466cecf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementShadowRoot")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Shadow606611e4a52e4f735466cecf]]
  
  inline def getElementTagName(param1: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementTagName")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getElementText(param1: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementText")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getNamedCookie(param1: Name): js.Promise[typings.devtoolsProtocol.mod.Protocol.Network.Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamedCookie")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.devtoolsProtocol.mod.Protocol.Network.Cookie]]
  
  inline def getPageSource(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageSource")().asInstanceOf[js.Promise[String]]
  
  inline def getTimeouts(): Implicit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeouts")().asInstanceOf[Implicit]
  
  inline def getTitle(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")().asInstanceOf[js.Promise[String]]
  
  inline def getUrl(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")().asInstanceOf[js.Promise[String]]
  
  inline def getWindowHandle(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowHandle")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getWindowHandles(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowHandles")().asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getWindowRect(): js.Promise[Width] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowRect")().asInstanceOf[js.Promise[Width]]
  
  inline def isElementEnabled(param1: ElementId): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementEnabled")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isElementSelected(param1: ElementId): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementSelected")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def navigateTo(param1: Url): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def newSession(param1: Capabilities): js.Promise[SessionId] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SessionId]]
  
  inline def performActions(param1: Actions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("performActions")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def refresh(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[js.Promise[Null]]
  
  inline def releaseActions(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseActions")().asInstanceOf[js.Promise[Unit]]
  
  inline def sendAlertText(param1: TextString): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendAlertText")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def setTimeouts(param1: PageLoad): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeouts")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def setWindowRect(params: HeightWidth): js.Promise[HeightWidth] = ^.asInstanceOf[js.Dynamic].applyDynamic("setWindowRect")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HeightWidth]]
  
  inline def status(): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[js.Promise[Message]]
  
  inline def switchToFrame(param1: Id): js.Promise[IdNull | Id] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToFrame")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdNull | Id]]
  
  inline def switchToParentFrame(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToParentFrame")().asInstanceOf[js.Promise[Null]]
  
  inline def switchToWindow(param1: HandleString): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToWindow")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def takeElementScreenshot(param1: ElementId): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeElementScreenshot")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
  
  inline def takeScreenshot(): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeScreenshot")().asInstanceOf[js.Promise[String | Buffer]]
}
