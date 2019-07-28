package typings.featherlight.FeatherlightNs

import typings.featherlight.JQuery
import typings.jquery.JQueryEventObject
import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featherlight extends Config {
  @JSName("$content")
  var $content: JQuery = js.native
  @JSName("$instance")
  var $instance: JQuery = js.native
  var target: JQuery | String = js.native
  def close(): JQueryPromise[JQuery] = js.native
  def close(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  def getContent(): JQuery | JQueryPromise[JQuery] = js.native
  def open(): JQueryPromise[JQuery] = js.native
  def open(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  def setContent($content: JQuery): Featherlight = js.native
  def setContent($content: JQueryPromise[JQuery]): Featherlight = js.native
  def setup(): Featherlight = js.native
  def setup(config: Config): Featherlight = js.native
  def setup(target: String): Featherlight = js.native
  def setup(target: String, config: Config): Featherlight = js.native
  def setup(target: JQuery): Featherlight = js.native
  def setup(target: JQuery, config: Config): Featherlight = js.native
}

