package typings.googleEarth.global.google.earth

import typings.googleEarth.global.google.earth.^
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addEventListener(
  targetObject: Any,
  eventID: String,
  listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener(
  targetObject: Any,
  eventID: String,
  listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, Unit],
  useCapture: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createInstance(
  domNode: String,
  initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, Unit],
  failureCallback: js.Function1[/* error */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def createInstance(
  domNode: String,
  initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, Unit],
  failureCallback: js.Function1[/* error */ Any, Unit],
  options: Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def createInstance(
  domNode: Element,
  initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, Unit],
  failureCallback: js.Function1[/* error */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def createInstance(
  domNode: Element,
  initCallback: js.Function1[/* plugin */ typings.googleEarth.google.earth.GEPlugin, Unit],
  failureCallback: js.Function1[/* error */ Any, Unit],
  options: Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(domNode.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def executeBatch(pluginInstance: typings.googleEarth.google.earth.GEPlugin, batchFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeBatch")(pluginInstance.asInstanceOf[js.Any], batchFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fetchKml(
  pluginInstance: typings.googleEarth.google.earth.GEPlugin,
  url: String,
  completionCallback: js.Function1[/* feature */ typings.googleEarth.google.earth.KmlFeature, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchKml")(pluginInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], completionCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isInstalled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")().asInstanceOf[Boolean]

inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]

inline def removeEventListener(
  targetObject: Any,
  eventID: String,
  listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener(
  targetObject: Any,
  eventID: String,
  listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, Unit],
  useCapture: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(targetObject.asInstanceOf[js.Any], eventID.asInstanceOf[js.Any], listenerCallback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setLanguage(languageCode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(languageCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
