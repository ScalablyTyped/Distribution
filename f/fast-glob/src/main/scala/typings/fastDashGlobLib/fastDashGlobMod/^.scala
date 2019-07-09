package typings
package fastDashGlobLib.fastDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(source: fastDashGlobLib.outTypesMod.Pattern | js.Array[fastDashGlobLib.outTypesMod.Pattern]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(
    source: js.Array[fastDashGlobLib.outTypesMod.Pattern] | fastDashGlobLib.outTypesMod.Pattern,
    options: (fastDashGlobLib.outSettingsMod.Options with EntryObjectPredicate) | fastDashGlobLib.outSettingsMod.Options
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def generateTasks(source: fastDashGlobLib.outTypesMod.Pattern): js.Array[Task] = js.native
  def generateTasks(source: fastDashGlobLib.outTypesMod.Pattern, options: fastDashGlobLib.outSettingsMod.Options): js.Array[Task] = js.native
  def generateTasks(source: js.Array[fastDashGlobLib.outTypesMod.Pattern]): js.Array[Task] = js.native
  def generateTasks(
    source: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    options: fastDashGlobLib.outSettingsMod.Options
  ): js.Array[Task] = js.native
  def stream(source: fastDashGlobLib.outTypesMod.Pattern): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(source: fastDashGlobLib.outTypesMod.Pattern, options: fastDashGlobLib.outSettingsMod.Options): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(source: js.Array[fastDashGlobLib.outTypesMod.Pattern]): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(
    source: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    options: fastDashGlobLib.outSettingsMod.Options
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def sync(source: fastDashGlobLib.outTypesMod.Pattern): js.Array[java.lang.String] = js.native
  def sync(
    source: fastDashGlobLib.outTypesMod.Pattern,
    options: (fastDashGlobLib.outSettingsMod.Options with EntryObjectPredicate) | fastDashGlobLib.outSettingsMod.Options
  ): js.Array[fastDashGlobLib.outTypesMod.Entry] = js.native
  def sync(source: js.Array[fastDashGlobLib.outTypesMod.Pattern]): js.Array[java.lang.String] = js.native
  def sync(
    source: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    options: (fastDashGlobLib.outSettingsMod.Options with EntryObjectPredicate) | fastDashGlobLib.outSettingsMod.Options
  ): js.Array[fastDashGlobLib.outTypesMod.Entry] = js.native
}

