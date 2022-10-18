package typings.firebaseMessaging

import typings.firebaseMessaging.distSrcInterfacesLoggingTypesMod.LogEvent
import typings.firebaseMessaging.distSrcInterfacesLoggingTypesMod.LogResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTestingFakesLoggingObjectMod {
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/logging-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFailedResponse(): LogResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getFailedResponse")().asInstanceOf[LogResponse]
  
  inline def getFakeLogEvent(): LogEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeLogEvent")().asInstanceOf[LogEvent]
  
  inline def getSuccessResponse(): LogResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuccessResponse")().asInstanceOf[LogResponse]
}
