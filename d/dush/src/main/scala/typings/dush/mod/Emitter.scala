package typings.dush.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dush.dushStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  var _allEvents: js.Array[StringDictionary[js.Array[Handler]]] = js.native
  def emit(`type`: String, event: js.Any*): Emitter = js.native
  def off(`type`: String): Emitter = js.native
  def off(`type`: String, handler: Handler): Emitter = js.native
  def off(`type`: Asterisk): Emitter = js.native
  def off(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
  def on(`type`: String, handler: Handler): Emitter = js.native
  def on(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
  def once(`type`: String, handler: Handler): Emitter = js.native
  def once(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
  def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, Unit]): Emitter = js.native
  def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, Unit], options: js.Any): Emitter = js.native
}

