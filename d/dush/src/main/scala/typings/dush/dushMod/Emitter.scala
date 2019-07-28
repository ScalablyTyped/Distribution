package typings.dush.dushMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  var _allEvents: js.Array[StringDictionary[js.Array[Handler]]] = js.native
  def emit(`type`: String, event: js.Any*): Emitter = js.native
  def off(`type`: String): Emitter = js.native
  def off(`type`: String, handler: Handler): Emitter = js.native
  def off(`type`: typings.dush.dushStrings.`*`): Emitter = js.native
  def off(`type`: typings.dush.dushStrings.`*`, handler: WildcardHandler): Emitter = js.native
  def on(`type`: String, handler: Handler): Emitter = js.native
  def on(`type`: typings.dush.dushStrings.`*`, handler: WildcardHandler): Emitter = js.native
  def once(`type`: String, handler: Handler): Emitter = js.native
  def once(`type`: typings.dush.dushStrings.`*`, handler: WildcardHandler): Emitter = js.native
  def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, Unit]): Emitter = js.native
  def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, Unit], options: js.Any): Emitter = js.native
}

