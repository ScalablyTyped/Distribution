package typings.featherlight

import typings.featherlight.FeatherlightNs.Config
import typings.featherlight.FeatherlightNs.Featherlight
import typings.featherlight.FeatherlightNs.FeatherlightStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("featherlight")
  var featherlight_Original: FeatherlightStatic = js.native
  def featherlight(): Featherlight = js.native
  def featherlight($content: String): Featherlight = js.native
  def featherlight($content: String, config: Config): Featherlight = js.native
  def featherlight($content: JQuery): Featherlight = js.native
  def featherlight($content: JQuery, config: Config): Featherlight = js.native
  def featherlight(config: Config): Featherlight = js.native
}

