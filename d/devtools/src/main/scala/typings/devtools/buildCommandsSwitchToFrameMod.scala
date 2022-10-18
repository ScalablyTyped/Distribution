package typings.devtools

import typings.devtools.anon.Id
import typings.devtools.anon.IdNull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsSwitchToFrameMod {
  
  @JSImport("devtools/build/commands/switchToFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasId: Id): js.Promise[IdNull | Id] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdNull | Id]]
}
