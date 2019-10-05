package typings.featherlight

import typings.featherlight.Featherlight.Config
import typings.featherlight.Featherlight.JQueryExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("featherlight")
  var featherlight_Original: JQueryExtension = js.native
  def featherlight(): JQuery = js.native
  def featherlight($content: String): JQuery = js.native
  def featherlight($content: String, config: Config): JQuery = js.native
  def featherlight($content: JQuery): JQuery = js.native
  def featherlight($content: JQuery, config: Config): JQuery = js.native
  def featherlight(config: Config): JQuery = js.native
}

