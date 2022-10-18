package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInstanceIdMod {
  
  @JSImport("firebase-admin/lib/instance-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/instance-id", "InstanceId")
  @js.native
  open class InstanceId ()
    extends typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId
  
  inline def getInstanceId(): typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceId")().asInstanceOf[typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId]
  inline def getInstanceId(app: App): typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceId")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId]
}
