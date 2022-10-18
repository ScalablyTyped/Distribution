package typings.firebaseMessaging

import typings.firebaseMessaging.distEsmSrcInterfacesInternalMessagePayloadMod.MessagePayloadInternal
import typings.firebaseMessaging.distEsmSrcInterfacesLoggingTypesMod.LogEvent
import typings.firebaseMessaging.distEsmSrcInterfacesLoggingTypesMod.LogRequest
import typings.firebaseMessaging.distEsmSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcHelpersLogToFirelogMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/logToFirelog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLogRequest(logEventQueue: js.Array[LogEvent]): LogRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("_createLogRequest")(logEventQueue.asInstanceOf[js.Any]).asInstanceOf[LogRequest]
  
  inline def dispatchLogEvents(messaging: MessagingService): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_dispatchLogEvents")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def mergeStrings(s1: String, s2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_mergeStrings")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def processQueue(messaging: MessagingService, offsetInMs: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_processQueue")(messaging.asInstanceOf[js.Any], offsetInMs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stageLog(messaging: MessagingService, internalPayload: MessagePayloadInternal): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stageLog")(messaging.asInstanceOf[js.Any], internalPayload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startLoggingService(messaging: MessagingService): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startLoggingService")(messaging.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
