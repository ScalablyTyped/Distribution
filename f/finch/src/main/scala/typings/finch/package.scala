package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object finch {
  type FinchCallback = js.Function2[
    /* bindings */ js.UndefOr[js.Any], 
    /* childCallback */ js.UndefOr[js.Function0[Unit]], 
    js.Any
  ]
  type ObserveCallback = js.Function1[/* repeated */ js.Any, String]
}
