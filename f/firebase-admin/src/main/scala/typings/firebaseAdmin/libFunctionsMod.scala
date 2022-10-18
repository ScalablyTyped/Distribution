package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionsMod {
  
  @JSImport("firebase-admin/lib/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/functions", "Functions")
  @js.native
  open class Functions ()
    extends typings.firebaseAdmin.libFunctionsFunctionsMod.Functions
  
  @JSImport("firebase-admin/lib/functions", "TaskQueue")
  @js.native
  open class TaskQueue[Args] ()
    extends typings.firebaseAdmin.libFunctionsFunctionsMod.TaskQueue[Args]
  
  inline def getFunctions(): typings.firebaseAdmin.libFunctionsFunctionsMod.Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")().asInstanceOf[typings.firebaseAdmin.libFunctionsFunctionsMod.Functions]
  inline def getFunctions(app: App): typings.firebaseAdmin.libFunctionsFunctionsMod.Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libFunctionsFunctionsMod.Functions]
}
