package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downshiftLib {
  type Callback = js.Function0[scala.Unit]
  type StateChangeFunction[Item] = js.Function1[/* state */ js.Any, stdLib.Partial[js.Any]]
}
