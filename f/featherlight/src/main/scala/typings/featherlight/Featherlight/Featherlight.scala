package typings.featherlight.Featherlight

import typings.featherlight.JQuery
import typings.jquery.JQueryEventObject
import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Featherlight extends Config {
  
  @JSName("$content")
  var $content: JQuery = js.native
  
  @JSName("$instance")
  var $instance: JQuery = js.native
  
  def close(): JQueryPromise[JQuery] = js.native
  def close(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  
  def getContent(): JQuery | JQueryPromise[JQuery] = js.native
  
  def open(): JQueryPromise[JQuery] = js.native
  def open(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  
  def setContent($content: JQuery): typings.featherlight.Featherlight.Featherlight = js.native
  def setContent($content: JQueryPromise[JQuery]): typings.featherlight.Featherlight.Featherlight = js.native
  
  def setup(): typings.featherlight.Featherlight.Featherlight = js.native
  def setup(config: Config): typings.featherlight.Featherlight.Featherlight = js.native
  def setup(target: String): typings.featherlight.Featherlight.Featherlight = js.native
  def setup(target: String, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
  def setup(target: JQuery): typings.featherlight.Featherlight.Featherlight = js.native
  def setup(target: JQuery, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
  
  var target: JQuery | String = js.native
}
