package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej")
@js.native
object ^ extends js.Object {
  val cssUA: String = js.native
  val cultures: culture = js.native
  val dataUtil: typings.ejDotWebDotAll.ejNs.dataUtil = js.native
  val globalize: typings.ejDotWebDotAll.ejNs.globalize = js.native
  val serverTimezoneOffset: Double = js.native
  val template: js.Any = js.native
  val transform: String = js.native
  val transformOrigin: String = js.native
  val transformStyle: String = js.native
  val transition: String = js.native
  val transitionDelay: String = js.native
  val transitionDuration: String = js.native
  val transitionProperty: String = js.native
  val transitionTimingFunction: String = js.native
  def addCulture(name: String): Unit = js.native
  def addCulture(name: String, culture: js.Any): Unit = js.native
  def addPrefix(style: String): String = js.native
  def animationEndEvent(): String = js.native
  def avg(json: js.Any, filedName: String): js.Any = js.native
  def blockDefaultActions(e: js.Any): Unit = js.native
  def browserInfo(): browserInfoOptions = js.native
  def buildTag(tag: String): JQuery = js.native
  def buildTag(tag: String, innerHtml: String): JQuery = js.native
  def buildTag(tag: String, innerHtml: String, styles: js.Any): JQuery = js.native
  def buildTag(tag: String, innerHtml: String, styles: js.Any, attrs: js.Any): JQuery = js.native
  def cancelEvent(): String = js.native
  def copyObject(): String = js.native
  def createObject(element: js.Any, eventEmitter: js.Any, model: js.Any): js.Any = js.native
  def createObject(nameSpace: String, value: js.Any, initIn: js.Any): JQuery = js.native
  def defineClass(className: String, constructor: js.Any, proto: js.Any, replace: Boolean): js.Any = js.native
  def destroyWidgets(element: js.Any): Unit = js.native
  def endEvent(): String = js.native
  def event(`type`: String, data: js.Any, eventProp: js.Any): js.Any = js.native
  def findCulture(): culture = js.native
  def findCulture(culture: String): culture = js.native
  def format(value: js.Any, format: String): String = js.native
  def format(value: js.Any, format: String, culture: String): String = js.native
  def getAndroidVersion(): js.Any = js.native
  def getAttrVal(ele: js.Any, `val`: String, option: js.Any): js.Any = js.native
  def getBooleanVal(ele: js.Any, `val`: String, option: js.Any): js.Any = js.native
  def getClearString(): String = js.native
  def getCurrentPage(): JQuery = js.native
  def getDimension(element: js.Any, method: String): js.Any = js.native
  def getFontString(fontObj: js.Any): String = js.native
  def getFontStyle(style: String): String = js.native
  def getGuid(prefix: String): Double = js.native
  def getLocalizedConstants(controlName: String): js.Any = js.native
  def getLocalizedConstants(controlName: String, culture: String): js.Any = js.native
  def getMaxZindex(): Double = js.native
  def getNameSpace(className: String): String = js.native
  def getObject(element: String, model: js.Any): js.Any = js.native
  def getObject(nameSpace: String): js.Any = js.native
  def getOffset(ele: String): js.Any = js.native
  def getRenderMode(): String = js.native
  def getScrollableParents(element: js.Any): JQuery = js.native
  def getTheme(): String = js.native
  def getZindexPartial(element: js.Any, popupEle: String): Double = js.native
  def group(jsonArray: js.Any, field: String, agg: String, level: Double, groupDs: String): js.Any = js.native
  def hasRenderMode(element: String): Unit = js.native
  def hasStyle(prop: String): Boolean = js.native
  def hasTheme(element: String): String = js.native
  def hexFromRGB(color: String): String = js.native
  def ieClearRemover(element: String): Unit = js.native
  def isAndroid(): Boolean = js.native
  def isAndroidWebView(): String = js.native
  def isCssCalc(): Boolean = js.native
  def isDevice(): Boolean = js.native
  def isFlat(): Boolean = js.native
  def isIOS(): Boolean = js.native
  def isIOS7(): Boolean = js.native
  def isIOSWebView(): Boolean = js.native
  def isJSON(jsonData: String): String = js.native
  def isLowerAndroid(): Boolean = js.native
  def isLowerResolution(): Boolean = js.native
  def isMobile(): Boolean = js.native
  def isNullOrUndefined(value: js.Any): Boolean = js.native
  def isPlainObject(): JQuery = js.native
  def isPortrait(): js.Any = js.native
  def isTablet(): Boolean = js.native
  def isTouchDevice(): Boolean = js.native
  def isWindows(): Boolean = js.native
  def isWindowsWebView(): String = js.native
  def listenEvents(selectors: js.Any, eventTypes: js.Any, handlers: js.Any): Unit = js.native
  def listenEvents(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any): Unit = js.native
  def listenEvents(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any, pluginObj: js.Any): Unit = js.native
  def listenEvents(
    selectors: js.Any,
    eventTypes: js.Any,
    handlers: js.Any,
    remove: js.Any,
    pluginObj: js.Any,
    disableMouse: Boolean
  ): Unit = js.native
  def listenTouchEvent(selectors: js.Any, eventTypes: js.Any, handlers: js.Any): Unit = js.native
  def listenTouchEvent(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any): Unit = js.native
  def listenTouchEvent(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any, pluginObj: js.Any): Unit = js.native
  def listenTouchEvent(
    selectors: js.Any,
    eventTypes: js.Any,
    handlers: js.Any,
    remove: js.Any,
    pluginObj: js.Any,
    disableMouse: Boolean
  ): Unit = js.native
  def logBase(`val`: String, base: String): Double = js.native
  def max(jsonArray: js.Any): js.Any = js.native
  def max(jsonArray: js.Any, fieldName: String): js.Any = js.native
  def max(jsonArray: js.Any, fieldName: String, comparer: String): js.Any = js.native
  def measureText(text: String, maxwidth: Double, font: String): String = js.native
  def merge(first: String, second: String): js.Any = js.native
  def mergeshort(jsonArray: js.Any, fieldName: String, comparer: String): js.Any = js.native
  def min(jsonArray: js.Any, fieldName: String, comparer: String): js.Any = js.native
  def moveEvent(): String = js.native
  def parseDate(value: String, format: String): Date = js.native
  def parseDate(value: String, format: String, culture: String): Date = js.native
  def parseFloat(value: String): Double = js.native
  def parseFloat(value: String, radix: js.Any): Double = js.native
  def parseFloat(value: String, radix: js.Any, culture: String): Double = js.native
  def parseInt(value: String): Double = js.native
  def parseInt(value: String, radix: js.Any): Double = js.native
  def parseInt(value: String, radix: js.Any, culture: String): Double = js.native
  def parseJSON(jsonText: String): String = js.native
  def parseTable(table: Double, headerOption: String, headerRowIndex: String): js.Any = js.native
  def preferredCulture(): culture = js.native
  def preferredCulture(culture: String): culture = js.native
  def print(element: String, printWindow: js.Any): Unit = js.native
  def proxy(fn: js.Any): js.Any = js.native
  def proxy(fn: js.Any, context: String): js.Any = js.native
  def proxy(fn: js.Any, context: String, arg: String): js.Any = js.native
  def round(value: String, div: String, up: String): js.Any = js.native
  def select(jsonArray: js.Any, fields: String): js.Any = js.native
  def sendAjaxRequest(ajaxOptions: js.Any): Unit = js.native
  def setCaretToPos(nput: String, pos1: String, pos2: String): Unit = js.native
  def setCulture(culture: String): Unit = js.native
  def setRenderMode(element: String): Unit = js.native
  def setTheme(): js.Any = js.native
  def setTransition(): Boolean = js.native
  def startEvent(): String = js.native
  def sum(json: String, fieldName: String): String = js.native
  def swap(array: js.Any, x: String, y: String): js.Any = js.native
  def tapEvent(): String = js.native
  def tapHoldEvent(): String = js.native
  def throwError(): js.Any = js.native
  def transitionEndEvent(): js.Any = js.native
  def userAgent(): Boolean = js.native
  def widget(pluginName: String, className: String, proto: js.Any): js.Any = js.native
}

