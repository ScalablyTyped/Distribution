package typings
package atFeathersjsRestDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restDashClientMod {
  type Handler = js.Function2[
    /* connection */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[HandlerResult]
  ]
}
