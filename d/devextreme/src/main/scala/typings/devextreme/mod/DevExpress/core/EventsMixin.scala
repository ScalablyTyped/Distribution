package typings.devextreme.mod.DevExpress.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsMixin extends js.Object {
  /** Detaches all event handlers from a single event. */
  def off(eventName: String): this.type = js.native
  /** Detaches a particular event handler from a single event. */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to an event. */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to events. */
  def on(events: js.Any): this.type = js.native
}

