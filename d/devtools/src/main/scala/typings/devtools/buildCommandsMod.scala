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
  
  inline def addCookie(hasCookie: Cookie): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCookie")(hasCookie.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def back(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[js.Promise[Null]]
  
  inline def closeWindow(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")().asInstanceOf[js.Promise[String]]
  
  inline def createWindow(hasType: Type): js.Promise[Handle] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWindow")(hasType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Handle]]
  
  inline def deleteAllCookies(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAllCookies")().asInstanceOf[js.Promise[Null]]
  
  inline def deleteCookie(hasName: Name): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookie")(hasName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def deleteSession(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSession")().asInstanceOf[js.Promise[Null]]
  
  inline def dismissAlert(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAlert")().asInstanceOf[js.Promise[Null]]
  
  inline def elementClear(hasElementId: ElementId): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementClear")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def elementClick(hasElementId: ElementId): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementClick")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def elementSendKeys(hasElementIdText: Text): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementSendKeys")(hasElementIdText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def executeAsyncScript(hasScriptArgs: Args): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeAsyncScript")(hasScriptArgs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def executeScript(hasScriptArgs: Args): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(hasScriptArgs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def findElement(hasUsingValue: Using): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(hasUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElementFromElement(hasElementIdUsingValue: Value): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementFromElement")(hasElementIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElementFromShadowRoot(hasShadowIdUsingValue: ShadowId): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementFromShadowRoot")(hasShadowIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElements(hasUsingValue: Using): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(hasUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def findElementsFromElement(hasElementIdUsingValue: Value): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementsFromElement")(hasElementIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def findElementsFromShadowRoot(hasShadowIdUsingValue: ShadowId): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findElementsFromShadowRoot")(hasShadowIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def forward(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[js.Promise[Null]]
  
  inline def getActiveElement(): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def getAlertText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertText")().asInstanceOf[String]
  
  inline def getAllCookies(): js.Promise[js.Array[typings.devtoolsProtocol.mod.Protocol.Network.Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCookies")().asInstanceOf[js.Promise[js.Array[typings.devtoolsProtocol.mod.Protocol.Network.Cookie]]]
  
  inline def getElementAttribute(hasElementIdName: ElementIdName): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementAttribute")(hasElementIdName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def getElementCSSValue(hasElementIdPropertyName: PropertyName): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementCSSValue")(hasElementIdPropertyName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getElementComputedLabel(hasElementId: ElementId): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementComputedLabel")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getElementComputedRole(hasElementId: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementComputedRole")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getElementProperty(hasElementIdName: ElementIdName): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementProperty")(hasElementIdName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getElementRect(hasElementId: ElementId): js.Promise[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Height]]
  
  inline def getElementShadowRoot(hasElementId: ElementId): js.Promise[Shadow606611e4a52e4f735466cecf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementShadowRoot")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Shadow606611e4a52e4f735466cecf]]
  
  inline def getElementTagName(hasElementId: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementTagName")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getElementText(hasElementId: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementText")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getNamedCookie(hasName: Name): js.Promise[typings.devtoolsProtocol.mod.Protocol.Network.Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamedCookie")(hasName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.devtoolsProtocol.mod.Protocol.Network.Cookie]]
  
  inline def getPageSource(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageSource")().asInstanceOf[js.Promise[String]]
  
  inline def getTimeouts(): Implicit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeouts")().asInstanceOf[Implicit]
  
  inline def getTitle(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")().asInstanceOf[js.Promise[String]]
  
  inline def getUrl(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")().asInstanceOf[js.Promise[String]]
  
  inline def getWindowHandle(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowHandle")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getWindowHandles(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowHandles")().asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getWindowRect(): js.Promise[Width] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowRect")().asInstanceOf[js.Promise[Width]]
  
  inline def isElementEnabled(hasElementId: ElementId): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementEnabled")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isElementSelected(hasElementId: ElementId): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementSelected")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def navigateTo(hasUrl: Url): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(hasUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def newSession(hasCapabilities: Capabilities): js.Promise[SessionId] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(hasCapabilities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SessionId]]
  
  inline def performActions(hasActions: Actions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("performActions")(hasActions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def refresh(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[js.Promise[Null]]
  
  inline def releaseActions(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseActions")().asInstanceOf[js.Promise[Unit]]
  
  inline def sendAlertText(hasText: TextString): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendAlertText")(hasText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def setTimeouts(hasImplicitPageLoadScript: PageLoad): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeouts")(hasImplicitPageLoadScript.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
  
  inline def setWindowRect(params: HeightWidth): js.Promise[HeightWidth] = ^.asInstanceOf[js.Dynamic].applyDynamic("setWindowRect")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HeightWidth]]
  
  inline def status(): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[js.Promise[Message]]
  
  inline def switchToFrame(hasId: Id): js.Promise[IdNull | Id] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToFrame")(hasId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdNull | Id]]
  
  inline def switchToParentFrame(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToParentFrame")().asInstanceOf[js.Promise[Null]]
  
  inline def switchToWindow(hasHandle: HandleString): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchToWindow")(hasHandle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def takeElementScreenshot(hasElementId: ElementId): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeElementScreenshot")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
  
  inline def takeScreenshot(): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeScreenshot")().asInstanceOf[js.Promise[String | Buffer]]
}
