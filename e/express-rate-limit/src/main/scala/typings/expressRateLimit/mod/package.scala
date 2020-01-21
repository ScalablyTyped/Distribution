package typings.expressRateLimit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MaxValueFn = js.Function0[scala.Double | js.Promise[scala.Double]]
  type StoreIncrementCallback = js.Function2[/* err */ js.UndefOr[js.Object], /* hits */ js.UndefOr[scala.Double], scala.Unit]
}
