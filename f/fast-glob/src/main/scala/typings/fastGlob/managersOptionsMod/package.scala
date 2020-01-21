package typings.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managersOptionsMod {
  type IPartialOptions[T] = typings.std.Partial[typings.fastGlob.managersOptionsMod.IOptions[T]]
  type TransformFunction[T] = js.Function1[/* entry */ typings.fastGlob.typesEntriesMod.EntryItem, T]
}
