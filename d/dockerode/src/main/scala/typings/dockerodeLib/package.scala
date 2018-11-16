package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dockerodeLib {
  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
}
