package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMinByMod {
  
  inline def apply[A, B](as: js.Iterable[A], f: js.Function1[/* a */ A, B]): js.UndefOr[A | Null] = (^.asInstanceOf[js.Dynamic].apply(as.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[A | Null]]
  inline def apply[A, B](
    as: js.Iterable[A],
    f: js.Function1[/* a */ A, B],
    compare: js.Function2[/* u */ B, /* v */ B, Double | Null]
  ): js.UndefOr[A | Null] = (^.asInstanceOf[js.Dynamic].apply(as.asInstanceOf[js.Any], f.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[A | Null]]
  
  @JSImport("fbjs/lib/minBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
