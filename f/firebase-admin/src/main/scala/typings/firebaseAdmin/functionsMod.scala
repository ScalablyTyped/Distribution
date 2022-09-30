package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("firebase-admin/lib/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/functions", "Functions")
  @js.native
  open class Functions ()
    extends typings.firebaseAdmin.functionsFunctionsMod.Functions
  
  @JSImport("firebase-admin/lib/functions", "TaskQueue")
  @js.native
  open class TaskQueue[Args] ()
    extends typings.firebaseAdmin.functionsFunctionsMod.TaskQueue[Args]
  
  inline def getFunctions(): typings.firebaseAdmin.functionsFunctionsMod.Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")().asInstanceOf[typings.firebaseAdmin.functionsFunctionsMod.Functions]
  inline def getFunctions(app: App): typings.firebaseAdmin.functionsFunctionsMod.Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.functionsFunctionsMod.Functions]
}
