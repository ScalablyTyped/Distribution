package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej")
@js.native
object ^ extends js.Object {
  val cssUA: java.lang.String = js.native
  val cultures: culture = js.native
  val dataUtil: ejDotWebDotAllLib.ejNs.dataUtil = js.native
  val globalize: ejDotWebDotAllLib.ejNs.globalize = js.native
  val serverTimezoneOffset: scala.Double = js.native
  val template: js.Any = js.native
  val transform: java.lang.String = js.native
  val transformOrigin: java.lang.String = js.native
  val transformStyle: java.lang.String = js.native
  val transition: java.lang.String = js.native
  val transitionDelay: java.lang.String = js.native
  val transitionDuration: java.lang.String = js.native
  val transitionProperty: java.lang.String = js.native
  val transitionTimingFunction: java.lang.String = js.native
  def addCulture(name: java.lang.String): scala.Unit = js.native
  def addCulture(name: java.lang.String, culture: js.Any): scala.Unit = js.native
  def addPrefix(style: java.lang.String): java.lang.String = js.native
  def animationEndEvent(): java.lang.String = js.native
  def avg(json: js.Any, filedName: java.lang.String): js.Any = js.native
  def blockDefaultActions(e: js.Any): scala.Unit = js.native
  def browserInfo(): browserInfoOptions = js.native
  def buildTag(tag: java.lang.String): ejDotWebDotAllLib.JQuery = js.native
  def buildTag(tag: java.lang.String, innerHtml: java.lang.String): ejDotWebDotAllLib.JQuery = js.native
  def buildTag(tag: java.lang.String, innerHtml: java.lang.String, styles: js.Any): ejDotWebDotAllLib.JQuery = js.native
  def buildTag(tag: java.lang.String, innerHtml: java.lang.String, styles: js.Any, attrs: js.Any): ejDotWebDotAllLib.JQuery = js.native
  def cancelEvent(): java.lang.String = js.native
  def copyObject(): java.lang.String = js.native
  def createObject(element: js.Any, eventEmitter: js.Any, model: js.Any): js.Any = js.native
  def createObject(nameSpace: java.lang.String, value: js.Any, initIn: js.Any): ejDotWebDotAllLib.JQuery = js.native
  def defineClass(className: java.lang.String, constructor: js.Any, proto: js.Any, replace: scala.Boolean): js.Any = js.native
  def destroyWidgets(element: js.Any): scala.Unit = js.native
  def endEvent(): java.lang.String = js.native
  def event(`type`: java.lang.String, data: js.Any, eventProp: js.Any): js.Any = js.native
  def findCulture(): culture = js.native
  def findCulture(culture: java.lang.String): culture = js.native
  def format(value: js.Any, format: java.lang.String): java.lang.String = js.native
  def format(value: js.Any, format: java.lang.String, culture: java.lang.String): java.lang.String = js.native
  def getAndroidVersion(): js.Any = js.native
  def getAttrVal(ele: js.Any, `val`: java.lang.String, option: js.Any): js.Any = js.native
  def getBooleanVal(ele: js.Any, `val`: java.lang.String, option: js.Any): js.Any = js.native
  def getClearString(): java.lang.String = js.native
  def getCurrentPage(): ejDotWebDotAllLib.JQuery = js.native
  def getDimension(element: js.Any, method: java.lang.String): js.Any = js.native
  def getFontString(fontObj: js.Any): java.lang.String = js.native
  def getFontStyle(style: java.lang.String): java.lang.String = js.native
  def getGuid(prefix: java.lang.String): scala.Double = js.native
  def getLocalizedConstants(controlName: java.lang.String): js.Any = js.native
  def getLocalizedConstants(controlName: java.lang.String, culture: java.lang.String): js.Any = js.native
  def getMaxZindex(): scala.Double = js.native
  def getNameSpace(className: java.lang.String): java.lang.String = js.native
  def getObject(element: java.lang.String, model: js.Any): js.Any = js.native
  def getObject(nameSpace: java.lang.String): js.Any = js.native
  def getOffset(ele: java.lang.String): js.Any = js.native
  def getRenderMode(): java.lang.String = js.native
  def getScrollableParents(element: js.Any): ejDotWebDotAllLib.JQuery = js.native
  def getTheme(): java.lang.String = js.native
  def getZindexPartial(element: js.Any, popupEle: java.lang.String): scala.Double = js.native
  def group(
    jsonArray: js.Any,
    field: java.lang.String,
    agg: java.lang.String,
    level: scala.Double,
    groupDs: java.lang.String
  ): js.Any = js.native
  def hasRenderMode(element: java.lang.String): scala.Unit = js.native
  def hasStyle(prop: java.lang.String): scala.Boolean = js.native
  def hasTheme(element: java.lang.String): java.lang.String = js.native
  def hexFromRGB(color: java.lang.String): java.lang.String = js.native
  def ieClearRemover(element: java.lang.String): scala.Unit = js.native
  def isAndroid(): scala.Boolean = js.native
  def isAndroidWebView(): java.lang.String = js.native
  def isCssCalc(): scala.Boolean = js.native
  def isDevice(): scala.Boolean = js.native
  def isFlat(): scala.Boolean = js.native
  def isIOS(): scala.Boolean = js.native
  def isIOS7(): scala.Boolean = js.native
  def isIOSWebView(): scala.Boolean = js.native
  def isJSON(jsonData: java.lang.String): java.lang.String = js.native
  def isLowerAndroid(): scala.Boolean = js.native
  def isLowerResolution(): scala.Boolean = js.native
  def isMobile(): scala.Boolean = js.native
  def isNullOrUndefined(value: js.Any): scala.Boolean = js.native
  def isPlainObject(): ejDotWebDotAllLib.JQuery = js.native
  def isPortrait(): js.Any = js.native
  def isTablet(): scala.Boolean = js.native
  def isTouchDevice(): scala.Boolean = js.native
  def isWindows(): scala.Boolean = js.native
  def isWindowsWebView(): java.lang.String = js.native
  def listenEvents(selectors: js.Any, eventTypes: js.Any, handlers: js.Any): scala.Unit = js.native
  def listenEvents(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any): scala.Unit = js.native
  def listenEvents(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any, pluginObj: js.Any): scala.Unit = js.native
  def listenEvents(
    selectors: js.Any,
    eventTypes: js.Any,
    handlers: js.Any,
    remove: js.Any,
    pluginObj: js.Any,
    disableMouse: scala.Boolean
  ): scala.Unit = js.native
  def listenTouchEvent(selectors: js.Any, eventTypes: js.Any, handlers: js.Any): scala.Unit = js.native
  def listenTouchEvent(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any): scala.Unit = js.native
  def listenTouchEvent(selectors: js.Any, eventTypes: js.Any, handlers: js.Any, remove: js.Any, pluginObj: js.Any): scala.Unit = js.native
  def listenTouchEvent(
    selectors: js.Any,
    eventTypes: js.Any,
    handlers: js.Any,
    remove: js.Any,
    pluginObj: js.Any,
    disableMouse: scala.Boolean
  ): scala.Unit = js.native
  def logBase(`val`: java.lang.String, base: java.lang.String): scala.Double = js.native
  def max(jsonArray: js.Any): js.Any = js.native
  def max(jsonArray: js.Any, fieldName: java.lang.String): js.Any = js.native
  def max(jsonArray: js.Any, fieldName: java.lang.String, comparer: java.lang.String): js.Any = js.native
  def measureText(text: java.lang.String, maxwidth: scala.Double, font: java.lang.String): java.lang.String = js.native
  def merge(first: java.lang.String, second: java.lang.String): js.Any = js.native
  def mergeshort(jsonArray: js.Any, fieldName: java.lang.String, comparer: java.lang.String): js.Any = js.native
  def min(jsonArray: js.Any, fieldName: java.lang.String, comparer: java.lang.String): js.Any = js.native
  def moveEvent(): java.lang.String = js.native
  def parseDate(value: java.lang.String, format: java.lang.String): stdLib.Date = js.native
  def parseDate(value: java.lang.String, format: java.lang.String, culture: java.lang.String): stdLib.Date = js.native
  def parseFloat(value: java.lang.String): scala.Double = js.native
  def parseFloat(value: java.lang.String, radix: js.Any): scala.Double = js.native
  def parseFloat(value: java.lang.String, radix: js.Any, culture: java.lang.String): scala.Double = js.native
  def parseInt(value: java.lang.String): scala.Double = js.native
  def parseInt(value: java.lang.String, radix: js.Any): scala.Double = js.native
  def parseInt(value: java.lang.String, radix: js.Any, culture: java.lang.String): scala.Double = js.native
  def parseJSON(jsonText: java.lang.String): java.lang.String = js.native
  def parseTable(table: scala.Double, headerOption: java.lang.String, headerRowIndex: java.lang.String): js.Any = js.native
  def preferredCulture(): culture = js.native
  def preferredCulture(culture: java.lang.String): culture = js.native
  def print(element: java.lang.String, printWindow: js.Any): scala.Unit = js.native
  def proxy(fn: js.Any): js.Any = js.native
  def proxy(fn: js.Any, context: java.lang.String): js.Any = js.native
  def proxy(fn: js.Any, context: java.lang.String, arg: java.lang.String): js.Any = js.native
  def round(value: java.lang.String, div: java.lang.String, up: java.lang.String): js.Any = js.native
  def select(jsonArray: js.Any, fields: java.lang.String): js.Any = js.native
  def sendAjaxRequest(ajaxOptions: js.Any): scala.Unit = js.native
  def setCaretToPos(nput: java.lang.String, pos1: java.lang.String, pos2: java.lang.String): scala.Unit = js.native
  def setCulture(culture: java.lang.String): scala.Unit = js.native
  def setRenderMode(element: java.lang.String): scala.Unit = js.native
  def setTheme(): js.Any = js.native
  def setTransition(): scala.Boolean = js.native
  def startEvent(): java.lang.String = js.native
  def sum(json: java.lang.String, fieldName: java.lang.String): java.lang.String = js.native
  def swap(array: js.Any, x: java.lang.String, y: java.lang.String): js.Any = js.native
  def tapEvent(): java.lang.String = js.native
  def tapHoldEvent(): java.lang.String = js.native
  def throwError(): js.Any = js.native
  def transitionEndEvent(): js.Any = js.native
  def userAgent(): scala.Boolean = js.native
  def widget(pluginName: java.lang.String, className: java.lang.String, proto: js.Any): js.Any = js.native
}

