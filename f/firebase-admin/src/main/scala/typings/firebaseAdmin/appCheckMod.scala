package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCheckMod {
  
  @JSImport("firebase-admin/lib/app-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/app-check", "AppCheck")
  @js.native
  open class AppCheck ()
    extends typings.firebaseAdmin.appCheckAppCheckMod.AppCheck
  
  inline def getAppCheck(): typings.firebaseAdmin.appCheckAppCheckMod.AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppCheck")().asInstanceOf[typings.firebaseAdmin.appCheckAppCheckMod.AppCheck]
  inline def getAppCheck(app: App): typings.firebaseAdmin.appCheckAppCheckMod.AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppCheck")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.appCheckAppCheckMod.AppCheck]
}
