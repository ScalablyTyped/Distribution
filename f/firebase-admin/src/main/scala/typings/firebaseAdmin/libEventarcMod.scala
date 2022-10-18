package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventarcMod {
  
  @JSImport("firebase-admin/lib/eventarc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/eventarc", "Channel")
  @js.native
  open class Channel ()
    extends typings.firebaseAdmin.libEventarcEventarcMod.Channel
  
  @JSImport("firebase-admin/lib/eventarc", "Eventarc")
  @js.native
  open class Eventarc ()
    extends typings.firebaseAdmin.libEventarcEventarcMod.Eventarc
  
  inline def getEventarc(): typings.firebaseAdmin.libEventarcEventarcMod.Eventarc = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventarc")().asInstanceOf[typings.firebaseAdmin.libEventarcEventarcMod.Eventarc]
  inline def getEventarc(app: App): typings.firebaseAdmin.libEventarcEventarcMod.Eventarc = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventarc")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libEventarcEventarcMod.Eventarc]
}
