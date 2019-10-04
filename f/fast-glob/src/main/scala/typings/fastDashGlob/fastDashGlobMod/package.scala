package typings.fastDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastDashGlobMod {
  import typings.fastDashGlob.outManagersOptionsMod.IPartialOptions
  import typings.fastDashGlob.outManagersTasksMod.ITask

  type Options[T] = IPartialOptions[T]
  type Task = ITask
  type TransformFunction[T] = typings.fastDashGlob.outManagersOptionsMod.TransformFunction[T]
}
