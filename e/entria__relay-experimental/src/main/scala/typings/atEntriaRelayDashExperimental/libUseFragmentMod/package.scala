package typings.atEntriaRelayDashExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUseFragmentMod {
  import typings.std.ReturnType

  type NonNullableArrayFragmentReturn[T] = ReturnType[NonNullableArrayReturn[T]]
  type NonNullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData]
  type NonNullableFragmentReturn[T] = ReturnType[NonNullableReturn[T]]
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  type NullableArrayFragmentReturn[T] = ReturnType[NullableArrayReturn[T]]
  type NullableArrayReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[js.Array[TFragmentData]], TFragmentData | Null]
  type NullableFragmentReturn[T] = ReturnType[NullableReturn[T]]
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData | Null]
}
