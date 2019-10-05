package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/notify.html
  *
  * Register a listener to be notified when an event
  * in dojo/request happens.
  *
  * @param type       OptionalThe event to listen for. Events emitted: "start", "send","load", "error", "done", "stop".
  * @param listener       OptionalA callback to be run when an event happens.
  */
@js.native
trait notify extends js.Object {
  def apply(): Unit = js.native
  def apply(`type`: String): Unit = js.native
  def apply(`type`: String, listener: js.Function): Unit = js.native
  /**
    *
    * @param type
    * @param event
    * @param cancel
    */
  def emit(`type`: js.Any, event: js.Any, cancel: js.Any): Unit = js.native
}

