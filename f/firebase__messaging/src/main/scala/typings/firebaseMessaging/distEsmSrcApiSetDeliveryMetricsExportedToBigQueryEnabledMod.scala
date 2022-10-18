package typings.firebaseMessaging

import typings.firebaseMessaging.distEsmSrcInterfacesPublicTypesMod.Messaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiSetDeliveryMetricsExportedToBigQueryEnabledMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/api/setDeliveryMetricsExportedToBigQueryEnabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setDeliveryMetricsExportedToBigQueryEnabled(messaging: Messaging, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setDeliveryMetricsExportedToBigQueryEnabled")(messaging.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
