package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth")
@js.native
object ^ extends js.Object {
  def addEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ googleDashEarthLib.googleNs.earthNs.KmlEvent, scala.Unit]
  ): scala.Unit = js.native
  def addEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ googleDashEarthLib.googleNs.earthNs.KmlEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def createInstance(
    domNode: java.lang.String,
    initCallback: js.Function1[/* plugin */ googleDashEarthLib.googleNs.earthNs.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createInstance(
    domNode: java.lang.String,
    initCallback: js.Function1[/* plugin */ googleDashEarthLib.googleNs.earthNs.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit],
    options: js.Any
  ): scala.Unit = js.native
  def createInstance(
    domNode: stdLib.Element,
    initCallback: js.Function1[/* plugin */ googleDashEarthLib.googleNs.earthNs.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createInstance(
    domNode: stdLib.Element,
    initCallback: js.Function1[/* plugin */ googleDashEarthLib.googleNs.earthNs.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit],
    options: js.Any
  ): scala.Unit = js.native
  def executeBatch(pluginInstance: googleDashEarthLib.googleNs.earthNs.GEPlugin, batchFunction: js.Function): scala.Unit = js.native
  def fetchKml(
    pluginInstance: googleDashEarthLib.googleNs.earthNs.GEPlugin,
    url: java.lang.String,
    completionCallback: js.Function1[/* feature */ googleDashEarthLib.googleNs.earthNs.KmlFeature, scala.Unit]
  ): scala.Unit = js.native
  def isInstalled(): scala.Boolean = js.native
  def isSupported(): scala.Boolean = js.native
  def removeEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ googleDashEarthLib.googleNs.earthNs.KmlEvent, scala.Unit]
  ): scala.Unit = js.native
  def removeEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ googleDashEarthLib.googleNs.earthNs.KmlEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def setLanguage(languageCode: java.lang.String): scala.Unit = js.native
}

