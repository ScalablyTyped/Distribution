package typings.expressRateLimit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MaxValueFn = js.Function0[scala.Double | js.Promise[scala.Double]]
  
  type StoreIncrementCallback = js.Function3[
    /* err */ js.UndefOr[js.Object], 
    /* hits */ js.UndefOr[scala.Double], 
    /* resetTime */ js.UndefOr[typings.std.Date], 
    scala.Unit
  ]
}
