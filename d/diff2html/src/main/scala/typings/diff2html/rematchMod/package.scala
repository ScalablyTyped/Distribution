package typings.diff2html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rematchMod {
  
  type DistanceFn[T] = js.Function2[/* x */ T, /* y */ T, scala.Double]
  
  type MatcherFn[T] = js.Function4[
    /* a */ js.Array[T], 
    /* b */ js.Array[T], 
    /* level */ js.UndefOr[scala.Double], 
    /* cache */ js.UndefOr[typings.std.Map[java.lang.String, scala.Double]], 
    js.Array[js.Array[js.Array[T]]]
  ]
}
