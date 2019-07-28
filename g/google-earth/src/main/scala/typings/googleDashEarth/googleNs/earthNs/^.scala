package typings.googleDashEarth.googleNs.earthNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth")
@js.native
object ^ extends js.Object {
  def addEventListener(targetObject: js.Any, eventID: String, listenerCallback: js.Function1[/* event */ KmlEvent, Unit]): Unit = js.native
  def addEventListener(
    targetObject: js.Any,
    eventID: String,
    listenerCallback: js.Function1[/* event */ KmlEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def createInstance(
    domNode: String,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def createInstance(
    domNode: String,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit],
    options: js.Any
  ): Unit = js.native
  def createInstance(
    domNode: Element,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def createInstance(
    domNode: Element,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit],
    options: js.Any
  ): Unit = js.native
  def executeBatch(pluginInstance: GEPlugin, batchFunction: js.Function): Unit = js.native
  def fetchKml(
    pluginInstance: GEPlugin,
    url: String,
    completionCallback: js.Function1[/* feature */ KmlFeature, Unit]
  ): Unit = js.native
  def isInstalled(): Boolean = js.native
  def isSupported(): Boolean = js.native
  def removeEventListener(targetObject: js.Any, eventID: String, listenerCallback: js.Function1[/* event */ KmlEvent, Unit]): Unit = js.native
  def removeEventListener(
    targetObject: js.Any,
    eventID: String,
    listenerCallback: js.Function1[/* event */ KmlEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def setLanguage(languageCode: String): Unit = js.native
}

