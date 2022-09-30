package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventarcMod {
  
  @JSImport("firebase-admin/lib/eventarc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/eventarc", "Channel")
  @js.native
  open class Channel ()
    extends typings.firebaseAdmin.eventarcEventarcMod.Channel
  
  @JSImport("firebase-admin/lib/eventarc", "Eventarc")
  @js.native
  open class Eventarc ()
    extends typings.firebaseAdmin.eventarcEventarcMod.Eventarc
  
  inline def getEventarc(): typings.firebaseAdmin.eventarcEventarcMod.Eventarc = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventarc")().asInstanceOf[typings.firebaseAdmin.eventarcEventarcMod.Eventarc]
  inline def getEventarc(app: App): typings.firebaseAdmin.eventarcEventarcMod.Eventarc = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventarc")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.eventarcEventarcMod.Eventarc]
}
