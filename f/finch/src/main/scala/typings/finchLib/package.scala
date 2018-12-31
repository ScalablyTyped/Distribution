package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object finchLib {
  type FinchCallback = js.Function2[
    /* bindings */ js.UndefOr[js.Any], 
    /* childCallback */ js.UndefOr[js.Function0[scala.Unit]], 
    js.Any
  ]
  type ObserveCallback = js.Function1[/* repeated */ js.Any, java.lang.String]
}
