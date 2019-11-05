package typings.fastDashMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastDashMemoizeMod {
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type MemoizeFunc = js.Function2[/* fn */ Func, /* options */ js.UndefOr[Options[Func]], Func]
  type Serializer = js.Function1[/* args */ js.Array[js.Any], String]
}
