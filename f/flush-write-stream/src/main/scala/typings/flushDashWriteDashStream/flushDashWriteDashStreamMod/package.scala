package typings.flushDashWriteDashStream

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object flushDashWriteDashStreamMod {
  type Callback = js.Function1[/* error */ js.UndefOr[Error], Unit]
  type Flush = js.Function1[/* callback */ Callback, Unit]
  type Write = js.Function3[/* chunk */ js.Any, /* encoding */ String, /* callback */ Callback, Unit]
}
