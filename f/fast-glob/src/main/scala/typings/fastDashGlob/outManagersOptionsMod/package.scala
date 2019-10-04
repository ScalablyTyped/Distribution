package typings.fastDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outManagersOptionsMod {
  import typings.fastDashGlob.outTypesEntriesMod.EntryItem
  import typings.std.Partial

  type IPartialOptions[T] = Partial[IOptions[T]]
  type TransformFunction[T] = js.Function1[/* entry */ EntryItem, T]
}
