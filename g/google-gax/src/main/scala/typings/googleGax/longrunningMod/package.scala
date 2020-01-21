package typings.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object longrunningMod {
  type GetOperationCallback = js.Function4[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[js.Object], 
    /* metadata */ js.UndefOr[js.Object], 
    /* rawResponse */ js.UndefOr[typings.googleGax.longrunningMod.LROOperation], 
    scala.Unit
  ]
}
