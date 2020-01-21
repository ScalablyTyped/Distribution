package typings.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options[T] = typings.fastGlob.optionsMod.IPartialOptions[T]
  type Task = typings.fastGlob.tasksMod.ITask
  type TransformFunction[T] = typings.fastGlob.optionsMod.TransformFunction[T]
}
