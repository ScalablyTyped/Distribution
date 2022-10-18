package typings.devtools

import typings.devtools.anon.HeightWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsSetWindowRectMod {
  
  @JSImport("devtools/build/commands/setWindowRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: HeightWidth): js.Promise[HeightWidth] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HeightWidth]]
}
