package typings.fastGlob.anon

import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallPathOptionsOrSettings extends js.Object {
  
  def apply(path: String): Stats = js.native
  def apply(path: String, optionsOrSettings: Options): Stats = js.native
  def apply(path: String, optionsOrSettings: default): Stats = js.native
}
