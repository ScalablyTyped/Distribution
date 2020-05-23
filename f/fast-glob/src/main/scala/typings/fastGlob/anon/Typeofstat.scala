package typings.fastGlob.anon

import typings.nodelibFsStat.mod.AsyncCallback
import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstat extends js.Object {
  def apply(path: String, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def __promisify__(path: String): js.Promise[Stats] = js.native
  def __promisify__(path: String, optionsOrSettings: Options): js.Promise[Stats] = js.native
  def __promisify__(path: String, optionsOrSettings: default): js.Promise[Stats] = js.native
}

