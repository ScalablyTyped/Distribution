package typings.firebase.compatMod.default

import typings.firebase.compatMod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functions {
  
  inline def apply(): typings.firebase.compatMod.firebase.functions.Functions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.firebase.compatMod.firebase.functions.Functions]
  inline def apply(app: App): typings.firebase.compatMod.firebase.functions.Functions = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.functions.Functions]
  
  @JSImport("firebase/compat", "default.functions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat", "default.functions.Functions")
  @js.native
  /* private */ open class Functions ()
    extends StObject
       with typings.firebase.compatMod.firebase.functions.Functions
}
