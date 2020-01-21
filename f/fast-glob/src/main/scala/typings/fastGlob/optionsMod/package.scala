package typings.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type IPartialOptions[T] = typings.std.Partial[typings.fastGlob.optionsMod.IOptions[T]]
  type TransformFunction[T] = js.Function1[/* entry */ typings.fastGlob.entriesMod.EntryItem, T]
}
