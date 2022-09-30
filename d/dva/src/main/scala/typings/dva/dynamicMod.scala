package typings.dva

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("dva/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(resolve: js.Function1[/* value */ js.UndefOr[PromiseLike[Any]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(resolve.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
