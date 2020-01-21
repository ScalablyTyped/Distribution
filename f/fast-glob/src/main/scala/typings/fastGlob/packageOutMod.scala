package typings.fastGlob

import typings.fastGlob.managersOptionsMod.IPartialOptions
import typings.fastGlob.managersTasksMod.ITask
import typings.fastGlob.typesEntriesMod.EntryItem
import typings.fastGlob.typesPatternsMod.Pattern
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out", JSImport.Namespace)
@js.native
object packageOutMod extends js.Object {
  def async(source: js.Array[Pattern]): js.Promise[js.Array[EntryItem]] = js.native
  def async(source: js.Array[Pattern], opts: IPartialOptions[EntryItem]): js.Promise[js.Array[EntryItem]] = js.native
  def async(source: Pattern): js.Promise[js.Array[EntryItem]] = js.native
  def async(source: Pattern, opts: IPartialOptions[EntryItem]): js.Promise[js.Array[EntryItem]] = js.native
  def generateTasks(source: js.Array[Pattern]): js.Array[ITask] = js.native
  def generateTasks(source: js.Array[Pattern], opts: IPartialOptions[EntryItem]): js.Array[ITask] = js.native
  def generateTasks(source: Pattern): js.Array[ITask] = js.native
  def generateTasks(source: Pattern, opts: IPartialOptions[EntryItem]): js.Array[ITask] = js.native
  def stream(source: js.Array[Pattern]): ReadableStream = js.native
  def stream(source: js.Array[Pattern], opts: IPartialOptions[EntryItem]): ReadableStream = js.native
  def stream(source: Pattern): ReadableStream = js.native
  def stream(source: Pattern, opts: IPartialOptions[EntryItem]): ReadableStream = js.native
  def sync(source: js.Array[Pattern]): js.Array[EntryItem] = js.native
  def sync(source: js.Array[Pattern], opts: IPartialOptions[EntryItem]): js.Array[EntryItem] = js.native
  def sync(source: Pattern): js.Array[EntryItem] = js.native
  def sync(source: Pattern, opts: IPartialOptions[EntryItem]): js.Array[EntryItem] = js.native
}

