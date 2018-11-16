package typings
package featherlightLib.FeatherlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featherlight extends Config {
  @JSName("$content")
  var $content: featherlightLib.JQuery = js.native
  @JSName("$instance")
  var $instance: featherlightLib.JQuery = js.native
  var target: featherlightLib.JQuery | java.lang.String = js.native
  def close(): jqueryLib.JQueryPromise[featherlightLib.JQuery] = js.native
  def close(event: jqueryLib.JQueryEventObject): jqueryLib.JQueryPromise[featherlightLib.JQuery] = js.native
  def getContent(): featherlightLib.JQuery | jqueryLib.JQueryPromise[featherlightLib.JQuery] = js.native
  def open(): jqueryLib.JQueryPromise[featherlightLib.JQuery] = js.native
  def open(event: jqueryLib.JQueryEventObject): jqueryLib.JQueryPromise[featherlightLib.JQuery] = js.native
  def setContent($content: featherlightLib.JQuery): Featherlight = js.native
  def setContent($content: jqueryLib.JQueryPromise[featherlightLib.JQuery]): Featherlight = js.native
  def setup(): Featherlight = js.native
  def setup(config: Config): Featherlight = js.native
  def setup(target: featherlightLib.JQuery): Featherlight = js.native
  def setup(target: featherlightLib.JQuery, config: Config): Featherlight = js.native
  def setup(target: java.lang.String): Featherlight = js.native
  def setup(target: java.lang.String, config: Config): Featherlight = js.native
}

