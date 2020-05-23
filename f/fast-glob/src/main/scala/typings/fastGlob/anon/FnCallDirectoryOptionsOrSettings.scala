package typings.fastGlob.anon

import typings.nodelibFsWalk.settingsMod.Options
import typings.nodelibFsWalk.settingsMod.default
import typings.nodelibFsWalk.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallDirectoryOptionsOrSettings extends js.Object {
  def apply(directory: String): js.Array[Entry] = js.native
  def apply(directory: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def apply(directory: String, optionsOrSettings: default): js.Array[Entry] = js.native
}

