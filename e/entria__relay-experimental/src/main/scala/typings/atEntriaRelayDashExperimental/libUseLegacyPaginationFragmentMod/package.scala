package typings.atEntriaRelayDashExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUseLegacyPaginationFragmentMod {
  import typings.std.ReturnType

  type NonNullableFragmentReturn[TReturn] = ReturnType[NonNullableReturn[TReturn]]
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  type NullableFragmentReturn[TReturn] = ReturnType[NullableReturn[TReturn]]
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | Null], TFragmentData | Null]
}
