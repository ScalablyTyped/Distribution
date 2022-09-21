package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoistStaticsMod {
  
  @JSImport("@fluentui/utilities/lib/hoistStatics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hoistStatics[TSource /* <: js.Object */, TDest](source: TSource, dest: TDest): TDest = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistStatics")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[TDest]
}
