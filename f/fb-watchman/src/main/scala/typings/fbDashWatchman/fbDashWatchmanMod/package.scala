package typings.fbDashWatchman

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fbDashWatchmanMod {
  import typings.std.Error

  type doneCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* resp */ js.UndefOr[js.Any], js.Any]
}
