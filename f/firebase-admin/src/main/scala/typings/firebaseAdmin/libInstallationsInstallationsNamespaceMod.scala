package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInstallationsInstallationsNamespaceMod {
  
  object installations {
    
    inline def apply(): Installations = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Installations]
    inline def apply(app: App): Installations = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Installations]
    
    @JSImport("firebase-admin/lib/installations/installations-namespace", "installations")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.installations#Installations}.
      */
    type Installations = typings.firebaseAdmin.libInstallationsInstallationsMod.Installations
  }
}
