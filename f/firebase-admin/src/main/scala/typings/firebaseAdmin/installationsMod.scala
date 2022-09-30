package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installationsMod {
  
  @JSImport("firebase-admin/lib/installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/installations", "Installations")
  @js.native
  open class Installations ()
    extends typings.firebaseAdmin.installationsInstallationsMod.Installations
  
  inline def getInstallations(): typings.firebaseAdmin.installationsInstallationsMod.Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[typings.firebaseAdmin.installationsInstallationsMod.Installations]
  inline def getInstallations(app: App): typings.firebaseAdmin.installationsInstallationsMod.Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.installationsInstallationsMod.Installations]
}
