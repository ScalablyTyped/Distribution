package typings.dojo.dojox.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/Controller.html
  *
  *
  * @param app dojox/app application instance.
  * @param events {event : handler}
  */
@JSGlobal("dojox.app.Controller")
@js.native
class Controller protected () extends js.Object {
  def this(app: js.Any, events: js.Any) = this()
  /**
    * Bind event on dojo/Evented instance, document, domNode or window.
    * Save event signal in controller instance. If no parameter is provided
    * automatically bind all events registered in controller events property.
    *
    * @param evented dojo/Evented instance, document, domNode or window
    * @param event event
    * @param handler event handler
    */
  def bind(evented: js.Object, event: String, handler: js.Function): js.Function = js.native
  /**
    * remove a binded event signal.
    *
    * @param evented dojo/Evented instance, document, domNode or window
    * @param event event
    */
  def unbind(evented: js.Object, event: String): js.Function = js.native
}

