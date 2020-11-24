package typings.fastGlob.anon

import typings.nodelibFsStat.mod.AsyncCallback
import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.settingsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstat extends js.Object {
  
  def apply(path: String, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
}
