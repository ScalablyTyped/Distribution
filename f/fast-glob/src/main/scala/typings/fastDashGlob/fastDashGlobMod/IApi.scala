package typings.fastDashGlob.fastDashGlobMod

import typings.fastDashGlob.outManagersOptionsMod.IPartialOptions
import typings.fastDashGlob.outTypesEntriesMod.EntryItem
import typings.fastDashGlob.outTypesPatternsMod.Pattern
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApi extends js.Object {
  def apply[T](patterns: js.Array[Pattern]): js.Promise[js.Array[T]] = js.native
  def apply[T](patterns: js.Array[Pattern], options: IPartialOptions[T]): js.Promise[js.Array[T]] = js.native
  def apply[T](patterns: Pattern): js.Promise[js.Array[T]] = js.native
  def apply[T](patterns: Pattern, options: IPartialOptions[T]): js.Promise[js.Array[T]] = js.native
  def async[T](patterns: js.Array[Pattern]): js.Promise[js.Array[T]] = js.native
  def async[T](patterns: js.Array[Pattern], options: IPartialOptions[T]): js.Promise[js.Array[T]] = js.native
  def async[T](patterns: Pattern): js.Promise[js.Array[T]] = js.native
  def async[T](patterns: Pattern, options: IPartialOptions[T]): js.Promise[js.Array[T]] = js.native
  def generateTasks(patterns: js.Array[Pattern]): js.Array[Task] = js.native
  def generateTasks(patterns: js.Array[Pattern], options: IPartialOptions[EntryItem]): js.Array[Task] = js.native
  def generateTasks(patterns: Pattern): js.Array[Task] = js.native
  def generateTasks(patterns: Pattern, options: IPartialOptions[EntryItem]): js.Array[Task] = js.native
  def stream(patterns: js.Array[Pattern]): ReadableStream = js.native
  def stream(patterns: js.Array[Pattern], options: IPartialOptions[EntryItem]): ReadableStream = js.native
  def stream(patterns: Pattern): ReadableStream = js.native
  def stream(patterns: Pattern, options: IPartialOptions[EntryItem]): ReadableStream = js.native
  def sync[T](patterns: js.Array[Pattern]): js.Array[T] = js.native
  def sync[T](patterns: js.Array[Pattern], options: IPartialOptions[T]): js.Array[T] = js.native
  def sync[T](patterns: Pattern): js.Array[T] = js.native
  def sync[T](patterns: Pattern, options: IPartialOptions[T]): js.Array[T] = js.native
}

