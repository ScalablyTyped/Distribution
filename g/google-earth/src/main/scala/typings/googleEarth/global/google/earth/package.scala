package typings.googleEarth.global.google

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object earth {
  
  @scala.inline
  def addEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, scala.Unit]
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createInstance(
    domNode: java.lang.String,
    initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def createInstance(
    domNode: java.lang.String,
    initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit],
    options: js.Any
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def createInstance(
    domNode: typings.std.Element,
    initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def createInstance(
    domNode: typings.std.Element,
    initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, scala.Unit],
    failureCallback: js.Function1[/* error */ js.Any, scala.Unit],
    options: js.Any
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def executeBatch(pluginInstance: typings.googleEarth.google.earth.GEPlugin, batchFunction: js.Function): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("executeBatch")(pluginInstance.asInstanceOf[js.Any], batchFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fetchKml(
    pluginInstance: typings.googleEarth.google.earth.GEPlugin,
    url: java.lang.String,
    completionCallback: js.Function1[/* feature */ typings.googleEarth.google.earth.KmlFeature, scala.Unit]
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("fetchKml")(pluginInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], completionCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isInstalled(): scala.Boolean = typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSupported(): scala.Boolean = typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def removeEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, scala.Unit]
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEventListener(
    targetObject: js.Any,
    eventID: java.lang.String,
    listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = (typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLanguage(languageCode: java.lang.String): scala.Unit = typings.googleEarth.global.google.earth.^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(languageCode.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
