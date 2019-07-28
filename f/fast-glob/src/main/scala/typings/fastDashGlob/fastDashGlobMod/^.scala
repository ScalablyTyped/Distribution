package typings.fastDashGlob.fastDashGlobMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    source: typings.fastDashGlob.outTypesMod.Pattern | js.Array[typings.fastDashGlob.outTypesMod.Pattern]
  ): js.Promise[js.Array[String]] = js.native
  def apply(
    source: js.Array[typings.fastDashGlob.outTypesMod.Pattern] | typings.fastDashGlob.outTypesMod.Pattern,
    options: (typings.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typings.fastDashGlob.outSettingsMod.Options
  ): js.Promise[js.Array[String]] = js.native
  def generateTasks(source: js.Array[typings.fastDashGlob.outTypesMod.Pattern]): js.Array[Task] = js.native
  def generateTasks(
    source: js.Array[typings.fastDashGlob.outTypesMod.Pattern],
    options: typings.fastDashGlob.outSettingsMod.Options
  ): js.Array[Task] = js.native
  def generateTasks(source: typings.fastDashGlob.outTypesMod.Pattern): js.Array[Task] = js.native
  def generateTasks(
    source: typings.fastDashGlob.outTypesMod.Pattern,
    options: typings.fastDashGlob.outSettingsMod.Options
  ): js.Array[Task] = js.native
  def stream(source: js.Array[typings.fastDashGlob.outTypesMod.Pattern]): ReadableStream = js.native
  def stream(
    source: js.Array[typings.fastDashGlob.outTypesMod.Pattern],
    options: typings.fastDashGlob.outSettingsMod.Options
  ): ReadableStream = js.native
  def stream(source: typings.fastDashGlob.outTypesMod.Pattern): ReadableStream = js.native
  def stream(
    source: typings.fastDashGlob.outTypesMod.Pattern,
    options: typings.fastDashGlob.outSettingsMod.Options
  ): ReadableStream = js.native
  def sync(source: js.Array[typings.fastDashGlob.outTypesMod.Pattern]): js.Array[String] = js.native
  def sync(
    source: js.Array[typings.fastDashGlob.outTypesMod.Pattern],
    options: (typings.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typings.fastDashGlob.outSettingsMod.Options
  ): js.Array[typings.fastDashGlob.outTypesMod.Entry] = js.native
  def sync(source: typings.fastDashGlob.outTypesMod.Pattern): js.Array[String] = js.native
  def sync(
    source: typings.fastDashGlob.outTypesMod.Pattern,
    options: (typings.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typings.fastDashGlob.outSettingsMod.Options
  ): js.Array[typings.fastDashGlob.outTypesMod.Entry] = js.native
}

