package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object appCheckMod {
  
  @JSImport("firebase-admin/app-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/app-check", "AppCheck")
  @js.native
  open class AppCheck ()
    extends typings.firebaseAdmin.libAppCheckMod.AppCheck
  
  inline def getAppCheck(): typings.firebaseAdmin.libAppCheckAppCheckMod.AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppCheck")().asInstanceOf[typings.firebaseAdmin.libAppCheckAppCheckMod.AppCheck]
  inline def getAppCheck(app: App): typings.firebaseAdmin.libAppCheckAppCheckMod.AppCheck = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppCheck")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libAppCheckAppCheckMod.AppCheck]
}
