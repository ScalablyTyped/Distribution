package typings.devtools

import typings.devtools.anon.ElementId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsIsElementSelectedMod {
  
  @JSImport("devtools/build/commands/isElementSelected", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: ElementId): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
