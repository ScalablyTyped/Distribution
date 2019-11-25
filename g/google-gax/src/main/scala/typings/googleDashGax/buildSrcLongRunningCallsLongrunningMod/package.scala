package typings.googleDashGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcLongRunningCallsLongrunningMod {
  import typings.std.Error

  type GetOperationCallback = js.Function4[
    /* err */ js.UndefOr[Error | Null], 
    /* result */ js.UndefOr[js.Object], 
    /* metadata */ js.UndefOr[js.Object], 
    /* rawResponse */ js.UndefOr[LROOperation], 
    Unit
  ]
}
