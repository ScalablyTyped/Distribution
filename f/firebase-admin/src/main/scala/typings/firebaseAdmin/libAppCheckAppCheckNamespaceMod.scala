package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppCheckAppCheckNamespaceMod {
  
  object appCheck {
    
    inline def apply(): AppCheck = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[AppCheck]
    inline def apply(app: App): AppCheck = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[AppCheck]
    
    @JSImport("firebase-admin/lib/app-check/app-check-namespace", "appCheck")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.app-check#AppCheck}.
      */
    type AppCheck = typings.firebaseAdmin.libAppCheckAppCheckMod.AppCheck
    
    /**
      * Type alias to {@link firebase-admin.app-check#AppCheckToken}.
      */
    type AppCheckToken = typings.firebaseAdmin.libAppCheckAppCheckApiMod.AppCheckToken
    
    type AppCheckTokenOptions = typings.firebaseAdmin.libAppCheckAppCheckApiMod.AppCheckTokenOptions
    
    /**
      * Type alias to {@link firebase-admin.app-check#DecodedAppCheckToken}.
      */
    type DecodedAppCheckToken = typings.firebaseAdmin.libAppCheckAppCheckApiMod.DecodedAppCheckToken
    
    /**
      * Type alias to {@link firebase-admin.app-check#VerifyAppCheckTokenResponse}.
      */
    type VerifyAppCheckTokenResponse = typings.firebaseAdmin.libAppCheckAppCheckApiMod.VerifyAppCheckTokenResponse
  }
}
