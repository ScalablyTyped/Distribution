package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object instanceIdMod {
  
  @JSImport("firebase-admin/instance-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/instance-id", "InstanceId")
  @js.native
  open class InstanceId ()
    extends typings.firebaseAdmin.libInstanceIdMod.InstanceId
  
  inline def getInstanceId(): typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceId")().asInstanceOf[typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId]
  inline def getInstanceId(app: App): typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceId")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId]
}
