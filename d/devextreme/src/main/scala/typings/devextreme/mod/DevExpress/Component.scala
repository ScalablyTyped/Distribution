package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  /** Prevents the widget from refreshing until the endUpdate() method is called. */
  def beginUpdate(): Unit = js.native
  /** Refreshes the widget after a call of the beginUpdate() method. */
  def endUpdate(): Unit = js.native
  /** Gets the widget's instance. Use it to access other methods of the widget. */
  def instance(): this.type = js.native
  /** Detaches all event handlers from a single event. */
  def off(eventName: String): this.type = js.native
  /** Detaches a particular event handler from a single event. */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to an event. */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to events. */
  def on(events: js.Any): this.type = js.native
  /** Gets all widget options. */
  def option(): js.Any = js.native
  /** Gets the value of a single option. */
  def option(optionName: String): js.Any = js.native
  /** Updates the value of a single option. */
  def option(optionName: String, optionValue: js.Any): Unit = js.native
  /** Updates the values of several options. */
  def option(options: js.Any): Unit = js.native
  /** Resets an option to its default value. */
  def resetOption(optionName: String): Unit = js.native
}

