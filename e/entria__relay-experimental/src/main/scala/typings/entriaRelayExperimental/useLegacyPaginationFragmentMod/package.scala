package typings.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useLegacyPaginationFragmentMod {
  
  type NonNullableFragmentReturn[TReturn] = typings.std.ReturnType[
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableReturn[TReturn]
  ]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableFragmentReturn[TReturn] = typings.std.ReturnType[
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableReturn[TReturn]
  ]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | scala.Null], TFragmentData | scala.Null]
}
