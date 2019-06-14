package typings
package dushLib.dushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  var _allEvents: js.Array[org.scalablytyped.runtime.StringDictionary[js.Array[Handler]]] = js.native
  def emit(`type`: java.lang.String, event: js.Any*): Emitter = js.native
  def off(`type`: dushLib.dushLibStrings.`*`): Emitter = js.native
  def off(`type`: dushLib.dushLibStrings.`*`, handler: WildcardHandler): Emitter = js.native
  def off(`type`: java.lang.String): Emitter = js.native
  def off(`type`: java.lang.String, handler: Handler): Emitter = js.native
  def on(`type`: dushLib.dushLibStrings.`*`, handler: WildcardHandler): Emitter = js.native
  def on(`type`: java.lang.String, handler: Handler): Emitter = js.native
  def once(`type`: dushLib.dushLibStrings.`*`, handler: WildcardHandler): Emitter = js.native
  def once(`type`: java.lang.String, handler: Handler): Emitter = js.native
  def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, scala.Unit]): Emitter = js.native
  def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, scala.Unit], options: js.Any): Emitter = js.native
}

