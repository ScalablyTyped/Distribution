package typings.firebase.global.firebase

import typings.firebase.mod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functions {
  
  inline def apply(): typings.firebase.mod.firebase.functions.Functions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.firebase.mod.firebase.functions.Functions]
  inline def apply(app: App): typings.firebase.mod.firebase.functions.Functions = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.functions.Functions]
  
  @JSGlobal("firebase.functions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("firebase.functions.Functions")
  @js.native
  /* private */ class Functions ()
    extends typings.firebase.mod.default.functions.Functions
}
