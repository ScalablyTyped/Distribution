package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceIdMod {
  
  @JSImport("firebase-admin/lib/instance-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/instance-id", "InstanceId")
  @js.native
  open class InstanceId ()
    extends typings.firebaseAdmin.instanceIdInstanceIdMod.InstanceId
  
  inline def getInstanceId(): typings.firebaseAdmin.instanceIdInstanceIdMod.InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceId")().asInstanceOf[typings.firebaseAdmin.instanceIdInstanceIdMod.InstanceId]
  inline def getInstanceId(app: App): typings.firebaseAdmin.instanceIdInstanceIdMod.InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceId")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.instanceIdInstanceIdMod.InstanceId]
}
