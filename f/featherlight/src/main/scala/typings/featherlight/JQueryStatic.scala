package typings.featherlight

import typings.featherlight.Featherlight.Config
import typings.featherlight.Featherlight.FeatherlightStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("featherlight")
  var featherlight_Original: FeatherlightStatic = js.native
  def featherlight(): typings.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: String): typings.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: String, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: JQuery): typings.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: JQuery, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
  def featherlight(config: Config): typings.featherlight.Featherlight.Featherlight = js.native
}

