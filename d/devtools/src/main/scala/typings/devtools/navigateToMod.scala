package typings.devtools

import typings.devtools.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigateToMod {
  
  @JSImport("devtools/build/commands/navigateTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasUrl: Url): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
}
