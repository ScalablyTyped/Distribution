package typings.featherlight

import typings.featherlight.Featherlight.Config
import typings.featherlight.Featherlight.JQueryExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def featherlight(): JQuery = js.native
  def featherlight($content: String): JQuery = js.native
  def featherlight($content: String, config: Config): JQuery = js.native
  def featherlight($content: JQuery): JQuery = js.native
  def featherlight($content: JQuery, config: Config): JQuery = js.native
  def featherlight(config: Config): JQuery = js.native
  @JSName("featherlight")
  var featherlight_Original: JQueryExtension = js.native
}
