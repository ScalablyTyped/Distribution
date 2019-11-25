package typings.dojo.dojo

import typings.dojo.Anon_Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/Evented.html
  *
  * A class that can be used as a mixin or base class,
  * to add on() and emit() methods to a class
  * for listening for events and emitting events:
  *
  */
@JSGlobal("dojo.Evented")
@js.native
class Evented () extends js.Object {
  /**
    *
    * @param type
    * @param event
    */
  def emit(`type`: String, data: js.Any): js.Any = js.native
  /**
    *
    * @param type
    * @param listener
    */
  def on(`type`: String, listener: js.Function1[/* e */ js.Any, Unit]): Anon_Remove = js.native
}

